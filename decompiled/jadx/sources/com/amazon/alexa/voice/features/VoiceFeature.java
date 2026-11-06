package com.amazon.alexa.voice.features;

import androidx.annotation.Nullable;
import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;
import com.amazon.alexa.ra.features.featurecheck.FeatureSource;
import com.amazon.alexa.redesign.utils.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum VoiceFeature {
    FAKE_FEATURE_FOR_TEST("FAKE_FEATURE_FOR_TEST"),
    FAKE_FEATURE_FOR_TEST_WITH_NAMESPACE("FAKE_FEATURE_FOR_TEST_WITH_NAMESPACE", "NAMESPACE"),
    TTA_I18N_LAUNCH(NativeFeatureRegistry.ALEXA_VOX_ANDROID_TTA_I18N_LAUNCH),
    ALEXA_MOBILE_FAB_GEOLOCATION_DISCLOSURE(NativeFeatureRegistry.ALEXA_MOBILE_GEOLOCATION_DISCLOSURE),
    ENABLE_SYNC_IN_APP_WW_AND_AHF(NativeFeatureRegistry.ALEXA_HANDS_FREE_FEATURE_ENABLE_SYNCED_AHF_AND_IN_APP_WW),
    APL(NativeFeatureRegistry.ALEXA_A4A_ANDROID_APL_GA),
    FAB_BOTTOM_SHEET_I18N("ALEXA_A4A_ANDROID_BOTTOMSHEET_I18N", Constants.MOSAIC_NAMESPACE),
    REMARKABLE_ALEXA_UI("ALEXA_VOX_ANDROID_RA_LAUNCH", FeatureSource.AVS_ANDROID_NAMESPACE),
    PERSONALIZED_CONTENT_UI("ALEXA_VOX_ANDROID_PERSONALIZED_CONTENT", FeatureSource.AVS_ANDROID_NAMESPACE),
    LOCAL_NOTIFICATIONS("ALEXA_ANDROID_CONVERSATION_CONTINUITY", "ALEXA_MOBILE_NOTIFICATION_NATIVE"),
    REMARKABLE_ALEXA_UI_I18N("ALEXA_VOX_ANDROID_RA_LAUNCH_I18N", FeatureSource.AVS_ANDROID_NAMESPACE),
    RA_FEEDBACK_SOUNDS("ALEXA_VOX_ANDROID_RA_FEEDBACK_SOUNDS", FeatureSource.AVS_ANDROID_NAMESPACE),
    RA_CONVERSATION_TOPICS("ALEXA_A4A_ANDROID_RA_CONVERSATIONS_TOPICS", FeatureSource.AVS_ANDROID_NAMESPACE),
    RA_HIDE_KEYBOARD_ON_SUBMIT("KEYBOARD_AUTO_DISMISS_ON_REQUEST", "AlexaVoiceAndroidConversationUIMiscellaneous"),
    RA_SHOW_REDESIGNED_GREETING("ALEXA_CH_HOME_AGENT_FORWARD_PROTOTYPE_ANDROID", "ALEXA_MOBILE_HOME_FRONTEND"),
    RA_ALEXA_PLUS_PREVIEW_TEXT("ALEXA_EXTERNAL_BETA_PREVIEW_ANDROID", "AlexaVoiceAndroidConversationUIMiscellaneous"),
    RA_GENERAL_ALEXA_FOR_KIDS("KIDS_ALEXA_PLUS_ON_FIRE_TABLET", "KIDS_TABLET"),
    CONVERSATION_CX_PLUGGABLE("ALEXA_ANDROID_CONVERSATION_CX_PLUGGABLE", "AlexaVoiceAndroidConversationUIMiscellaneous"),
    BRANCH_HVA_ANDROID("BRANCH_HVA_ANDROID", "ALEXA_MOBILE_GROWTH"),
    WW_DISABLE_NEW_SIGNUPS("ALEXA_VOX_ANDROID_WW_DISABLE_NEW_SIGNUPS", FeatureSource.AVS_ANDROID_NAMESPACE),
    WW_EXPERIMENT_S2_1("ALEXA_MOBILE_ANDROID_WW_EXPERIMENT_S2_1", FeatureSource.AVS_ANDROID_NAMESPACE),
    WW_EXPERIMENT_S2_2("ALEXA_MOBILE_ANDROID_WW_EXPERIMENT_S2_2", FeatureSource.AVS_ANDROID_NAMESPACE),
    AGENT_HUB("AGENT_HUB", "ALEXA_PERSONALITY_VISUALS_MOBILE"),
    DICTATION_MODE(FeatureSource.DICTATION_MODE, FeatureSource.AVS_ANDROID_NAMESPACE);

    private final String featureName;
    private final String featureNamespace;

    VoiceFeature(String str, @Nullable String str2) {
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

    VoiceFeature(String str) {
        this(str, null);
    }
}
