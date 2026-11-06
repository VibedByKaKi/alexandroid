package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.hho.metrics.HHOMetricsConstants;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes13.dex */
public class PreferredNavigationAppSettingRetriever {

    @VisibleForTesting
    static final Intent DEFAULT_MAPS_INTENT;
    private static final Uri GEOLOCATION_QUERY;
    private static final String TAG = "PreferredNavigationAppSettingRetriever";
    private final HHOMetricsService metrics;
    private final PackageManager packageManager;
    private final PreferredNavigationAppContentAccessor preferredNavigationAppContentAccessor;

    static {
        Uri parse = Uri.parse("geo:37.423156,-122.084917");
        GEOLOCATION_QUERY = parse;
        DEFAULT_MAPS_INTENT = new Intent("android.intent.action.VIEW", parse);
    }

    @Inject
    public PreferredNavigationAppSettingRetriever(PackageManager packageManager, PreferredNavigationAppContentAccessor preferredNavigationAppContentAccessor, HHOMetricsService hHOMetricsService) {
        this.packageManager = packageManager;
        this.preferredNavigationAppContentAccessor = preferredNavigationAppContentAccessor;
        this.metrics = hHOMetricsService;
    }

    private Set<String> getAvailableNavApps() {
        List<ResolveInfo> queryIntentActivities = this.packageManager.queryIntentActivities(DEFAULT_MAPS_INTENT, 0);
        HashSet hashSet = new HashSet();
        Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().activityInfo.packageName);
        }
        return hashSet;
    }

    public String getPreferredNavigationApp(String str) {
        String preferredNavigationApp = this.preferredNavigationAppContentAccessor.getPreferredNavigationApp();
        Set<String> availableNavApps = getAvailableNavApps();
        if (preferredNavigationApp != null && availableNavApps.contains(preferredNavigationApp)) {
            return preferredNavigationApp;
        }
        if (preferredNavigationApp == null) {
            Log.w(TAG, "Preferred nav app setting unavailable. Default to google maps");
            this.metrics.recordOccurrence(HHOMetricsConstants.Event.PREFERRED_NAV_APP_SETTING_UNAVAILABLE, true, str, HHOMetricsConstants.Subcomponent.DEEPLINKING);
        } else {
            StringBuilder sb = new StringBuilder("preferred ");
            sb.append(preferredNavigationApp);
            sb.append(" not available. Default to google maps");
            this.metrics.recordOccurrence(HHOMetricsConstants.Event.PREFERRED_NAV_APP_NOT_INSTALLED, true, str, HHOMetricsConstants.Subcomponent.DEEPLINKING);
        }
        this.preferredNavigationAppContentAccessor.setPreferredNavigationApp("com.google.android.apps.maps");
        return "com.google.android.apps.maps";
    }

    public String getPreferredNavigationApp() {
        return getPreferredNavigationApp(HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_CLASSIC_3P_DEEPLINK);
    }
}
