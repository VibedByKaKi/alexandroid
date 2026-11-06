package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.smarthomecameras.view.ActivityOrientationListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class LandscapeViewModule_ProvidesOrientationListenerFactory implements Factory<ActivityOrientationListener> {
    private final LandscapeViewModule module;

    public LandscapeViewModule_ProvidesOrientationListenerFactory(LandscapeViewModule landscapeViewModule) {
        this.module = landscapeViewModule;
    }

    public static LandscapeViewModule_ProvidesOrientationListenerFactory create(LandscapeViewModule landscapeViewModule) {
        return new LandscapeViewModule_ProvidesOrientationListenerFactory(landscapeViewModule);
    }

    public static ActivityOrientationListener providesOrientationListener(LandscapeViewModule landscapeViewModule) {
        return (ActivityOrientationListener) Preconditions.checkNotNull(landscapeViewModule.providesOrientationListener(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ActivityOrientationListener get() {
        return providesOrientationListener(this.module);
    }
}
