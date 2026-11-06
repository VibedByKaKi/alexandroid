package com.amazon.alexa.smarthomecameras.dependencies.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SmartAlertEventModule_ProvidesImageUrlFactory implements Factory<String> {
    private final SmartAlertEventModule module;

    public SmartAlertEventModule_ProvidesImageUrlFactory(SmartAlertEventModule smartAlertEventModule) {
        this.module = smartAlertEventModule;
    }

    public static SmartAlertEventModule_ProvidesImageUrlFactory create(SmartAlertEventModule smartAlertEventModule) {
        return new SmartAlertEventModule_ProvidesImageUrlFactory(smartAlertEventModule);
    }

    public static String providesImageUrl(SmartAlertEventModule smartAlertEventModule) {
        return (String) Preconditions.checkNotNull(smartAlertEventModule.providesImageUrl(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesImageUrl(this.module);
    }
}
