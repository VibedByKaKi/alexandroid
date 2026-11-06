package com.amazon.alexa.sharing.presenter;

import com.amazon.alexa.sharing.util.DeviceInfoUtil;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class ShareToSocialDeepLinkPresenter_Factory implements Factory<ShareToSocialDeepLinkPresenter> {
    private final Provider<DeviceInfoUtil> deviceInfoUtilProvider;
    private final Provider<AlexaCommsCoreMetricsService> metricsServiceLazyProvider;

    public ShareToSocialDeepLinkPresenter_Factory(Provider<AlexaCommsCoreMetricsService> provider, Provider<DeviceInfoUtil> provider2) {
        this.metricsServiceLazyProvider = provider;
        this.deviceInfoUtilProvider = provider2;
    }

    public static ShareToSocialDeepLinkPresenter_Factory create(Provider<AlexaCommsCoreMetricsService> provider, Provider<DeviceInfoUtil> provider2) {
        return new ShareToSocialDeepLinkPresenter_Factory(provider, provider2);
    }

    public static ShareToSocialDeepLinkPresenter newInstance(Lazy<AlexaCommsCoreMetricsService> lazy, DeviceInfoUtil deviceInfoUtil) {
        return new ShareToSocialDeepLinkPresenter(lazy, deviceInfoUtil);
    }

    @Override // javax.inject.Provider
    public ShareToSocialDeepLinkPresenter get() {
        return newInstance(DoubleCheck.lazy(this.metricsServiceLazyProvider), this.deviceInfoUtilProvider.get());
    }
}
