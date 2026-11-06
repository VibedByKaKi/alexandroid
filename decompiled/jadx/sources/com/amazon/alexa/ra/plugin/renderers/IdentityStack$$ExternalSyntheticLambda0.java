package com.amazon.alexa.ra.plugin.renderers;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class IdentityStack$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ IdentityStack$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean remove$lambda$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                remove$lambda$1 = IdentityStack.remove$lambda$1(obj2, obj);
                break;
            default:
                remove$lambda$1 = IdentityStack.add$lambda$0(obj2, obj);
                break;
        }
        return Boolean.valueOf(remove$lambda$1);
    }
}
