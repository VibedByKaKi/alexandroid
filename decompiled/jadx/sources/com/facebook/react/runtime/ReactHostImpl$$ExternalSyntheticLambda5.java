package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactHostImpl$$ExternalSyntheticLambda5 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactHostImpl f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda5(ReactHostImpl reactHostImpl, String str, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = reactHostImpl;
        this.f$1 = str;
        this.f$2 = obj;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Void callAfterGetOrCreateReactInstance$lambda$29;
        Boolean callWithExistingReactInstance$lambda$28;
        Task destroy$lambda$10$lambda$9;
        switch (this.$r8$classId) {
            case 0:
                callAfterGetOrCreateReactInstance$lambda$29 = ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$29(this.f$0, this.f$1, (Function1) this.f$2, task);
                return callAfterGetOrCreateReactInstance$lambda$29;
            case 1:
                callWithExistingReactInstance$lambda$28 = ReactHostImpl.callWithExistingReactInstance$lambda$28(this.f$0, this.f$1, (Function1) this.f$2, task);
                return callWithExistingReactInstance$lambda$28;
            default:
                destroy$lambda$10$lambda$9 = ReactHostImpl.destroy$lambda$10$lambda$9(this.f$0, this.f$1, (Exception) this.f$2, task);
                return destroy$lambda$10$lambda$9;
        }
    }
}
