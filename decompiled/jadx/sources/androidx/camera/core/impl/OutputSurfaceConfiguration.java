package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class OutputSurfaceConfiguration {
    @NonNull
    public static OutputSurfaceConfiguration create(@NonNull OutputSurface outputSurface, @NonNull OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3, @Nullable OutputSurface outputSurface4) {
        return new AutoValue_OutputSurfaceConfiguration(outputSurface, outputSurface2, outputSurface3, outputSurface4);
    }

    @Nullable
    public abstract OutputSurface getImageAnalysisOutputSurface();

    @NonNull
    public abstract OutputSurface getImageCaptureOutputSurface();

    @Nullable
    public abstract OutputSurface getPostviewOutputSurface();

    @NonNull
    public abstract OutputSurface getPreviewOutputSurface();
}
