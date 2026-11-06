package org.webrtc;

import android.view.View;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface WebRTCRendererShim<T extends View> extends VideoSink {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Shape {
        Circle,
        Rectangle,
        RoundedRectangle
    }

    void enableRenderBlack(boolean z);

    boolean firstFrameReceived();

    boolean firstFrameRendered();

    T getView();

    void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents);

    void release();

    void setFirstFrameReceived();

    void setFirstFrameRendered();

    void setMirror(boolean z);

    void setScalingType(RendererCommon.ScalingType scalingType);

    void setShape(Shape shape, int i);
}
