package com.amazon.alexa.navigation.menu.navigationcontroller;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.navigation.menu.MenuMetricConstants;
import com.amazon.alexa.navigation.menu.MetricsComponents;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ActivityNavigationController extends NavigationController {
    private static final String TAG = "ActivityNavigationController";
    private final Map<String, String> activityIntentExtras;
    private final String activityName;
    private final Context context;

    @VisibleForTesting
    Intent intent;

    public ActivityNavigationController(Context context, @NonNull String str, @Nullable Map<String, String> map, @NonNull MetricsComponents metricsComponents, @NonNull String str2, @NonNull String str3, Provider<Mobilytics> provider) {
        super(metricsComponents, provider, str2, str3);
        this.context = context;
        this.activityName = str;
        this.activityIntentExtras = map;
        this.intent = new Intent();
    }

    public Intent getIntent() {
        return this.intent;
    }

    @Override // com.amazon.alexa.navigation.menu.navigationcontroller.NavigationController
    public void navigate() {
        try {
            this.intent.setClass(this.context, Class.forName(this.activityName));
            Map<String, String> map = this.activityIntentExtras;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
            try {
                this.context.startActivity(this.intent);
            } catch (ActivityNotFoundException e) {
                Log.e(TAG, e.toString());
                this.mobilyticsProvider.get().recordOperationalEvent(this.mobilyticsProvider.get().createOperationalEvent(MenuMetricConstants.MORE_ERROR_ACTIVITY, "error", this.metricComponentName, this.metricSubComponentName, OwnerIdentifier.ALEXA_MOBILE_GROWTH));
            }
        } catch (ClassNotFoundException e2) {
            Log.e(TAG, e2.toString());
            this.mobilyticsProvider.get().recordOperationalEvent(this.mobilyticsProvider.get().createOperationalEvent(MenuMetricConstants.MORE_ERROR_CLASS, "error", this.metricComponentName, this.metricSubComponentName, OwnerIdentifier.ALEXA_MOBILE_GROWTH));
        }
        this.mobilyticsProvider.get().recordUserInteractionEvent(this.mobilyticsProvider.get().createUserInteractionEvent(this.metricsComponents.metricName, "click", this.metricComponentName, this.metricSubComponentName, OwnerIdentifier.ALEXA_MOBILE_GROWTH));
        this.mobilyticsProvider.get().recordOperationalEvent(this.mobilyticsProvider.get().createOperationalEvent(this.metricsComponents.metricName, "counter", this.metricComponentName, this.metricSubComponentName, OwnerIdentifier.ALEXA_MOBILE_GROWTH));
    }
}
