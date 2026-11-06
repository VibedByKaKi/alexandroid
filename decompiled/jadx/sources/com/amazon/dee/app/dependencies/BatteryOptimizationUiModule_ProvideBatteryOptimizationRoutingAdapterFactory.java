package com.amazon.dee.app.dependencies;

import android.app.Activity;
import com.amazon.alexa.presence.battery.BatteryOptimizationRoutingAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.MainScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BatteryOptimizationUiModule_ProvideBatteryOptimizationRoutingAdapterFactory implements Factory<BatteryOptimizationRoutingAdapter> {
    private final Provider<Activity> activityProvider;
    private final BatteryOptimizationUiModule module;

    public BatteryOptimizationUiModule_ProvideBatteryOptimizationRoutingAdapterFactory(BatteryOptimizationUiModule batteryOptimizationUiModule, Provider<Activity> provider) {
        this.module = batteryOptimizationUiModule;
        this.activityProvider = provider;
    }

    public static BatteryOptimizationUiModule_ProvideBatteryOptimizationRoutingAdapterFactory create(BatteryOptimizationUiModule batteryOptimizationUiModule, Provider<Activity> provider) {
        return new BatteryOptimizationUiModule_ProvideBatteryOptimizationRoutingAdapterFactory(batteryOptimizationUiModule, provider);
    }

    public static BatteryOptimizationRoutingAdapter provideBatteryOptimizationRoutingAdapter(BatteryOptimizationUiModule batteryOptimizationUiModule, Activity activity) {
        return (BatteryOptimizationRoutingAdapter) Preconditions.checkNotNullFromProvides(batteryOptimizationUiModule.provideBatteryOptimizationRoutingAdapter(activity));
    }

    @Override // javax.inject.Provider
    public BatteryOptimizationRoutingAdapter get() {
        return provideBatteryOptimizationRoutingAdapter(this.module, this.activityProvider.get());
    }
}
