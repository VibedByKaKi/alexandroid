package com.facebook.react.runtime.internal.bolts;

import com.facebook.react.runtime.internal.bolts.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class Task$Companion$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Continuation f$0;
    public final /* synthetic */ Task f$1;
    public final /* synthetic */ TaskCompletionSource f$2;

    public /* synthetic */ Task$Companion$$ExternalSyntheticLambda3(Continuation continuation, Task task, TaskCompletionSource taskCompletionSource, int i) {
        this.$r8$classId = i;
        this.f$0 = continuation;
        this.f$1 = task;
        this.f$2 = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Task.Companion.completeImmediately$lambda$3(this.f$0, this.f$1, this.f$2);
                break;
            default:
                Task.Companion.completeAfterTask$lambda$5(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
