package com.amazon.alexa.android.extension.discovery;

import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;
import com.amazon.alexaext.ActivityDescriptor;
import com.amazon.alexaext.SessionDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes16.dex */
public class AbstractExtensionClient implements ExtensionMultiplexClient.ConnectionCallback {
    private static final String TAG = "AbstractExtensionClient";
    private final ExtensionMultiplexClient mClient;
    private ExtensionMultiplexClient.IMultiplexClientConnection mConnection;
    private final int mRoutingID = ExtensionMultiplexClient.randomConnectionID();

    public AbstractExtensionClient(ExtensionMultiplexClient extensionMultiplexClient) {
        this.mClient = extensionMultiplexClient;
    }

    public boolean connect(String str) {
        ExtensionMultiplexClient.IMultiplexClientConnection connect = this.mClient.connect(str, this);
        this.mConnection = connect;
        return connect != null;
    }

    public void disconnect(String str, String str2) {
        if (this.mConnection != null) {
            this.mClient.disconnect(str, this, str2);
        }
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public int getID() {
        return this.mRoutingID;
    }

    public void sendMessage(String str) {
        try {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection != null) {
                iMultiplexClientConnection.send(this, new ActivityDescriptor("", new SessionDescriptor(""), ""), str);
            } else {
                Log.w(TAG, "Calling command when service is not connected");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void sendResourceAvailable(Surface surface, Rect rect, String str) {
        try {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection != null) {
                iMultiplexClientConnection.resourceAvailable(this, new ActivityDescriptor("", new SessionDescriptor(""), ""), surface, rect, str);
            } else {
                Log.w(TAG, "Calling command when service is not connected");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void sendResourceUnavailable(String str) {
        try {
            ExtensionMultiplexClient.IMultiplexClientConnection iMultiplexClientConnection = this.mConnection;
            if (iMultiplexClientConnection != null) {
                iMultiplexClientConnection.resourceUnavailable(this, new ActivityDescriptor("", new SessionDescriptor(""), ""), str);
            } else {
                Log.w(TAG, "Calling command when service is not connected");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onConnect(String str) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onConnectionClosed(String str, String str2) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onMessage(String str, String str2) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onRequestResource(String str, String str2) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onConnectionFailure(String str, int i, String str2) {
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public void onMessageFailure(String str, int i, String str2, String str3) {
    }
}
