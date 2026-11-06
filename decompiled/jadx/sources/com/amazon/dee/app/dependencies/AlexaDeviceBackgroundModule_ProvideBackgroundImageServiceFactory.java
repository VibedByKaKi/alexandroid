package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.services.alexadevicebackground.BackgroundImageService;
import com.dee.app.http.CoralService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AlexaDeviceBackgroundModule_ProvideBackgroundImageServiceFactory implements Factory<BackgroundImageService> {
    private final Provider<CoralService> coralServiceProvider;
    private final AlexaDeviceBackgroundModule module;

    public AlexaDeviceBackgroundModule_ProvideBackgroundImageServiceFactory(AlexaDeviceBackgroundModule alexaDeviceBackgroundModule, Provider<CoralService> provider) {
        this.module = alexaDeviceBackgroundModule;
        this.coralServiceProvider = provider;
    }

    public static AlexaDeviceBackgroundModule_ProvideBackgroundImageServiceFactory create(AlexaDeviceBackgroundModule alexaDeviceBackgroundModule, Provider<CoralService> provider) {
        return new AlexaDeviceBackgroundModule_ProvideBackgroundImageServiceFactory(alexaDeviceBackgroundModule, provider);
    }

    public static BackgroundImageService provideBackgroundImageService(AlexaDeviceBackgroundModule alexaDeviceBackgroundModule, CoralService coralService) {
        return (BackgroundImageService) Preconditions.checkNotNullFromProvides(alexaDeviceBackgroundModule.provideBackgroundImageService(coralService));
    }

    @Override // javax.inject.Provider
    public BackgroundImageService get() {
        return provideBackgroundImageService(this.module, this.coralServiceProvider.get());
    }
}
