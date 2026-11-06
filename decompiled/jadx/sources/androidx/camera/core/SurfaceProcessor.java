package androidx.camera.core;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface SurfaceProcessor {
    void onInputSurface(@NonNull SurfaceRequest surfaceRequest) throws ProcessingException;

    void onOutputSurface(@NonNull SurfaceOutput surfaceOutput) throws ProcessingException;
}
