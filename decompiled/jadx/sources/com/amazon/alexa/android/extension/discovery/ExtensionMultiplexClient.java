package com.amazon.alexa.android.extension.discovery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.android.extension.discovery.ExtensionBinder;
import com.amazon.alexa.android.extension.discovery.ExtensionDiscovery;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;
import com.amazon.alexa.android.extension.discovery.L2_IRemoteClient;
import com.amazon.alexa.android.extension.discovery.L2_IRemoteService;
import com.amazon.alexa.android.extension.discovery.L2_IRemoteServiceV2;
import com.amazon.alexaext.ActivityDescriptor;
import com.amazon.alexaext.SessionDescriptor;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes16.dex */
public class ExtensionMultiplexClient {
    private static final String TAG = "ExtensionMultiplexClnt";

    @SuppressLint({"InlinedApi"})
    private static final SecureRandom sGenerator = new SecureRandom(SecureRandom.getSeed(4));
    private final ExtensionBinder mBinder = new ExtensionBinder();
    private final ConnectionMonitorList<ClientConnection, String> mConnections = new ConnectionMonitorList<ClientConnection, String>() { // from class: com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.1
        @Override // com.amazon.alexa.android.extension.discovery.ConnectionMonitorList
        public void onDied(ClientConnection clientConnection, String str) {
            if (clientConnection != null) {
                String.format("onDied service connection for uri:%s and connectionID:%d ", str, Integer.valueOf(clientConnection.mConnectionID));
                clientConnection.disconnectOnFailure(-200, "The service has died:" + str);
            }
        }
    };
    private ExtensionContext mContext;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ExtensionContext {
        Context getContext();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IMultiplexClientConnection {
        int connectionID();

        @Deprecated
        void pause(ConnectionCallback connectionCallback) throws RemoteException;

        @Deprecated
        void resume(ConnectionCallback connectionCallback) throws RemoteException;

        void send(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor, String str) throws RemoteException;

        @Deprecated
        void send(ConnectionCallback connectionCallback, String str) throws RemoteException;

        @Deprecated
        void setFocusGain(ConnectionCallback connectionCallback) throws RemoteException;

        @Deprecated
        void setFocusLost(ConnectionCallback connectionCallback) throws RemoteException;

        default void resourceAvailable(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException {
        }

        default void resourceUnavailable(ConnectionCallback connectionCallback, String str) throws RemoteException {
        }

        default void onBackground(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        default void onForeground(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        default void onHidden(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        default void onRegistered(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        default void onSessionEnded(ConnectionCallback connectionCallback, SessionDescriptor sessionDescriptor) throws RemoteException {
        }

        default void onSessionStarted(ConnectionCallback connectionCallback, SessionDescriptor sessionDescriptor) throws RemoteException {
        }

        default void onUnregistered(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
        }

        default void resourceUnavailable(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
        }

        default void resourceAvailable(ConnectionCallback connectionCallback, Surface surface, Rect rect, String str) throws RemoteException {
        }
    }

    public ExtensionMultiplexClient(ExtensionContext extensionContext) {
        this.mContext = extensionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnection(ClientConnection clientConnection) {
        this.mConnections.unregister(clientConnection);
        clientConnection.close();
        this.mBinder.unbind(this.mContext.getContext(), clientConnection.mExtensionURI);
    }

    public static int randomConnectionID() {
        int i = 0;
        while (i == 0) {
            i = sGenerator.nextInt();
        }
        return i;
    }

    public IMultiplexClientConnection connect(@NonNull String str, String str2, Looper looper, @NonNull ConnectionCallback connectionCallback, boolean z) {
        ExtensionMultiplexClient extensionMultiplexClient;
        String str3;
        boolean z2;
        if (isKilled()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot reuse connection after call to kill()");
            return null;
        }
        if (str == null || connectionCallback == null) {
            return null;
        }
        synchronized (this.mConnections) {
            try {
                ClientConnection clientConnection = this.mConnections.get(str);
                if (clientConnection == null) {
                    extensionMultiplexClient = this;
                    str3 = str;
                    z2 = true;
                    clientConnection = extensionMultiplexClient.new ClientConnection(str3, looper, z, str2);
                } else {
                    extensionMultiplexClient = this;
                    str3 = str;
                    z2 = false;
                }
                clientConnection.registerCallback(connectionCallback);
                if (z2) {
                    if (!extensionMultiplexClient.mBinder.bind(extensionMultiplexClient.mContext.getContext(), str3, clientConnection)) {
                        Log.e(TAG, "Service not available");
                        return null;
                    }
                    extensionMultiplexClient.mConnections.register(clientConnection, str3);
                }
                return clientConnection;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean disconnect(String str, ConnectionCallback connectionCallback, String str2) {
        boolean z;
        ParcelCompat$$ExternalSyntheticOutline0.m7657m("Closing connection: ", str, ", reason: ", str2, TAG);
        synchronized (this.mConnections) {
            try {
                ClientConnection clientConnection = this.mConnections.get(str);
                if (clientConnection != null) {
                    String.format("Disconnecting connection for uri:%s and connectionID:%d ", str, Integer.valueOf(clientConnection.mConnectionID));
                    z = clientConnection.unregisterCallback(connectionCallback);
                    if (clientConnection.mCallbacks.isEmpty()) {
                        clearConnection(clientConnection);
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean disconnectV1(String str, ConnectionCallback connectionCallback, String str2) {
        boolean z;
        ParcelCompat$$ExternalSyntheticOutline0.m7657m("Closing connection: ", str, ", reason: ", str2, TAG);
        synchronized (this.mConnections) {
            try {
                ClientConnection clientConnection = this.mConnections.get(str);
                if (clientConnection == null || clientConnection.mServiceV1 == null) {
                    z = false;
                } else {
                    Log.i(TAG, String.format("Closing connection for uri:%s and connectionID:%d ", str, Integer.valueOf(clientConnection.mConnectionID)));
                    z = clientConnection.unregisterCallback(connectionCallback);
                    if (clientConnection.mCallbacks.isEmpty()) {
                        clearConnection(clientConnection);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @VisibleForTesting
    public ExtensionBinder getBinder() {
        return this.mBinder;
    }

    @VisibleForTesting
    public int getConnectionCount() {
        return this.mConnections.getRegisteredCallbackCount();
    }

    public String getExtensionDefinition(String str) {
        return ExtensionDiscovery.getInstance(this.mContext.getContext()).getExtensionDefinition(str);
    }

    public ExtensionDiscovery.ExtensionPresence hasExtension(String str) {
        return ExtensionDiscovery.getInstance(this.mContext.getContext()).hasExtension(str);
    }

    public boolean isKilled() {
        return this.mConnections.isKilled();
    }

    public void kill() {
        if (isKilled()) {
            return;
        }
        synchronized (this.mConnections) {
            try {
                int beginBroadcast = this.mConnections.beginBroadcast();
                int i = 0;
                while (true) {
                    ConnectionMonitorList<ClientConnection, String> connectionMonitorList = this.mConnections;
                    if (i < beginBroadcast) {
                        ClientConnection broadcastItem = connectionMonitorList.getBroadcastItem(i);
                        String valueOf = String.valueOf(this.mConnections.getBroadcastCookie(i));
                        Log.i(TAG, String.format("Killing connection for uri:%s and connectionID:%d ", valueOf, Integer.valueOf(broadcastItem.mConnectionID)));
                        broadcastItem.close();
                        this.mBinder.unbind(this.mContext.getContext(), valueOf);
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
        this.mContext = null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class ClientConnection extends L2_IRemoteClient.Stub implements ExtensionBinder.ConnectionCallback, IMultiplexClientConnection {
        private final String mConfiguration;
        private final ActivityDescriptor mDummyActivityDescriptor;
        private final String mExtensionURI;
        private final Handler mHandler;
        private L2_IRemoteService mServiceV1;
        private L2_IRemoteServiceV2 mServiceV2;
        private final Map<Integer, ConnectionCallback> mCallbacks = Collections.synchronizedMap(new LinkedHashMap());
        private boolean mHasService = false;
        private final AtomicBoolean mAccept = new AtomicBoolean(false);
        final CountDownLatch mBindingFailTest = new CountDownLatch(1);
        private final int mConnectionID = ExtensionMultiplexClient.randomConnectionID();

        public ClientConnection(String str, Looper looper, boolean z, String str2) {
            this.mExtensionURI = str;
            this.mConfiguration = str2;
            this.mHandler = (z || looper != null) ? !z ? new Handler(looper) : looper != null ? Handler.createAsync(looper) : null : new Handler();
            this.mDummyActivityDescriptor = new ActivityDescriptor(str, new SessionDescriptor(UUID.randomUUID().toString()), UUID.randomUUID().toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void disconnectOnFailure(int i, String str) {
            Log.w(ExtensionMultiplexClient.TAG, "disconnectOnFailure:" + i + " " + str);
            this.mServiceV1 = null;
            this.mServiceV2 = null;
            this.mHasService = false;
            synchronized (this.mCallbacks) {
                try {
                    for (ConnectionCallback connectionCallback : this.mCallbacks.values()) {
                        Handler handler = this.mHandler;
                        if (handler != null) {
                            handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda0(this, connectionCallback, i, str));
                        } else {
                            lambda$disconnectOnFailure$1(connectionCallback, i, str);
                        }
                    }
                    this.mCallbacks.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ExtensionMultiplexClient.this.clearConnection(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyConnect, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void lambda$registerCallback$0(ConnectionCallback connectionCallback) {
            try {
                connectionCallback.onConnect(this.mExtensionURI);
            } catch (Exception unused) {
                Log.e(ExtensionMultiplexClient.TAG, "Connection notification failed: " + this.mExtensionURI + " clientID: " + connectionCallback.getID());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyConnectClosed, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_connectionClosed$3(ConnectionCallback connectionCallback, String str) {
            try {
                connectionCallback.onConnectionClosed(this.mExtensionURI, str);
            } catch (Exception unused) {
                AppLaunchChecker$$ExternalSyntheticOutline0.m(this.mExtensionURI, ExtensionMultiplexClient.TAG, new StringBuilder("Failed to notify client of closed connection:"));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyConnectFailure, reason: merged with bridge method [inline-methods] */
        public void lambda$disconnectOnFailure$1(ConnectionCallback connectionCallback, int i, String str) {
            try {
                connectionCallback.onConnectionFailure(this.mExtensionURI, i, str);
            } catch (Exception unused) {
                AppLaunchChecker$$ExternalSyntheticOutline0.m(this.mExtensionURI, ExtensionMultiplexClient.TAG, new StringBuilder("Unhandled connection failure for service:"));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyMessage, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_receive$4(int i, String str) {
            try {
                ConnectionCallback connectionCallback = this.mCallbacks.get(Integer.valueOf(i));
                if (connectionCallback != null) {
                    connectionCallback.onMessage(this.mExtensionURI, str);
                    return;
                }
                Log.w(ExtensionMultiplexClient.TAG, "Failed to find client id = " + str);
            } catch (Exception e) {
                Log.e(ExtensionMultiplexClient.TAG, "onReceive callback error.", e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyMessageFailure, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_messageFailure$6(int i, int i2, String str, String str2) {
            ConnectionCallback connectionCallback = this.mCallbacks.get(Integer.valueOf(i));
            if (connectionCallback != null) {
                try {
                    connectionCallback.onMessageFailure(this.mExtensionURI, i2, str, str2);
                } catch (Exception unused) {
                    Log.e(ExtensionMultiplexClient.TAG, "Error handling message failure:" + str);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyMessageFailureV2, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_messageFailureV2$9(int i, ActivityDescriptor activityDescriptor, int i2, String str, String str2) {
            ConnectionCallback connectionCallback = this.mCallbacks.get(Integer.valueOf(i));
            if (connectionCallback != null) {
                try {
                    connectionCallback.onMessageFailure(activityDescriptor, i2, str, str2);
                } catch (Exception unused) {
                    Log.e(ExtensionMultiplexClient.TAG, "Error handling message failure:" + str);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyMessageV2, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_receiveV2$8(int i, ActivityDescriptor activityDescriptor, String str) {
            try {
                ConnectionCallback connectionCallback = this.mCallbacks.get(Integer.valueOf(i));
                if (connectionCallback != null) {
                    connectionCallback.onMessage(activityDescriptor, str);
                    return;
                }
                Log.w(ExtensionMultiplexClient.TAG, "Failed to find client id = " + str);
            } catch (Exception e) {
                Log.e(ExtensionMultiplexClient.TAG, "onReceive callback error.", e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyResourceRequest, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_onRequestResource$7(int i, String str) {
            try {
                ConnectionCallback connectionCallback = this.mCallbacks.get(Integer.valueOf(i));
                if (connectionCallback != null) {
                    connectionCallback.onRequestResource(this.mExtensionURI, str);
                }
            } catch (Exception e) {
                Log.e(ExtensionMultiplexClient.TAG, "notifyResourceRequest error: ", e);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_connectionAccept() throws RemoteException {
            this.mAccept.set(true);
            synchronized (this.mCallbacks) {
                try {
                    for (ConnectionCallback connectionCallback : this.mCallbacks.values()) {
                        Handler handler = this.mHandler;
                        if (handler != null) {
                            handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda4(this, connectionCallback, 0));
                        } else {
                            lambda$registerCallback$0(connectionCallback);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_connectionClosed(String str) throws RemoteException {
            synchronized (this.mCallbacks) {
                try {
                    for (ConnectionCallback connectionCallback : this.mCallbacks.values()) {
                        Handler handler = this.mHandler;
                        if (handler != null) {
                            handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda2(this, connectionCallback, str, 0));
                        } else {
                            lambda$L2_connectionClosed$3(connectionCallback, str);
                        }
                        if (!ExtensionMultiplexClient.this.disconnect(this.mExtensionURI, connectionCallback, str)) {
                            Log.w(ExtensionMultiplexClient.TAG, "Failed to disconnect from: " + this.mExtensionURI);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public int L2_connectionID() throws RemoteException {
            return this.mConnectionID;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_connectionReject(int i, String str) throws RemoteException {
            disconnectOnFailure(-100, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_messageFailure(final int i, final int i2, final String str, final String str2) throws RemoteException {
            Handler handler = this.mHandler;
            if (handler == null) {
                lambda$L2_messageFailure$6(i, i2, str, str2);
            } else if (!handler.post(new Runnable() { // from class: com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionMultiplexClient.ClientConnection.this.lambda$L2_messageFailure$6(i, i2, str, str2);
                }
            })) {
                throw new RemoteException("Remote message queue failed");
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_messageFailureV2(final int i, final ActivityDescriptor activityDescriptor, final int i2, final String str, final String str2) throws RemoteException {
            Handler handler = this.mHandler;
            if (handler == null) {
                lambda$L2_messageFailureV2$9(i, activityDescriptor, i2, str, str2);
            } else if (!handler.post(new Runnable() { // from class: com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionMultiplexClient.ClientConnection.this.lambda$L2_messageFailureV2$9(i, activityDescriptor, i2, str, str2);
                }
            })) {
                throw new RemoteException("Remote message queue failed");
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onBackgroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_onFocusLost(this.mConnectionID, i);
                    return;
                }
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onBackground(this.mConnectionID, i, activityDescriptor);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onForegroundV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_onFocusGained(this.mConnectionID, i);
                    return;
                }
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onForeground(this.mConnectionID, i, activityDescriptor);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onHiddenV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_onFocusLost(this.mConnectionID, i);
                    return;
                }
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onHidden(this.mConnectionID, i, activityDescriptor);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onRegisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
            try {
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onRegistered(this.mConnectionID, i, activityDescriptor);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onRequestResource(int i, String str) throws RemoteException {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda6(this, i, str, 0));
            } else {
                lambda$L2_onRequestResource$7(i, str);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onSessionEndedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException {
            try {
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onSessionEnded(this.mConnectionID, i, sessionDescriptor);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onSessionStartedV2(int i, SessionDescriptor sessionDescriptor) throws RemoteException {
            try {
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onSessionStarted(this.mConnectionID, i, sessionDescriptor);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_onUnregisteredV2(int i, ActivityDescriptor activityDescriptor) throws RemoteException {
            try {
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onUnregistered(this.mConnectionID, i, activityDescriptor);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_pause(int i) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_onPause(this.mConnectionID, i);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling send without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_receive(int i, String str) throws RemoteException {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda6(this, i, str, 1));
            } else {
                lambda$L2_receive$4(i, str);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_receiveBroadcast(String str) throws RemoteException {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda4(this, str, 2));
            } else {
                lambda$L2_receiveBroadcast$5(str);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_receiveV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda0(this, i, activityDescriptor, str));
            } else {
                lambda$L2_receiveV2$8(i, activityDescriptor, str);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceAvailable(int i, Surface surface, Rect rect, String str) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_onResourceAvailable(this.mConnectionID, i, surface, rect, str);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceAvailableV2(int i, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException {
            try {
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onResourceAvailable(this.mConnectionID, i, activityDescriptor, surface, rect, str);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceUnavailable(int i, String str) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_onResourceUnavailable(this.mConnectionID, i, str);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource unavailable without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resourceUnavailableV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
            try {
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_onResourceUnavailable(this.mConnectionID, i, activityDescriptor, str);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling resource available without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_resume(int i) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_onResume(this.mConnectionID, i);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling send without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_send(int i, String str) throws RemoteException {
            try {
                L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                if (l2_IRemoteService != null) {
                    l2_IRemoteService.L2_receive(this.mConnectionID, i, str);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling send without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public void L2_sendV2(int i, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
            try {
                L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                if (l2_IRemoteServiceV2 != null) {
                    l2_IRemoteServiceV2.L2_receive(this.mConnectionID, i, activityDescriptor, str);
                }
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "calling send without service connection");
                throw e;
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        public boolean L2_supportsTransactVersion(int i) throws RemoteException {
            return i == 1 || i == 2;
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionBinder.ConnectionCallback
        public void bindingFailure(int i, String str) {
            this.mBindingFailTest.countDown();
            disconnectOnFailure(i == -100 ? -200 : -100, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionBinder.ConnectionCallback
        public void bindingSuccess(IBinder iBinder) {
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                Log.i(ExtensionMultiplexClient.TAG, "INTERFACE_DESCRIPTOR:" + interfaceDescriptor);
                if (interfaceDescriptor.equals(L2_IRemoteService.DESCRIPTOR)) {
                    L2_IRemoteService asInterface = L2_IRemoteService.Stub.asInterface(iBinder);
                    this.mServiceV1 = asInterface;
                    asInterface.L2_connect(this, this.mConfiguration);
                    this.mHasService = true;
                    return;
                }
                if (!interfaceDescriptor.equals(L2_IRemoteServiceV2.DESCRIPTOR)) {
                    disconnectOnFailure(-100, "Client - Server transaction incompatibility");
                    return;
                }
                L2_IRemoteServiceV2 asInterface2 = L2_IRemoteServiceV2.Stub.asInterface(iBinder);
                this.mServiceV2 = asInterface2;
                asInterface2.L2_connect(this, this.mConfiguration);
                this.mHasService = true;
            } catch (RemoteException e) {
                Log.e(ExtensionMultiplexClient.TAG, "Binding Failure", e);
            }
        }

        public void close() {
            try {
                if (this.mHasService) {
                    L2_IRemoteService l2_IRemoteService = this.mServiceV1;
                    if (l2_IRemoteService != null) {
                        l2_IRemoteService.L2_connectionClosed(this, "Exit");
                        return;
                    }
                    L2_IRemoteServiceV2 l2_IRemoteServiceV2 = this.mServiceV2;
                    if (l2_IRemoteServiceV2 != null) {
                        l2_IRemoteServiceV2.L2_connectionClosed(this, "Exit");
                    }
                }
            } catch (RemoteException e) {
                Log.w(ExtensionMultiplexClient.TAG, "Connection close failed", e);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public int connectionID() {
            return this.mConnectionID;
        }

        public int getRegisteredCallbackCount() {
            return this.mCallbacks.size();
        }

        @VisibleForTesting
        public L2_IRemoteService getService() {
            return this.mServiceV1;
        }

        /* renamed from: notifyBroadcast, reason: merged with bridge method [inline-methods] */
        public void lambda$L2_receiveBroadcast$5(String str) {
            synchronized (this.mCallbacks) {
                try {
                    Iterator<Integer> it2 = this.mCallbacks.keySet().iterator();
                    while (it2.hasNext()) {
                        lambda$L2_receive$4(it2.next().intValue(), str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void onBackground(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_onBackgroundV2(connectionCallback.getID(), activityDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void onForeground(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_onForegroundV2(connectionCallback.getID(), activityDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void onHidden(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_onHiddenV2(connectionCallback.getID(), activityDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void onRegistered(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_onRegisteredV2(connectionCallback.getID(), activityDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void onSessionEnded(ConnectionCallback connectionCallback, SessionDescriptor sessionDescriptor) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_onSessionEndedV2(connectionCallback.getID(), sessionDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void onSessionStarted(ConnectionCallback connectionCallback, SessionDescriptor sessionDescriptor) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_onSessionStartedV2(connectionCallback.getID(), sessionDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void onUnregistered(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            if (this.mServiceV1 != null) {
                ExtensionMultiplexClient.this.disconnect(activityDescriptor.getURI(), connectionCallback, "Un-registered");
            }
            L2_onUnregisteredV2(connectionCallback.getID(), activityDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void pause(ConnectionCallback connectionCallback) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_pause(connectionCallback.getID());
        }

        public void registerCallback(ConnectionCallback connectionCallback) {
            synchronized (this.mCallbacks) {
                try {
                    this.mCallbacks.put(Integer.valueOf(connectionCallback.getID()), connectionCallback);
                    if (this.mHasService && this.mAccept.get()) {
                        Handler handler = this.mHandler;
                        if (handler != null) {
                            handler.post(new ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda4(this, connectionCallback, 1));
                        } else {
                            lambda$registerCallback$0(connectionCallback);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void resourceAvailable(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor, Surface surface, Rect rect, String str) throws RemoteException {
            if (connectionCallback == null || surface == null) {
                throw new RemoteException("No routing identifiers");
            }
            if (this.mServiceV1 != null) {
                L2_resourceAvailable(connectionCallback.getID(), surface, rect, str);
            } else if (this.mServiceV2 != null) {
                L2_resourceAvailableV2(connectionCallback.getID(), activityDescriptor, surface, rect, str);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void resourceUnavailable(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            if (this.mServiceV1 != null) {
                L2_resourceUnavailable(connectionCallback.getID(), str);
            } else if (this.mServiceV2 != null) {
                L2_resourceUnavailableV2(connectionCallback.getID(), activityDescriptor, str);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void resume(ConnectionCallback connectionCallback) throws RemoteException {
            if (connectionCallback == null) {
                throw new RemoteException("No routing identifiers");
            }
            L2_resume(connectionCallback.getID());
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        public void send(ConnectionCallback connectionCallback, ActivityDescriptor activityDescriptor, String str) throws RemoteException {
            if (connectionCallback == null || str == null) {
                throw new RemoteException("No routing identifiers");
            }
            if (this.mServiceV1 != null) {
                L2_send(connectionCallback.getID(), str);
            } else if (this.mServiceV2 != null) {
                L2_sendV2(connectionCallback.getID(), activityDescriptor, str);
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        @Deprecated
        public void setFocusGain(ConnectionCallback connectionCallback) throws RemoteException {
            onForeground(connectionCallback, this.mDummyActivityDescriptor);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        @Deprecated
        public void setFocusLost(ConnectionCallback connectionCallback) throws RemoteException {
            onBackground(connectionCallback, this.mDummyActivityDescriptor);
        }

        public boolean unregisterCallback(ConnectionCallback connectionCallback) {
            boolean z;
            L2_IRemoteService l2_IRemoteService;
            synchronized (this.mCallbacks) {
                ConnectionCallback remove = this.mCallbacks.remove(Integer.valueOf(connectionCallback.getID()));
                try {
                    if (this.mHasService && (l2_IRemoteService = this.mServiceV1) != null) {
                        l2_IRemoteService.L2_onExit(connectionID(), connectionCallback.getID());
                    }
                } catch (RemoteException e) {
                    Log.w(ExtensionMultiplexClient.TAG, "Connection close failed", e);
                }
                z = remove != null;
            }
            return z;
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        @Deprecated
        public void L2_setFocusGained(int i) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.L2_IRemoteClient
        @Deprecated
        public void L2_setFocusLost(int i) throws RemoteException {
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        @Deprecated
        public void resourceUnavailable(ConnectionCallback connectionCallback, String str) throws RemoteException {
            resourceUnavailable(connectionCallback, this.mDummyActivityDescriptor, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        @Deprecated
        public void resourceAvailable(ConnectionCallback connectionCallback, Surface surface, Rect rect, String str) throws RemoteException {
            resourceAvailable(connectionCallback, this.mDummyActivityDescriptor, surface, rect, str);
        }

        @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.IMultiplexClientConnection
        @Deprecated
        public void send(ConnectionCallback connectionCallback, String str) throws RemoteException {
            send(connectionCallback, this.mDummyActivityDescriptor, str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConnectionCallback {
        public static final int FAIL_HANDSHAKE = -100;
        public static final int FAIL_SERVER_DIED = -200;

        int getID();

        void onConnect(String str);

        void onConnectionClosed(String str, String str2);

        void onConnectionFailure(String str, int i, String str2);

        void onMessage(String str, String str2);

        void onMessageFailure(String str, int i, String str2, String str3);

        default void onMessage(ActivityDescriptor activityDescriptor, String str) {
        }

        default void onRequestResource(String str, String str2) {
        }

        default void onMessageFailure(ActivityDescriptor activityDescriptor, int i, String str, String str2) {
        }
    }

    public IMultiplexClientConnection connect(@NonNull String str, String str2, @NonNull ConnectionCallback connectionCallback) {
        if (!isKilled()) {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                Log.w(TAG, "There is no Looper for the current thread, creating a handler thread");
                HandlerThread handlerThread = new HandlerThread("ExtensionHandlerThread");
                handlerThread.start();
                myLooper = handlerThread.getLooper();
            }
            return connect(str, str2, myLooper, connectionCallback, false);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot reuse connection after call to kill()");
        return null;
    }

    public IMultiplexClientConnection connect(@NonNull String str, @NonNull ConnectionCallback connectionCallback) {
        if (!isKilled()) {
            return connect(str, null, connectionCallback);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot reuse connection after call to kill()");
        return null;
    }
}
