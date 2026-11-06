package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink;

import android.content.Intent;
import android.util.Log;
import com.amazon.alexa.hho.metrics.HHOMetricsConstants;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import com.amazon.alexa.hho.navigation.constants.NavigationConstants;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppSettingRetriever;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui.UserInterfaceManager;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class External3PMapDeeplinkHelper {
    private static final String TAG = "External3PMapDeeplinkHelper";
    private final GoogleMapsDeeplinkHelper googleMapsDeeplinkHelper;
    private final LastLaunchedNavigationAppStore lastLaunchedNavigationAppStore;
    private final HHOMetricsService metrics;
    private final PreferredNavigationAppSettingRetriever preferredNavigationAppSettingRetriever;
    private final UserInterfaceManager userInterfaceManager;
    private final WazeMapsDeeplinkHelper wazeMapsDeeplinkHelper;

    @Inject
    public External3PMapDeeplinkHelper(HHOMetricsService hHOMetricsService, UserInterfaceManager userInterfaceManager, PreferredNavigationAppSettingRetriever preferredNavigationAppSettingRetriever, GoogleMapsDeeplinkHelper googleMapsDeeplinkHelper, WazeMapsDeeplinkHelper wazeMapsDeeplinkHelper, LastLaunchedNavigationAppStore lastLaunchedNavigationAppStore) {
        this.metrics = hHOMetricsService;
        this.userInterfaceManager = userInterfaceManager;
        this.preferredNavigationAppSettingRetriever = preferredNavigationAppSettingRetriever;
        this.googleMapsDeeplinkHelper = googleMapsDeeplinkHelper;
        this.wazeMapsDeeplinkHelper = wazeMapsDeeplinkHelper;
        this.lastLaunchedNavigationAppStore = lastLaunchedNavigationAppStore;
    }

    private MappingApplication findPreferredNavApp() {
        return MappingApplication.from(this.preferredNavigationAppSettingRetriever.getPreferredNavigationApp());
    }

    private static String mapProviderMetricEvent(String str) {
        return PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME.equals(str) ? HHOMetricsConstants.Event.LAUNCH_DEEPLINK_PROVIDER_WAZE : HHOMetricsConstants.Event.LAUNCH_DEEPLINK_PROVIDER_GOOGLE_MAPS;
    }

    private static String preferredProviderMetricEvent(String str) {
        return PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME.equals(str) ? HHOMetricsConstants.Event.PREFERRED_MAP_PROVIDER_WAZE : HHOMetricsConstants.Event.PREFERRED_MAP_PROVIDER_GOOGLE_MAPS;
    }

    private String resolveNavigationApp(String str) {
        String preferredNavigationApp = this.preferredNavigationAppSettingRetriever.getPreferredNavigationApp(HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK);
        this.metrics.recordOccurrence(preferredProviderMetricEvent(preferredNavigationApp), true, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK);
        if (!PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME.equals(preferredNavigationApp) || NavigationConstants.NavigationDirectiveTransportMode.DRIVING.equals(str)) {
            return preferredNavigationApp;
        }
        this.metrics.recordOccurrence(HHOMetricsConstants.Event.WAZE_FALLBACK_TO_GOOGLE_MAPS, true, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK);
        return "com.google.android.apps.maps";
    }

    private static String transportModeMetricEvent(String str) {
        if (str == null) {
            return HHOMetricsConstants.Event.LAUNCH_DEEPLINK_TRANSPORT_MODE_UNKNOWN;
        }
        switch (str) {
        }
        return HHOMetricsConstants.Event.LAUNCH_DEEPLINK_TRANSPORT_MODE_UNKNOWN;
    }

    @Deprecated
    public void cancelExternal3PMapSession() {
        String packageName = findPreferredNavApp().getPackageName();
        if ("com.google.android.apps.maps".equals(packageName)) {
            this.userInterfaceManager.stopGoogleMaps();
        } else if (PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME.equals(packageName)) {
            this.userInterfaceManager.stopWazeMaps();
        }
    }

    public void cancelTransit3PNavigationSession(boolean z) {
        if (!z) {
            this.userInterfaceManager.launchCancelSessionDeeplink(this.googleMapsDeeplinkHelper.getCancelNavigationUri());
            return;
        }
        String lastLaunchedApp = this.lastLaunchedNavigationAppStore.getLastLaunchedApp();
        if (lastLaunchedApp == null) {
            Log.w(TAG, "No record of last launched nav app; cancelling against the preference setting");
            this.metrics.recordOccurrence(HHOMetricsConstants.Event.CANCEL_NAVIGATION_LAST_LAUNCHED_APP_MISSING, true, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK);
            lastLaunchedApp = this.preferredNavigationAppSettingRetriever.getPreferredNavigationApp(HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK);
        }
        boolean equals = PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME.equals(lastLaunchedApp);
        UserInterfaceManager userInterfaceManager = this.userInterfaceManager;
        if (equals) {
            userInterfaceManager.launchCancelSessionDeeplink(this.wazeMapsDeeplinkHelper.getCancelNavigationUri());
        } else {
            userInterfaceManager.launchCancelSessionDeeplink(this.googleMapsDeeplinkHelper.getCancelNavigationUri());
        }
    }

    @Deprecated
    public void startExternal3PMapSession(double d, double d2, String str) {
        MappingApplication findPreferredNavApp = findPreferredNavApp();
        Intent intent = findPreferredNavApp.getIntent(d, d2, str);
        findPreferredNavApp.name();
        boolean equals = "com.google.android.apps.maps".equals(findPreferredNavApp.getPackageName());
        UserInterfaceManager userInterfaceManager = this.userInterfaceManager;
        if (equals) {
            userInterfaceManager.launchGoogleMaps(intent);
        } else {
            userInterfaceManager.launchExternalApp(intent);
        }
    }

    public void startTransit3PNavigationSession(String str, double d, double d2, String str2, boolean z) {
        if (!z) {
            this.userInterfaceManager.launchStartSessionDeeplink(this.googleMapsDeeplinkHelper.getStartNavigationUri(str, d, d2, str2, true));
            return;
        }
        String resolveNavigationApp = resolveNavigationApp(str2);
        this.lastLaunchedNavigationAppStore.setLastLaunchedApp(resolveNavigationApp);
        this.metrics.recordOccurrence(transportModeMetricEvent(str2), true, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK);
        this.metrics.recordOccurrence(mapProviderMetricEvent(resolveNavigationApp), true, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_3P_DEEPLINK);
        boolean equals = PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME.equals(resolveNavigationApp);
        UserInterfaceManager userInterfaceManager = this.userInterfaceManager;
        if (equals) {
            userInterfaceManager.launchStartSessionDeeplink(this.wazeMapsDeeplinkHelper.getStartNavigationUri(d, d2));
        } else {
            userInterfaceManager.launchStartSessionDeeplink(this.googleMapsDeeplinkHelper.getStartNavigationUri(str, d, d2, str2, true));
        }
    }
}
