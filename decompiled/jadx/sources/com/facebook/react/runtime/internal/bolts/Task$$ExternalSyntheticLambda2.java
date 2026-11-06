package com.facebook.react.runtime.internal.bolts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class Task$$ExternalSyntheticLambda2 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Continuation f$0;

    public /* synthetic */ Task$$ExternalSyntheticLambda2(Continuation continuation, int i) {
        this.$r8$classId = i;
        this.f$0 = continuation;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Task onSuccess$lambda$12;
        Task onSuccessTask$lambda$13;
        int i = this.$r8$classId;
        Continuation continuation = this.f$0;
        switch (i) {
            case 0:
                onSuccess$lambda$12 = Task.onSuccess$lambda$12(continuation, task);
                return onSuccess$lambda$12;
            default:
                onSuccessTask$lambda$13 = Task.onSuccessTask$lambda$13(continuation, task);
                return onSuccessTask$lambda$13;
        }
    }
}
