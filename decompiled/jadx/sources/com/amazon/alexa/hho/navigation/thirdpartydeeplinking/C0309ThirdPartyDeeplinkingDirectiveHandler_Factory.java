package com.amazon.alexa.hho.navigation.thirdpartydeeplinking;

import com.amazon.alexa.hho.metrics.HHOMetricsService;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink.External3PMapDeeplinkHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ThirdPartyDeeplinkingDirectiveHandler_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0309ThirdPartyDeeplinkingDirectiveHandler_Factory implements Factory<ThirdPartyDeeplinkingDirectiveHandler> {
    private final Provider<External3PMapDeeplinkHelper> deeplinkHelperProvider;
    private final Provider<HHOMetricsService> metricsProvider;

    public C0309ThirdPartyDeeplinkingDirectiveHandler_Factory(Provider<HHOMetricsService> provider, Provider<External3PMapDeeplinkHelper> provider2) {
        this.metricsProvider = provider;
        this.deeplinkHelperProvider = provider2;
    }

    public static C0309ThirdPartyDeeplinkingDirectiveHandler_Factory create(Provider<HHOMetricsService> provider, Provider<External3PMapDeeplinkHelper> provider2) {
        return new C0309ThirdPartyDeeplinkingDirectiveHandler_Factory(provider, provider2);
    }

    public static ThirdPartyDeeplinkingDirectiveHandler newInstance(HHOMetricsService hHOMetricsService, External3PMapDeeplinkHelper external3PMapDeeplinkHelper) {
        return new ThirdPartyDeeplinkingDirectiveHandler(hHOMetricsService, external3PMapDeeplinkHelper);
    }

    @Override // javax.inject.Provider
    public ThirdPartyDeeplinkingDirectiveHandler get() {
        return newInstance(this.metricsProvider.get(), this.deeplinkHelperProvider.get());
    }
}
