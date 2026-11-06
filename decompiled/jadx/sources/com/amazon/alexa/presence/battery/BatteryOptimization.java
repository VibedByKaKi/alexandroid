package com.amazon.alexa.presence.battery;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RequiresApi;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.presence.Presence;
import com.amazon.alexa.presence.utils.DevicePlatformUtil;
import com.amazon.alexa.presence.utils.MetricsUtil;
import com.dee.app.metrics.MetricsServiceV2;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class BatteryOptimization {
    private static final String TAG = Presence.tag();
    private final Context mContext;
    private final MetricsServiceV2 mMetricsServiceV2;
    private final PowerManager mPowerManager;
    private final Mobilytics mobilytics;

    @Inject
    public BatteryOptimization(Context context, PowerManager powerManager, MetricsServiceV2 metricsServiceV2, Mobilytics mobilytics) {
        this.mContext = context;
        this.mPowerManager = powerManager;
        this.mMetricsServiceV2 = metricsServiceV2;
        this.mobilytics = mobilytics;
    }

    @RequiresApi(api = 23)
    public boolean checkBatteryOptimization(String str) {
        return !this.mPowerManager.isIgnoringBatteryOptimizations(str);
    }

    public boolean isBatteryOptimized() {
        MetricsUtil.recordZeroCount(this.mMetricsServiceV2, this.mobilytics, MetricsUtil.MetricsId.CHECK_BATTERY_OPTIMIZATION, "");
        if (!DevicePlatformUtil.isAndroidMOrLater()) {
            return false;
        }
        MetricsUtil.recordCount(this.mMetricsServiceV2, this.mobilytics, MetricsUtil.MetricsId.CHECK_BATTERY_OPTIMIZATION, "");
        return checkBatteryOptimization(this.mContext.getPackageName());
    }

    public void requestDisable() {
        MetricsUtil.recordZeroCount(this.mMetricsServiceV2, this.mobilytics, MetricsUtil.MetricsId.REQUEST_DISABLE, "");
        if (isBatteryOptimized() && DevicePlatformUtil.isAndroidMOrLater()) {
            MetricsUtil.recordCount(this.mMetricsServiceV2, this.mobilytics, MetricsUtil.MetricsId.REQUEST_DISABLE, "");
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
            this.mContext.startActivity(intent);
        }
    }
}
