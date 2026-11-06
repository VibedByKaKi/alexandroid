package com.amazon.deecomms.identity;

import com.amazon.deecomms.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsIdentityStoreV2Impl$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsIdentityStoreV2Impl f$0;

    public /* synthetic */ CommsIdentityStoreV2Impl$$ExternalSyntheticLambda0(CommsIdentityStoreV2Impl commsIdentityStoreV2Impl, int i) {
        this.$r8$classId = i;
        this.f$0 = commsIdentityStoreV2Impl;
    }

    @Override // com.amazon.deecomms.util.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        CommsIdentityStoreV2Impl commsIdentityStoreV2Impl = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                commsIdentityStoreV2Impl.lambda$populateIdentityWithOOBEUser$0(str);
                break;
            case 1:
                commsIdentityStoreV2Impl.lambda$populateIdentityWithOOBEUser$1(str);
                break;
            case 2:
                commsIdentityStoreV2Impl.lambda$getCommsId$3(str);
                break;
            default:
                commsIdentityStoreV2Impl.lambda$getDirectedId$2(str);
                break;
        }
    }
}
