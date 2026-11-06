package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_OutputSurfaceConfiguration extends OutputSurfaceConfiguration {
    private final OutputSurface imageAnalysisOutputSurface;
    private final OutputSurface imageCaptureOutputSurface;
    private final OutputSurface postviewOutputSurface;
    private final OutputSurface previewOutputSurface;

    public AutoValue_OutputSurfaceConfiguration(OutputSurface outputSurface, OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3, @Nullable OutputSurface outputSurface4) {
        if (outputSurface == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null previewOutputSurface");
            throw null;
        }
        this.previewOutputSurface = outputSurface;
        if (outputSurface2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null imageCaptureOutputSurface");
            throw null;
        }
        this.imageCaptureOutputSurface = outputSurface2;
        this.imageAnalysisOutputSurface = outputSurface3;
        this.postviewOutputSurface = outputSurface4;
    }

    public boolean equals(Object obj) {
        OutputSurface outputSurface;
        OutputSurface outputSurface2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurfaceConfiguration) {
            OutputSurfaceConfiguration outputSurfaceConfiguration = (OutputSurfaceConfiguration) obj;
            if (this.previewOutputSurface.equals(outputSurfaceConfiguration.getPreviewOutputSurface()) && this.imageCaptureOutputSurface.equals(outputSurfaceConfiguration.getImageCaptureOutputSurface()) && ((outputSurface = this.imageAnalysisOutputSurface) != null ? outputSurface.equals(outputSurfaceConfiguration.getImageAnalysisOutputSurface()) : outputSurfaceConfiguration.getImageAnalysisOutputSurface() == null) && ((outputSurface2 = this.postviewOutputSurface) != null ? outputSurface2.equals(outputSurfaceConfiguration.getPostviewOutputSurface()) : outputSurfaceConfiguration.getPostviewOutputSurface() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @Nullable
    public OutputSurface getImageAnalysisOutputSurface() {
        return this.imageAnalysisOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @NonNull
    public OutputSurface getImageCaptureOutputSurface() {
        return this.imageCaptureOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @Nullable
    public OutputSurface getPostviewOutputSurface() {
        return this.postviewOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @NonNull
    public OutputSurface getPreviewOutputSurface() {
        return this.previewOutputSurface;
    }

    public int hashCode() {
        int hashCode = (((this.previewOutputSurface.hashCode() ^ 1000003) * 1000003) ^ this.imageCaptureOutputSurface.hashCode()) * 1000003;
        OutputSurface outputSurface = this.imageAnalysisOutputSurface;
        int hashCode2 = (hashCode ^ (outputSurface == null ? 0 : outputSurface.hashCode())) * 1000003;
        OutputSurface outputSurface2 = this.postviewOutputSurface;
        return hashCode2 ^ (outputSurface2 != null ? outputSurface2.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.previewOutputSurface + ", imageCaptureOutputSurface=" + this.imageCaptureOutputSurface + ", imageAnalysisOutputSurface=" + this.imageAnalysisOutputSurface + ", postviewOutputSurface=" + this.postviewOutputSurface + StringSubstitutor.DEFAULT_VAR_END;
    }
}
