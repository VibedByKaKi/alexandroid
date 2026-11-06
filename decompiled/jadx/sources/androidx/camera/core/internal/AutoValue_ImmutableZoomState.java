package androidx.camera.core.internal;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_ImmutableZoomState extends ImmutableZoomState {
    private final float linearZoom;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private final float zoomRatio;

    public AutoValue_ImmutableZoomState(float f, float f2, float f3, float f4) {
        this.zoomRatio = f;
        this.maxZoomRatio = f2;
        this.minZoomRatio = f3;
        this.linearZoom = f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableZoomState) {
            ImmutableZoomState immutableZoomState = (ImmutableZoomState) obj;
            if (Float.floatToIntBits(this.zoomRatio) == Float.floatToIntBits(immutableZoomState.getZoomRatio()) && Float.floatToIntBits(this.maxZoomRatio) == Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && Float.floatToIntBits(this.minZoomRatio) == Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && Float.floatToIntBits(this.linearZoom) == Float.floatToIntBits(immutableZoomState.getLinearZoom())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.linearZoom;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.zoomRatio;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.linearZoom) ^ ((((((Float.floatToIntBits(this.zoomRatio) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.maxZoomRatio)) * 1000003) ^ Float.floatToIntBits(this.minZoomRatio)) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.zoomRatio);
        sb.append(", maxZoomRatio=");
        sb.append(this.maxZoomRatio);
        sb.append(", minZoomRatio=");
        sb.append(this.minZoomRatio);
        sb.append(", linearZoom=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.linearZoom);
    }
}
