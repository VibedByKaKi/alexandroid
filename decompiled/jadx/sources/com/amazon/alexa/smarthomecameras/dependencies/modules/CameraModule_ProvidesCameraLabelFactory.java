package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.smarthomecameras.model.CameraLabel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CameraModule_ProvidesCameraLabelFactory implements Factory<CameraLabel> {
    private final CameraModule module;

    public CameraModule_ProvidesCameraLabelFactory(CameraModule cameraModule) {
        this.module = cameraModule;
    }

    public static CameraModule_ProvidesCameraLabelFactory create(CameraModule cameraModule) {
        return new CameraModule_ProvidesCameraLabelFactory(cameraModule);
    }

    public static CameraLabel providesCameraLabel(CameraModule cameraModule) {
        return (CameraLabel) Preconditions.checkNotNull(cameraModule.providesCameraLabel(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CameraLabel get() {
        return providesCameraLabel(this.module);
    }
}
