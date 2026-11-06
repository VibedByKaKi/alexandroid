package com.amazon.alexa.configservice.storage;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.time.Clock;
import javax.annotation.concurrent.ThreadSafe;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes17.dex */
public class ConfigRefreshStatusManager {
    private static final String TAG = "ConfigRefreshStatusManager";
    private final Clock clock;
    private final SharedPreferencesManager sharedPreferencesManager;

    @Inject
    public ConfigRefreshStatusManager(@NonNull SharedPreferencesManager sharedPreferencesManager) {
        this(sharedPreferencesManager, Clock.systemUTC());
    }

    public boolean isConfigReadyForRefresh(@NonNull String str) {
        ConfigRefreshStatus fromSharedPreferences = this.sharedPreferencesManager.getFromSharedPreferences(str);
        if (fromSharedPreferences == null) {
            return true;
        }
        long epochSecond = this.clock.instant().getEpochSecond() - fromSharedPreferences.getPreviousRetrievalTimeStamp();
        if (epochSecond < 0) {
            return true;
        }
        if (!fromSharedPreferences.isPreviousRetrievalSuccess() || epochSecond < 3600) {
            return !fromSharedPreferences.isPreviousRetrievalSuccess() && epochSecond >= 1200;
        }
        return true;
    }

    public void updateConfigRefreshStatus(@NonNull String str, @NonNull long j, @NonNull boolean z) {
        this.sharedPreferencesManager.storeInSharedPreferences(new ConfigRefreshStatus(str, j, z));
    }

    @VisibleForTesting
    public ConfigRefreshStatusManager(@NonNull SharedPreferencesManager sharedPreferencesManager, @NonNull Clock clock) {
        this.sharedPreferencesManager = sharedPreferencesManager;
        this.clock = clock;
    }
}
