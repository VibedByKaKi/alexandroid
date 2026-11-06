package com.amazon.minerva.client.thirdparty.configuration;

import android.content.SharedPreferences;
import android.util.Log;
import com.amazonaws.mobileconnectors.remoteconfiguration.Configuration;
import com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CustomRemoteMetricsConfigurationUpdater implements ConfigurationSyncCallback {
    private static final String TAG = "CustomRemoteMetricsConfigurationUpdater";
    private AssetFileParser mAssetFileParser;
    private MetricsConfigurationHelper mMetricsConfigurationHelper;
    private SharedPreferences mSharedPreferences;

    public CustomRemoteMetricsConfigurationUpdater(MetricsConfigurationHelper metricsConfigurationHelper, AssetFileParser assetFileParser, SharedPreferences sharedPreferences) {
        this.mMetricsConfigurationHelper = metricsConfigurationHelper;
        this.mAssetFileParser = assetFileParser;
        this.mSharedPreferences = sharedPreferences;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
    public void onConfigurationModified(Configuration configuration) {
        this.mMetricsConfigurationHelper.setCustomMetricsConfiguration(configuration);
        Log.i(TAG, "Customer's Remote configuration is changed, and update local metric configurations.");
        this.mSharedPreferences.edit().putLong(ConfigurationManager.SHARED_PREF_LAST_CUSTOM_ARCUS_SYNC_MILLIS, System.currentTimeMillis()).apply();
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
    public void onConfigurationUnmodified(Configuration configuration) {
        this.mMetricsConfigurationHelper.setCustomMetricsConfiguration(configuration);
        Log.i(TAG, "Customer's  Remote configuration is unchanged, but still update local metric configurations to ensure the match.");
        this.mSharedPreferences.edit().putLong(ConfigurationManager.SHARED_PREF_LAST_CUSTOM_ARCUS_SYNC_MILLIS, System.currentTimeMillis()).apply();
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
    public void onFailure(Exception exc) {
        Log.e(TAG, "Customer's  Remote configuration sync failed, and wait for next cycle.", exc);
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
    public void onThrottle(long j) {
        Log.w(TAG, String.format("Customer's  Remote configuration sync was throttled, and can retry in %d minutes.", Long.valueOf((j / 1000) / 60)));
    }
}
