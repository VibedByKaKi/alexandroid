package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesDeviceSerialNumberFactory implements Factory<String> {
    private final Provider<Context> contextProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDeviceSerialNumberFactory(ApplicationModule applicationModule, Provider<Context> provider) {
        this.module = applicationModule;
        this.contextProvider = provider;
    }

    public static ApplicationModule_ProvidesDeviceSerialNumberFactory create(ApplicationModule applicationModule, Provider<Context> provider) {
        return new ApplicationModule_ProvidesDeviceSerialNumberFactory(applicationModule, provider);
    }

    public static String providesDeviceSerialNumber(ApplicationModule applicationModule, Context context) {
        return (String) Preconditions.checkNotNullFromProvides(applicationModule.providesDeviceSerialNumber(context));
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesDeviceSerialNumber(this.module, this.contextProvider.get());
    }
}
