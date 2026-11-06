package com.amazon.alexa.android.extension.discovery;

import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes16.dex */
public class ExtensionClientCallback implements ExtensionMultiplexClient.ConnectionCallback {
    final int mID = ExtensionMultiplexClient.randomConnectionID();

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ConnectionCallback
    public int getID() {
        return this.mID;
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
