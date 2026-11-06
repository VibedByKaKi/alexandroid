package com.amazon.alexa.accessory.frames.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class FeatureChecker {
    public static final String ALEXA_ECHO_BUDS_GEN_THREE_SMART_PLAY_ANDROID_WEBLAB = "ALEXA_ECHO_BUDS_GEN_THREE_SMART_PLAY_ANDROID";
    public static final String ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE = "ALEXA_MOBILE_ACCESSORIES";
    public static final String ALEXA_MOBILE_ANDROID_FACE_DETECTION_LCE_RETOUCHER_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_FACE_DETECTION_LCE_RETOUCHER";
    public static final String ALEXA_MOBILE_ANDROID_LIVE_TRANSLATION_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_LIVE_TRANSLATION";
    public static final String ALEXA_MOBILE_ANDROID_LIVE_TRANSLATION_USE_V2_SERVICE_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_LIVE_TRANSLATION_USE_V2_SERVICE";
    public static final String ALEXA_MOBILE_ANDROID_MEDIA_AUTO_CROP_REVERT_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_MEDIA_AUTO_CROP_REVERT";
    public static final String ALEXA_MOBILE_ANDROID_MEDIA_IMPORT_NAN_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_MEDIA_IMPORT_NAN";
    public static final String ALEXA_MOBILE_ANDROID_MEDIA_LCE_ENHANCEMENT_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_MEDIA_LCE_ENHANCEMENT";
    public static final String ALEXA_MOBILE_ANDROID_MEDIA_LCE_FAST_GUIDED_FILTER_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_MEDIA_LCE_FAST_GUIDED_FILTER";
    public static final String ALEXA_MOBILE_ANDROID_MEDIA_NOISE_REDUCTION_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_MEDIA_NOISE_REDUCTION";
    public static final String ALEXA_MOBILE_FRAME_AUTO_SAVE_ANDROID_FEATURE_NAME = "ALEXA_MOBILE_FRAME_AUTO_SAVE_ANDROID";
    public static final String ALEXA_MOBILE_FRAME_MEDIA_AUTO_IMPORT_ANDROID_FEATURE_NAME = "ALEXA_MOBILE_ANDROID_MEDIA_AUTO_IMPORT";
    public static final String ALEXA_OTG_ECHO_BUDS_GEN_THREE_TAP_ROUTINES_ANDROID_WEBLAB = "ALEXA_OTG_ECHO_BUDS_GEN_THREE_TAP_ROUTINES_ANDROID";
    public static final String ALEXA_OTG_ECHO_BUDS_GEN_THREE_TAP_ROUTINES_FOS_WEBLAB = "ALEXA_OTG_ECHO_BUDS_GEN_THREE_TAP_ROUTINES_FOS";
    public static final String ALEXA_SMART_PLAY_FETCH_MSP_RETRY_ANDROID_WEBLAB = "ALEXA_SMART_PLAY_V2_FETCH_MSP_RETRY_ANDROID";
    public static final String ALEXA_ZEN_AMNS_DEPRECATION_ANDROID_FEATURE_NAME = "ALEXA_ZEN_AMNS_DEPRECATION_ANDROID";
    public static final String ALEXA_ZEN_SMART_PLAY_ANDROID_V2_WEBLAB = "ALEXA_ZEN_SMART_PLAY_V2_ANDROID";
    public static final String ALEXA_ZEN_SMART_PLAY_V2_PLAY_API_ANDROID_WEBLAB = "ALEXA_ZEN_SMART_PLAY_V2_PLAY_API_ANDROID";
    public static final String ALEXA_ZEN_SMART_PLAY_V2_PODCAST_FILTER_ANDROID_WEBLAB = "ALEXA_ZEN_SMART_PLAY_V2_PODCAST_FILTER_ANDROID";
    public static final String ALEXA_ZEPHYR_MOBILE_FEATURE_NAMESPACE = "ZEPHYR_MOBILE";
    public static final String PERSONALIZED_GREETING_ANDROID_FEATURE_NAME = "PERSONALIZED_GREETING_ANDROID";
    private static final String TAG = "FeatureChecker";
    public static final String THIRD_PARTY_AUTH_WEBLAB = "THIRD_PARTY_AUTH";
    public static final String TOP_CONTACT_ASSET_DOWNLOAD_ANDROID_WEBLAB = "TOP_CONTACT_ASSET_DOWNLOAD_ANDROID";

    private FeatureChecker() {
    }

    @VisibleForTesting
    public static boolean checkFeatureAccess(@Nullable FeatureServiceV2 featureServiceV2, @NonNull String str) {
        return featureServiceV2 != null && featureServiceV2.hasAccess(str, false);
    }

    @VisibleForTesting
    public static boolean checkFeatureAccessWithNamespace(@NonNull String str, @NonNull String str2) {
        FeatureServiceV2 featureServiceV2 = DependencyProvider.getFeatureServiceV2();
        return featureServiceV2 != null && featureServiceV2.hasAccess(str, str2, false);
    }

    public static boolean hasAMNSDeprecationAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_ZEN_AMNS_DEPRECATION_ANDROID_FEATURE_NAME);
    }

    public static boolean hasFramesAutoSaveAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_FRAME_AUTO_SAVE_ANDROID_FEATURE_NAME);
    }

    public static boolean hasFramesMediaAutoImportAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_FRAME_MEDIA_AUTO_IMPORT_ANDROID_FEATURE_NAME);
    }

    public static boolean hasLiveTranslationAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_LIVE_TRANSLATION_FEATURE_NAME);
    }

    public static boolean hasLiveTranslationV2ServiceAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_LIVE_TRANSLATION_USE_V2_SERVICE_FEATURE_NAME);
    }

    public static boolean hasMediaFaceDetectionLceRetoucherAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_FACE_DETECTION_LCE_RETOUCHER_FEATURE_NAME);
    }

    public static boolean hasMediaImportNanAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_MEDIA_IMPORT_NAN_FEATURE_NAME);
    }

    public static boolean hasMediaImportRevertAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_MEDIA_AUTO_CROP_REVERT_FEATURE_NAME);
    }

    public static boolean hasMediaLceEnhancementAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_MEDIA_LCE_ENHANCEMENT_FEATURE_NAME);
    }

    public static boolean hasMediaLceFastGuidedFilterAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_MEDIA_LCE_FAST_GUIDED_FILTER_FEATURE_NAME);
    }

    public static boolean hasMediaNoiseReductionAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", ALEXA_MOBILE_ANDROID_MEDIA_NOISE_REDUCTION_FEATURE_NAME);
    }

    public static boolean hasPersonalizedGreetingAccess() {
        return checkFeatureAccessWithNamespace("ZEPHYR_MOBILE", PERSONALIZED_GREETING_ANDROID_FEATURE_NAME);
    }

    public static boolean hasRosterWeblabAccess(@Nullable String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE, str);
    }

    public static boolean hasSmartPlayAccess(@Nullable String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("A21YKVRGQV9TET")) {
            return checkFeatureAccess("ALEXA_ECHO_BUDS_GEN_THREE_SMART_PLAY_ANDROID");
        }
        if (str.equals("A2OUFCM11BT9RB")) {
            return true;
        }
        Log.d(TAG, "Unsupported device type");
        return false;
    }

    public static boolean hasSmartPlayFetchMSPRetryAccess() {
        return checkFeatureAccess("ALEXA_SMART_PLAY_V2_FETCH_MSP_RETRY_ANDROID");
    }

    public static boolean hasSmartPlayV2Access(@Nullable String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("A2OUFCM11BT9RB")) {
            return checkFeatureAccess("ALEXA_ZEN_SMART_PLAY_V2_ANDROID");
        }
        Log.d(TAG, "Unsupported device type");
        return false;
    }

    public static boolean hasSmartPlayV2FilterPodcastAccess() {
        return checkFeatureAccess("ALEXA_ZEN_SMART_PLAY_V2_PODCAST_FILTER_ANDROID");
    }

    public static boolean hasSmartPlayV2PlayAPIAccess(@Nullable String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("A2OUFCM11BT9RB")) {
            return hasSmartPlayV2Access(str) && checkFeatureAccess("ALEXA_ZEN_SMART_PLAY_V2_PLAY_API_ANDROID");
        }
        Log.d(TAG, "Unsupported device type");
        return false;
    }

    public static boolean hasTapRoutinesAccess(@Nullable String str) {
        if (str == null) {
            return false;
        }
        boolean isFireOS = DependencyProvider.getDeviceInformation().isFireOS();
        if (str.equals("A21YKVRGQV9TET")) {
            return isFireOS ? checkFeatureAccess(ALEXA_OTG_ECHO_BUDS_GEN_THREE_TAP_ROUTINES_FOS_WEBLAB) : checkFeatureAccess("ALEXA_OTG_ECHO_BUDS_GEN_THREE_TAP_ROUTINES_ANDROID");
        }
        return false;
    }

    public static boolean hasThirdPartyAuthAccess() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ACCESSORIES_FEATURE_NAMESPACE, THIRD_PARTY_AUTH_WEBLAB);
    }

    public static boolean hasTopContactAssetDownloadAccess() {
        return checkFeatureAccess("TOP_CONTACT_ASSET_DOWNLOAD_ANDROID");
    }

    @VisibleForTesting
    public static boolean checkFeatureAccess(@NonNull String str) {
        return checkFeatureAccess(DependencyProvider.getFeatureServiceV2(), str);
    }
}
