package com.amazon.dee.app.services.core;

import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final /* synthetic */ class DefaultApplicationLifecycleService$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ApplicationLifecycleObserver f$0;

    public /* synthetic */ DefaultApplicationLifecycleService$$ExternalSyntheticLambda0(ApplicationLifecycleObserver applicationLifecycleObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = applicationLifecycleObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ApplicationLifecycleObserver applicationLifecycleObserver = this.f$0;
        switch (i) {
            case 0:
                applicationLifecycleObserver.onStart();
                break;
            default:
                applicationLifecycleObserver.onStop();
                break;
        }
    }
}
