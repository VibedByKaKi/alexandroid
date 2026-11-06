package com.amazon.alexa.accessory.internal.connection;

import android.os.Handler;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.transport.queue.TransportQueue;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.benefits.helpers.NetworkHelper$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.InterruptedIOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ConnectionTransportDispatcher implements Closeable {
    private final Accessory accessory;
    private final ConnectionCallback callback;
    private volatile boolean closed;
    private final Handler handler;
    private final long idleTimeoutMillis;
    private final TransportQueue queue;
    private DispatcherThread thread;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class DispatcherThread extends Thread {
        public DispatcherThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Logger.d("Connection transport dispatcher (%s) started", ConnectionTransportDispatcher.this.accessory);
            ConnectionTransportDispatcher connectionTransportDispatcher = ConnectionTransportDispatcher.this;
            ConnectionTransportDispatcher$$ExternalSyntheticLambda1 connectionTransportDispatcher$$ExternalSyntheticLambda1 = new ConnectionTransportDispatcher$$ExternalSyntheticLambda1(connectionTransportDispatcher, 4);
            try {
                try {
                    connectionTransportDispatcher.queue.prepare();
                    ConnectionTransportDispatcher.this.notifyConnected();
                    while (!isInterrupted()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (ConnectionTransportDispatcher.this.idleTimeoutMillis > 0) {
                            ConnectionTransportDispatcher.this.handler.postDelayed(connectionTransportDispatcher$$ExternalSyntheticLambda1, ConnectionTransportDispatcher.this.idleTimeoutMillis);
                        }
                        ConnectionTransportDispatcher.this.queue.executeNext();
                        if (ConnectionTransportDispatcher.this.idleTimeoutMillis > 0) {
                            ConnectionTransportDispatcher.this.handler.removeCallbacks(connectionTransportDispatcher$$ExternalSyntheticLambda1);
                            if (System.currentTimeMillis() - currentTimeMillis >= ConnectionTransportDispatcher.this.idleTimeoutMillis) {
                                ConnectionTransportDispatcher.this.handler.post(new ConnectionTransportDispatcher$$ExternalSyntheticLambda1(ConnectionTransportDispatcher.this, 5));
                            }
                        }
                    }
                    Logger.d("Connection transport dispatcher (%s) is terminating", ConnectionTransportDispatcher.this.accessory);
                    ConnectionTransportDispatcher.this.notifyDisconnected();
                    ConnectionTransportDispatcher.this.handler.removeCallbacks(connectionTransportDispatcher$$ExternalSyntheticLambda1);
                } catch (InterruptedIOException unused) {
                    Logger.d("Connection transport dispatcher (%s) is terminating", ConnectionTransportDispatcher.this.accessory);
                    ConnectionTransportDispatcher.this.notifyDisconnected();
                    ConnectionTransportDispatcher.this.handler.removeCallbacks(connectionTransportDispatcher$$ExternalSyntheticLambda1);
                } catch (Exception e) {
                    if (ConnectionTransportDispatcher.this.closed) {
                        Logger.d("Connection transport dispatcher (%s) is terminating", ConnectionTransportDispatcher.this.accessory);
                        ConnectionTransportDispatcher.this.notifyDisconnected();
                    } else {
                        Logger.d("Connection transport dispatcher (%s) is terminating with error", e, ConnectionTransportDispatcher.this.accessory);
                        ConnectionTransportDispatcher.this.notifyTerminated(e);
                    }
                    ConnectionTransportDispatcher.this.handler.removeCallbacks(connectionTransportDispatcher$$ExternalSyntheticLambda1);
                }
            } catch (Throwable th) {
                ConnectionTransportDispatcher.this.handler.removeCallbacks(connectionTransportDispatcher$$ExternalSyntheticLambda1);
                throw th;
            }
        }
    }

    public ConnectionTransportDispatcher(Accessory accessory, TransportQueue transportQueue, Handler handler, long j, ConnectionCallback connectionCallback) {
        Preconditions.notNull(accessory, ModelTransformer.KEY_ACCESSORY);
        Preconditions.notNull(transportQueue, "queue");
        Preconditions.notNull(handler, "handler");
        this.accessory = accessory;
        this.queue = transportQueue;
        this.handler = handler;
        this.callback = connectionCallback;
        this.idleTimeoutMillis = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyActive$4() {
        ConnectionCallback connectionCallback = this.callback;
        if (connectionCallback != null) {
            connectionCallback.onActive();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyConnected$0() {
        ConnectionCallback connectionCallback = this.callback;
        if (connectionCallback != null) {
            connectionCallback.onConnected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyDisconnected$2() {
        ConnectionCallback connectionCallback = this.callback;
        if (connectionCallback != null) {
            connectionCallback.onDisconnected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyIdle$3() {
        ConnectionCallback connectionCallback = this.callback;
        if (connectionCallback != null) {
            connectionCallback.onIdle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyTerminated$1(Throwable th) {
        ConnectionCallback connectionCallback = this.callback;
        if (connectionCallback != null) {
            connectionCallback.onFailed(th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        DispatcherThread dispatcherThread = this.thread;
        if (dispatcherThread != null) {
            dispatcherThread.interrupt();
        }
    }

    public void notifyActive() {
        this.handler.post(new ConnectionTransportDispatcher$$ExternalSyntheticLambda1(this, 0));
    }

    public void notifyConnected() {
        this.handler.post(new ConnectionTransportDispatcher$$ExternalSyntheticLambda1(this, 2));
    }

    public void notifyDisconnected() {
        this.handler.post(new ConnectionTransportDispatcher$$ExternalSyntheticLambda1(this, 3));
    }

    public void notifyIdle() {
        this.handler.post(new ConnectionTransportDispatcher$$ExternalSyntheticLambda1(this, 1));
    }

    public void notifyTerminated(Throwable th) {
        this.handler.post(new NetworkHelper$$ExternalSyntheticLambda0(this, th, 8));
    }

    public void open() {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Dispatcher is closed");
        } else {
            if (this.thread != null) {
                return;
            }
            DispatcherThread dispatcherThread = new DispatcherThread();
            this.thread = dispatcherThread;
            dispatcherThread.start();
        }
    }

    @VisibleForTesting
    public boolean peekIsThreadInterruptedForTesting() {
        DispatcherThread dispatcherThread = this.thread;
        if (dispatcherThread != null) {
            return dispatcherThread.isInterrupted();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No thread");
        return false;
    }
}
