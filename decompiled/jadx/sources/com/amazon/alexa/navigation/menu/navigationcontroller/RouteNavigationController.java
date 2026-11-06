package com.amazon.alexa.navigation.menu.navigationcontroller;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.navigation.menu.MenuMetricConstants;
import com.amazon.alexa.navigation.menu.MetricsComponents;
import com.amazon.alexa.routing.api.RoutingService;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class RouteNavigationController extends NavigationController {
    private static final String TAG = "RouteNavigationController";
    private final Bundle routeBundle;
    private final String routeName;
    private final Provider<RoutingService> routingService;

    public RouteNavigationController(@NonNull String str, @NonNull MetricsComponents metricsComponents, @NonNull String str2, @NonNull String str3, Provider<Mobilytics> provider, Provider<RoutingService> provider2) {
        super(metricsComponents, provider, str2, str3);
        this.routeName = str;
        this.routeBundle = new Bundle();
        this.routingService = provider2;
    }

    @Override // com.amazon.alexa.navigation.menu.navigationcontroller.NavigationController
    public void navigate() {
        try {
            this.routingService.get().navigate(this.routingService.get().route(this.routeName).withAll(this.routeBundle).create());
        } catch (IllegalArgumentException e) {
            Log.e(TAG, e.toString());
            this.mobilyticsProvider.get().recordOperationalEvent(this.mobilyticsProvider.get().createOperationalEvent(MenuMetricConstants.MORE_ERROR_ROUTING, "error", this.metricComponentName, this.metricSubComponentName, OwnerIdentifier.ALEXA_MOBILE_GROWTH));
        }
        this.mobilyticsProvider.get().recordUserInteractionEvent(this.mobilyticsProvider.get().createUserInteractionEvent(this.metricsComponents.metricName, "click", this.metricComponentName, this.metricSubComponentName, OwnerIdentifier.ALEXA_MOBILE_GROWTH));
        this.mobilyticsProvider.get().recordOperationalEvent(this.mobilyticsProvider.get().createOperationalEvent(this.metricsComponents.metricName, "counter", this.metricComponentName, this.metricSubComponentName, OwnerIdentifier.ALEXA_MOBILE_GROWTH));
    }

    public RouteNavigationController(@NonNull String str, @NonNull Bundle bundle, @NonNull MetricsComponents metricsComponents, @NonNull String str2, @NonNull String str3, Provider<Mobilytics> provider, Provider<RoutingService> provider2) {
        super(metricsComponents, provider, str2, str3);
        this.routeName = str;
        this.routeBundle = bundle;
        this.routingService = provider2;
    }
}
