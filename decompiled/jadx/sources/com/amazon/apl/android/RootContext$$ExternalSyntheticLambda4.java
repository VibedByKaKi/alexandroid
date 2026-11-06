package com.amazon.apl.android;

import com.amazon.common.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RootContext$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RootContext f$0;

    public /* synthetic */ RootContext$$ExternalSyntheticLambda4(RootContext rootContext, int i) {
        this.$r8$classId = i;
        this.f$0 = rootContext;
    }

    @Override // com.amazon.common.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        RootContext rootContext = this.f$0;
        switch (i) {
            case 0:
                rootContext.removePending((Action) obj);
                break;
            default:
                rootContext.removeComponent((Component) obj);
                break;
        }
    }
}
