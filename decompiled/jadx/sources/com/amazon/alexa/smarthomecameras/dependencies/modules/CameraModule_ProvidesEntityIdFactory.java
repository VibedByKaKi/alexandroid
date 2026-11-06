package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.smarthomecameras.model.EntityId;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CameraModule_ProvidesEntityIdFactory implements Factory<EntityId> {
    private final CameraModule module;

    public CameraModule_ProvidesEntityIdFactory(CameraModule cameraModule) {
        this.module = cameraModule;
    }

    public static CameraModule_ProvidesEntityIdFactory create(CameraModule cameraModule) {
        return new CameraModule_ProvidesEntityIdFactory(cameraModule);
    }

    public static EntityId providesEntityId(CameraModule cameraModule) {
        return (EntityId) Preconditions.checkNotNull(cameraModule.providesEntityId(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public EntityId get() {
        return providesEntityId(this.module);
    }
}
