package com.amazon.alexa.pmi.implementation.taplatency;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class TapLatencyCloserHooks$$ExternalSyntheticLambda1 implements OnBackInvokedCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TapLatencyCloserHooks$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public final void onBackInvoked() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((TapLatencyCloserHooks) obj).onSystemBack();
                break;
            default:
                ((MaterialBackHandler) obj).handleBackInvoked();
                break;
        }
    }
}
