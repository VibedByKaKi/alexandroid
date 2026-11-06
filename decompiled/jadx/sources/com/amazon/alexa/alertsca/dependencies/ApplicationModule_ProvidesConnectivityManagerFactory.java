package com.amazon.alexa.alertsca.dependencies;

import android.net.ConnectivityManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ApplicationModule_ProvidesConnectivityManagerFactory implements Factory<ConnectivityManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesConnectivityManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesConnectivityManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesConnectivityManagerFactory(applicationModule);
    }

    public static ConnectivityManager providesConnectivityManager(ApplicationModule applicationModule) {
        return (ConnectivityManager) Preconditions.checkNotNullFromProvides(applicationModule.providesConnectivityManager());
    }

    @Override // javax.inject.Provider
    public ConnectivityManager get() {
        return providesConnectivityManager(this.module);
    }
}
