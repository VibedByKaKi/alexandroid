package com.amazon.alexa.accessorykit;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda3 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda3(int i, String str, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource lambda$deregisterDevice$3;
        CompletableSource lambda$deregisterDevice$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$deregisterDevice$3 = ((AccessoryModule) this.f$0).lambda$deregisterDevice$3(this.f$1);
                return lambda$deregisterDevice$3;
            default:
                lambda$deregisterDevice$4 = ((AbaSettingsBridgeDelegate) this.f$0).lambda$deregisterDevice$4(this.f$1);
                return lambda$deregisterDevice$4;
        }
    }
}
