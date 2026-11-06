package com.amazon.alexa.featureservice.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FeatureServiceMetrics {
    public static final String HTTP_ERROR_PREFIX = "http_error_";
    public static final String METRICS_NAME_PREFIX = "feature_service_v2.";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EventName {
        public static final String BENEFIT_ENTITLEMENT = "benefit_entitlement";
        public static final String BUGSNAG_NOT_INITIALIZED = "bugsnag_not_initialized";
        public static final String CLEAR_FEATURES_FAILED = "clear_features_failed";
        public static final String CLEAR_FEATURES_SUCCESS = "clear_features_success";
        public static final String COLD_START = "cold_start";
        public static final String CORE_API_TIME_INTERVAL = "CoreAPITimeInterval";
        public static final String CRASH_LOOP_DETECTED = "crash_loop_detected";
        public static final String CRASH_MITIGATION_EVENT_PREFIX = "prefetch_";
        public static final String CRASH_MITIGATION_SUPPRESSED = "crash_mitigation_suppressed";
        public static final String DB_TO_CACHE_FAIL = "DB_to_cache_fail";
        public static final String DB_TO_CACHE_SUCCESS = "DB_to_cache_success";
        public static final String DOWNLOAD_FEATURES = "download_features";
        public static final String EMPTY_RESPONSE = "empty_response";
        public static final String EXECUTION_ERROR = "execution_error";
        public static final String FEATURE_REFRESH_COMPLETED = "feature_refresh_completed";
        public static final String FEATURE_REFRESH_NOT_COMPLETED = "feature_refresh_not_completed";
        public static final String FEATURE_REFRESH_NOT_STARTED = "feature_refresh_not_started";
        public static final String FSV2_IMPLEMENTATION = "FSV2_impl";
        public static final String INITIALIZE_SERVICE = "initialize_service";
        public static final String INIT_APP_START_STATUS = "init_app_start_status";
        public static final String INTERRUPT_ERROR = "interrupt_error";
        public static final String LOAD_APP_START_STATUS = "load_app_start_status";
        public static final String LOAD_APP_START_STATUS_FAILED = "load_app_start_status_failed";
        public static final String MISSING_TREATMENT = "missing_treatment";
        public static final String MODEL_ERROR = "model_error";
        public static final String PARSE_FAILED = "parse_failed";
        public static final String RECORD_TRIGGERS_FAILED = "record_triggers_failed";
        public static final String RECORD_TRIGGERS_SUCCESS = "record_triggers_success";
        public static final String REFRESH_FEATURES = "refresh_features";
        public static final String RE_LOGIN = "re_login";
        public static final String STORE_FEATURES_LOCAL_IN_BATCH = "store_features_local_in_batch";
        public static final String STORE_FEATURES_LOCAL_NO_BATCH = "store_features_local_no_batch";
        public static final String UPDATE_APP_START_STATUS = "update_app_start_status";
        public static final String UPDATE_BUGSNAG_COMP_TIME = "update_bugsnag_complete_time";
        public static final String VERSION_UPGRADED = "version_upgraded";
        public static final String WARM_START = "warm_start";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EventType {
        public static final String APP_VERSION = "app_version";
        public static final String BMCL = "bmcl";
        public static final String CONSTRUCTOR_INIT = "constructor_init";
        public static final String CORE_API_GET_TREATMENT = "get_treatment";
        public static final String CORE_API_GET_TREATMENT_AND_RECORD_TRIGGER = "get_treatment_and_record_trigger";
        public static final String CORE_API_GET_TREATMENT_AND_RECORD_TRIGGER_WITH_NAMESPACE = "get_treatment_and_record_trigger_namespace";
        public static final String CORE_API_GET_TREATMENT_WITH_NAMESPACE = "get_treatment_namespace";
        public static final String CORE_API_HAS_ACCESS = "has_access";
        public static final String CORE_API_HAS_ACCESS_WITH_NAMESPACE = "has_access_namespace";
        public static final String CORE_API_OBSERVE_FEATURE = "observe_feature";
        public static final String CORE_API_OBSERVE_FEATURE_WITH_NAMESPACE = "observe_feature_namespace";
        public static final String CRASH_MITIGATION = "crash_mitigation";
        public static final String EXPERIMENTATION_NON_ACTIONABLE_HTTP_ERROR = "experimentation_non_actionable_http_error";
        public static final String EXPERIMENTATION_TRIGGER_HTTP_ERROR = "experimentation_trigger_http_error";
        public static final String EXPERIMENTATION_TRIGGER_SUCCESS = "experimentation_trigger_success";
        public static final String EXPERIMENT_ERROR = "experiment_error";
        public static final String EXPERIMENT_RECORD = "experiment_record";
        public static final String INIT_CONSTRUCTOR_ERROR = "init_constructor_error";
        public static final String NEW_SESSION = "new_session";
        public static final String NON_ACTIONABLE_HTTP_ERROR = "non_actionable_http_error";
        public static final String POST_INIT_TIMER = "core_startup.dependency_post_init";
        public static final String PREFETCH_ATTEMPTED = "attempted";
        public static final String PREFETCH_COMPLETED = "completed";
        public static final String REFRESH_HTTP_ERROR = "refresh_http_error";
        public static final String REFRESH_PAYLOAD_ERROR = "refresh_payload_error";
        public static final String REFRESH_SUCCESS = "refresh_success";
        public static final String ROOM_THREAD_ERROR = "room_thread_error";
        public static final String SYNCHRONOUS_REFRESH = "sync_refresh";
        public static final String TRIGGER_HTTP_ERROR = "trigger_http_error";
        public static final String TRIGGER_PAYLOAD_ERROR = "trigger_payload_error";
        public static final String TRIGGER_RECORD = "trigger_record";
        public static final String TRIGGER_REQUEST = "trigger_request";
        public static final String TRIGGER_SUCCESS = "trigger_success";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Subcomponent {
        public static final String APP_GENERIC = "AppGeneric";
        public static final String APP_START_STATUS = "AppStartStatus";
        public static final String PREFETCH_FEATURES = "PrefetchFeatures";
        public static final String RECORD_TRIGGER = "RecordTrigger";
        public static final String REFRESH_FEATURES = "RefreshFeatures";
        public static final String ROOM_DATABASE = "RoomDatabase";
        public static final String SESSION_MANAGEMENT = "SessionManagement";
        public static final String VIEW_MODEL_CONSTRUCTOR = "ViewModelConstructor";
    }

    private FeatureServiceMetrics() {
    }
}
