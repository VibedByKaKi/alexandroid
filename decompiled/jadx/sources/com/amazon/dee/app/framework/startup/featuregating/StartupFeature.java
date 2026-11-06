package com.amazon.dee.app.framework.startup.featuregating;

import com.amazon.dee.app.services.features.Features;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class StartupFeature {
    public static final StartupFeature ALEXA_NATIVE_ROUTING_METRICS;
    public static final StartupFeature ASSET_MANAGER_DEFERRAL;
    public static final StartupFeature FOUNDATION_ANDROID_APP_HEADER_AVATAR;
    public static final StartupFeature PRE_WARM_HOME_NETWORK_API_CALL_ENABLED;
    public static final StartupFeature SHARING_CLIENT_DEFERRAL;
    static final StartupFeature[] STARTUP_FEATURES_TO_OBSERVE;
    private String featureName;
    private String namespace;

    static {
        StartupFeature startupFeature = new StartupFeature("AlexaMobileFoundationAndroid", "FOUNDATION_ANDROID_ASSETMANGER_DEFERRAL");
        ASSET_MANAGER_DEFERRAL = startupFeature;
        StartupFeature startupFeature2 = new StartupFeature("AlexaMobileFoundationAndroid", "FOUNDATION_ANDROID_SHARING_CLIENT_DEFERRAL");
        SHARING_CLIENT_DEFERRAL = startupFeature2;
        ALEXA_NATIVE_ROUTING_METRICS = new StartupFeature("AlexaMobileFoundationAndroid", "ALEXA_NATIVE_ROUTING_METRICS_ANDROID");
        StartupFeature startupFeature3 = new StartupFeature("ALEXA_MOBILE_HOME_FRONTEND", Features.PRE_WARM_HOME_NETWORK_API_CALL);
        PRE_WARM_HOME_NETWORK_API_CALL_ENABLED = startupFeature3;
        StartupFeature startupFeature4 = new StartupFeature("AlexaMobileFoundationAndroid", "FOUNDATION_ANDROID_APP_HEADER_AVATAR");
        FOUNDATION_ANDROID_APP_HEADER_AVATAR = startupFeature4;
        STARTUP_FEATURES_TO_OBSERVE = new StartupFeature[]{startupFeature, startupFeature2, startupFeature3, startupFeature4};
    }

    public StartupFeature(String str, String str2) {
        this.namespace = str;
        this.featureName = str2;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String toString() {
        if (this.namespace == null) {
            return this.featureName;
        }
        return this.namespace + "#" + this.featureName;
    }
}
