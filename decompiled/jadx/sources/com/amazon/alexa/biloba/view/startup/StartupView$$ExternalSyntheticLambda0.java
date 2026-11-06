package com.amazon.alexa.biloba.view.startup;

import androidx.lifecycle.Observer;
import com.amazon.alexa.biloba.model.CareActor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class StartupView$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StartupView f$0;

    public /* synthetic */ StartupView$$ExternalSyntheticLambda0(StartupView startupView, int i) {
        this.$r8$classId = i;
        this.f$0 = startupView;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        StartupView startupView = this.f$0;
        switch (i) {
            case 0:
                startupView.clearTTCFOnError((Throwable) obj);
                break;
            case 1:
                startupView.lambda$new$0((CareActor) obj);
                break;
            case 2:
                startupView.lambda$new$1((Boolean) obj);
                break;
            default:
                startupView.lambda$new$2((Integer) obj);
                break;
        }
    }
}
