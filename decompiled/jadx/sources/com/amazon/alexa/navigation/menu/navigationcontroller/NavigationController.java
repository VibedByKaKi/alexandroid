package com.amazon.alexa.navigation.menu.navigationcontroller;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.navigation.menu.MetricsComponents;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public abstract class NavigationController {
    protected final String metricComponentName;
    protected final String metricSubComponentName;
    protected final MetricsComponents metricsComponents;
    protected final Provider<Mobilytics> mobilyticsProvider;

    public NavigationController(@NonNull MetricsComponents metricsComponents, Provider<Mobilytics> provider, String str, String str2) {
        this.metricsComponents = metricsComponents;
        this.mobilyticsProvider = provider;
        this.metricComponentName = str;
        this.metricSubComponentName = str2;
    }

    public abstract void navigate();
}
