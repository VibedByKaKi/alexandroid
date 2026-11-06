package com.amazon.alexa.presence.library;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class IdentityHelper$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AtomicBoolean f$0;

    public /* synthetic */ IdentityHelper$$ExternalSyntheticLambda0(AtomicBoolean atomicBoolean, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicBoolean;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        AtomicBoolean atomicBoolean = this.f$0;
        switch (i) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
