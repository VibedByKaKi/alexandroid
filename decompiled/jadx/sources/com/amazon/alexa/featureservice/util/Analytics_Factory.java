package com.amazon.alexa.featureservice.util;

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
public final class Analytics_Factory implements Factory<Analytics> {
    private final Provider<Mobilytics> mobilyticsLazyProvider;
    private final Provider<RandomUtil> randomUtilProvider;

    public Analytics_Factory(Provider<Mobilytics> provider, Provider<RandomUtil> provider2) {
        this.mobilyticsLazyProvider = provider;
        this.randomUtilProvider = provider2;
    }

    public static Analytics_Factory create(Provider<Mobilytics> provider, Provider<RandomUtil> provider2) {
        return new Analytics_Factory(provider, provider2);
    }

    public static Analytics newInstance(Lazy<Mobilytics> lazy, RandomUtil randomUtil) {
        return new Analytics(lazy, randomUtil);
    }

    @Override // javax.inject.Provider
    public Analytics get() {
        return newInstance(DoubleCheck.lazy(this.mobilyticsLazyProvider), this.randomUtilProvider.get());
    }
}
