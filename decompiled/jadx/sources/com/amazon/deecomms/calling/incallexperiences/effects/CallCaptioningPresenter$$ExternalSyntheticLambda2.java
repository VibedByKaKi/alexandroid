package com.amazon.deecomms.calling.incallexperiences.effects;

import android.view.View;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallCaptioningPresenter$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CallCaptioningPresenter$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                CallCaptioningPresenter.lambda$initialize$1(view);
                break;
            case 1:
                CallCaptioningPresenter.lambda$initialize$2(view);
                break;
            default:
                RNGestureHandlerButtonViewManager.ButtonViewGroup.dummyClickListener$lambda$14(view);
                break;
        }
    }
}
