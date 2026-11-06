package com.amazon.alexa.matter.utils;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class RxJava3$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AtomicReference f$0;

    public /* synthetic */ RxJava3$$ExternalSyntheticLambda0(AtomicReference atomicReference, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicReference;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        AtomicReference atomicReference = this.f$0;
        switch (i) {
            case 0:
                RxJava3.dispose(atomicReference);
                break;
            case 1:
                RxJava1To3.lambda$shim$1(atomicReference);
                break;
            case 2:
                RxJava3.dispose(atomicReference);
                break;
            default:
                RxJava3.dispose(atomicReference);
                break;
        }
    }
}
