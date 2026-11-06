package com.amazon.dee.app.services.internetsharing;

import android.app.Application;
import com.amazon.dee.app.services.internetsharing.nan.NanSubscriberManager;
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
/* loaded from: classes5.dex */
public final class InternetSharingModule_ProvideInternetSharingManagerFactory implements Factory<InternetSharingManager> {
    private final Provider<Application> applicationProvider;
    private final InternetSharingModule module;
    private final Provider<NanSubscriberManager> nanManagerProvider;

    public InternetSharingModule_ProvideInternetSharingManagerFactory(InternetSharingModule internetSharingModule, Provider<Application> provider, Provider<NanSubscriberManager> provider2) {
        this.module = internetSharingModule;
        this.applicationProvider = provider;
        this.nanManagerProvider = provider2;
    }

    public static InternetSharingModule_ProvideInternetSharingManagerFactory create(InternetSharingModule internetSharingModule, Provider<Application> provider, Provider<NanSubscriberManager> provider2) {
        return new InternetSharingModule_ProvideInternetSharingManagerFactory(internetSharingModule, provider, provider2);
    }

    public static InternetSharingManager provideInternetSharingManager(InternetSharingModule internetSharingModule, Application application, NanSubscriberManager nanSubscriberManager) {
        return (InternetSharingManager) Preconditions.checkNotNullFromProvides(internetSharingModule.provideInternetSharingManager(application, nanSubscriberManager));
    }

    @Override // javax.inject.Provider
    public InternetSharingManager get() {
        return provideInternetSharingManager(this.module, this.applicationProvider.get(), this.nanManagerProvider.get());
    }
}
