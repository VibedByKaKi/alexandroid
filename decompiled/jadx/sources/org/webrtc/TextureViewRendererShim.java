package org.webrtc;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import org.webrtc.WebRTCRendererShim;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class TextureViewRendererShim extends TextureViewRenderer implements WebRTCRendererShim<TextureView> {
    private static final String TAG = "TextureViewRendererShim";
    private boolean firstFrameReceived;
    private boolean firstFrameRendered;

    public TextureViewRendererShim(Context context) {
        super(context);
        this.firstFrameRendered = false;
        this.firstFrameReceived = false;
    }

    @Override // org.webrtc.WebRTCRendererShim
    public void enableRenderBlack(boolean z) {
        Automotive$$ExternalSyntheticOutline0.m8396m("enableRenderBlack enable = ", TAG, z);
    }

    @Override // org.webrtc.WebRTCRendererShim
    public boolean firstFrameReceived() {
        return this.firstFrameReceived;
    }

    @Override // org.webrtc.WebRTCRendererShim
    public boolean firstFrameRendered() {
        return this.firstFrameRendered;
    }

    @Override // org.webrtc.WebRTCRendererShim
    public void setFirstFrameReceived() {
        this.firstFrameReceived = true;
    }

    @Override // org.webrtc.WebRTCRendererShim
    public void setFirstFrameRendered() {
        this.firstFrameRendered = true;
    }

    @Override // org.webrtc.WebRTCRendererShim
    public void setShape(WebRTCRendererShim.Shape shape, int i) {
        Log.e(TAG, "setShape not supported; use ViewOutlineProvider and View#setClipToOutline");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.webrtc.WebRTCRendererShim
    public TextureView getView() {
        return this;
    }

    public TextureViewRendererShim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.firstFrameRendered = false;
        this.firstFrameReceived = false;
    }
}
