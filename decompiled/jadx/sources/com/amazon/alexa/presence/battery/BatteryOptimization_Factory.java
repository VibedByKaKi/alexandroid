package com.amazon.alexa.presence.battery;

import android.content.Context;
import android.os.PowerManager;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.dee.app.metrics.MetricsServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class BatteryOptimization_Factory implements Factory<BatteryOptimization> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsServiceV2> metricsServiceV2Provider;
    private final Provider<Mobilytics> mobilyticsProvider;
    private final Provider<PowerManager> powerManagerProvider;

    public BatteryOptimization_Factory(Provider<Context> provider, Provider<PowerManager> provider2, Provider<MetricsServiceV2> provider3, Provider<Mobilytics> provider4) {
        this.contextProvider = provider;
        this.powerManagerProvider = provider2;
        this.metricsServiceV2Provider = provider3;
        this.mobilyticsProvider = provider4;
    }

    public static BatteryOptimization_Factory create(Provider<Context> provider, Provider<PowerManager> provider2, Provider<MetricsServiceV2> provider3, Provider<Mobilytics> provider4) {
        return new BatteryOptimization_Factory(provider, provider2, provider3, provider4);
    }

    public static BatteryOptimization newInstance(Context context, PowerManager powerManager, MetricsServiceV2 metricsServiceV2, Mobilytics mobilytics) {
        return new BatteryOptimization(context, powerManager, metricsServiceV2, mobilytics);
    }

    @Override // javax.inject.Provider
    public BatteryOptimization get() {
        return newInstance(this.contextProvider.get(), this.powerManagerProvider.get(), this.metricsServiceV2Provider.get(), this.mobilyticsProvider.get());
    }
}
