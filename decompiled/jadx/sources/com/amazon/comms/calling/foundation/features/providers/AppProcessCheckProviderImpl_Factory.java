package com.amazon.comms.calling.foundation.features.providers;

import android.app.ActivityManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AppProcessCheckProviderImpl_Factory implements Factory<AppProcessCheckProviderImpl> {
    private final Provider<ActivityManager> activityManagerProvider;

    public AppProcessCheckProviderImpl_Factory(Provider<ActivityManager> provider) {
        this.activityManagerProvider = provider;
    }

    public static AppProcessCheckProviderImpl_Factory create(Provider<ActivityManager> provider) {
        return new AppProcessCheckProviderImpl_Factory(provider);
    }

    public static AppProcessCheckProviderImpl newInstance(ActivityManager activityManager) {
        return new AppProcessCheckProviderImpl(activityManager);
    }

    @Override // javax.inject.Provider
    public AppProcessCheckProviderImpl get() {
        return newInstance(this.activityManagerProvider.get());
    }
}
