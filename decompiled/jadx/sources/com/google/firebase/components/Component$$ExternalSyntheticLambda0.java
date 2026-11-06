package com.google.firebase.components;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Component$$ExternalSyntheticLambda0 implements ComponentFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Component$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$of$2;
        Object lambda$intoSet$4;
        Object lambda$intoSet$3;
        Object lambda$of$0;
        Object lambda$of$1;
        DefaultHeartBeatController lambda$component$3;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$of$2 = Component.lambda$of$2(obj, componentContainer);
                return lambda$of$2;
            case 1:
                lambda$intoSet$4 = Component.lambda$intoSet$4(obj, componentContainer);
                return lambda$intoSet$4;
            case 2:
                lambda$intoSet$3 = Component.lambda$intoSet$3(obj, componentContainer);
                return lambda$intoSet$3;
            case 3:
                lambda$of$0 = Component.lambda$of$0(obj, componentContainer);
                return lambda$of$0;
            case 4:
                lambda$of$1 = Component.lambda$of$1(obj, componentContainer);
                return lambda$of$1;
            default:
                lambda$component$3 = DefaultHeartBeatController.lambda$component$3((Qualified) obj, componentContainer);
                return lambda$component$3;
        }
    }
}
