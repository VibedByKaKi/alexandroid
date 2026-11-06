package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactHostImpl$$ExternalSyntheticLambda14 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Task orCreateStartTask$lambda$26$lambda$25;
        Void destroy$lambda$8;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                orCreateStartTask$lambda$26$lambda$25 = ReactHostImpl.getOrCreateStartTask$lambda$26$lambda$25((Exception) obj, task);
                return orCreateStartTask$lambda$26$lambda$25;
            default:
                destroy$lambda$8 = ReactHostImpl.destroy$lambda$8((Function1) obj, task);
                return destroy$lambda$8;
        }
    }
}
