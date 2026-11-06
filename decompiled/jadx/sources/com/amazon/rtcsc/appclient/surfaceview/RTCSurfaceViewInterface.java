package com.amazon.rtcsc.appclient.surfaceview;

import com.amazon.rtcsc.interfaces.RtcscTimestampRetrievalParams;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface RTCSurfaceViewInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ViewDirection {
        LOCAL_VIEW,
        REMOTE_VIEW
    }

    void clearImage();

    void disableVideoFrameTimestampRetrieval();

    void enableVideoFrameTimestampRetrieval(RtcscTimestampRetrievalParams rtcscTimestampRetrievalParams);

    void init(String str, ViewDirection viewDirection);

    void release();

    void setEnableHardwareScaler(boolean z);

    void setMirror(boolean z);

    void setScalingType(ScalingType scalingType);
}
