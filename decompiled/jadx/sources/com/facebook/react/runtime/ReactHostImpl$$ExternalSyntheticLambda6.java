package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactHostImpl$$ExternalSyntheticLambda6 implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactHostImpl f$0;

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda6(ReactHostImpl reactHostImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        Void callAfterGetOrCreateReactInstance$lambda$30;
        Task reload$lambda$7$lambda$6;
        Task orCreateStartTask$lambda$26;
        Task _get_jsBundleLoader_$lambda$42;
        int i = this.$r8$classId;
        ReactHostImpl reactHostImpl = this.f$0;
        switch (i) {
            case 0:
                callAfterGetOrCreateReactInstance$lambda$30 = ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$30(reactHostImpl, task);
                return callAfterGetOrCreateReactInstance$lambda$30;
            case 1:
                reload$lambda$7$lambda$6 = ReactHostImpl.reload$lambda$7$lambda$6(reactHostImpl, task);
                return reload$lambda$7$lambda$6;
            case 2:
                orCreateStartTask$lambda$26 = ReactHostImpl.getOrCreateStartTask$lambda$26(reactHostImpl, task);
                return orCreateStartTask$lambda$26;
            default:
                _get_jsBundleLoader_$lambda$42 = ReactHostImpl._get_jsBundleLoader_$lambda$42(reactHostImpl, task);
                return _get_jsBundleLoader_$lambda$42;
        }
    }
}
