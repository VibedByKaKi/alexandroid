package com.amazon.alexa.growth.coachmark;

import android.view.MotionEvent;
import android.view.View;
import com.amazon.alexa.ra.core.ui.webview.CustomWebViewClient;
import com.amazon.alexa.redesign.view.header.HomeHeader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class TourCoachMark$$ExternalSyntheticLambda1 implements View.OnTouchListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TourCoachMark$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean lambda$generateFullscreenTouchInterceptor$5;
        boolean initialize$lambda$2$lambda$1;
        boolean lambda$initHomeHeader$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$generateFullscreenTouchInterceptor$5 = TourCoachMark.lambda$generateFullscreenTouchInterceptor$5(view, motionEvent);
                return lambda$generateFullscreenTouchInterceptor$5;
            case 1:
                initialize$lambda$2$lambda$1 = CustomWebViewClient.initialize$lambda$2$lambda$1(view, motionEvent);
                return initialize$lambda$2$lambda$1;
            default:
                lambda$initHomeHeader$2 = HomeHeader.lambda$initHomeHeader$2(view, motionEvent);
                return lambda$initHomeHeader$2;
        }
    }
}
