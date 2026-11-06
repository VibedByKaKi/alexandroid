package com.amazon.ptz.gestures.listeners;

import android.view.KeyEvent;
import com.amazon.ptz.digital.DigitalMagnitudes;
import com.amazon.ptz.digital.DigitalZoomState;
import com.amazon.ptz.gestures.Gesture;
import com.amazon.ptz.gestures.GestureType;
import com.amazon.ptz.gestures.TransformInfo;
import com.amazon.ptz.gestures.handlers.GestureHandler;
import com.amazon.ptz.metrics.MetricRecorder;
import com.amazon.ptz.util.LogTag;
import com.amazon.ptz.util.ZoomInput;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.Nonnull;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PtzKeyEventListener {
    private static final int KEYEVENT_INTERVAL_MILLIS = 400;
    private static final String TAG = LogTag.forClass(PtzKeyEventListener.class);
    private static final float ZOOM_IN_SCALE = DigitalMagnitudes.DIGITAL_ZOOM_IN.getMagnitude();
    private static final float ZOOM_OUT_SCALE = DigitalMagnitudes.DIGITAL_ZOOM_OUT.getMagnitude();

    @Nonnull
    private final GestureHandler gestureHandler;
    private long keyDownTimeMillis;

    @Nonnull
    private final MetricRecorder metricRecorder;

    @Nonnull
    private final DigitalZoomState zoomState;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PtzKeyEventListener(@Nonnull GestureHandler gestureHandler, @Nonnull MetricRecorder metricRecorder, @Nonnull DigitalZoomState digitalZoomState) {
        if (gestureHandler == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("gestureHandler is marked non-null but is null");
            throw null;
        }
        if (metricRecorder == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("metricRecorder is marked non-null but is null");
            throw null;
        }
        if (digitalZoomState == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("zoomState is marked non-null but is null");
            throw null;
        }
        this.gestureHandler = gestureHandler;
        this.metricRecorder = metricRecorder;
        this.zoomState = digitalZoomState;
    }

    private void handleKeyEvent(float f, float f2, float f3, GestureType gestureType) {
        if (!gestureType.equals(GestureType.PAN_TILT) || sendKeyEvents()) {
            this.gestureHandler.handle(new Gesture(gestureType, new TransformInfo(f, f2, f3, 0.0f, 0.0f)));
        }
    }

    private boolean sendKeyEvents() {
        if (!this.zoomState.isZoomedOut()) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.keyDownTimeMillis <= 400) {
            return false;
        }
        this.keyDownTimeMillis = currentTimeMillis;
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        float magnitude = (this.zoomState.isZoomedOut() ? DigitalMagnitudes.PHYSICAL_PAN_STEP : DigitalMagnitudes.DIGITAL_PAN_STEP).getMagnitude();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4) {
            resetCameraView();
            return false;
        }
        if (keyCode == 89) {
            handleKeyEvent(0.0f, 0.0f, ZOOM_OUT_SCALE, GestureType.ZOOM_OUT_CENTER);
            return true;
        }
        if (keyCode == 90) {
            this.metricRecorder.recordDigitalZoomRequest(ZoomInput.BUTTON_PRESS);
            handleKeyEvent(0.0f, 0.0f, ZOOM_IN_SCALE, GestureType.ZOOM_IN_CENTER);
            return true;
        }
        switch (keyCode) {
            case 19:
                handleKeyEvent(0.0f, magnitude, 0.0f, GestureType.PAN_TILT);
                return true;
            case 20:
                handleKeyEvent(0.0f, -magnitude, 0.0f, GestureType.PAN_TILT);
                return true;
            case 21:
                handleKeyEvent(magnitude, 0.0f, 0.0f, GestureType.PAN_TILT);
                return true;
            case 22:
                handleKeyEvent(-magnitude, 0.0f, 0.0f, GestureType.PAN_TILT);
                return true;
            default:
                return false;
        }
    }

    public void resetCameraView() {
        handleKeyEvent(0.0f, 0.0f, 0.0f, GestureType.ZOOM_OUT_CENTER);
    }
}
