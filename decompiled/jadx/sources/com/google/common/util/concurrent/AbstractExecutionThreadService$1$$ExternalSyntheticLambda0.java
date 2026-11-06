package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.AbstractScheduledService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractExecutionThreadService$1$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractService f$0;

    public /* synthetic */ AbstractExecutionThreadService$1$$ExternalSyntheticLambda0(AbstractService abstractService, int i) {
        this.$r8$classId = i;
        this.f$0 = abstractService;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        String lambda$doStart$0;
        String lambda$doStart$02;
        int i = this.$r8$classId;
        AbstractService abstractService = this.f$0;
        switch (i) {
            case 0:
                lambda$doStart$0 = ((AbstractExecutionThreadService.AnonymousClass1) abstractService).lambda$doStart$0();
                return lambda$doStart$0;
            default:
                lambda$doStart$02 = ((AbstractScheduledService.ServiceDelegate) abstractService).lambda$doStart$0();
                return lambda$doStart$02;
        }
    }
}
