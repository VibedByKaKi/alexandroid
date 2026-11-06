package com.amazon.ptz.gestures.listeners;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.amazon.ptz.gestures.Gesture;
import com.amazon.ptz.gestures.GestureType;
import com.amazon.ptz.gestures.TransformInfo;
import com.amazon.ptz.gestures.handlers.GestureHandler;
import com.amazon.ptz.metrics.MetricRecorder;
import com.amazon.ptz.util.LogTag;
import com.amazon.ptz.util.ZoomInput;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import javax.annotation.Nonnull;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SimplePtzGestureListener extends GestureDetector.SimpleOnGestureListener {
    private static final String TAG = LogTag.forClass(SimplePtzGestureListener.class);

    @Nonnull
    private final GestureHandler gestureHandler;

    @Nonnull
    private final MetricRecorder metricRecorder;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SimplePtzGestureListener(@Nonnull GestureHandler gestureHandler, @Nonnull MetricRecorder metricRecorder) {
        if (gestureHandler == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("gestureHandler is marked non-null but is null");
            throw null;
        }
        if (metricRecorder == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("metricRecorder is marked non-null but is null");
            throw null;
        }
        this.gestureHandler = gestureHandler;
        this.metricRecorder = metricRecorder;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Objects.toString(motionEvent);
        Gesture gesture = new Gesture(GestureType.ZOOM_TOGGLE, new TransformInfo(0.0f, 0.0f, 0.0f, motionEvent.getX(), motionEvent.getY()));
        this.metricRecorder.recordDigitalZoomRequest(ZoomInput.DOUBLE_TAP);
        this.gestureHandler.handle(gesture);
        return true;
    }
}
