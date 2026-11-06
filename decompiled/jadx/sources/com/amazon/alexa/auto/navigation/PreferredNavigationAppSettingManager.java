package com.amazon.alexa.auto.navigation;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.Lazy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class PreferredNavigationAppSettingManager {

    @VisibleForTesting
    static final Intent DEFAULT_MAPS_INTENT;
    private static final Uri GEOLOCATION_QUERY;

    @VisibleForTesting
    static final String GOOGLE_MAPS_PACKAGENAME = "com.google.android.apps.maps";
    static final String PREFERRED_NAV_APP_PREFERENCE_KEY = "preferred_nav_app";
    private static final String TAG = "PreferredNavigationAppSettingManager";

    @VisibleForTesting
    static final String WAZE_PACKAGENAME = "com.waze";
    private final PackageManager packageManager;
    private final Lazy<PersistentStorage> persistentStorage;

    static {
        Uri parse = Uri.parse("geo:37.423156,-122.084917");
        GEOLOCATION_QUERY = parse;
        DEFAULT_MAPS_INTENT = new Intent("android.intent.action.VIEW", parse);
    }

    @Inject
    public PreferredNavigationAppSettingManager(PackageManager packageManager, @Named("navigation_store") Lazy<PersistentStorage> lazy) {
        this.packageManager = packageManager;
        this.persistentStorage = lazy;
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

    private String getPreferredNavAppFromPreferences() {
        String string = this.persistentStorage.get().getString("preferred_nav_app");
        if (string != null) {
            return string;
        }
        setDefaultNavAppInPreferences();
        return "com.google.android.apps.maps";
    }

    private void setDefaultNavAppInPreferences() {
        setPreferredNavAppPreference("com.google.android.apps.maps");
    }

    private void setPreferredNavAppPreference(String str) {
        this.persistentStorage.get().edit().set("preferred_nav_app", str).commit();
    }

    public String getPreferredNavigationApp() {
        String preferredNavAppFromPreferences = getPreferredNavAppFromPreferences();
        if (getAvailableNavApps().contains(preferredNavAppFromPreferences)) {
            return preferredNavAppFromPreferences;
        }
        StringBuilder sb = new StringBuilder("preferred ");
        sb.append(preferredNavAppFromPreferences);
        sb.append(" not availale. Default to google maps");
        setDefaultNavAppInPreferences();
        return "com.google.android.apps.maps";
    }

    public void setPreferredNavigationApp(String str) {
        if (str == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -660073534) {
            if (hashCode == 40719148) {
                str.equals("com.google.android.apps.maps");
            }
        } else if (str.equals("com.waze")) {
            setPreferredNavAppPreference("com.waze");
            return;
        }
        setPreferredNavAppPreference("com.google.android.apps.maps");
    }
}
