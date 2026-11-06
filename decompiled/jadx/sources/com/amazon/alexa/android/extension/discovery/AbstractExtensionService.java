package com.amazon.alexa.android.extension.discovery;

import android.app.Service;
import android.content.Intent;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes16.dex */
public abstract class AbstractExtensionService extends Service implements ExtensionMultiplexService.ConnectionCallback {
    protected ExtensionMultiplexService.IMultiplexServiceConnection mMultiplexService;

    public void disconnect(String str) {
        ExtensionMultiplexService.getInstance().disconnect(this, str);
    }

    public abstract String getName();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.mMultiplexService == null) {
            this.mMultiplexService = ExtensionMultiplexService.getInstance().connect(this);
        }
        return this.mMultiplexService;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ExtensionMultiplexService.getInstance().disconnect(this, "Service Destroyed: " + getName());
    }

    public void sendBroadcast(String str) {
        try {
            this.mMultiplexService.sendBroadcast(str);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void sendFailure(ExtensionMultiplexService.ConnectionID connectionID, int i, int i2, String str, String str2) {
        ExtensionMultiplexService.ConnectionID connectionID2;
        int i3;
        try {
            connectionID2 = connectionID;
            i3 = i;
        } catch (RemoteException e) {
            e = e;
            connectionID2 = connectionID;
            i3 = i;
        }
        try {
            this.mMultiplexService.sendFailure(connectionID2, i3, i2, str, str2);
        } catch (RemoteException e2) {
            e = e2;
            RemoteException remoteException = e;
            remoteException.printStackTrace();
            onClientFail(connectionID2, i3, remoteException.getMessage());
        }
    }

    public void sendMessage(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
        try {
            this.mMultiplexService.send(connectionID, i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            onClientFail(connectionID, i, e.getMessage());
        }
    }

    public void sendResourceRequest(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
        try {
            this.mMultiplexService.requestResource(connectionID, i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            onClientFail(connectionID, i, e.getMessage());
        }
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onConnect(ExtensionMultiplexService.ConnectionID connectionID, String str) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onConnectionClosed(ExtensionMultiplexService.ConnectionID connectionID, String str) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onExit(ExtensionMultiplexService.ConnectionID connectionID, int i) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onFocusGained(ExtensionMultiplexService.ConnectionID connectionID, int i) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onFocusLost(ExtensionMultiplexService.ConnectionID connectionID, int i) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onPause(ExtensionMultiplexService.ConnectionID connectionID, int i) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onResume(ExtensionMultiplexService.ConnectionID connectionID, int i) {
    }

    public void onClientFail(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onConnectionFailure(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onMessage(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onResourceUnavailable(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
    public void onResourceAvailable(ExtensionMultiplexService.ConnectionID connectionID, int i, Surface surface, Rect rect, String str) {
    }
}
