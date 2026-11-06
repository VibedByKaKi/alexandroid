package com.mrousavy.camera.react;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.amazon.alexa.growth.coachmark.CoachMark;
import com.amazon.alexa.navigation.menu.viewcontroller.NavigationViewController;
import com.amazon.alexa.ra.features.backgroundmode.OverlayUIController;
import com.amazon.alexa.redesign.view.carousel.CarouselViewHolder;
import com.amazon.alexa.redesign.view.viewtypes.CarouselView;
import com.amazon.dee.app.ui.video.VideoActivity;
import com.amazon.deecomms.call.active.ActiveVideoCallView;
import com.amazon.deecomms.calling.accessibility.RealTimeTextView;
import com.amazon.tarazed.ui.menu.MenuBarManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class CameraView$$ExternalSyntheticLambda0 implements View.OnTouchListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CameraView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean updateZoomGesture$lambda$0;
        boolean lambda$generateFullscreenTouchInterceptor$6;
        boolean lambda$setUpMoreTitle$1;
        boolean z;
        boolean onTouchListener$lambda$0;
        boolean onTouchListener$lambda$02;
        boolean lambda$setUpVideoView$2;
        boolean lambda$bind$0;
        boolean lambda$setListeners$2;
        boolean onTouch$lambda$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                updateZoomGesture$lambda$0 = CameraView.updateZoomGesture$lambda$0((ScaleGestureDetector) obj, view, motionEvent);
                return updateZoomGesture$lambda$0;
            case 1:
                lambda$generateFullscreenTouchInterceptor$6 = ((CoachMark) obj).lambda$generateFullscreenTouchInterceptor$6(view, motionEvent);
                return lambda$generateFullscreenTouchInterceptor$6;
            case 2:
                lambda$setUpMoreTitle$1 = NavigationViewController.lambda$setUpMoreTitle$1((ImageView) obj, view, motionEvent);
                return lambda$setUpMoreTitle$1;
            case 3:
                z = OverlayUIController.setupClickListeners$lambda$3((OverlayUIController) obj, view, motionEvent);
                return z;
            case 4:
                onTouchListener$lambda$0 = CarouselViewHolder.onTouchListener$lambda$0((CarouselViewHolder) obj, view, motionEvent);
                return onTouchListener$lambda$0;
            case 5:
                onTouchListener$lambda$02 = CarouselView.onTouchListener$lambda$0((CarouselView) obj, view, motionEvent);
                return onTouchListener$lambda$02;
            case 6:
                lambda$setUpVideoView$2 = ((VideoActivity) obj).lambda$setUpVideoView$2(view, motionEvent);
                return lambda$setUpVideoView$2;
            case 7:
                lambda$bind$0 = ((ActiveVideoCallView) obj).lambda$bind$0(view, motionEvent);
                return lambda$bind$0;
            case 8:
                lambda$setListeners$2 = ((RealTimeTextView) obj).lambda$setListeners$2(view, motionEvent);
                return lambda$setListeners$2;
            default:
                onTouch$lambda$1 = MenuBarManager.setOnTouch$lambda$1((MenuBarManager) obj, view, motionEvent);
                return onTouch$lambda$1;
        }
    }
}
