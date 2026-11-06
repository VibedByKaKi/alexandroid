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
public final class InternetSharingModule_ProvideNanSubscriberManagerFactory implements Factory<NanSubscriberManager> {
    private final Provider<Application> applicationProvider;
    private final InternetSharingModule module;

    public InternetSharingModule_ProvideNanSubscriberManagerFactory(InternetSharingModule internetSharingModule, Provider<Application> provider) {
        this.module = internetSharingModule;
        this.applicationProvider = provider;
    }

    public static InternetSharingModule_ProvideNanSubscriberManagerFactory create(InternetSharingModule internetSharingModule, Provider<Application> provider) {
        return new InternetSharingModule_ProvideNanSubscriberManagerFactory(internetSharingModule, provider);
    }

    public static NanSubscriberManager provideNanSubscriberManager(InternetSharingModule internetSharingModule, Application application) {
        return (NanSubscriberManager) Preconditions.checkNotNullFromProvides(internetSharingModule.provideNanSubscriberManager(application));
    }

    @Override // javax.inject.Provider
    public NanSubscriberManager get() {
        return provideNanSubscriberManager(this.module, this.applicationProvider.get());
    }
}
