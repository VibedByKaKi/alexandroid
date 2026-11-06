package com.amazon.alexa.growthcore.service.metrics;

import com.amazon.alexa.mobilytics.Mobilytics;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MobilyticsService_Factory implements Factory<MobilyticsService> {
    private final Provider<Mobilytics> mobilyticsProvider;

    public MobilyticsService_Factory(Provider<Mobilytics> provider) {
        this.mobilyticsProvider = provider;
    }

    public static MobilyticsService_Factory create(Provider<Mobilytics> provider) {
        return new MobilyticsService_Factory(provider);
    }

    public static MobilyticsService newInstance(Lazy<Mobilytics> lazy) {
        return new MobilyticsService(lazy);
    }

    @Override // javax.inject.Provider
    public MobilyticsService get() {
        return newInstance(DoubleCheck.lazy(this.mobilyticsProvider));
    }
}
