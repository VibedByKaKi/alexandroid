package com.amazon.alexa.featureservice.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FeatureConstants {
    public static final String APP_AUTHENTICATED_EVENT = "app:authenticated";
    public static final String APP_UPGRADED_EVENT = "app:upgraded";
    public static final String BENEFITS_ENTITLEMENT_UPDATE_EVENT = "alexa_premium_default";
    public static final String CANARY_FEATURE_NAME = "FOUNDATION_ANDROID_TRIGGER_CANARY";
    public static final String CONTROL = "C";
    public static final String CONTROL_DEFAULT = "C_DEFAULT";
    public static final String FEATURES_UPDATED_EVENT = "featureServiceV2:featuresUpdated";
    public static final String FEATURES_UPDATED_FTUE_IDENTITY_CHANGED_EVENT = "featureServiceV2:internal:featuresUpdatedForFTUEIdentityChanged";
    public static final String FEATURES_UPDATED_INTERNAL_EVENT = "featureServiceV2:internal:featuresUpdated";
    public static final long FEATURE_NEVER_REFRESHED = -1;
    public static final String FEATURE_SERVICE_ENDPOINT = "/api/features";
    public static final String FEATURE_SERVICE_V2_TAG = "DefaultFeatureServiceV2";
    public static final String FEATURE_SERVICE_V2_WEBLAB = "FEATURE_SERVICE_V2_ANDROID";
    public static final String NAMESPACE_DELIMITER = "#";
    public static final String RECORD_TRIGGER_ENDPOINT = "api/features/v2/triggers";
    public static final long REFRESH_FEATURE_FREQUENCY_IN_MILLISECONDS = 3600000;
    public static final long SESSION_CHANGE_THRESHOLD_IN_MILLISECONDS = 600000;
    public static final String T1 = "T1";
    public static final String T1_DEFAULT = "T1_DEFAULT";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CrashMitigation {
        public static final String BUGSNAG_STATUS_KEY = "bugsnagStatus";
        public static final int CRASH_LOOP_THRESHOLD = 3;
        public static final String FEATURE_SERVICE_PREF_STORE = "com.amazon.alexa.featureService.preferencesStore";
        public static final String FEATURE_SERVICE_STATUS_KEY = "featureServiceStatus";
        public static final String INCOMPLETE_START_COUNT_KEY = "incompleteStartCount";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public @interface FetchIdentifier {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Identifiers {
        public static final String FETCH_FEATURES_WHEN_AUTHENTICATED = "fetchFeaturesWhenAuthenticated";
        public static final String PREFETCH_NEWLY_ADDED_FEATURES = "prefetchNewlyAddedFeatures";
        public static final String REFRESH_FEATURES_IF_REALM_CHANGED = "refreshFeaturesIfRealmChanged";
        public static final String REFRESH_FEATURES_IF_STALE = "refreshFeaturesIfStale";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Network {
        public static final String ALLOCATION_ID = "allocationId";
        public static final String FEATURE_NAME = "name";
        public static final String FEATURE_NAMESPACE = "namespace";
        public static final String RECORD_STATUS = "recordStatus";
        public static final String SHOULD_RECORD_TRIGGER = "shouldRecordTrigger";
        public static final String TIME_USED = "timeUsed";
        public static final String TREATMENT = "treatment";
        public static final String TREATMENTS = "treatments";
        public static final String TREATMENT_USED = "treatmentUsed";
        public static final String TRIGGER_ON_USE = "triggerOnUse";
    }

    private FeatureConstants() {
    }
}
