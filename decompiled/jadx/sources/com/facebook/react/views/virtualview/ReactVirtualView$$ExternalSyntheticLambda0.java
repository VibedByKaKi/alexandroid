package com.facebook.react.views.virtualview;

import android.view.ViewTreeObserver;
import com.amazon.alexa.pmi.implementation.taplatency.SecondaryWindowTracker;
import com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class ReactVirtualView$$ExternalSyntheticLambda0 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ReactVirtualView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ReactVirtualView) obj).dispatchOnModeChangeIfNeeded(false);
                break;
            case 1:
                ((SecondaryWindowTracker) obj).scheduleSweep();
                break;
            default:
                TarazedAppLifeCycleObserver.setupWindowFocusChangeListener$lambda$0((TarazedAppLifeCycleObserver) obj, z);
                break;
        }
    }
}
