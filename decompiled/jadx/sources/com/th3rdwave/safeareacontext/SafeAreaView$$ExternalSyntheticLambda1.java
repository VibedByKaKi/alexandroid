package com.th3rdwave.safeareacontext;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class SafeAreaView$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReentrantLock f$0;
    public final /* synthetic */ Ref.BooleanRef f$1;
    public final /* synthetic */ Condition f$2;

    public /* synthetic */ SafeAreaView$$ExternalSyntheticLambda1(ReentrantLock reentrantLock, Ref.BooleanRef booleanRef, Condition condition, int i) {
        this.$r8$classId = i;
        this.f$0 = reentrantLock;
        this.f$1 = booleanRef;
        this.f$2 = condition;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SafeAreaView.waitForReactLayout$lambda$2(this.f$0, this.f$1, this.f$2);
                break;
            default:
                com.swmansion.rnscreens.safearea.SafeAreaView.waitForReactLayout$lambda$3(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
