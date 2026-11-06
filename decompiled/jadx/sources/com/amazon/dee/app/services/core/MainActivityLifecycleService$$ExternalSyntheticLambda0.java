package com.amazon.dee.app.services.core;

import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final /* synthetic */ class MainActivityLifecycleService$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainActivityLifecycleObserver f$0;

    public /* synthetic */ MainActivityLifecycleService$$ExternalSyntheticLambda0(MainActivityLifecycleObserver mainActivityLifecycleObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = mainActivityLifecycleObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MainActivityLifecycleObserver mainActivityLifecycleObserver = this.f$0;
        switch (i) {
            case 0:
                mainActivityLifecycleObserver.onActivityPause();
                break;
            case 1:
                mainActivityLifecycleObserver.onActivityCreated();
                break;
            case 2:
                mainActivityLifecycleObserver.onActivityDestroy();
                break;
            case 3:
                mainActivityLifecycleObserver.onActivityResume();
                break;
            case 4:
                mainActivityLifecycleObserver.onActivityStop();
                break;
            default:
                mainActivityLifecycleObserver.onActivityStart();
                break;
        }
    }
}
