package com.facebook.react.runtime.internal.bolts;

import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.Unit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class Task$Companion$$ExternalSyntheticLambda0 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource f$0;

    public /* synthetic */ Task$Companion$$ExternalSyntheticLambda0(TaskCompletionSource taskCompletionSource, int i) {
        this.$r8$classId = i;
        this.f$0 = taskCompletionSource;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Unit completeAfterTask$lambda$5$lambda$4;
        Unit call$lambda$2$lambda$0;
        int i = this.$r8$classId;
        TaskCompletionSource taskCompletionSource = this.f$0;
        switch (i) {
            case 0:
                completeAfterTask$lambda$5$lambda$4 = Task.Companion.completeAfterTask$lambda$5$lambda$4(taskCompletionSource, task);
                return completeAfterTask$lambda$5$lambda$4;
            default:
                call$lambda$2$lambda$0 = Task.Companion.call$lambda$2$lambda$0(taskCompletionSource, task);
                return call$lambda$2$lambda$0;
        }
    }
}
