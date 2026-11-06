package com.amazon.alexa.featurefeedbackservice.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MetricConstants {
    public static final String FEATURE_FEEDBACK_SERVICE = "feature_feedback_service";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Component {
        public static final String CHECK_ELIGIBILITY = "check_feature_feedback_eligibility";
        public static final String CONFIG_RETRIEVAL_MANAGER = "config_retrieval_manager";
        public static final String SUBMIT_FEEDBACK = "submit_feature_feedback";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EventName {
        public static final String CHECK_ELIGIBILITY_ATTEMPT = "check_feature_feedback_eligibility_attempt";
        public static final String CHECK_ELIGIBILITY_TIME = "check_feature_feedback_eligibility_time";
        public static final String DOWNLOAD_CONFIGS_ATTEMPT = "download_feature_feedback_configs_attempt";
        public static final String DOWNLOAD_CONFIGS_FAILED = "download_feature_feedback_configs_failed";
        public static final String DOWNLOAD_CONFIGS_INVALID_RESPONSE = "download_feature_feedback_configs_invalid_response";
        public static final String DOWNLOAD_CONFIGS_TIME = "download_feature_feedback_configs_time";
        public static final String LOAD_CONFIG_TIME = "load_config_time";
        public static final String RETRIEVE_CONFIG_REMOTE_ATTEMPT = "retrieve_config_remote_attempt";
        public static final String RETRIEVE_CONFIG_REMOTE_TIME = "retrieve_config_remote_time";
        public static final String SUBMIT_FEEDBACK_ATTEMPT = "submit_feature_feedback_attempt";
        public static final String SUBMIT_FEEDBACK_NOT_ELIGIBLE = "submit_feature_not_eligible";
        public static final String SUBMIT_FEEDBACK_REMOTE_ATTEMPT = "submit_feature_feedback_remote_attempt";
        public static final String SUBMIT_FEEDBACK_REMOTE_FAILED = "submit_feature_feedback_remote_failed";
        public static final String SUBMIT_FEEDBACK_REMOTE_TIME = "submit_feature_feedback_remote_time";
        public static final String SUBMIT_FEEDBACK_TIME = "submit_feature_feedback_time";
    }

    private MetricConstants() {
    }
}
