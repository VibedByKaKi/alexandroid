package com.facebook.react.runtime.internal.bolts;

import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class Task$$ExternalSyntheticLambda1 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource f$0;
    public final /* synthetic */ Continuation f$1;
    public final /* synthetic */ Executor f$2;

    public /* synthetic */ Task$$ExternalSyntheticLambda1(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, int i) {
        this.$r8$classId = i;
        this.f$0 = taskCompletionSource;
        this.f$1 = continuation;
        this.f$2 = executor;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Unit continueWithTask$lambda$11$lambda$10;
        Unit continueWith$lambda$9$lambda$8;
        switch (this.$r8$classId) {
            case 0:
                continueWithTask$lambda$11$lambda$10 = Task.continueWithTask$lambda$11$lambda$10(this.f$0, this.f$1, this.f$2, task);
                return continueWithTask$lambda$11$lambda$10;
            default:
                continueWith$lambda$9$lambda$8 = Task.continueWith$lambda$9$lambda$8(this.f$0, this.f$1, this.f$2, task);
                return continueWith$lambda$9$lambda$8;
        }
    }
}
