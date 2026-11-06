package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class VideoDecoderGLSurfaceView extends GLSurfaceView {
    private final VideoDecoderGLFrameRenderer renderer;

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        VideoDecoderGLFrameRenderer videoDecoderGLFrameRenderer = new VideoDecoderGLFrameRenderer(this);
        this.renderer = videoDecoderGLFrameRenderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(videoDecoderGLFrameRenderer);
        setRenderMode(0);
    }

    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this.renderer;
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }
}
