package com.amazon.alexa.configservice.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Configuration {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CloudfrontUrl {
        public static final String DEFAULT = "https://d1w28k9rcqb7vf.cloudfront.net";
        public static final String PREVIEW = "https://d117ji2zxzh57j.cloudfront.net";
        public static final String PROD = "https://d1w28k9rcqb7vf.cloudfront.net";
        public static final String PROD_QA = "https://d1w28k9rcqb7vf.cloudfront.net";

        private CloudfrontUrl() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RefreshTimePeriod {
        public static final int CONFIG_RETRIEVAL_FAILURE = 1200;
        public static final int CONFIG_RETRIEVAL_SUCCESS = 3600;

        private RefreshTimePeriod() {
        }
    }

    private Configuration() {
    }
}
