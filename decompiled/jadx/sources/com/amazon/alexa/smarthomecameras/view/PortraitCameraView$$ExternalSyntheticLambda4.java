package com.amazon.alexa.smarthomecameras.view;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.amazon.comms.calling.presentation.ui.extensions.EditTextExtKt;
import com.amazon.ptz.gestures.listeners.PtzListener;
import com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceView;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class PortraitCameraView$$ExternalSyntheticLambda4 implements View.OnTouchListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PortraitCameraView$$ExternalSyntheticLambda4(View view, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean lambda$setupChildViews$2;
        boolean lambda$setupChildViews$0;
        boolean drawableTouchListener$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$setupChildViews$2 = ((PortraitCameraView) this.f$0).lambda$setupChildViews$2((PtzListener) this.f$1, (RTCSurfaceView) this.f$2, view, motionEvent);
                return lambda$setupChildViews$2;
            case 1:
                lambda$setupChildViews$0 = ((LandscapeCameraView) this.f$0).lambda$setupChildViews$0((PtzListener) this.f$1, (RTCSurfaceView) this.f$2, view, motionEvent);
                return lambda$setupChildViews$0;
            default:
                drawableTouchListener$lambda$0 = EditTextExtKt.setDrawableTouchListener$lambda$0((EditText) this.f$0, (Function0) this.f$1, (Function0) this.f$2, view, motionEvent);
                return drawableTouchListener$lambda$0;
        }
    }
}
