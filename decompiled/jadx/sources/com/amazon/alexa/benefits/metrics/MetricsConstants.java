package com.amazon.alexa.benefits.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MetricsConstants {
    public static final String BENEFITS_COMPONENT = "AlexaBenefits";
    public static final String BENEFITS_SUB_COMPONENT = "AlexaBenefits";
    public static final String COUNTER_EVENT = ".Count";
    public static final String DEBUG = ".Debug";
    public static final String EMPTY_SUFFIX = "";
    public static final String METRIC_SEPARATOR = ".";
    public static final String SUCCESS_EVENT = ".Success";
    public static final String TIME_EVENT = ".Time";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OperationalMetrics {
        public static final String BACKGROUND_APP_START_CALL = "backgroundAppStartCall";
        public static final String BENEFITS_CACHE_EXPIRED = "benefitsCacheExpired";
        public static final String BENEFITS_UNEXPIRED_CACHE_NETWORK_CALL = "madeUnforcedUnexpiredBenefitsCall";
        public static final String BENEFITS_WEBLAB_GROOT_BYPASS_TAKEN = "benefitsWeblabGrootBypassTaken";
        public static final String BENEFITS_WEBLAB_GROOT_MARKETPLACE_BYPASS_TAKEN = "benefitsWeblabGrootMarketplaceBypassTaken";
        public static final String BETA_STATUS_CHANGE_EVENT = "betaStatusChangeEvent";
        public static final String CACHE_JSON_PARSE_ERROR = "cacheJsonParseError";
        public static final String ENTITLEMENT_UPDATE_CAPABILITY_RECEIVED = "entitlementUpdateCapabilityReceived";
        public static final String FORCE_BENEFITS_ENTITLEMENT = "forceBenefitsEntitlement";
        public static final String GET_ALL_BENEFITS_API = "getAllBenefitsApi";
        public static final String GET_ALL_BENEFITS_CACHE_EXPIRED = "getAllBenefitsCacheExpired";
        public static final String GET_BENEFITS_CACHE_RETURN = "getBenefitsEntitlementCacheReturn";
        public static final String GET_BENEFITS_ENTITLEMENT = "getBenefitsEntitlement";
        public static final String GET_BENEFITS_NONEXISTENT_BENEFIT = "getBenefitsEntitlementNonexistentBenefit";
        public static final String GET_BENEFITS_OFFLINE = "getAllBenefitsOffline";
        public static final String LOCALE_UPDATE = "locale-update.%s-%s";
        public static final String MAP_TOKEN_EMPTY = "mapTokenEmpty";
        public static final String NOT_AUTHENTICATED = "notAuthenticated";
        public static final String PEEK_BENEFITS_ENTITLEMENT = "peekBenefitsEntitlement";
        public static final String PEEK_MULTIPLE_BENEFITS = "peekMultipleBenefits";
        public static final String SUBSCRIBE_TO_BENEFITS_ENTITLEMENT = "subscribeToBenefitsEntitlement";

        private OperationalMetrics() {
        }
    }

    private MetricsConstants() {
    }
}
