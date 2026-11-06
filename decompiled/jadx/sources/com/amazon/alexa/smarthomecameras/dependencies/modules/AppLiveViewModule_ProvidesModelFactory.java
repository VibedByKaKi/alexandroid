package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.smarthomecameras.CameraViewContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AppLiveViewModule_ProvidesModelFactory implements Factory<CameraViewContract.Model> {
    private static final AppLiveViewModule_ProvidesModelFactory INSTANCE = new AppLiveViewModule_ProvidesModelFactory();

    public static AppLiveViewModule_ProvidesModelFactory create() {
        return INSTANCE;
    }

    public static CameraViewContract.Model providesModel() {
        return (CameraViewContract.Model) Preconditions.checkNotNull(AppLiveViewModule.providesModel(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CameraViewContract.Model get() {
        return providesModel();
    }
}
