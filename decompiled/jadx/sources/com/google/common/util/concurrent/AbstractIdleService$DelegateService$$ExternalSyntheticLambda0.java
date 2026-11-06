package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractIdleService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractIdleService$DelegateService$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractIdleService.DelegateService f$0;

    public /* synthetic */ AbstractIdleService$DelegateService$$ExternalSyntheticLambda0(AbstractIdleService.DelegateService delegateService, int i) {
        this.$r8$classId = i;
        this.f$0 = delegateService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AbstractIdleService.DelegateService delegateService = this.f$0;
        switch (i) {
            case 0:
                delegateService.lambda$doStop$0();
                break;
            default:
                delegateService.lambda$doStart$0();
                break;
        }
    }
}
