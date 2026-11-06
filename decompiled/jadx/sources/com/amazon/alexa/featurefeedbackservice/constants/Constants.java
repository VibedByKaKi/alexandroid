package com.amazon.alexa.featurefeedbackservice.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Constants {
    public static final int DEFAULT_JSON_INT = 0;
    public static final String FEATURE_FEEDBACK_SERVICE = "featureFeedbackService";
    public static final String FEATURE_GATE_C_TREATMENT = "C";
    public static final String FEATURE_GATE_ENABLED = "ALEXA_FEATURE_FEEDBACK_ENABLED_ANDROID";
    public static final String FEATURE_GATE_GUARDRAILS = "ALEXA_FEATURE_FEEDBACK_LOCAL_GUARDRAIL_ANDROID";
    public static final String FEATURE_GATE_NAMESPACE = "ALEXA_MOBILE_FEATURE_FEEDBACK";
    public static final String FEATURE_GATE_T1_TREATMENT = "T1";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CheckEligibility {
        public static final String EVENT_CHECK_ELIGIBILITY_REQUEST = "featurefeedbackservice:checkeligibility:request";
        public static final String EVENT_CHECK_ELIGIBILITY_RESPONSE = "featurefeedbackservice:checkeligibility:response";
        public static final String NOT_ELIGIBLE_MESSAGE = "Not eligible to show feature feedback prompt";
        public static final String NOT_ELIGIBLE_MESSAGE_LOCAL_GUARDRAIL = "Not eligible as blocked by local guardrail";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FeatureFeedbackConfigs {
        public static final String FEATURE_FEEDBACK_CONFIGS_ENDPOINT = "/api/feature-feedback/configuration";
        public static final String FEEDBACK_CONFIGS = "feedbackConfigurations";
        public static final String FEEDBACK_CONFIG_FEATURE_NAME = "feature";
        public static final String FEEDBACK_CONFIG_PROMPT_CONFIG = "promptConfiguration";
        public static final String PROMPT_CONFIG_ELIGIBLE = "promptEligible";
        public static final String PROMPT_CONFIG_ELIGIBLE_TIMESTAMP = "promptEligibleTimestamp";
        public static final String PROMPT_CONFIG_EVENTS = "promptEvents";
        public static final String PROMPT_CONFIG_LOCAL_GUARDRAIL_MS = "localMinTimeBetweenPromptsMillis";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Interactions {
        public static final String FEATURE_FEEDBACK_INTERACTIONS_ENDPOINT = "/api/feature-feedback/interactions";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Storage {
        public static final String CONFIG_REFRESH_STATUS_KEY = "featureFeedbackService.configrefreshstatus";
        public static final String FEATURE_FEEDBACK_SERVICE_CONFIG_KEY = "featureFeedbackService.config";
        public static final String FEATURE_FEEDBACK_SERVICE_LOCAL_GUARDRAILS_NAMESPACE = "featureFeedbackService.guardrails.";
        public static final String FEATURE_FEEDBACK_SERVICE_PREF_STORE = "com.amazon.alexa.featureFeedbackService.preferencesStore";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SubmitFeedback {
        public static final String BAD_REQUEST = "The request is not valid";
        public static final String EVENT_SUBMIT_FEEDBACK_REQUEST = "featurefeedbackservice:submitfeedback:request";
        public static final String EVENT_SUBMIT_FEEDBACK_RESPONSE = "featurefeedbackservice:submitfeedback:response";
        public static final String NOT_ELIGIBLE = "User is not eligible for feature feedback prompt";
        public static final String REQUEST_CAMPAIGN_ID = "campaignId";
        public static final String REQUEST_CAMPAIGN_TYPE = "campaignType";
        public static final String REQUEST_CONTENT_DETAILS = "contentDetails";
        public static final String REQUEST_EXPERIENCE_DETAILS = "experienceFeedbackDetails";
        public static final String REQUEST_FEATURE = "feature";
        public static final String REQUEST_FEEDBACK_CHANNEL = "feedbackChannel";
        public static final String REQUEST_FEEDBACK_DATA = "feedbackData";
        public static final String REQUEST_FEEDBACK_TYPE = "feedbackType";
        public static final String REQUEST_PROACTIVE_DETAILS = "proactiveFeedbackDetails";
        public static final String SUBMIT_FEATURE_FEEDBACK_ENDPOINT = "/api/feature-feedback";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SubmitFeedbackContentDetails {
        public static final String REQUEST_CONTENT_CONTEXT_STRING = "contentContextString";
        public static final String REQUEST_CONTENT_ID = "contentId";
        public static final String REQUEST_CONTENT_TYPE = "contentType";
        public static final String REQUEST_IMPRESSION_ID = "impressionId";
        public static final String REQUEST_JOB_ID = "jobId";
        public static final String REQUEST_POSITION = "position";
        public static final String REQUEST_PROVIDER_ID = "providerId";
        public static final String REQUEST_SLOT_ID = "slotId";
        public static final String REQUEST_SOURCE = "source";
        public static final String REQUEST_TOPIC_ID_LIST = "topicIdList";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SubmitFeedbackExperienceDetails {
        public static final String REQUEST_ID = "experienceId";
        public static final String REQUEST_INQUIRY_ID = "inquiryId";
        public static final String REQUEST_INQUIRY_LIST = "inquiryList";
        public static final String REQUEST_INQUIRY_LOCALE = "inquiryLocale";
        public static final String REQUEST_INQUIRY_OPTION_ID = "optionId";
        public static final String REQUEST_INQUIRY_OPTION_LIST = "optionList";
        public static final String REQUEST_INQUIRY_OPTION_SELECTED = "selected";
        public static final String REQUEST_INQUIRY_OPTION_TEXT = "optionText";
        public static final String REQUEST_INQUIRY_TEXT = "inquiryText";
        public static final String REQUEST_TYPE = "experienceType";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SubmitFeedbackProactiveDetails {
        public static final String REQUEST_TYPE = "type";
    }

    private Constants() {
    }
}
