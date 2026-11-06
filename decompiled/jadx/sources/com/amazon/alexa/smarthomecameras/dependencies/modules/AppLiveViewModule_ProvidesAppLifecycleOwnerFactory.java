package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.smarthomecameras.util.AppLifecycleOwner;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AppLiveViewModule_ProvidesAppLifecycleOwnerFactory implements Factory<AppLifecycleOwner> {
    private static final AppLiveViewModule_ProvidesAppLifecycleOwnerFactory INSTANCE = new AppLiveViewModule_ProvidesAppLifecycleOwnerFactory();

    public static AppLiveViewModule_ProvidesAppLifecycleOwnerFactory create() {
        return INSTANCE;
    }

    public static AppLifecycleOwner providesAppLifecycleOwner() {
        return (AppLifecycleOwner) Preconditions.checkNotNull(AppLiveViewModule.providesAppLifecycleOwner(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public AppLifecycleOwner get() {
        return providesAppLifecycleOwner();
    }
}
