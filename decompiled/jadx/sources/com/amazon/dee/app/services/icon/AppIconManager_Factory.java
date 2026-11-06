package com.amazon.dee.app.services.icon;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class AppIconManager_Factory implements Factory<AppIconManager> {
    private final Provider<Context> contextProvider;
    private final Provider<IconMetrics> iconMetricsProvider;

    public AppIconManager_Factory(Provider<Context> provider, Provider<IconMetrics> provider2) {
        this.contextProvider = provider;
        this.iconMetricsProvider = provider2;
    }

    public static AppIconManager_Factory create(Provider<Context> provider, Provider<IconMetrics> provider2) {
        return new AppIconManager_Factory(provider, provider2);
    }

    public static AppIconManager newInstance(Context context, IconMetrics iconMetrics) {
        return new AppIconManager(context, iconMetrics);
    }

    @Override // javax.inject.Provider
    public AppIconManager get() {
        return newInstance(this.contextProvider.get(), this.iconMetricsProvider.get());
    }
}
