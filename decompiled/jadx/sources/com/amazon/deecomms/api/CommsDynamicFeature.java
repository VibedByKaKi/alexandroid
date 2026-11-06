package com.amazon.deecomms.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CommsDynamicFeature {
    COMMS_ALL_FEATURES(NativeFeatureRegistry.COMMS_ALL_FEATURES),
    COMMS_ALL_FEATURES_NEW(NativeFeatureRegistry.COMMS_ALL_FEATURES_NEW),
    COMMS_AVAILABILITY("COMMS_AVAILABILITY"),
    DIAGNOSTICS("ALEXA_BETA", "ALEXA_FRIENDS_AND_FAMILY"),
    ROGUE(NativeFeatureRegistry.TACHYON_FEATURE_ROGUE),
    HUDSON(NativeFeatureRegistry.TACHYON_FEATURE_HUDSON),
    CABLE("TACHYON_FEATURE_CABLE"),
    COMMS_ON_FIRE_OS(NativeFeatureRegistry.TACHYON_FEATURE_THING),
    TELEMETRY(NativeFeatureRegistry.TACHYON_FEATURE_LOKI),
    HORNET(NativeFeatureRegistry.TACHYON_FEATURE_HORNET),
    SIF(NativeFeatureRegistry.TACHYON_FEATURE_SIF),
    WILDCAT(NativeFeatureRegistry.TACHYON_FEATURE_WILDCAT),
    BEARCAT(NativeFeatureRegistry.TACHYON_FEATURE_BEARCAT),
    PERSHING(NativeFeatureRegistry.TACHYON_FEATURE_PERSHING),
    THOR(NativeFeatureRegistry.TACHYON_FEATURE_THOR),
    PIKACHU(NativeFeatureRegistry.TACHYON_FEATURE_PHOEBE),
    FIESTA(NativeFeatureRegistry.TACHYON_FEATURE_LEXINGTON),
    CHANNELS("ALEXA_MOBILE_APP_GENERIC_FEATURE_3"),
    SHERMAN(NativeFeatureRegistry.TACHYON_FEATURE_SHERMAN),
    STANLY(NativeFeatureRegistry.TACHYON_FEATURE_STANLY),
    CROMWELL(NativeFeatureRegistry.TACHYON_FEATURE_CROMWELL),
    BUFFALO(NativeFeatureRegistry.TACHYON_FEATURE_BUFFALO),
    BULBASAUR(NativeFeatureRegistry.TACHYON_FEATURE_BULBASAUR),
    IVYSAUR(NativeFeatureRegistry.TACHYON_FEATURE_IVYSAUR),
    HURRICANE(NativeFeatureRegistry.TACHYON_FEATURE_HURRICANE),
    TYPHOON(NativeFeatureRegistry.TACHYON_FEATURE_TYPHOON),
    PIDGEOTTO(NativeFeatureRegistry.TACHYON_FEATURE_PIDGEOTTO),
    WARTORTLE(NativeFeatureRegistry.TACHYON_FEATURE_WARTORTLE),
    EKANS(NativeFeatureRegistry.TACHYON_FEATURE_EKANS),
    CATALINA(NativeFeatureRegistry.TACHYON_FEATURE_CATALINA),
    TACHYON_FEATURE_ARBOK(NativeFeatureRegistry.TACHYON_FEATURE_ARBOK),
    DIGLETT(NativeFeatureRegistry.TACHYON_FEATURE_DIGLETT),
    RATICATE(NativeFeatureRegistry.TACHYON_FEATURE_RATICATE),
    VENUSAUR(NativeFeatureRegistry.TACHYON_FEATURE_VENUSAUR),
    RIDLEY(NativeFeatureRegistry.TACHYON_FEATURE_RIDLEY),
    YOSHI(NativeFeatureRegistry.TACHYON_FEATURE_YOSHI),
    WARIO(NativeFeatureRegistry.TACHYON_FEATURE_WARIO),
    PCA_PROFILES(NativeFeatureRegistry.ALEXA_PCA_PROFILE_ANDROID),
    LINDAIYU(NativeFeatureRegistry.TACHYON_FEATURE_LINDAIYU),
    MIAOYU(NativeFeatureRegistry.TACHYON_FEATURE_MIAOYU),
    ENHANCED_NOTIFICATION(NativeFeatureRegistry.TACHYON_FEATURE_COMO_26273),
    CALL_RECONNECT_V3_LIWAN(NativeFeatureRegistry.TACHYON_FEATURE_LIWAN),
    STORYTIME(NativeFeatureRegistry.ALEXA_COMMS_STORYTIME),
    SEPIA(NativeFeatureRegistry.TACHYON_FEATURE_SEPIA_ANDROID),
    REACTIONS(NativeFeatureRegistry.TACHYON_FEATURE_REACTIONS_ANDROID),
    SEPIA_MESSAGING(NativeFeatureRegistry.TACHYON_SEPIA_MESSAGES_ANDROID),
    MPU_DYNAMIC_PIP(NativeFeatureRegistry.TACHYON_FEATURE_SELFVIEW_PIP),
    ASSIST_SIP(NativeFeatureRegistry.ASSIST_SIP_CALLING_ANDROID),
    MOSAIC_THEMING("MOSAIC_THEMING_VERSION_2_ANDROID"),
    SHARE_SHEET("SHARING_COMO_22247_ANDROID_SHEET"),
    ANNOUNCEMENT_24024("ANNOUNCEMENT_ACCESSORY_COMO_24024"),
    FIRE_TABLETS_MIGRATION_TO_PROFILE_OOBE("FIRE_TABLETS_MIGRATION_TO_PROFILE_OOBE", null, "FIRE_TABLETS_MIGRATION_TO_PROFILE_OOBE"),
    DRIVE_MODE_ANDROID_COMMS_NATIVE(NativeFeatureRegistry.ALEXA_AUTO_ANDROID_AUTOMODE_2_0_LAUNCH),
    COMMS_CORE_FEATURE_SERVICE(NativeFeatureRegistry.COMO29093_COMMS_CORE_FEATURE_SERVICE),
    COMMS_CORE_METRICS_SERVICE(NativeFeatureRegistry.COMO29093_COMMS_CORE_METRICS_SERVICE),
    COMMS_CORE_REMOTE_CONFIG_SERVICE(NativeFeatureRegistry.COMO29093_COMMS_CORE_REMOTE_CONFIG_SERVICE),
    TACHYON_CALLING_FEATURE_AUTH_TOKEN_ERROR_DIALOG(NativeFeatureRegistry.TACHYON_CALLING_FEATURE_AUTH_TOKEN_DIALOG),
    AVALANCHE(NativeFeatureRegistry.TACHYON_CALLING_FEATURE_AVALANCHE),
    DESPACITO(NativeFeatureRegistry.TACHYON_CALLING_FEATURE_DESPACITO),
    CALLING_ENABLE_AUTH_TOKEN_HANDLER_ANDROID("CALLING_ENABLE_AUTH_TOKEN_HANDLER_ANDROID", null, "ALEXA_MOBILE_CALLING"),
    CALLING_MPU_VIDEO_EVENT("CALLING_ENABLE_MPU_VIDEO_EVENT", null, "ALEXA_MOBILE_CALLING"),
    TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID("TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID", null, "ALEXA_MOBILE_CALLING"),
    TACHYON_FEATURE_METRICS_SERVICE_DEPRECATION("TACHYON_FEATURE_METRICS_SERVICE_DEPRECATION", null, "ALEXA_MOBILE_COMMS_GENERAL");


    @Nullable
    private final String alternateFeatureFlagName;

    @NonNull
    private final String featureFlagName;

    @Nullable
    private final String nameSpace;

    CommsDynamicFeature(String str, String str2) {
        this.featureFlagName = str;
        this.alternateFeatureFlagName = str2;
        this.nameSpace = "";
    }

    @Nullable
    public static CommsDynamicFeature getFeatureFromName(@Nullable String str) {
        String str2;
        for (CommsDynamicFeature commsDynamicFeature : values()) {
            if (commsDynamicFeature.featureFlagName.equalsIgnoreCase(str) || ((str2 = commsDynamicFeature.alternateFeatureFlagName) != null && str2.equalsIgnoreCase(str))) {
                return commsDynamicFeature;
            }
        }
        return null;
    }

    @NonNull
    public String getNameSpace() {
        return this.nameSpace;
    }

    @NonNull
    public String getPrimaryFeatureName() {
        return this.featureFlagName;
    }

    public boolean hasNameSpace() {
        return !this.nameSpace.isEmpty();
    }

    CommsDynamicFeature(String str) {
        this(str, null);
    }

    CommsDynamicFeature(String str, String str2, String str3) {
        this.featureFlagName = str;
        this.alternateFeatureFlagName = str2;
        this.nameSpace = str3;
    }
}
