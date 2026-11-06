package com.amazon.alexa.client.core.configuration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum SDKFeature {
    INCORRECT_FEATURE_NAME("incorrect_feature_name"),
    GEOLOCATION("geolocation"),
    EMP("external_media_player"),
    APL("apl"),
    NON_MEDIA_NOTIFICATION("non_media_notification");

    private final String featureName;

    SDKFeature(String str) {
        this.featureName = str;
    }

    public static SDKFeature from(String str) {
        for (SDKFeature sDKFeature : values()) {
            if (sDKFeature.featureName.equalsIgnoreCase(str)) {
                return sDKFeature;
            }
        }
        return INCORRECT_FEATURE_NAME;
    }

    public String getFeatureName() {
        return this.featureName;
    }
}
