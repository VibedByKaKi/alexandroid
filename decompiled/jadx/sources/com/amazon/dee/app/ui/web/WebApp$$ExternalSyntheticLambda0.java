package com.amazon.dee.app.ui.web;

import com.amazon.dee.app.ui.web.OOBEBridge;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class WebApp$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ WebApp$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((WebApp) obj).lambda$alertNoNetworkAvailable$1();
                break;
            case 1:
                ((WebApp) obj).notifyResumed();
                break;
            default:
                ((OOBEBridge.StartVoiceEnrollment) obj).lambda$execute$0();
                break;
        }
    }
}
