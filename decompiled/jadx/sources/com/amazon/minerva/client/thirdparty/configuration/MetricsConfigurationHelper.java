package com.amazon.minerva.client.thirdparty.configuration;

import android.content.Context;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.minerva.client.thirdparty.utils.MinervaLogger;
import com.amazonaws.mobileconnectors.remoteconfiguration.Configuration;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MetricsConfigurationHelper {
    private static final String ORIGIN = "configuration";
    private static final MinervaLogger log = new MinervaLogger("MetricsConfigurationHelper");
    private ThrottleConfiguration mActiveThrottleConfiguration;
    private AssetFileParser mAssetFileParser;
    private Context mContext;
    private StorageConfiguration mCustomStorageConfiguration;
    private ThrottleConfiguration mCustomThrottleConfiguration;
    private UploadConfiguration mCustomUploadConfiguration;
    private DenyListConfiguration mDenyListConfiguration;
    private LocalConfiguration mLocalConfiguration;
    private MultiProcessConfiguration mMultiProcessConfiguration;
    private SamplingConfiguration mSamplingConfiguration;
    private StorageConfiguration mStorageConfiguration;
    private ThrottleConfiguration mThrottleConfiguration;
    private ThrottleConfiguration mThrottleHardLimitsConfiguration;
    private UploadConfiguration mUploadConfiguration;
    private ValidationConfiguration mValidationConfiguration;

    public MetricsConfigurationHelper(Context context, AssetFileParser assetFileParser) {
        this.mContext = context;
        this.mAssetFileParser = assetFileParser;
        setMetricsConfigurationJson(assetFileParser.parseMetricsConfiguration(DefaultMetricsConfiguration.DEFAULT_CONFIGURATION));
    }

    private void setActiveThrottle() {
        ThrottleConfiguration throttleConfiguration = this.mCustomThrottleConfiguration;
        if (throttleConfiguration == null) {
            this.mActiveThrottleConfiguration = new ThrottleConfiguration(this.mThrottleConfiguration.getThrottleSwitch(), this.mThrottleConfiguration.getMaxThrottleCredit(), this.mThrottleConfiguration.getDefaultThrottleCreditHour());
        } else {
            this.mActiveThrottleConfiguration = new ThrottleConfiguration(throttleConfiguration.getThrottleSwitch(), this.mCustomThrottleConfiguration.getMaxThrottleCredit(), this.mCustomThrottleConfiguration.getDefaultThrottleCreditHour(), this.mThrottleHardLimitsConfiguration);
        }
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        int throttleSwitch = this.mActiveThrottleConfiguration.getThrottleSwitch();
        int maxThrottleCredit = this.mActiveThrottleConfiguration.getMaxThrottleCredit();
        int defaultThrottleCreditHour = this.mActiveThrottleConfiguration.getDefaultThrottleCreditHour();
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(throttleSwitch, maxThrottleCredit, ", ACTIVE throttle configuration (last printout is the active one used) throttleSwitch: ", ", maxThrottleCredit: ", ", defaultThrottleCreditHour: ");
        m29m.append(defaultThrottleCreditHour);
        minervaLogger.debug("configuration".concat(m29m.toString()));
    }

    private void setCustomStorageConfiguration(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optJSONObject(MetricsConfigurationConstants.STORAGE_CONFIGURATION) == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.STORAGE_CONFIGURATION);
        long optLong = optJSONObject.optLong(MetricsConfigurationConstants.MAX_BATCH_OPEN_TIME_MILLIS, this.mAssetFileParser.getFallbackMaxBatchOpenTimeMillis());
        long optLong2 = optJSONObject.optLong(MetricsConfigurationConstants.CHECK_BATCH_OPEN_TIME_MILLIS, this.mAssetFileParser.getFallbackCheckBatchOpenTimeMillis());
        long optLong3 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_BATCH_ENTRIES, this.mAssetFileParser.getFallbackMaxBatchEntries());
        long optLong4 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_BATCH_SIZE_BYTES, this.mAssetFileParser.getFallbackMaxBatchSizeBytes());
        long optLong5 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_STORAGE_SPACE_BYTES, this.mAssetFileParser.getFallbackMaxStorageSpaceBytes());
        long optLong6 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_NUMBER_OF_BATCH_FILES, this.mAssetFileParser.getFallbackMaxNumberOfBatchFiles());
        long optLong7 = optJSONObject.optLong(MetricsConfigurationConstants.EXPIRY_TIME_MILLIS, this.mAssetFileParser.getFallbackExpiryTimeMillis());
        long optLong8 = optJSONObject.optLong(MetricsConfigurationConstants.PURGE_PERIOD_MILLIS, this.mAssetFileParser.getFallbackPurgePeriodMillis());
        long optLong9 = optJSONObject.optLong(MetricsConfigurationConstants.TRANSMISSION_PERIOD_MILLIS, this.mAssetFileParser.getFallbackTransmissionPeriodMillis());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m = a$$ExternalSyntheticOutline0.m(", custom storage configuration, maxBatchOpenTimeMillis: ", optLong, ", checkBatchOpenTimeMillis: ");
        m.append(optLong2);
        ArcMode$$ExternalSyntheticOutline0.m(optLong3, ", maxBatchEntries: ", ", maxBatchSizeBytes: ", m);
        m.append(optLong4);
        ArcMode$$ExternalSyntheticOutline0.m(optLong5, ", maxStorageSpaceBytes: ", ", maxNumberOfBatchFiles: ", m);
        m.append(optLong6);
        ArcMode$$ExternalSyntheticOutline0.m(optLong7, ", expiryTimeMillis: ", ", purgePeriodMillis: ", m);
        m.append(optLong8);
        m.append(", transmissionPeriodMillis: ");
        m.append(optLong9);
        minervaLogger.debug("configuration".concat(m.toString()));
        this.mCustomStorageConfiguration = new StorageConfiguration(optLong, optLong2, optLong3, optLong4, optLong5, optLong6, optLong7, optLong8, optLong9);
    }

    private void setCustomUploadConfiguration(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optJSONObject(MetricsConfigurationConstants.UPLOAD_CONFIGURATION) == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.UPLOAD_CONFIGURATION);
        String optString = optJSONObject.optString(MetricsConfigurationConstants.URL_ENDPOINT, this.mAssetFileParser.getFallbackUrlEndpoint());
        String optString2 = optJSONObject.optString(MetricsConfigurationConstants.ION_FORMAT, this.mAssetFileParser.getFallbackIonFormat());
        int optInt = optJSONObject.optInt(MetricsConfigurationConstants.CONNECT_TIMEOUT_MILLIS, this.mAssetFileParser.getFallbackConnectTimeoutMillis());
        int optInt2 = optJSONObject.optInt(MetricsConfigurationConstants.READ_TIMEOUT_MILLIS, this.mAssetFileParser.getFallbackReadTimeoutMillis());
        long optLong = optJSONObject.optLong(MetricsConfigurationConstants.WAKE_LOCK_TIMEOUT_MILLIS, this.mAssetFileParser.getFallbackWakeLockTimeoutMillis());
        String optString3 = optJSONObject.optString(MetricsConfigurationConstants.KPI_REGION, this.mAssetFileParser.getFallbackKpiRegion());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m(", custom upload configuration, urlEndpoint: ", optString, ", ionFormat: ", optString2, ", connectTimeout: ");
        TableInfo$$ExternalSyntheticOutline0.m(m, optInt, ", readTimeout: ", optInt2, ", wakeLockTimeout: ");
        m.append(optLong);
        m.append(", kpiRegion: ");
        m.append(optString3);
        minervaLogger.debug("configuration".concat(m.toString()));
        this.mCustomUploadConfiguration = new UploadConfiguration(optString, optString2, optInt, optInt2, optLong, optString3);
    }

    private void setDenyListConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.DENYLIST_CONFIGURATION) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.DENYLIST_CONFIGURATION) : this.mAssetFileParser.getFallbackDenyListConfiguration();
        String optString = optJSONObject.optString(MetricsConfigurationConstants.DENYLIST_BITS, this.mAssetFileParser.getFallbackDenyListBits());
        int optInt = optJSONObject.optInt(MetricsConfigurationConstants.BITS_SIZE, this.mAssetFileParser.getFallbackDenyListBitSize());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        minervaLogger.debug("configuration".concat(", denylist configuration denyListBits: " + optString + ", bitsSize: " + optInt));
        this.mDenyListConfiguration = new DenyListConfiguration(optJSONObject.optJSONArray(MetricsConfigurationConstants.EXPLICIT_DENYLIST), optString, optInt);
    }

    private void setLocalConfigurationJson(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.LOCAL_CONFIGURATION)) == null) {
            return;
        }
        this.mLocalConfiguration = new LocalConfiguration(optJSONObject.optString(MetricsConfigurationConstants.LOCAL_CUSTOMER_ARCUS_APP_ID));
    }

    private void setSamplingConfiguration(JSONObject jSONObject) {
        int optInt = (jSONObject.optJSONObject(MetricsConfigurationConstants.SAMPLING_CONFIGURATION) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.SAMPLING_CONFIGURATION) : this.mAssetFileParser.getFallbackSamplingConfiguration()).optInt(MetricsConfigurationConstants.DEFAULT_SAMPLING_RATE, this.mAssetFileParser.getFallbackDefaultSamplingRate());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        minervaLogger.debug("configuration".concat(", sampling configuration, defaultSamplingRate : " + optInt));
        this.mSamplingConfiguration = new SamplingConfiguration(optInt);
    }

    private void setStorageConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.STORAGE_CONFIGURATION) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.STORAGE_CONFIGURATION) : this.mAssetFileParser.getFallbackStorageConfiguration();
        long optLong = optJSONObject.optLong(MetricsConfigurationConstants.MAX_BATCH_OPEN_TIME_MILLIS, this.mAssetFileParser.getFallbackMaxBatchOpenTimeMillis());
        long optLong2 = optJSONObject.optLong(MetricsConfigurationConstants.CHECK_BATCH_OPEN_TIME_MILLIS, this.mAssetFileParser.getFallbackCheckBatchOpenTimeMillis());
        long optLong3 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_BATCH_ENTRIES, this.mAssetFileParser.getFallbackMaxBatchEntries());
        long optLong4 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_BATCH_SIZE_BYTES, this.mAssetFileParser.getFallbackMaxBatchSizeBytes());
        long optLong5 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_STORAGE_SPACE_BYTES, this.mAssetFileParser.getFallbackMaxStorageSpaceBytes());
        long optLong6 = optJSONObject.optLong(MetricsConfigurationConstants.MAX_NUMBER_OF_BATCH_FILES, this.mAssetFileParser.getFallbackMaxNumberOfBatchFiles());
        long optLong7 = optJSONObject.optLong(MetricsConfigurationConstants.EXPIRY_TIME_MILLIS, this.mAssetFileParser.getFallbackExpiryTimeMillis());
        long optLong8 = optJSONObject.optLong(MetricsConfigurationConstants.PURGE_PERIOD_MILLIS, this.mAssetFileParser.getFallbackPurgePeriodMillis());
        long optLong9 = optJSONObject.optLong(MetricsConfigurationConstants.TRANSMISSION_PERIOD_MILLIS, this.mAssetFileParser.getFallbackTransmissionPeriodMillis());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m = a$$ExternalSyntheticOutline0.m(", storage configuration: maxBatchOpenTimeMillis: ", optLong, ", checkBatchOpenTimeMillis: ");
        m.append(optLong2);
        ArcMode$$ExternalSyntheticOutline0.m(optLong3, ", maxBatchEntries: ", ", maxBatchSizeBytes: ", m);
        m.append(optLong4);
        ArcMode$$ExternalSyntheticOutline0.m(optLong5, ", maxStorageSpaceBytes: ", ", maxNumberOfBatchFiles: ", m);
        m.append(optLong6);
        ArcMode$$ExternalSyntheticOutline0.m(optLong7, ", expiryTimeMillis: ", ", purgePeriodMillis: ", m);
        m.append(optLong8);
        m.append(", transmissionPeriodMillis: ");
        m.append(optLong9);
        minervaLogger.debug("configuration".concat(m.toString()));
        this.mStorageConfiguration = new StorageConfiguration(optLong, optLong2, optLong3, optLong4, optLong5, optLong6, optLong7, optLong8, optLong9);
    }

    private void setThrottleConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.THROTTLE_CONFIGURATION) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.THROTTLE_CONFIGURATION) : this.mAssetFileParser.getFallbackThrottleConfiguration();
        int optInt = optJSONObject.optInt(MetricsConfigurationConstants.THROTTLE_SWITCH, this.mAssetFileParser.getFallbackThrottleSwitch());
        int optInt2 = optJSONObject.optInt(MetricsConfigurationConstants.MAX_THROTTLE_CREDIT, this.mAssetFileParser.getFallbackMaxThrottleCredit());
        int optInt3 = optJSONObject.optInt(MetricsConfigurationConstants.DEFAULT_THROTTLE_CREDIT_HOUR, this.mAssetFileParser.getFallbackDefaultThrottleCreditHour());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(optInt, optInt2, ", throttle configuration, throttleSwitch: ", ", maxThrottleCredit: ", ", defaultThrottleCreditHour: ");
        m29m.append(optInt3);
        minervaLogger.debug("configuration".concat(m29m.toString()));
        this.mThrottleConfiguration = new ThrottleConfiguration(optInt, optInt2, optInt3);
    }

    private void setThrottleHardLimitsConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.THROTTLE_CONFIGURATION_HARD_LIMITS) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.THROTTLE_CONFIGURATION_HARD_LIMITS) : this.mAssetFileParser.getFallbackThrottleConfigurationHardLimits();
        int optInt = optJSONObject.optInt(MetricsConfigurationConstants.THROTTLE_SWITCH_HARD_LIMIT, this.mAssetFileParser.getFallbackThrottleSwitchHardLimit());
        int optInt2 = optJSONObject.optInt(MetricsConfigurationConstants.MAX_THROTTLE_CREDIT_HARD_LIMIT, this.mAssetFileParser.getFallbackMaxThrottleCreditHardLimit());
        int optInt3 = optJSONObject.optInt(MetricsConfigurationConstants.DEFAULT_THROTTLE_CREDIT_HOUR_HARD_LIMIT, this.mAssetFileParser.getFallbackDefaultThrottleCreditHourHardLimit());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(optInt, optInt2, ", throttle hard limit configuration, throttleSwitchHardLimit: ", ", maxThrottleCreditHardLimit: ", ", defaultThrottleCreditHourHardLimit: ");
        m29m.append(optInt3);
        minervaLogger.debug("configuration".concat(m29m.toString()));
        this.mThrottleHardLimitsConfiguration = new ThrottleConfiguration(optInt, optInt2, optInt3);
    }

    private void setUploadConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.UPLOAD_CONFIGURATION) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.UPLOAD_CONFIGURATION) : this.mAssetFileParser.getFallbackUploadConfiguration();
        String optString = optJSONObject.optString(MetricsConfigurationConstants.URL_ENDPOINT, this.mAssetFileParser.getFallbackUrlEndpoint());
        String optString2 = optJSONObject.optString(MetricsConfigurationConstants.ION_FORMAT, this.mAssetFileParser.getFallbackIonFormat());
        int optInt = optJSONObject.optInt(MetricsConfigurationConstants.CONNECT_TIMEOUT_MILLIS, this.mAssetFileParser.getFallbackConnectTimeoutMillis());
        int optInt2 = optJSONObject.optInt(MetricsConfigurationConstants.READ_TIMEOUT_MILLIS, this.mAssetFileParser.getFallbackReadTimeoutMillis());
        long optLong = optJSONObject.optLong(MetricsConfigurationConstants.WAKE_LOCK_TIMEOUT_MILLIS, this.mAssetFileParser.getFallbackWakeLockTimeoutMillis());
        String optString3 = optJSONObject.optString(MetricsConfigurationConstants.KPI_REGION, this.mAssetFileParser.getFallbackKpiRegion());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m(", upload configuration: urlEndpoint: ", optString, ", ionFormat: ", optString2, ", connectTimeout: ");
        TableInfo$$ExternalSyntheticOutline0.m(m, optInt, ", readTimeout: ", optInt2, ", wakeLockTimeout: ");
        m.append(optLong);
        m.append(", kpiRegion: ");
        m.append(optString3);
        minervaLogger.debug("configuration".concat(m.toString()));
        this.mUploadConfiguration = new UploadConfiguration(optString, optString2, optInt, optInt2, optLong, optString3);
    }

    private void setValidationConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.VALIDATION_CONFIGURATION) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.VALIDATION_CONFIGURATION) : this.mAssetFileParser.getFallbackValidationConfiguration();
        int optInt = optJSONObject.optInt(MetricsConfigurationConstants.MAX_KEY_VALUE_PAIR_COUNT, this.mAssetFileParser.getFallbackMaxKeyValuePairCount());
        int optInt2 = optJSONObject.optInt(MetricsConfigurationConstants.MAX_METRIC_EVENT_SIZE_BYTES, this.mAssetFileParser.getFallbackMaxMetricEventSizeBytes());
        int optInt3 = optJSONObject.optInt(MetricsConfigurationConstants.MAX_KEY_SIZE_BYTES, this.mAssetFileParser.getFallbackMaxKeySizeBytes());
        int optInt4 = optJSONObject.optInt(MetricsConfigurationConstants.MAX_VALUE_SIZE_BYTES, this.mAssetFileParser.getFallbackMaxValueSizeBytes());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(optInt, optInt2, ", validation configuration, maxKeyValuePairCount: ", ", maxMetricEventSizeBytes: ", ", maxKeySizeBytes: ");
        m29m.append(optInt3);
        m29m.append(", maxValueSizeBytes: ");
        m29m.append(optInt4);
        minervaLogger.debug("configuration".concat(m29m.toString()));
        this.mValidationConfiguration = new ValidationConfiguration(optInt, optInt2, optInt3, optInt4);
    }

    public DenyListConfiguration getDenyListConfiguration() {
        return this.mDenyListConfiguration;
    }

    public LocalConfiguration getLocalConfiguration() {
        return this.mLocalConfiguration;
    }

    public MultiProcessConfiguration getMultiProcessConfiguration() {
        return this.mMultiProcessConfiguration;
    }

    public SamplingConfiguration getSamplingConfiguration() {
        return this.mSamplingConfiguration;
    }

    public StorageConfiguration getStorageConfiguration() {
        StorageConfiguration storageConfiguration = this.mCustomStorageConfiguration;
        return storageConfiguration != null ? storageConfiguration : this.mStorageConfiguration;
    }

    public ThrottleConfiguration getThrottleConfiguration() {
        return this.mActiveThrottleConfiguration;
    }

    public UploadConfiguration getUploadConfiguration() {
        UploadConfiguration uploadConfiguration = this.mCustomUploadConfiguration;
        return uploadConfiguration != null ? uploadConfiguration : this.mUploadConfiguration;
    }

    public ValidationConfiguration getValidationConfiguration() {
        return this.mValidationConfiguration;
    }

    public void setConfigurationFromCustomFile() {
        log.info("configuration, set custom starter config from customConfiguration file");
        JSONObject parseMetricsConfiguration = this.mAssetFileParser.parseMetricsConfiguration(this.mContext, MetricsConfigurationConstants.CUSTOM_CONFIGURATION_FILE_NAME);
        setCustomMetricsConfigurationJson(parseMetricsConfiguration);
        setLocalConfigurationJson(parseMetricsConfiguration);
    }

    public boolean setCustomMetricsConfiguration(Configuration configuration) {
        JSONObject asJsonObject = configuration.getAsJsonObject();
        if (asJsonObject.length() == 0) {
            return false;
        }
        try {
            return setCustomMetricsConfigurationJson(this.mAssetFileParser.getDomainMetricsConfiguration(asJsonObject));
        } catch (JSONException e) {
            log.error("configuration".concat(", An error occurs when retrieving domain configuration. " + e.getMessage()));
            return false;
        }
    }

    public boolean setCustomMetricsConfigurationJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        setCustomStorageConfiguration(jSONObject);
        setCustomUploadConfiguration(jSONObject);
        setCustomThrottleConfiguration(jSONObject);
        setActiveThrottle();
        setMultiProcessConfiguration(jSONObject);
        return true;
    }

    public void setCustomThrottleConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.THROTTLE_CONFIGURATION) != null ? jSONObject.optJSONObject(MetricsConfigurationConstants.THROTTLE_CONFIGURATION) : this.mAssetFileParser.getFallbackThrottleConfiguration();
        int optInt = optJSONObject.optInt(MetricsConfigurationConstants.THROTTLE_SWITCH, this.mAssetFileParser.getFallbackThrottleSwitch());
        int optInt2 = optJSONObject.optInt(MetricsConfigurationConstants.MAX_THROTTLE_CREDIT, this.mAssetFileParser.getFallbackMaxThrottleCredit());
        int optInt3 = optJSONObject.optInt(MetricsConfigurationConstants.DEFAULT_THROTTLE_CREDIT_HOUR, this.mAssetFileParser.getFallbackDefaultThrottleCreditHour());
        MinervaLogger minervaLogger = log;
        Locale locale = Locale.US;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(optInt, optInt2, ", custom throttle configuration, throttleSwitch: ", ", maxThrottleCount: ", ", defaultThrottleCreditHour: ");
        m29m.append(optInt3);
        minervaLogger.debug("configuration".concat(m29m.toString()));
        this.mCustomThrottleConfiguration = new ThrottleConfiguration(optInt, optInt2, optInt3);
    }

    public boolean setMetricsConfiguration(Configuration configuration) {
        JSONObject asJsonObject = configuration.getAsJsonObject();
        if (asJsonObject.length() == 0) {
            return false;
        }
        try {
            return setMetricsConfigurationJson(this.mAssetFileParser.getDomainMetricsConfiguration(asJsonObject));
        } catch (JSONException e) {
            log.error("configuration".concat(", An error occurs when retrieving domain configuration. " + e.getMessage()));
            return false;
        }
    }

    public boolean setMetricsConfigurationJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        setValidationConfiguration(jSONObject);
        setThrottleConfiguration(jSONObject);
        setThrottleHardLimitsConfiguration(jSONObject);
        setActiveThrottle();
        setSamplingConfiguration(jSONObject);
        setDenyListConfiguration(jSONObject);
        setStorageConfiguration(jSONObject);
        setUploadConfiguration(jSONObject);
        return true;
    }

    public void setMultiProcessConfiguration(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MetricsConfigurationConstants.MULTI_PROCESS_CONFIGURATION);
        if (optJSONObject != null) {
            JSONArray optJSONArray = optJSONObject.optJSONArray(MetricsConfigurationConstants.SECONDARY_PROCESSES);
            HashSet hashSet = new HashSet();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString == null || optString.isEmpty()) {
                        log.warn("setMultiProcessConfiguration: Invalid configuration found!");
                    } else {
                        hashSet.add(optString);
                        log.debug("setMultiProcessConfiguration: Adding process: " + optString + " to list");
                    }
                }
            }
            this.mMultiProcessConfiguration = new MultiProcessConfiguration(optJSONObject.optString(MetricsConfigurationConstants.MAIN_PROCESS_NAME), hashSet);
        }
    }
}
