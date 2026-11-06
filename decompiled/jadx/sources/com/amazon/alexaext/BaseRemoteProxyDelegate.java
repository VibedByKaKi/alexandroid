package com.amazon.alexaext;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceHolder;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;
import com.amazon.alexaext.RemoteExtensionProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class BaseRemoteProxyDelegate implements ExtensionMultiplexClient.ConnectionCallback {
    private static final String TAG = "BaseRemoteProxyDelegate";

    @Nullable
    @Deprecated
    protected ActivityDescriptor mCachedDescriptor;
    protected boolean mConnected;

    @Nullable
    private ExtensionMultiplexClient.IMultiplexClientConnection mConnection;

    @Nullable
    private RemoteExtensionProxy.IExtensionDisconnectCallback mExtensionDisconnectCallback;

    @NonNull
    protected final ExtensionMultiplexClient mMultiplexClient;
    private InternalMessageAction mOnInternalMessageAction;
    protected boolean mRegistered;
    private final int mID = ExtensionMultiplexClient.randomConnectionID();

    @NonNull
    protected final Map<String, Pair<ActivityDescriptor, String>> mRegistrations = new HashMap();

    @NonNull
    protected final List<SessionDescriptor> mSessions = new ArrayList();
    protected final List<String> mInboundMessages = new ArrayList();
    protected final List<Pair<ActivityDescriptor, String>> mInboundV2Messages = new ArrayList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InternalMessageAction {
        boolean act(@NonNull ActivityDescriptor activityDescriptor, String str, boolean z);
    }

    public BaseRemoteProxyDelegate(@NonNull ExtensionMultiplexClient extensionMultiplexClient) {
        this.mMultiplexClient = extensionMultiplexClient;
    }

    private synchronized void reset() {
        this.mConnected = false;
        this.mRegistered = false;
        this.mConnection = null;
    }

    public synchronized void connect(@NonNull String str) {
        if (this.mConnection == null) {
            this.mConnection = this.mMultiplexClient.connect(str, this);
        }
    }

    public void disconnect(@NonNull String str, String str2) {
        this.mMultiplexClient.disconnect(str, this, str2);
        reset();
    }

    public void disconnectV1(@NonNull String str, String str2) {
        this.mMultiplexClient.disconnectV1(str, this, str2);
        reset();
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public int getID() {
        return this.mID;
    }

    public void onBackgroundInternal(@NonNull ActivityDescriptor activityDescriptor) {
        if (this.mConnected) {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection == null) {
                Log.e(TAG, "mConnection should not be null while mConnected is true");
                return;
            }
            try {
                iMultiplexClientConnection.onBackground(this, activityDescriptor);
            } catch (RemoteException e) {
                Log.wtf(TAG, "Unable to notify background.", e);
            }
        }
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    @CallSuper
    public synchronized void onConnect(String str) {
        try {
            this.mConnected = true;
            if (!this.mSessions.isEmpty()) {
                Iterator<SessionDescriptor> it2 = this.mSessions.iterator();
                while (it2.hasNext()) {
                    onSessionStartedInternal(it2.next());
                }
                this.mSessions.clear();
            }
            Pair<ActivityDescriptor, String> pair = this.mRegistrations.get(str);
            if (pair != null) {
                sendMessage((ActivityDescriptor) pair.first, (String) pair.second);
                this.mRegistrations.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onConnectionClosed(@NonNull String str, String str2) {
        reset();
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onConnectionFailure(@NonNull String str, int i, String str2) {
        RemoteExtensionProxy.IExtensionDisconnectCallback iExtensionDisconnectCallback = this.mExtensionDisconnectCallback;
        if (iExtensionDisconnectCallback != null) {
            iExtensionDisconnectCallback.onFailure(str);
        }
        reset();
    }

    public void onForegroundInternal(@NonNull ActivityDescriptor activityDescriptor) {
        if (this.mConnected) {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection == null) {
                Log.e(TAG, "mConnection should not be null while mConnected is true");
                return;
            }
            try {
                iMultiplexClientConnection.onForeground(this, activityDescriptor);
            } catch (RemoteException e) {
                Log.wtf(TAG, "Unable to notify foreground.", e);
            }
        }
    }

    public void onHiddenInternal(@NonNull ActivityDescriptor activityDescriptor) {
        if (this.mConnected) {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection == null) {
                Log.e(TAG, "mConnection should not be null while mConnected is true");
                return;
            }
            try {
                iMultiplexClientConnection.onHidden(this, activityDescriptor);
            } catch (RemoteException e) {
                Log.wtf(TAG, "Unable to notify hidden.", e);
            }
        }
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public synchronized void onMessage(@NonNull String str, String str2) {
        if (!onMessageInternal(str, str2)) {
            this.mInboundMessages.add(str2);
        }
    }

    public boolean onMessageInternal(@NonNull String str, String str2) {
        if (this.mOnInternalMessageAction == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("MessageAction not provided");
            return false;
        }
        ActivityDescriptor activityDescriptor = this.mCachedDescriptor;
        if (activityDescriptor != null && activityDescriptor.getURI().equals(str)) {
            return this.mOnInternalMessageAction.act(this.mCachedDescriptor, str2, this.mRegistered);
        }
        return false;
    }

    public abstract boolean onProxyInitialize(@NonNull String str);

    public synchronized void onRegisteredInternal(@NonNull ActivityDescriptor activityDescriptor) {
        this.mRegistered = true;
        if (this.mConnected) {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection == null) {
                Log.e(TAG, "mConnection should not be null while mConnected is true");
                return;
            }
            try {
                iMultiplexClientConnection.onRegistered(this, activityDescriptor);
            } catch (RemoteException e) {
                Log.wtf(TAG, "Unable to notify registration.", e);
            }
            Iterator<String> it2 = this.mInboundMessages.iterator();
            while (it2.hasNext()) {
                onMessageInternal(activityDescriptor.getURI(), it2.next());
            }
        }
    }

    @CallSuper
    public synchronized boolean onRequestRegistration(@NonNull ActivityDescriptor activityDescriptor, String str) {
        this.mCachedDescriptor = activityDescriptor;
        if (this.mRegistered) {
            return false;
        }
        if (this.mConnected) {
            return sendMessage(activityDescriptor, str);
        }
        this.mRegistrations.put(activityDescriptor.getURI(), Pair.create(activityDescriptor, str));
        return true;
    }

    public synchronized void onResourceReadyInternal(@NonNull ActivityDescriptor activityDescriptor, @NonNull ResourceHolder resourceHolder) {
        Throwable th;
        BaseRemoteProxyDelegate baseRemoteProxyDelegate;
        BaseRemoteProxyDelegate baseRemoteProxyDelegate2;
        try {
            try {
                try {
                    if (!this.mConnected) {
                        Log.w(TAG, "Calling resourceAvailable when service is not connected");
                        return;
                    }
                    if (this.mConnection == null) {
                        Log.e(TAG, "mConnection should not be null while mConnected is true");
                        return;
                    }
                    try {
                        SurfaceHolder surfaceHolder = (SurfaceHolder) resourceHolder.getFacet(SurfaceHolder.class);
                        baseRemoteProxyDelegate2 = this;
                        try {
                            this.mConnection.resourceAvailable(baseRemoteProxyDelegate2, activityDescriptor, surfaceHolder.getSurface(), surfaceHolder.getSurfaceFrame(), resourceHolder.resourceId());
                        } catch (RemoteException e) {
                            e = e;
                            RemoteException remoteException = e;
                            Log.w(TAG, "Calling extension when service is not connected");
                            remoteException.printStackTrace();
                        } catch (IllegalStateException e2) {
                            e = e2;
                            IllegalStateException illegalStateException = e;
                            Log.w(TAG, "Cannot Send Resource: " + illegalStateException.getMessage());
                            illegalStateException.printStackTrace();
                        }
                    } catch (RemoteException e3) {
                        e = e3;
                        baseRemoteProxyDelegate2 = this;
                    } catch (IllegalStateException e4) {
                        e = e4;
                        baseRemoteProxyDelegate2 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    baseRemoteProxyDelegate = this;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                baseRemoteProxyDelegate = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void onSessionEndedInternal(@NonNull SessionDescriptor sessionDescriptor) {
        if (this.mConnected) {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection == null) {
                Log.e(TAG, "mConnection should not be null while mConnected is true");
                return;
            }
            try {
                iMultiplexClientConnection.onSessionEnded(this, sessionDescriptor);
            } catch (RemoteException e) {
                Log.wtf(TAG, "Unable to notify session end.", e);
            }
        }
    }

    public void onSessionStartedInternal(@NonNull SessionDescriptor sessionDescriptor) {
        if (!this.mConnected) {
            this.mSessions.add(sessionDescriptor);
            return;
        }
        ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
        if (iMultiplexClientConnection == null) {
            Log.e(TAG, "mConnection should not be null while mConnected is true");
            return;
        }
        try {
            iMultiplexClientConnection.onSessionStarted(this, sessionDescriptor);
        } catch (RemoteException e) {
            Log.wtf(TAG, "Unable to notify session start.", e);
        }
    }

    public void onUnregisteredInternal(@NonNull ActivityDescriptor activityDescriptor) {
        ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
        if (iMultiplexClientConnection == null) {
            Log.e(TAG, "mConnection should not be null while mConnected is true");
            this.mCachedDescriptor = null;
            this.mRegistered = false;
        } else {
            try {
                iMultiplexClientConnection.onUnregistered(this, activityDescriptor);
            } catch (RemoteException e) {
                Log.wtf(TAG, "Unable to notify un-registration.", e);
            }
            this.mCachedDescriptor = null;
            this.mRegistered = false;
        }
    }

    @CallSuper
    public synchronized boolean sendMessage(@NonNull ActivityDescriptor activityDescriptor, String str) {
        if (!this.mConnected) {
            Log.w(TAG, "Calling command when service is not connected");
            return false;
        }
        ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
        if (iMultiplexClientConnection == null) {
            Log.e(TAG, "mConnection should not be null while mConnected is true");
            return false;
        }
        try {
            iMultiplexClientConnection.send(this, activityDescriptor, str);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setExtensionDisconnectCallback(@Nullable RemoteExtensionProxy.IExtensionDisconnectCallback iExtensionDisconnectCallback) {
        this.mExtensionDisconnectCallback = iExtensionDisconnectCallback;
    }

    public void setOnInternalMessageAction(@NonNull InternalMessageAction internalMessageAction) {
        this.mOnInternalMessageAction = internalMessageAction;
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onMessageFailure(@NonNull String str, int i, String str2, String str3) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onMessage(ActivityDescriptor activityDescriptor, String str) {
        if (onMessageInternal(activityDescriptor, str)) {
            return;
        }
        this.mInboundV2Messages.add(Pair.create(activityDescriptor, str));
    }

    public boolean onMessageInternal(@NonNull ActivityDescriptor activityDescriptor, String str) {
        InternalMessageAction internalMessageAction = this.mOnInternalMessageAction;
        if (internalMessageAction != null) {
            return internalMessageAction.act(activityDescriptor, str, this.mRegistered);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("MessageAction not provided");
        return false;
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onMessageFailure(ActivityDescriptor activityDescriptor, int i, String str, String str2) {
    }
}
