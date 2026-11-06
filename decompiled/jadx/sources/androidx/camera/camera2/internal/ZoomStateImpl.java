package androidx.camera.camera2.internal;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f, float f2) {
        this.mMaxZoomRatio = f;
        this.mMinZoomRatio = f2;
    }

    private float getPercentageByRatio(float f) {
        float f2 = this.mMaxZoomRatio;
        float f3 = this.mMinZoomRatio;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    private float getRatioByPercentage(float f) {
        if (f == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f2 = this.mMaxZoomRatio;
        float f3 = this.mMinZoomRatio;
        double d = 1.0f / f3;
        return (float) MathUtils.clamp(1.0d / ((((1.0f / f2) - d) * f) + d), f3, f2);
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f) throws IllegalArgumentException {
        if (f > 1.0f || f < 0.0f) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(f, "Requested linearZoom ", " is not within valid range [0..1]"));
        } else {
            this.mLinearZoom = f;
            this.mZoomRatio = getRatioByPercentage(f);
        }
    }

    public void setZoomRatio(float f) throws IllegalArgumentException {
        if (f <= this.mMaxZoomRatio && f >= this.mMinZoomRatio) {
            this.mZoomRatio = f;
            this.mLinearZoom = getPercentageByRatio(f);
            return;
        }
        StringBuilder sb = new StringBuilder("Requested zoomRatio ");
        sb.append(f);
        sb.append(" is not within valid range [");
        sb.append(this.mMinZoomRatio);
        sb.append(" , ");
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_BRACKET, this.mMaxZoomRatio));
    }
}
