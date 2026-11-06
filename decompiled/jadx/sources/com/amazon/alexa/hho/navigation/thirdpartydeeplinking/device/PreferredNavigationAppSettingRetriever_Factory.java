package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device;

import android.content.pm.PackageManager;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class PreferredNavigationAppSettingRetriever_Factory implements Factory<PreferredNavigationAppSettingRetriever> {
    private final Provider<HHOMetricsService> metricsProvider;
    private final Provider<PackageManager> packageManagerProvider;
    private final Provider<PreferredNavigationAppContentAccessor> preferredNavigationAppContentAccessorProvider;

    public PreferredNavigationAppSettingRetriever_Factory(Provider<PackageManager> provider, Provider<PreferredNavigationAppContentAccessor> provider2, Provider<HHOMetricsService> provider3) {
        this.packageManagerProvider = provider;
        this.preferredNavigationAppContentAccessorProvider = provider2;
        this.metricsProvider = provider3;
    }

    public static PreferredNavigationAppSettingRetriever_Factory create(Provider<PackageManager> provider, Provider<PreferredNavigationAppContentAccessor> provider2, Provider<HHOMetricsService> provider3) {
        return new PreferredNavigationAppSettingRetriever_Factory(provider, provider2, provider3);
    }

    public static PreferredNavigationAppSettingRetriever newInstance(PackageManager packageManager, PreferredNavigationAppContentAccessor preferredNavigationAppContentAccessor, HHOMetricsService hHOMetricsService) {
        return new PreferredNavigationAppSettingRetriever(packageManager, preferredNavigationAppContentAccessor, hHOMetricsService);
    }

    @Override // javax.inject.Provider
    public PreferredNavigationAppSettingRetriever get() {
        return newInstance(this.packageManagerProvider.get(), this.preferredNavigationAppContentAccessorProvider.get(), this.metricsProvider.get());
    }
}
