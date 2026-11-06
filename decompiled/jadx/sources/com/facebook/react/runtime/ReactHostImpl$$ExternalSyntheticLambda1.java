package com.facebook.react.runtime;

import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactHostImpl$$ExternalSyntheticLambda1 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactHostImpl f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda1(ReactHostImpl reactHostImpl, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = reactHostImpl;
        this.f$1 = str;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        ReactHostImpl.CreationResult orCreateReactInstanceTask$lambda$41$lambda$38;
        Task reload$lambda$7$lambda$5$lambda$4;
        Task orCreateReloadTask$lambda$54;
        Void orCreateDestroyTask$lambda$62;
        switch (this.$r8$classId) {
            case 0:
                orCreateReactInstanceTask$lambda$41$lambda$38 = ReactHostImpl.getOrCreateReactInstanceTask$lambda$41$lambda$38(this.f$0, this.f$1, task);
                return orCreateReactInstanceTask$lambda$41$lambda$38;
            case 1:
                reload$lambda$7$lambda$5$lambda$4 = ReactHostImpl.reload$lambda$7$lambda$5$lambda$4(this.f$0, this.f$1, task);
                return reload$lambda$7$lambda$5$lambda$4;
            case 2:
                orCreateReloadTask$lambda$54 = ReactHostImpl.getOrCreateReloadTask$lambda$54(this.f$0, "getOrCreateReloadTask()", this.f$1, task);
                return orCreateReloadTask$lambda$54;
            default:
                orCreateDestroyTask$lambda$62 = ReactHostImpl.getOrCreateDestroyTask$lambda$62(this.f$0, "getOrCreateDestroyTask()", this.f$1, task);
                return orCreateDestroyTask$lambda$62;
        }
    }
}
