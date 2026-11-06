package com.amazon.alexaext;

import android.content.Context;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;
import com.amazon.alexaext.BaseRemoteProxyDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RemoteExtensionProxy$$ExternalSyntheticLambda0 implements BaseRemoteProxyDelegate.InternalMessageAction, ExtensionMultiplexClient.ExtensionContext {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RemoteExtensionProxy$$ExternalSyntheticLambda0(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.amazon.alexaext.BaseRemoteProxyDelegate.InternalMessageAction
    public boolean act(ActivityDescriptor activityDescriptor, String str, boolean z) {
        boolean lambda$new$0;
        lambda$new$0 = ((RemoteExtensionProxy) this.f$0).lambda$new$0(activityDescriptor, str, z);
        return lambda$new$0;
    }

    @Override // com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient.ExtensionContext
    public Context getContext() {
        Context lambda$new$0;
        lambda$new$0 = DiscoveryExtensionsProvider.lambda$new$0((Context) this.f$0);
        return lambda$new$0;
    }
}
