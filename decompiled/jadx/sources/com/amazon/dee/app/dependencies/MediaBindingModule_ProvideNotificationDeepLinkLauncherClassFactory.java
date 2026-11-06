package com.amazon.dee.app.dependencies;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes3.dex */
public final class MediaBindingModule_ProvideNotificationDeepLinkLauncherClassFactory implements Factory<Class<?>> {
    private final MediaBindingModule module;

    public MediaBindingModule_ProvideNotificationDeepLinkLauncherClassFactory(MediaBindingModule mediaBindingModule) {
        this.module = mediaBindingModule;
    }

    public static MediaBindingModule_ProvideNotificationDeepLinkLauncherClassFactory create(MediaBindingModule mediaBindingModule) {
        return new MediaBindingModule_ProvideNotificationDeepLinkLauncherClassFactory(mediaBindingModule);
    }

    public static Class<?> provideNotificationDeepLinkLauncherClass(MediaBindingModule mediaBindingModule) {
        return (Class) Preconditions.checkNotNullFromProvides(mediaBindingModule.provideNotificationDeepLinkLauncherClass());
    }

    @Override // javax.inject.Provider
    public Class<?> get() {
        return provideNotificationDeepLinkLauncherClass(this.module);
    }
}
