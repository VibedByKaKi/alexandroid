package com.amazon.dee.app.services.icon;

import com.amazon.alexa.mobilytics.Mobilytics;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class IconMetrics_Factory implements Factory<IconMetrics> {
    private final Provider<Mobilytics> mobilyticsLazyProvider;

    public IconMetrics_Factory(Provider<Mobilytics> provider) {
        this.mobilyticsLazyProvider = provider;
    }

    public static IconMetrics_Factory create(Provider<Mobilytics> provider) {
        return new IconMetrics_Factory(provider);
    }

    public static IconMetrics newInstance(Lazy<Mobilytics> lazy) {
        return new IconMetrics(lazy);
    }

    @Override // javax.inject.Provider
    public IconMetrics get() {
        return newInstance(DoubleCheck.lazy(this.mobilyticsLazyProvider));
    }
}
