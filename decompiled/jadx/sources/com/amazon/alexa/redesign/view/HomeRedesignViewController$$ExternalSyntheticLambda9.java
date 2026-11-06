package com.amazon.alexa.redesign.view;

import android.os.Bundle;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeRedesignViewController$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeRedesignViewController f$0;
    public final /* synthetic */ Bundle f$1;
    public final /* synthetic */ LinearLayout f$2;

    public /* synthetic */ HomeRedesignViewController$$ExternalSyntheticLambda9(HomeRedesignViewController homeRedesignViewController, Bundle bundle, LinearLayout linearLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = homeRedesignViewController;
        this.f$1 = bundle;
        this.f$2 = linearLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$initRNPlaceholder$18(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$initRNPlaceholder$17(this.f$1, this.f$2);
                break;
        }
    }
}
