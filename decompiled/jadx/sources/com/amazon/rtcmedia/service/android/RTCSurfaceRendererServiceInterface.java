package com.amazon.rtcmedia.service.android;

import android.view.Surface;
import com.amazon.rtcmedia.util.ViewDirection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface RTCSurfaceRendererServiceInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RendererListener {
        int onGetHeight();

        int onGetWidth();

        void onHolderSetFixedSize(int i, int i2);

        void onHolderSetSizeFromLayout();

        void onMeasuredDimension(int i, int i2);

        void onRequestLayout();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    void clearImage();

    void init(RendererListener rendererListener, ViewDirection viewDirection, String str, String str2);

    void onLayout(boolean z, int i, int i2, int i3, int i4);

    void onMeasure(int i, int i2);

    void release();

    void setEnableHardwareScaler(Boolean bool);

    void setMirror(boolean z);

    void setScalingType(ScalingType scalingType);

    void surfaceChanged(Surface surface, int i, int i2, int i3);

    void surfaceCreated(Surface surface);

    void surfaceDestroyed(Surface surface);
}
