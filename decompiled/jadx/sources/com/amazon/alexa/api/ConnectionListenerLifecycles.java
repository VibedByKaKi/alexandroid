package com.amazon.alexa.api;

import android.os.Handler;
import android.util.Log;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.ApiThreadHelper;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ConnectionListenerLifecycles {
    private static final long LISTENER_TIMEOUT_MS = 1000;
    private static final String TAG = "ConnectionListenerLifecycles";
    private final Handler defaultHandler;
    private final ReentrantLock lock;
    private final ManagedServiceConnection managedServiceConnection;
    private final Set<ConnectionListenerLifecycle> connectionListeners = new CopyOnWriteArraySet();
    private final Map<ConnectionListener, ConnectionListenerLifecycle> lifecycleMap = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConnectionListener {
        void onConnected();

        void onConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str);

        void onDisconnected();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ConnectionListenerLifecycle {
        private ConnectionListener connectionListener;
        private Handler handler;
        private ReentrantLock lock;
        private ManagedServiceConnection managedServiceConnection;
        private AtomicReference<ConnectionListenerState> state;

        private ConnectionListenerLifecycle(@Nullable Handler handler, ConnectionListener connectionListener, ManagedServiceConnection managedServiceConnection, ReentrantLock reentrantLock) {
            this.handler = handler;
            this.connectionListener = connectionListener;
            this.managedServiceConnection = managedServiceConnection;
            this.lock = reentrantLock;
            this.state = new AtomicReference<>(ConnectionListenerState.UNKNOWN);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ConnectionListenerLifecycle connectionListenerLifecycle = (ConnectionListenerLifecycle) obj;
                if (Objects.equals(this.handler.getLooper(), connectionListenerLifecycle.handler.getLooper()) && Objects.equals(this.connectionListener, connectionListenerLifecycle.connectionListener)) {
                    return true;
                }
            }
            return false;
        }

        public Handler getHandler() {
            return this.handler;
        }

        public int hashCode() {
            return Objects.hash(this.handler.getLooper(), this.connectionListener);
        }

        public void onConnected() {
            if (this.state.get().equals(ConnectionListenerState.CONNECTED)) {
                return;
            }
            ApiThreadHelper.runOnDefaultHandler(this.handler, new Runnable() { // from class: com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListenerLifecycle.1
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionListenerLifecycle.this.lock.lock();
                    try {
                        if (ConnectionListenerLifecycle.this.managedServiceConnection.isConnected()) {
                            AtomicReference atomicReference = ConnectionListenerLifecycle.this.state;
                            ConnectionListenerState connectionListenerState = ConnectionListenerState.CONNECTED;
                            if (!((ConnectionListenerState) atomicReference.getAndSet(connectionListenerState)).equals(connectionListenerState)) {
                                ConnectionListenerLifecycle.this.connectionListener.onConnected();
                            }
                        }
                    } finally {
                        ConnectionListenerLifecycle.this.lock.unlock();
                    }
                }
            });
        }

        public void onConnectingFailed(final AlexaConnectingFailedReason alexaConnectingFailedReason, final String str) {
            if (this.state.get().equals(ConnectionListenerState.FAILED)) {
                return;
            }
            ApiThreadHelper.runOnDefaultHandler(this.handler, new Runnable() { // from class: com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListenerLifecycle.2
                @Override // java.lang.Runnable
                public void run() {
                    AtomicReference atomicReference = ConnectionListenerLifecycle.this.state;
                    ConnectionListenerState connectionListenerState = ConnectionListenerState.FAILED;
                    if (((ConnectionListenerState) atomicReference.getAndSet(connectionListenerState)).equals(connectionListenerState)) {
                        return;
                    }
                    ConnectionListenerLifecycle.this.connectionListener.onConnectingFailed(alexaConnectingFailedReason, str);
                }
            });
        }

        public void onDisconnected(final CountDownLatch countDownLatch) {
            ConnectionListenerState connectionListenerState = this.state.get();
            if (connectionListenerState.equals(ConnectionListenerState.CONNECTED) || connectionListenerState.equals(ConnectionListenerState.UNKNOWN)) {
                ApiThreadHelper.runOnDefaultHandler(this.handler, new Runnable() { // from class: com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListenerLifecycle.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionListenerState connectionListenerState2 = (ConnectionListenerState) ConnectionListenerLifecycle.this.state.getAndSet(ConnectionListenerState.DISCONNECTED);
                        if (connectionListenerState2.equals(ConnectionListenerState.CONNECTED) || connectionListenerState2.equals(ConnectionListenerState.UNKNOWN)) {
                            ConnectionListenerLifecycle.this.connectionListener.onDisconnected();
                        } else {
                            Log.w(ConnectionListenerLifecycles.TAG, "Ignoring disconnect state, already in state : " + connectionListenerState2.name());
                        }
                        countDownLatch.countDown();
                    }
                });
                return;
            }
            Log.w(ConnectionListenerLifecycles.TAG, "Ignoring disconnect state, already in state : " + connectionListenerState.name());
            countDownLatch.countDown();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConnectionListenerState {
        CONNECTED,
        FAILED,
        DISCONNECTED,
        UNKNOWN
    }

    public ConnectionListenerLifecycles(ManagedServiceConnection managedServiceConnection, ReentrantLock reentrantLock, Handler handler) {
        this.managedServiceConnection = managedServiceConnection;
        this.lock = reentrantLock;
        this.defaultHandler = handler;
    }

    public ConnectionListenerLifecycle addListener(@Nullable Handler handler, @NonNull ConnectionListener connectionListener) {
        Preconditions.notNull(connectionListener, "The provided ConnectionListener was null.");
        if (handler == null) {
            handler = this.defaultHandler;
        }
        ConnectionListenerLifecycle connectionListenerLifecycle = new ConnectionListenerLifecycle(handler, connectionListener, this.managedServiceConnection, this.lock);
        synchronized (this.connectionListeners) {
            this.lifecycleMap.put(connectionListener, connectionListenerLifecycle);
            this.connectionListeners.add(connectionListenerLifecycle);
        }
        return connectionListenerLifecycle;
    }

    public void notifyConnectionConnected() {
        synchronized (this.connectionListeners) {
            try {
                Iterator<ConnectionListenerLifecycle> it2 = this.connectionListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onConnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyConnectionDisconnected() {
        synchronized (this.connectionListeners) {
            CountDownLatch countDownLatch = new CountDownLatch(this.connectionListeners.size());
            Iterator<ConnectionListenerLifecycle> it2 = this.connectionListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDisconnected(countDownLatch);
            }
            try {
                countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.e(TAG, "Waiting for onDisconnected listeners failed", e);
            }
        }
    }

    public void notifyConnectionFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
        synchronized (this.connectionListeners) {
            try {
                Iterator<ConnectionListenerLifecycle> it2 = this.connectionListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onConnectingFailed(alexaConnectingFailedReason, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListener(@NonNull ConnectionListener connectionListener) {
        Preconditions.notNull(connectionListener, "The provided ConnectionListener was null.");
        synchronized (this.connectionListeners) {
            try {
                ConnectionListenerLifecycle remove = this.lifecycleMap.remove(connectionListener);
                if (remove != null) {
                    this.connectionListeners.remove(remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reset() {
        synchronized (this.connectionListeners) {
            try {
                Iterator<ConnectionListenerLifecycle> it2 = this.connectionListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().state.set(ConnectionListenerState.UNKNOWN);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int size() {
        int size;
        synchronized (this.connectionListeners) {
            size = this.connectionListeners.size();
        }
        return size;
    }

    public ConnectionListenerLifecycle addListener(@NonNull ConnectionListener connectionListener) {
        return addListener(null, connectionListener);
    }
}
