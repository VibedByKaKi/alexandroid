package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractScheduledService.ServiceDelegate f$0;

    public /* synthetic */ AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda1(AbstractScheduledService.ServiceDelegate serviceDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = serviceDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AbstractScheduledService.ServiceDelegate serviceDelegate = this.f$0;
        switch (i) {
            case 0:
                serviceDelegate.lambda$doStart$1();
                break;
            default:
                serviceDelegate.lambda$doStop$0();
                break;
        }
    }
}
