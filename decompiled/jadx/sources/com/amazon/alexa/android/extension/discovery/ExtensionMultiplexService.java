package com.amazon.alexa.android.extension.discovery;

import android.graphics.Rect;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService;
import com.amazon.alexa.android.extension.discovery.L2_IRemoteService;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes16.dex */
public final class ExtensionMultiplexService {
    private static final String TAG = "ExtensionMultiplexSvc";
    private static final ExtensionMultiplexService sInstance = new ExtensionMultiplexService();
    private final ConnectionMonitorList<ServiceConnection, Object> mConnections = new ConnectionMonitorList<ServiceConnection, Object>() { // from class: com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.1
        @Override // com.amazon.alexa.android.extension.discovery.ConnectionMonitorList, android.os.RemoteCallbackList
        public void onCallbackDied(ServiceConnection serviceConnection, Object obj) {
            if (serviceConnection != null) {
                serviceConnection.disconnectOnFailure(null, -300, "The service has died");
            }
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ConnectionID {
        public final int connectionID;
        public final int connectionPID;

        public ConnectionID(int i, int i2) {
            this.connectionPID = i;
            this.connectionID = i2;
        }

        public static ConnectionID valueOf(int i, int i2) {
            return new ConnectionID(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectionID)) {
                return false;
            }
            ConnectionID connectionID = (ConnectionID) obj;
            return this.connectionPID == connectionID.connectionPID && this.connectionID == connectionID.connectionID;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.connectionPID), Integer.valueOf(this.connectionID));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConnectionID{connectionPID=");
            sb.append(this.connectionPID);
            sb.append(", connectionID=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.connectionID, AbstractJsonLexerKt.END_OBJ);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static class ServiceConnection extends L2_IRemoteService.Stub implements IMultiplexServiceConnection {
        private ConnectionCallback mCallback;
        private final ConnectionMonitorList<L2_IRemoteClient, ConnectionID> mClients = new ConnectionMonitorList<L2_IRemoteClient, ConnectionID>() { // from class: com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ServiceConnection.1
            @Override // com.amazon.alexa.android.extension.discovery.ConnectionMonitorList
            public void onDied(L2_IRemoteClient l2_IRemoteClient, ConnectionID connectionID) {
                ServiceConnection.this.disconnectOnFailure(connectionID, -200, "Client died.");
            }
        };
        private final Handler mHandler;

        public ServiceConnection(Looper looper, @NonNull ConnectionCallback connectionCallback, boolean z) {
            this.mCallback = connectionCallback;
            this.mHandler = (z || looper != null) ? !z ? new Handler(looper) : looper != null ? Handler.createAsync(looper) : null : new Handler();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyConnectionClosed, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_connectionClosed$2(ConnectionID connectionID, String str) {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onConnectionClosed(connectionID, str);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Connection Closed - extension no longer available.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyFocusGained, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onFocusGained$5(ConnectionID connectionID, int i) throws IllegalStateException {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onFocusGained(connectionID, i);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Focus gain - extension no longer available.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyFocusLost, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onFocusLost$4(ConnectionID connectionID, int i) throws IllegalStateException {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onFocusLost(connectionID, i);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Focus lost - extension no longer available.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyOnConnect, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_connect$1(ConnectionID connectionID, String str) {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onConnect(connectionID, str);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Connection Closed - extension no longer available.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyOnExit, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onExit$8(ConnectionID connectionID, int i) throws IllegalStateException {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onExit(connectionID, i);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "On exit - extension no longer available.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyPause, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onPause$6(ConnectionID connectionID, int i) throws IllegalStateException {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onPause(connectionID, i);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Pause - extension no longer available.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyReceive, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_receive$3(ConnectionID connectionID, int i, String str) throws IllegalStateException {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback == null || str == null) {
                Log.w(ExtensionMultiplexService.TAG, "Message received - extension no longer available.");
            } else {
                connectionCallback.onMessage(connectionID, i, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyResourceAvailable, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onResourceAvailable$9(ConnectionID connectionID, int i, Surface surface, Rect rect, String str) throws IllegalStateException {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback == null || surface == null) {
                Log.w(ExtensionMultiplexService.TAG, "Surface received - extension no longer available");
            } else {
                connectionCallback.onResourceAvailable(connectionID, i, surface, rect, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyResourceUnavailable, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onResourceUnavailable$10(ConnectionID connectionID, int i, String str) {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onResourceUnavailable(connectionID, i, str);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Surface unavailable - extension no longer available");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyResume, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onResume$7(ConnectionID connectionID, int i) throws IllegalStateException {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onResume(connectionID, i);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Resume - extension no longer available.");
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_connect(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
            if (l2_IRemoteClient == null) {
                Log.e(ExtensionMultiplexService.TAG, "Client handshake failed, null client");
                disconnectOnFailure(null, -100, "Null client connection.");
                return;
            }
            try {
                ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), l2_IRemoteClient.L2_connectionID());
                Objects.toString(valueOf);
                int validate = validate(l2_IRemoteClient);
                if (1 == validate && this.mClients.register(l2_IRemoteClient, valueOf)) {
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda2(this, valueOf, str, 2));
                    } else {
                        lambda$L2_connect$1(valueOf, str);
                    }
                    l2_IRemoteClient.L2_connectionAccept();
                } else {
                    disconnectOnFailure(valueOf, -100, "Client - Server transaction incompatibility.");
                    l2_IRemoteClient.L2_connectionReject(validate, "Service rejected.");
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexService.TAG, "Client handshake failed", e);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_connectionClosed(L2_IRemoteClient l2_IRemoteClient, String str) throws RemoteException {
            if (l2_IRemoteClient == null) {
                Log.wtf(ExtensionMultiplexService.TAG, "Invalid client.");
                return;
            }
            try {
                this.mClients.unregister(l2_IRemoteClient);
                ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), l2_IRemoteClient.L2_connectionID());
                Objects.toString(valueOf);
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda2(this, valueOf, str, 1));
                } else {
                    lambda$L2_connectionClosed$2(valueOf, str);
                }
            } catch (Exception unused) {
                Log.e(ExtensionMultiplexService.TAG, "Client closed connection failure");
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_onExit(int i, int i2) throws RemoteException {
            try {
                ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                Objects.toString(valueOf);
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda0(this, valueOf, i2, 1));
                } else {
                    lambda$L2_onFocusGained$5(valueOf, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_onFocusGained(int i, int i2) throws RemoteException {
            try {
                ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                Objects.toString(valueOf);
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda0(this, valueOf, i2, 0));
                } else {
                    lambda$L2_onFocusGained$5(valueOf, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_onFocusLost(int i, int i2) throws RemoteException {
            try {
                ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                Objects.toString(valueOf);
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda0(this, valueOf, i2, 2));
                } else {
                    lambda$L2_onFocusLost$4(valueOf, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_onPause(int i, int i2) throws RemoteException {
            try {
                ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                Objects.toString(valueOf);
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda0(this, valueOf, i2, 4));
                } else {
                    lambda$L2_onPause$6(valueOf, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_onResourceAvailable(int i, final int i2, final Surface surface, final Rect rect, final String str) throws RemoteException {
            try {
                final ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                Objects.toString(valueOf);
                Handler handler = this.mHandler;
                if (handler != null) {
                    try {
                        Runnable runnable = new Runnable() { // from class: com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ExtensionMultiplexService.ServiceConnection.this.lambda$L2_onResourceAvailable$9(valueOf, i2, surface, rect, str);
                            }
                        };
                        this = this;
                        handler.post(runnable);
                    } catch (Throwable th) {
                        th = th;
                        this = this;
                        Throwable th2 = th;
                        throw th2;
                    }
                } else {
                    lambda$L2_onResourceAvailable$9(valueOf, i2, surface, rect, str);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_onResourceUnavailable(int i, int i2, String str) throws RemoteException {
            ServiceConnection serviceConnection;
            try {
                try {
                    ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                    Objects.toString(valueOf);
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        serviceConnection = this;
                        handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda1(serviceConnection, valueOf, i2, str, 2));
                    } else {
                        serviceConnection = this;
                        serviceConnection.lambda$L2_onResourceUnavailable$10(valueOf, i2, str);
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_onResume(int i, int i2) throws RemoteException {
            try {
                ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                Objects.toString(valueOf);
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda0(this, valueOf, i2, 3));
                } else {
                    lambda$L2_onResume$7(valueOf, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_receive(int i, int i2, String str) throws RemoteException {
            ServiceConnection serviceConnection;
            try {
                try {
                    ConnectionID valueOf = ConnectionID.valueOf(Binder.getCallingPid(), i);
                    Objects.toString(valueOf);
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        serviceConnection = this;
                        handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda1(serviceConnection, valueOf, i2, str, 1));
                    } else {
                        serviceConnection = this;
                        serviceConnection.lambda$L2_receive$3(valueOf, i2, str);
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_requestResource(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException {
            l2_IRemoteClient.L2_onRequestResource(i, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_send(L2_IRemoteClient l2_IRemoteClient, int i, String str) throws RemoteException {
            l2_IRemoteClient.L2_receive(i, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_sendBroadcast(String str) throws RemoteException {
            int beginBroadcast = this.mClients.beginBroadcast();
            int i = 0;
            while (true) {
                ConnectionMonitorList<L2_IRemoteClient, ConnectionID> connectionMonitorList = this.mClients;
                if (i < beginBroadcast) {
                    try {
                        connectionMonitorList.getBroadcastItem(i).L2_receiveBroadcast(str);
                    } catch (RemoteException unused) {
                        Log.w(ExtensionMultiplexService.TAG, "Remote client close was unsuccessful");
                    }
                    i++;
                } else {
                    connectionMonitorList.finishBroadcast();
                }
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized void L2_sendFailure(L2_IRemoteClient l2_IRemoteClient, int i, int i2, String str, String str2) throws RemoteException {
            l2_IRemoteClient.L2_messageFailure(i, i2, str, str2);
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteService
        public synchronized boolean L2_supportsTransactVersion(int i) throws RemoteException {
            return i == 1;
        }

        public synchronized void closeConnection(String str) {
            this.mCallback = null;
            int beginBroadcast = this.mClients.beginBroadcast();
            int i = 0;
            while (true) {
                ConnectionMonitorList<L2_IRemoteClient, ConnectionID> connectionMonitorList = this.mClients;
                if (i < beginBroadcast) {
                    try {
                        L2_IRemoteClient broadcastItem = connectionMonitorList.getBroadcastItem(i);
                        broadcastItem.L2_connectionClosed(str);
                        this.mClients.unregister(broadcastItem);
                    } catch (RemoteException unused) {
                        Log.w(ExtensionMultiplexService.TAG, "Remote client close was unsuccessful");
                    }
                    i++;
                } else {
                    connectionMonitorList.finishBroadcast();
                }
            }
        }

        public void disconnectOnFailure(ConnectionID connectionID, int i, String str) {
            Log.w(ExtensionMultiplexService.TAG, "Connection failure:" + i + " " + str);
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda1(this, connectionID, i, str, 0));
            } else {
                lambda$disconnectOnFailure$0(connectionID, i, str);
            }
        }

        @VisibleForTesting
        public int getClientCount() {
            return this.mClients.getRegisteredCallbackCount();
        }

        /* renamed from: notifyConnectionFailure, reason: merged with bridge method [inline-methods] */
        public void lambda$disconnectOnFailure$0(ConnectionID connectionID, int i, String str) {
            ConnectionCallback connectionCallback = this.mCallback;
            if (connectionCallback != null) {
                connectionCallback.onConnectionFailure(connectionID, i, str);
            } else {
                Log.w(ExtensionMultiplexService.TAG, "Connection failure - extension no longer available.");
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.IMultiplexServiceConnection
        public synchronized void requestResource(ConnectionID connectionID, int i, String str) throws RemoteException {
            if (connectionID == null || i == 0) {
                throw new RemoteException("No routing identifiers");
            }
            L2_IRemoteClient l2_IRemoteClient = this.mClients.get(connectionID);
            if (l2_IRemoteClient == null) {
                throw new RemoteException("Client not found");
            }
            L2_requestResource(l2_IRemoteClient, i, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.IMultiplexServiceConnection
        public synchronized void send(ConnectionID connectionID, int i, String str) throws RemoteException {
            if (connectionID == null || i == 0) {
                throw new RemoteException("No routing identifiers");
            }
            L2_IRemoteClient l2_IRemoteClient = this.mClients.get(connectionID);
            if (l2_IRemoteClient == null) {
                throw new RemoteException("Client not found");
            }
            L2_send(l2_IRemoteClient, i, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.IMultiplexServiceConnection
        public synchronized void sendBroadcast(String str) throws RemoteException {
            if (str == null) {
                throw new RemoteException("Empty broadcast message");
            }
            L2_sendBroadcast(str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.IMultiplexServiceConnection
        public synchronized void sendFailure(ConnectionID connectionID, int i, int i2, String str, String str2) throws RemoteException {
            try {
                if (connectionID == null || i == 0) {
                    throw new RemoteException("No routing identifiers");
                }
                try {
                    L2_IRemoteClient l2_IRemoteClient = this.mClients.get(connectionID);
                    if (l2_IRemoteClient == null) {
                        throw new RemoteException("Client not found");
                    }
                    L2_sendFailure(l2_IRemoteClient, i, i2, str, str2);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @VisibleForTesting
        public int validate(L2_IRemoteClient l2_IRemoteClient) {
            try {
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexService.TAG, "Client handshake failed", e);
            }
            return !l2_IRemoteClient.L2_supportsTransactVersion(1) ? -100 : 1;
        }
    }

    private ExtensionMultiplexService() {
    }

    public static ExtensionMultiplexService getInstance() {
        return sInstance;
    }

    public IMultiplexServiceConnection connect(Looper looper, @NonNull ConnectionCallback connectionCallback, boolean z) {
        ServiceConnection serviceConnection;
        synchronized (this.mConnections) {
            try {
                serviceConnection = this.mConnections.get(connectionCallback);
                if (serviceConnection == null) {
                    serviceConnection = new ServiceConnection(looper, connectionCallback, z);
                    this.mConnections.register(serviceConnection, connectionCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceConnection;
    }

    public void disconnect(ConnectionCallback connectionCallback, String str) {
        synchronized (this.mConnections) {
            try {
                ServiceConnection serviceConnection = this.mConnections.get(connectionCallback);
                if (serviceConnection != null) {
                    this.mConnections.unregister(serviceConnection);
                    serviceConnection.closeConnection(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public void disconnectAll(String str) {
        synchronized (this.mConnections) {
            try {
                int beginBroadcast = this.mConnections.beginBroadcast();
                int i = 0;
                while (true) {
                    ConnectionMonitorList<ServiceConnection, Object> connectionMonitorList = this.mConnections;
                    if (i < beginBroadcast) {
                        connectionMonitorList.getBroadcastItem(i).closeConnection(str);
                        i++;
                    } else {
                        connectionMonitorList.finishBroadcast();
                        this.mConnections.kill();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public IMultiplexServiceConnection connect(ConnectionCallback connectionCallback) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            HandlerThread handlerThread = new HandlerThread("ExtensionHandlerThread");
            handlerThread.start();
            myLooper = handlerThread.getLooper();
        }
        return connect(myLooper, connectionCallback, false);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConnectionCallback {
        public static final int FAIL_CLIENT_DIED = -200;
        public static final int FAIL_HANDSHAKE = -100;
        public static final int FAIL_SERVER_DIED = -300;

        void onConnect(ConnectionID connectionID, String str);

        void onConnectionClosed(ConnectionID connectionID, String str);

        void onConnectionFailure(ConnectionID connectionID, int i, String str);

        void onExit(ConnectionID connectionID, int i);

        void onFocusGained(ConnectionID connectionID, int i);

        void onFocusLost(ConnectionID connectionID, int i);

        void onMessage(ConnectionID connectionID, int i, String str);

        void onPause(ConnectionID connectionID, int i);

        void onResume(ConnectionID connectionID, int i);

        default void onResourceUnavailable(ConnectionID connectionID, int i, String str) {
        }

        default void onResourceAvailable(ConnectionID connectionID, int i, Surface surface, Rect rect, String str) {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IMultiplexServiceConnection extends IBinder {
        void send(ConnectionID connectionID, int i, String str) throws RemoteException;

        void sendBroadcast(String str) throws RemoteException;

        void sendFailure(ConnectionID connectionID, int i, int i2, String str, String str2) throws RemoteException;

        default void requestResource(ConnectionID connectionID, int i, String str) throws RemoteException {
        }
    }
}
