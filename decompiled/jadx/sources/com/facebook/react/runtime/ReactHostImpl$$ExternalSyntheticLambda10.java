package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Task;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactHostImpl$$ExternalSyntheticLambda10 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactHostImpl f$0;

    public /* synthetic */ ReactHostImpl$$ExternalSyntheticLambda10(ReactHostImpl reactHostImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = reactHostImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Task waitThenCallGetOrCreateReactInstanceTask;
        Task orCreateStartTask;
        int i = this.$r8$classId;
        ReactHostImpl reactHostImpl = this.f$0;
        switch (i) {
            case 0:
                waitThenCallGetOrCreateReactInstanceTask = reactHostImpl.waitThenCallGetOrCreateReactInstanceTask();
                return waitThenCallGetOrCreateReactInstanceTask;
            default:
                orCreateStartTask = reactHostImpl.getOrCreateStartTask();
                return orCreateStartTask;
        }
    }
}
