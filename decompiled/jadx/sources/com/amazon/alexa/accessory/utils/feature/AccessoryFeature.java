package com.amazon.alexa.accessory.utils.feature;

import androidx.annotation.Nullable;
import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AccessoryFeature {
    ALEXA_ACCESSORY_ANDROID_AUDIO_TUNING(NativeFeatureRegistry.ALEXA_ACCESSORY_ANDROID_AUDIO_TUNING),
    ALEXA_ACCESSORY_ANDROID_ACCESSORY_STATE_REPORT(NativeFeatureRegistry.ALEXA_ACCESSORY_ANDROID_ACCESSORY_STATE_REPORT),
    ALEXA_ACCESSORY_CLOUD_PAIRING(NativeFeatureRegistry.ALEXA_ACCESSORY_CLOUD_PAIRING),
    ALEXA_ACCESSORIES_ANDROID_PHONE_MOMENTS(NativeFeatureRegistry.ALEXA_ACCESSORIES_ANDROID_PHONE_MOMENTS),
    ALEXA_ACCESSORIES_FOS_AUTO_PAIRING(NativeFeatureRegistry.ALEXA_ACCESSORIES_FOS_AUTO_PAIRING),
    AMBIENT_CONTEXT("ANDROID_AMBIENT_CONTEXT", com.amazon.alexa.accessory.frames.provider.FeatureChecker.ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE),
    LOCAL_COMMANDS("LOCAL_COMMANDS_ANDROID", com.amazon.alexa.accessory.frames.provider.FeatureChecker.ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE),
    CAMERA_CONTROL("ALEXA_OTG_CAMERA_ANDROID", com.amazon.alexa.accessory.frames.provider.FeatureChecker.ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE),
    OTA_VIA_ASSET_TRANSFER("ALEXA_MOBILE_OTA_VIA_ASSET_TRANSFER_ANDROID", "ZEPHYR_MOBILE"),
    VISION_CAPTURE("VISION_CAPTURE_ANDROID", com.amazon.alexa.accessory.frames.provider.FeatureChecker.ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE),
    FACTORY_RESET("ALEXA_MOBILE_ANDROID_FACTORY_RESET", "ZEPHYR_MOBILE"),
    TIMEZONE_OFFSET("ALEXA_MOBILE_ANDROID_TIMEZONE_OFFSET", "ZEPHYR_MOBILE"),
    AUTO_CAPTURE("ALEXA_OTG_AUTO_CAPTURE_ANDROID", com.amazon.alexa.accessory.frames.provider.FeatureChecker.ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE),
    NATURAL_TURN_DETECTION("ALEXA_OTG_NTD_ANDROID", com.amazon.alexa.accessory.frames.provider.FeatureChecker.ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE),
    SEND_LOGS_VIA_ASSET_TRANSFER("ALEXA_MOBILE_ANDROID_SEND_LOGS_VIA_ASSET_TRANSFER", "ZEPHYR_MOBILE"),
    THIRD_PARTY_AUTH(com.amazon.alexa.accessory.frames.provider.FeatureChecker.THIRD_PARTY_AUTH_WEBLAB, com.amazon.alexa.accessory.frames.provider.FeatureChecker.ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE);

    private final String featureName;
    private final String featureNamespace;

    AccessoryFeature(String str, @Nullable String str2) {
        this.featureName = str;
        this.featureNamespace = str2;
    }

    @Nullable
    public String getFeatureNamespace() {
        return this.featureNamespace;
    }

    public String getName() {
        return this.featureName;
    }

    AccessoryFeature(String str) {
        this(str, null);
    }
}
