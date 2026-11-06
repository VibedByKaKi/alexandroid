package com.amazon.apl.android;

import com.amazon.alexaext.RemoteExtensionProxy;
import com.amazon.apl.android.RootContext;
import com.amazon.apl.android.providers.ITelemetryProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RootContext$1$$ExternalSyntheticLambda0 implements RemoteExtensionProxy.IExtensionDisconnectCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ RootContext$1$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // com.amazon.alexaext.RemoteExtensionProxy.IExtensionDisconnectCallback
    public final void onFailure(String str) {
        switch (this.$r8$classId) {
            case 0:
                ((RootContext.AnonymousClass1) this.f$0).lambda$onComplete$0(this.f$1, str);
                break;
            default:
                ((ITelemetryProvider) this.f$0).incrementCount(this.f$1);
                break;
        }
    }
}
