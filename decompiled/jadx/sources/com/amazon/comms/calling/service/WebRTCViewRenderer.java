package com.amazon.comms.calling.service;

import android.view.SurfaceView;
import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface WebRTCViewRenderer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SurfaceViewShape {
        CIRCLE,
        RECTANGLE,
        ROUNDED_RECTANGLE;

        public static SurfaceViewShape getValue(String str) {
            return str == null ? RECTANGLE : valueOf(str);
        }
    }

    boolean firstFrameReceived();

    boolean firstFrameRendered();

    @Deprecated
    SurfaceView getSurfaceView();

    <T extends View> T getView(Class<T> cls);

    void setMirror(boolean z);

    void setScalingType(ScalingType scalingType);

    void setSurfaceViewShape(SurfaceViewShape surfaceViewShape, int i);
}
