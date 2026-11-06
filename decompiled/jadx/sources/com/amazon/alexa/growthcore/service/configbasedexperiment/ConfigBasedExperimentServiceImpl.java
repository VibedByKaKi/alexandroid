package com.amazon.alexa.growthcore.service.configbasedexperiment;

import android.content.res.Configuration;
import android.util.Log;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.configservice.api.Domain;
import com.amazon.alexa.growthcore.service.cache.CacheService;
import com.amazon.alexa.growthcore.service.configbasedexperiment.AssignmentResult;
import com.amazon.alexa.growthcore.service.configbasedexperiment.ExperimentConfig;
import com.amazon.alexa.growthcore.service.metadata.MetadataProvider;
import com.amazon.alexa.growthcore.service.metrics.MetricsConstant;
import com.amazon.alexa.growthcore.service.metrics.MobilyticsService;
import com.amazon.alexa.growthcore.service.sessionid.ExperimentSessionIDProvider;
import com.amazon.alexa.growthcore.util.NumericUtil;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ConfigBasedExperimentServiceImpl implements ConfigBasedExperimentService {
    private static final String ASSIGNMENT_CACHING_KEY_DELIMITER = "_";
    private static final long ASSIGNMENT_CACHING_TTL_IN_MS = 3600000;
    private static final String PER_EXPERIMENT_GATING_SESSION_SUFFIX = "GATING";
    private static final String PER_EXPERIMENT_SESSION_DELIMITER = "_";
    private static final int PER_EXPERIMENT_SESSION_MAX_BYTES = 4;
    private static final long PER_EXPERIMENT_SESSION_MAX_VALUES = 4294967295L;
    private static final String PER_EXPERIMENT_SESSION_SUFFIX = "EXPERIMENT";
    private static final String RECORD_TRIGGER_DATA_VALUE_DELIMITER = "_";
    private static final String TAG = "ConfigBasedExperimentServiceImpl";
    private static ConfigBasedExperimentServiceImpl instance;
    private final CacheService<AssignmentResult> cacheService;
    private final Lazy<ConfigService> configService;
    private final Configuration configuration;
    private final Lazy<ExperimentSessionIDProvider> experimentSessionIDProvider;
    private final Lazy<MetadataProvider> metadataProvider;
    private final Lazy<MobilyticsService> mobilyticsService;

    @VisibleForTesting
    public ConfigBasedExperimentServiceImpl(@NonNull Lazy<ExperimentSessionIDProvider> lazy, @NonNull Lazy<ConfigService> lazy2, @NonNull Lazy<MetadataProvider> lazy3, @NonNull Lazy<MobilyticsService> lazy4, @NonNull CacheService<AssignmentResult> cacheService, @NonNull Configuration configuration) {
        this.experimentSessionIDProvider = lazy;
        this.configService = lazy2;
        this.metadataProvider = lazy3;
        this.mobilyticsService = lazy4;
        this.cacheService = cacheService;
        this.configuration = configuration;
    }

    private AssignmentResult getAssignmentAndRecordTriggerInternal(@NonNull String str, @NonNull AssignmentResult assignmentResult) throws Exception {
        if ("".equals(this.experimentSessionIDProvider.get().get())) {
            Log.w(TAG, String.format("Experiment session ID is not available while getting treatment for %1$s. Returning treatment value as %2$s.", str, assignmentResult.treatment));
            return assignmentResult;
        }
        ExperimentConfig experimentConfig = (ExperimentConfig) this.configService.get().getConfig(Domain.AMG, str, new ExperimentConfig());
        if (!experimentConfig.isValid()) {
            Log.w(TAG, String.format("Experiment config is not valid while getting treatment for %1$s. Returning treatment value as %2$s.", str, assignmentResult.treatment));
            return assignmentResult;
        }
        String appVersion = this.metadataProvider.get().getAppVersion();
        if (!experimentConfig.isApplicableToAppVersion(appVersion)) {
            Log.w(TAG, String.format("Current app version \"%1$s\" is not applicable to config's inclusive lower bound \"%2$s\" while getting treatment for %3$s. Returning treatment value as %4$s.", appVersion, experimentConfig.fromAppVersion, str, assignmentResult.treatment));
            return assignmentResult;
        }
        Locale configuredLocale = getConfiguredLocale();
        ExperimentConfig.Allocation allocationForLocale = experimentConfig.getAllocationForLocale(configuredLocale);
        if (allocationForLocale == null) {
            Log.w(TAG, String.format("Experiment \"%1$s\" is not conducted in the device locale country settings (\"%2$s\"). Returning treatment value as %3$s.", str, configuredLocale.getISO3Country(), assignmentResult.treatment));
            return assignmentResult;
        }
        if (!isInExperiment(str, allocationForLocale)) {
            Log.w(TAG, String.format("Current app session is not in \"%1$s\" experiment. Returning treatment value as %2$s.", str, assignmentResult.treatment));
            return assignmentResult;
        }
        String treatment = getTreatment(str, allocationForLocale);
        recordTrigger(str, allocationForLocale, treatment);
        Log.i(TAG, String.format("Returning %1$s as treatment for %2$s.", treatment, str));
        return new AssignmentResult(treatment, getAssignmentMetadata(allocationForLocale));
    }

    private String getAssignmentCacheKey(@Nullable String str) {
        return String.join("_", str, getConfiguredLocale().getISO3Country());
    }

    private Map<AssignmentResult.AssignmentMetadataKey, String> getAssignmentMetadata(@NonNull ExperimentConfig.Allocation allocation) {
        return new HashMap<AssignmentResult.AssignmentMetadataKey, String>(allocation) { // from class: com.amazon.alexa.growthcore.service.configbasedexperiment.ConfigBasedExperimentServiceImpl.1
            final /* synthetic */ ExperimentConfig.Allocation val$allocation;

            {
                this.val$allocation = allocation;
                put(AssignmentResult.AssignmentMetadataKey.LOCALE_ID, allocation.localeID);
                put(AssignmentResult.AssignmentMetadataKey.RANDOMIZATION, String.valueOf(allocation.randomization));
                put(AssignmentResult.AssignmentMetadataKey.APP_VERSION, ((MetadataProvider) ConfigBasedExperimentServiceImpl.this.metadataProvider.get()).getAppVersion());
            }
        };
    }

    private Locale getConfiguredLocale() {
        return this.configuration.getLocales().get(0);
    }

    public static ConfigBasedExperimentServiceImpl getInstance(@NonNull Lazy<ExperimentSessionIDProvider> lazy, @NonNull Lazy<ConfigService> lazy2, @NonNull Lazy<MetadataProvider> lazy3, @NonNull Lazy<MobilyticsService> lazy4, @NonNull CacheService<AssignmentResult> cacheService, @NonNull Configuration configuration) {
        if (instance == null) {
            synchronized (ConfigBasedExperimentServiceImpl.class) {
                try {
                    if (instance == null) {
                        instance = new ConfigBasedExperimentServiceImpl(lazy, lazy2, lazy3, lazy4, cacheService, configuration);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    private double getNormalizedPerExperimentSession(@NonNull String str, @NonNull ExperimentConfig.Allocation allocation, @NonNull String str2) throws NoSuchAlgorithmException, IllegalArgumentException {
        return (NumericUtil.toLong(NumericUtil.md5(getPerExperimentSession(str, allocation, str2)), 4) / 4.294967295E9d) * 100.0d;
    }

    private String getPerExperimentSession(@NonNull String str, @NonNull ExperimentConfig.Allocation allocation, @NonNull String str2) {
        return String.join("_", this.experimentSessionIDProvider.get().get(), str, allocation.localeID, allocation.randomization.toString(), str2);
    }

    private String getTreatment(@NonNull String str, @NonNull ExperimentConfig.Allocation allocation) throws NoSuchAlgorithmException, IllegalArgumentException, ArithmeticException {
        return getTreatmentGroup(allocation.getTreatmentForSession(getNormalizedPerExperimentSession(str, allocation, PER_EXPERIMENT_SESSION_SUFFIX)));
    }

    private String getTreatmentGroup(@IntRange(from = 0) int i) {
        return i > 0 ? a$$ExternalSyntheticOutline0.m(i, ExifInterface.GPS_DIRECTION_TRUE) : "C";
    }

    private boolean isInExperiment(@NonNull String str, @NonNull ExperimentConfig.Allocation allocation) throws NoSuchAlgorithmException, IllegalArgumentException {
        return allocation.launchAllocation.intValue() != 0 && getNormalizedPerExperimentSession(str, allocation, PER_EXPERIMENT_GATING_SESSION_SUFFIX) <= ((double) allocation.launchAllocation.intValue());
    }

    private void recordTrigger(@NonNull String str, @NonNull ExperimentConfig.Allocation allocation, @NonNull String str2) {
        this.mobilyticsService.get().recordDataEvent(MetricsConstant.EventTypes.RECORD_TREATMENT_TRIGGER, MetricsConstant.SubComponents.CONFIG_BASED_EXPERIMENT_SERVICE, String.join("_", allocation.localeID, String.valueOf(allocation.randomization), str2), str, this.metadataProvider.get().getAppVersion(), this.experimentSessionIDProvider.get().get());
    }

    @Override // com.amazon.alexa.growthcore.service.configbasedexperiment.ConfigBasedExperimentService
    public AssignmentResult getAssignmentAndRecordTrigger(@NonNull String str, @NonNull AssignmentResult assignmentResult) {
        if (str != null) {
            try {
                if (!"".equals(str)) {
                    String assignmentCacheKey = getAssignmentCacheKey(str);
                    AssignmentResult assignmentResult2 = this.cacheService.get(assignmentCacheKey);
                    if (assignmentResult2 != null) {
                        return assignmentResult2;
                    }
                    AssignmentResult assignmentAndRecordTriggerInternal = getAssignmentAndRecordTriggerInternal(str, assignmentResult);
                    this.cacheService.put(assignmentCacheKey, assignmentAndRecordTriggerInternal, 3600000L);
                    return assignmentAndRecordTriggerInternal;
                }
            } catch (Exception e) {
                Log.e(TAG, String.format("Exception while getting treament for %1$s. Returning treatment value as %2$s.\n%3$s", str, assignmentResult.treatment, e.getMessage()));
                this.mobilyticsService.get().recordErrorEvent(MobilyticsService.getPMETMetricName(MetricsConstant.SubComponents.CONFIG_BASED_EXPERIMENT_SERVICE, e.getClass().getSimpleName(), str), MetricsConstant.SubComponents.CONFIG_BASED_EXPERIMENT_SERVICE, e);
            }
        }
        return assignmentResult;
    }
}
