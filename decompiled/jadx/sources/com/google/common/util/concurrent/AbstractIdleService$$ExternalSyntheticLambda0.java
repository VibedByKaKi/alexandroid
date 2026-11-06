package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractIdleService$$ExternalSyntheticLambda0 implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Service f$0;

    public /* synthetic */ AbstractIdleService$$ExternalSyntheticLambda0(Service service, int i) {
        this.$r8$classId = i;
        this.f$0 = service;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Service service = this.f$0;
        switch (i) {
            case 0:
                ((AbstractIdleService) service).lambda$executor$0(runnable);
                break;
            default:
                ((AbstractExecutionThreadService) service).lambda$executor$0(runnable);
                break;
        }
    }
}
