package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactHostImpl$$ExternalSyntheticLambda16 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ ReactHostImpl f$1;

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda16(Function2 function2, ReactHostImpl reactHostImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = function2;
        this.f$1 = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Task orCreateReloadTask$lambda$49;
        Task orCreateReloadTask$lambda$51;
        Task orCreateReloadTask$lambda$52;
        Task orCreateReloadTask$lambda$53;
        Task orCreateDestroyTask$lambda$59;
        Task orCreateDestroyTask$lambda$61;
        switch (this.$r8$classId) {
            case 0:
                orCreateReloadTask$lambda$49 = ReactHostImpl.getOrCreateReloadTask$lambda$49(this.f$0, this.f$1, "getOrCreateReloadTask()", task);
                return orCreateReloadTask$lambda$49;
            case 1:
                orCreateReloadTask$lambda$51 = ReactHostImpl.getOrCreateReloadTask$lambda$51(this.f$0, this.f$1, "getOrCreateReloadTask()", task);
                return orCreateReloadTask$lambda$51;
            case 2:
                orCreateReloadTask$lambda$52 = ReactHostImpl.getOrCreateReloadTask$lambda$52(this.f$0, this.f$1, "getOrCreateReloadTask()", task);
                return orCreateReloadTask$lambda$52;
            case 3:
                orCreateReloadTask$lambda$53 = ReactHostImpl.getOrCreateReloadTask$lambda$53(this.f$0, this.f$1, "getOrCreateReloadTask()", task);
                return orCreateReloadTask$lambda$53;
            case 4:
                orCreateDestroyTask$lambda$59 = ReactHostImpl.getOrCreateDestroyTask$lambda$59(this.f$0, this.f$1, "getOrCreateDestroyTask()", task);
                return orCreateDestroyTask$lambda$59;
            default:
                orCreateDestroyTask$lambda$61 = ReactHostImpl.getOrCreateDestroyTask$lambda$61(this.f$0, this.f$1, "getOrCreateDestroyTask()", task);
                return orCreateDestroyTask$lambda$61;
        }
    }
}
