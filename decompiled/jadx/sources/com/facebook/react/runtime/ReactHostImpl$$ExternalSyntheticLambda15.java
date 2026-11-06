package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactHostImpl$$ExternalSyntheticLambda15 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactHostImpl f$0;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda15(Function2 function2, ReactHostImpl reactHostImpl, String str) {
        this.$r8$classId = 2;
        this.f$2 = function2;
        this.f$0 = reactHostImpl;
        this.f$3 = str;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Task orCreateReloadTask$lambda$48;
        Task orCreateDestroyTask$lambda$57;
        Task orCreateDestroyTask$lambda$60;
        switch (this.$r8$classId) {
            case 0:
                orCreateReloadTask$lambda$48 = ReactHostImpl.getOrCreateReloadTask$lambda$48(this.f$0, "getOrCreateReloadTask()", this.f$2, this.f$3, task);
                return orCreateReloadTask$lambda$48;
            case 1:
                orCreateDestroyTask$lambda$57 = ReactHostImpl.getOrCreateDestroyTask$lambda$57(this.f$0, "getOrCreateDestroyTask()", this.f$2, this.f$3, task);
                return orCreateDestroyTask$lambda$57;
            default:
                orCreateDestroyTask$lambda$60 = ReactHostImpl.getOrCreateDestroyTask$lambda$60(this.f$2, this.f$0, "getOrCreateDestroyTask()", this.f$3, task);
                return orCreateDestroyTask$lambda$60;
        }
    }

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda15(ReactHostImpl reactHostImpl, Function2 function2, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = reactHostImpl;
        this.f$2 = function2;
        this.f$3 = str;
    }
}
