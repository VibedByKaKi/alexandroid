package com.amazon.alexa.voice.navigation;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.uimanager.ViewAtIndex$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PreferredNavigationAppRepository {
    private static final Comparator<NavigationAppInfo> APP_DISPLAY_NAME_COMPARATOR = new ViewAtIndex$$ExternalSyntheticLambda0(7);
    private static final Uri DAY1_COORDINATES;

    @VisibleForTesting
    static final Intent DEFAULT_MAPS_INTENT;
    private static final String TAG = "PreferredNavigationAppRepository";
    private final PackageManager packageManager;
    private final PreferredNavigationAppContentAccessor preferredNavigationAppContentAccessor;

    static {
        Uri parse = Uri.parse("geo:47.615898,-122.339920");
        DAY1_COORDINATES = parse;
        DEFAULT_MAPS_INTENT = new Intent("android.intent.action.VIEW", parse);
    }

    public PreferredNavigationAppRepository(PackageManager packageManager, PreferredNavigationAppContentAccessor preferredNavigationAppContentAccessor) {
        this.packageManager = packageManager;
        this.preferredNavigationAppContentAccessor = preferredNavigationAppContentAccessor;
    }

    private String getPreferredNavigationAppFromPreferences() {
        String preferredNavigationApp = this.preferredNavigationAppContentAccessor.getPreferredNavigationApp();
        if (preferredNavigationApp != null) {
            return preferredNavigationApp;
        }
        setDefaultNavigationAppInPreferences();
        return "com.google.android.apps.maps";
    }

    private Map<String, NavigationAppInfo> getSupportedNavigationApps(String str) {
        NavigationAppInfo navigationAppInfo;
        List<ResolveInfo> queryIntentActivities = this.packageManager.queryIntentActivities(DEFAULT_MAPS_INTENT, 0);
        HashMap hashMap = new HashMap();
        Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
        while (it2.hasNext()) {
            ActivityInfo activityInfo = it2.next().activityInfo;
            String str2 = activityInfo.packageName;
            if (str2.equals(com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME) || str2.equals("com.google.android.apps.maps")) {
                hashMap.put(str2, NavigationAppInfo.create(activityInfo.loadLabel(this.packageManager).toString(), str2, str2.equals(str)));
            }
        }
        if (!hashMap.containsKey(str) && (navigationAppInfo = (NavigationAppInfo) hashMap.get("com.google.android.apps.maps")) != null) {
            hashMap.put("com.google.android.apps.maps", NavigationAppInfo.create(navigationAppInfo.getAppDisplayName(), navigationAppInfo.getAppFullName(), true, navigationAppInfo.getAppIconAsset()));
            setDefaultNavigationAppInPreferences();
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(NavigationAppInfo navigationAppInfo, NavigationAppInfo navigationAppInfo2) {
        return navigationAppInfo.getAppDisplayName().compareToIgnoreCase(navigationAppInfo2.getAppDisplayName());
    }

    private void setDefaultNavigationAppInPreferences() {
        this.preferredNavigationAppContentAccessor.setPreferredNavigationApp("com.google.android.apps.maps");
    }

    public List<NavigationAppInfo> getAllNavigationApps() {
        ArrayList arrayList = new ArrayList(getSupportedNavigationApps(getPreferredNavigationAppFromPreferences()).values());
        Collections.sort(arrayList, APP_DISPLAY_NAME_COMPARATOR);
        return arrayList;
    }

    public void setPreferredNavigationApp(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -660073534) {
            if (hashCode == 40719148) {
                str.equals("com.google.android.apps.maps");
            }
        } else if (str.equals(com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME)) {
            this.preferredNavigationAppContentAccessor.setPreferredNavigationApp(com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME);
            return;
        }
        this.preferredNavigationAppContentAccessor.setPreferredNavigationApp("com.google.android.apps.maps");
    }
}
