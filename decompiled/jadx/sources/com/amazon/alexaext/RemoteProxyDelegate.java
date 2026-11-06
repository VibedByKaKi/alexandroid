package com.amazon.alexaext;

import androidx.annotation.NonNull;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class RemoteProxyDelegate extends BaseRemoteProxyDelegate {
    public RemoteProxyDelegate(ExtensionMultiplexClient extensionMultiplexClient) {
        super(extensionMultiplexClient);
    }

    @Override // com.amazon.alexaext.BaseRemoteProxyDelegate
    public boolean onProxyInitialize(@NonNull String str) {
        connect(str);
        return true;
    }
}
