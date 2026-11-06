package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ApplicationStateReporterProvider_Factory implements Factory<ApplicationStateReporterProvider> {
    private final Provider<Context> contextProvider;

    public ApplicationStateReporterProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ApplicationStateReporterProvider_Factory create(Provider<Context> provider) {
        return new ApplicationStateReporterProvider_Factory(provider);
    }

    public static ApplicationStateReporterProvider newInstance(Context context) {
        return new ApplicationStateReporterProvider(context);
    }

    @Override // javax.inject.Provider
    public ApplicationStateReporterProvider get() {
        return newInstance(this.contextProvider.get());
    }
}
