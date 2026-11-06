package com.amazon.alexa.configservice.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.configservice.metrics.MetricsUtils;
import com.amazon.alexa.configservice.metrics.MobilyticsService;
import java.time.Clock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes17.dex */
public class SharedPreferencesManager {
    private static final int INVALID_TIME_STAMP = -1;
    private static final String TAG = "SharedPreferencesManager";
    private final Context context;
    private final Object lock = new Object();
    private final MobilyticsService mobilyticsService;
    private final SharedPreferences preferences;

    public SharedPreferencesManager(@NonNull Context context, @NonNull MobilyticsService mobilyticsService) {
        this.context = context;
        this.preferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        this.mobilyticsService = mobilyticsService;
    }

    private String getSuccessKey(@NonNull String str) {
        return BitVector$$ExternalSyntheticOutline0.m(str, MetricsConstants.SUCCESS_SUFFIX);
    }

    private String getTimeStampKey(@NonNull String str) {
        return BitVector$$ExternalSyntheticOutline0.m(str, "_timestamp");
    }

    public void deleteFromSharedPreferences(@NonNull String str) {
        ConfigRefreshStatus fromSharedPreferences = getFromSharedPreferences(str);
        if (fromSharedPreferences != null) {
            synchronized (this.lock) {
                SharedPreferences.Editor edit = this.preferences.edit();
                edit.remove(getTimeStampKey(fromSharedPreferences.getResourcePath()));
                edit.remove(getSuccessKey(fromSharedPreferences.getResourcePath()));
                edit.apply();
            }
        }
    }

    @Nullable
    public ConfigRefreshStatus getFromSharedPreferences(@NonNull String str) {
        try {
            ConfigRefreshStatus configRefreshStatus = new ConfigRefreshStatus(str, this.preferences.getLong(getTimeStampKey(str), -1L), this.preferences.getBoolean(getSuccessKey(str), false));
            if (configRefreshStatus.getPreviousRetrievalTimeStamp() != -1) {
                return configRefreshStatus;
            }
            AppLaunchChecker$$ExternalSyntheticOutline0.m("No previous retrieval details for the config file: ", str, TAG);
            return null;
        } catch (ClassCastException e) {
            Log.e(TAG, "getFromSharedPreferences() error: " + e.getMessage());
            this.mobilyticsService.recordErrorEvent(MetricsUtils.getPMETErrorMetricName(MetricsConstants.Category.CONFIG_STORAGE, "error", MetricsConstants.Error.CLASS_CAST_EXCEPTION), e);
            return new ConfigRefreshStatus(str, Clock.systemUTC().instant().getEpochSecond(), false);
        }
    }

    public void storeInSharedPreferences(@NonNull ConfigRefreshStatus configRefreshStatus) {
        synchronized (this.lock) {
            SharedPreferences.Editor edit = this.preferences.edit();
            edit.putLong(getTimeStampKey(configRefreshStatus.getResourcePath()), configRefreshStatus.getPreviousRetrievalTimeStamp());
            edit.putBoolean(getSuccessKey(configRefreshStatus.getResourcePath()), configRefreshStatus.isPreviousRetrievalSuccess());
            edit.apply();
        }
    }
}
