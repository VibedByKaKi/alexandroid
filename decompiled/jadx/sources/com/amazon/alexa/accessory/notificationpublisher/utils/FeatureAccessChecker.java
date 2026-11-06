package com.amazon.alexa.accessory.notificationpublisher.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.providers.AccessoryProvider;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class FeatureAccessChecker {
    public static final String ALEXA_MOBILE_ANDROID_CPN_BATCH_SUMMARIZATION = "ALEXA_MOBILE_ANDROID_CPN_BATCH_SUMMARIZATION";
    public static final String ALEXA_MOBILE_ANDROID_CPN_COMMS_APP = "ALEXA_MOBILE_ANDROID_CPN_COMMS_APP";
    public static final String ALEXA_MOBILE_ANDROID_CPN_REPLY = "ALEXA_MOBILE_ANDROID_CPN_REPLY";
    public static final String ALEXA_MOBILE_ANDROID_CPN_REPLY_POP = "ALEXA_MOBILE_ANDROID_CPN_REPLY_POP";
    public static final String ALEXA_MOBILE_ANDROID_GENCAST_INTEGRATION = "ALEXA_MOBILE_ANDROID_GENCAST_INTEGRATION";
    public static final String ALEXA_MOBILE_ANDROID_RING_INTEGRATION = "ALEXA_MOBILE_ANDROID_RING_INTEGRATION";
    public static final String ALEXA_MOBILE_ANDROID_VIPF_DUPLICATE_NOTIFICATION_PREVENTION = "ALEXA_MOBILE_ANDROID_VIPF_DUPLICATE_NOTIFICATION_PREVENTION";
    public static final String ALEXA_MOBILE_ANDROID_VIP_FILTER_MOBILYTICS = "ALEXA_MOBILE_ANDROID_VIP_FILTER_MOBILYTICS";
    private static final String ALEXA_MOBILE_ANDROID_VIP_FILTER_NAMESPACE = "ALEXA_MOBILE_ANDROID_VIP_FILTER";
    public static final String ALEXA_OTG_ANDROID_DISABLE_AMNS_CALLS_WEBLAB = "ALEXA_OTG_ANDROID_DISABLE_AMNS_CALLS";
    public static final String ALEXA_OTG_PHONE_MOMENTS_CONTACT_SELECTION_ANDROID_WEBLAB = "ALEXA_OTG_PHONE_MOMENTS_CONTACT_SELECTION_ANDROID";
    public static final String ALEXA_OTG_PHONE_MOMENTS_UAE_ANDROID_WEBLAB = "ALEXA_OTG_PHONE_MOMENTS_UAE_ANDROID";
    public static final String ALEXA_OTG_VIP_FILTER_ANDROID_WEBLAB = "ALEXA_OTG_VIP_FILTER_ANDROID";
    private static final String ALEXA_OTG_VIP_FILTER_MULTIDEVICE_USS_SETTINGS_ANDROID_WEBLAB = "ALEXA_OTG_VIP_FILTER_MULTIDEVICE_USS_SETTINGS_ANDROID";
    public static final String ALEXA_VIP_FILTER_REPLY_DEPRECATION_ANDROID_WEBLAB = "ALEXA_VIP_FILTER_REPLY_DEPRECATION_ANDROID";
    public static final String ALEXA_ZEN_VIP_FILTER_REPLY_ANDROID_WEBLAB = "ALEXA_ZEN_VIP_FILTER_REPLY_ANDROID";
    private static final String ALEXA_ZEPHYR_MOBILE_NAMESPACE = "ZEPHYR_MOBILE";
    private static final String ALEXA_ZION_ANDROID_BLOCK_ACTIVE_PHONE_NOTIFICATION = "ALEXA_ZION_ANDROID_BLOCK_ACTIVE_PHONE_NOTIFICATION";
    private static final String ALEXA_ZION_ANDROID_FETCH_TEMPLATES_DEBUG_WEBLAB = "ALEXA_ZION_ANDROID_FETCH_TEMPLATES_DEBUG";
    private static final String ALEXA_ZION_ANDROID_REPLY = "ALEXA_ZION_ANDROID_REPLY";
    public static final String ANDROID_SETUP_WEBLAB = "ELEMENTS_1P_SETUP_ZION_ANDROID";
    public static final String ELEMENTS_PHONE_NOTIFICATIONS_UI = "ELEMENTS_PHONE_NOTIFICATIONS_UI";
    private static final String GROUP_NOTIFICATION_USS_SETTINGS_WEBLAB = "ZION_GROUP_NOTIFICATIONS_USS_SETTINGS_ANDROID";
    private static final String REMOVE_WAKEUP_CALL_WEBLAB = "ALEXA_ZION_ANDROID_REMOVE_WAKEUP_CALL";
    private static final String TAG = "FeatureAccessChecker";
    private static final String VOICE_CAPABILITY = "ALEXA_OTG_NOTIFICATIONS_EXTERNAL_CAPABILITY_ANDROID";
    private static final String ZION_ANDROID_REMOVE_REPEATING_CONTACT_SAYS = "ZION_ANDROID_REMOVE_REPEATING_CONTACT_SAYS";

    private FeatureAccessChecker() {
    }

    @VisibleForTesting
    public static boolean checkFeatureAccess(@Nullable FeatureServiceV2 featureServiceV2, @NonNull String str) {
        return featureServiceV2 != null && featureServiceV2.hasAccess(str, false);
    }

    @VisibleForTesting
    public static boolean checkFeatureAccessWithNamespace(@NonNull String str) {
        return checkFeatureAccess(DependencyProvider.getFeatureServiceV2(), ALEXA_MOBILE_ANDROID_VIP_FILTER_NAMESPACE, str);
    }

    @VisibleForTesting
    public static String getLastConnectedDeviceType() {
        return AccessoryProvider.getAccessoryDeviceType();
    }

    public static boolean hasBlockActivePhoneNotificationFeatureAccess() {
        return checkFeatureAccess(ALEXA_ZION_ANDROID_BLOCK_ACTIVE_PHONE_NOTIFICATION);
    }

    public static boolean hasCpnBatchSummarizationAccess() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_CPN_BATCH_SUMMARIZATION, "ZEPHYR_MOBILE");
    }

    public static boolean hasCpnCommsAppAccess() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_CPN_COMMS_APP, "ZEPHYR_MOBILE");
    }

    public static boolean hasCpnReplyAccess() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_CPN_REPLY, "ZEPHYR_MOBILE");
    }

    public static boolean hasCpnReplyPopAccess() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_CPN_REPLY_POP, "ZEPHYR_MOBILE");
    }

    public static boolean hasFetchCloudTemplatesFromTestFolderAccess() {
        return checkFeatureAccess("ALEXA_ZION_ANDROID_FETCH_TEMPLATES_DEBUG");
    }

    public static boolean hasFocusFilterFeatureAccess() {
        return checkFeatureAccess("ELEMENTS_1P_SETUP_ZION_ANDROID");
    }

    public static boolean hasGenCastIntegrationAccess() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_GENCAST_INTEGRATION, "ZEPHYR_MOBILE");
    }

    public static boolean hasGroupNotificationUssSettingsFeatureAccess() {
        return checkFeatureAccess(GROUP_NOTIFICATION_USS_SETTINGS_WEBLAB);
    }

    public static boolean hasOtgVipFilterAccess() {
        return checkFeatureAccess("ALEXA_OTG_VIP_FILTER_ANDROID");
    }

    public static boolean hasOtgVipFilterUssSettingsAccess() {
        return checkFeatureAccess("ALEXA_OTG_VIP_FILTER_MULTIDEVICE_USS_SETTINGS_ANDROID");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r0.equals("AJMM5LZMBFMM0") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean hasPhoneMomentsContactSelectionAccess() {
        /*
            java.lang.String r0 = getLastConnectedDeviceType()
            java.lang.String r1 = com.amazon.alexa.accessory.notificationpublisher.utils.FeatureAccessChecker.TAG
            java.lang.String r2 = "deviceType is: "
            com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(r2, r0, r1)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r2 = r0.hashCode()
            r3 = 1
            r4 = -1
            switch(r2) {
                case -1264806791: goto L46;
                case -769687556: goto L3b;
                case 203551326: goto L30;
                case 249118782: goto L25;
                case 708406650: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r4
            goto L4f
        L1a:
            java.lang.String r1 = "AN5E98JS518PS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L18
        L23:
            r1 = 4
            goto L4f
        L25:
            java.lang.String r1 = "A2OUFCM11BT9RB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L18
        L2e:
            r1 = 3
            goto L4f
        L30:
            java.lang.String r1 = "A3IYPH06PH1HRA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L18
        L39:
            r1 = 2
            goto L4f
        L3b:
            java.lang.String r1 = "A3JKY41C0S05FZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L18
        L44:
            r1 = r3
            goto L4f
        L46:
            java.lang.String r2 = "AJMM5LZMBFMM0"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4f
            goto L18
        L4f:
            switch(r1) {
                case 0: goto L59;
                case 1: goto L59;
                case 2: goto L59;
                case 3: goto L59;
                case 4: goto L59;
                default: goto L52;
            }
        L52:
            java.lang.String r0 = "ALEXA_OTG_PHONE_MOMENTS_CONTACT_SELECTION_ANDROID"
            boolean r0 = checkFeatureAccess(r0)
            return r0
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.notificationpublisher.utils.FeatureAccessChecker.hasPhoneMomentsContactSelectionAccess():boolean");
    }

    public static boolean hasPhoneNotificationsUiAccess(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("AJMM5LZMBFMM0") || str.equals("A3JKY41C0S05FZ")) {
            return checkFeatureAccessWithNamespace(ELEMENTS_PHONE_NOTIFICATIONS_UI, "ZEPHYR_MOBILE");
        }
        return false;
    }

    public static boolean hasRemoveRepeatingContactSaysAccess() {
        return checkFeatureAccess("ZION_ANDROID_REMOVE_REPEATING_CONTACT_SAYS");
    }

    public static boolean hasRemoveWakeupCallFeatureAccess() {
        return checkFeatureAccess(REMOVE_WAKEUP_CALL_WEBLAB);
    }

    public static boolean hasRingIntegrationAccess() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_RING_INTEGRATION, "ZEPHYR_MOBILE");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r0.equals("AJMM5LZMBFMM0") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean hasUserAttentionEngineAccess() {
        /*
            java.lang.String r0 = getLastConnectedDeviceType()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r0.hashCode()
            r3 = 1
            r4 = -1
            switch(r2) {
                case -1264806791: goto L3f;
                case -769687556: goto L34;
                case 203551326: goto L29;
                case 249118782: goto L1e;
                case 708406650: goto L13;
                default: goto L11;
            }
        L11:
            r1 = r4
            goto L48
        L13:
            java.lang.String r1 = "AN5E98JS518PS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L11
        L1c:
            r1 = 4
            goto L48
        L1e:
            java.lang.String r1 = "A2OUFCM11BT9RB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L11
        L27:
            r1 = 3
            goto L48
        L29:
            java.lang.String r1 = "A3IYPH06PH1HRA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L11
        L32:
            r1 = 2
            goto L48
        L34:
            java.lang.String r1 = "A3JKY41C0S05FZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L11
        L3d:
            r1 = r3
            goto L48
        L3f:
            java.lang.String r2 = "AJMM5LZMBFMM0"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L48
            goto L11
        L48:
            switch(r1) {
                case 0: goto L52;
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L52;
                default: goto L4b;
            }
        L4b:
            java.lang.String r0 = "ALEXA_OTG_PHONE_MOMENTS_UAE_ANDROID"
            boolean r0 = checkFeatureAccess(r0)
            return r0
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.notificationpublisher.utils.FeatureAccessChecker.hasUserAttentionEngineAccess():boolean");
    }

    @Deprecated
    public static boolean hasVipFilter2024_5Access() {
        return true;
    }

    public static boolean hasVipFilterReplyFeatureAccess() {
        String lastConnectedDeviceType = getLastConnectedDeviceType();
        if (lastConnectedDeviceType == null) {
            return false;
        }
        if (lastConnectedDeviceType.equals("A3IYPH06PH1HRA")) {
            return checkFeatureAccess(ALEXA_ZION_ANDROID_REPLY);
        }
        if (lastConnectedDeviceType.equals("A2OUFCM11BT9RB")) {
            return checkFeatureAccess("ALEXA_ZEN_VIP_FILTER_REPLY_ANDROID");
        }
        return false;
    }

    public static boolean hasVipFilterReplyFeatureDeprecatedAccess() {
        return checkFeatureAccess("ALEXA_VIP_FILTER_REPLY_DEPRECATION_ANDROID");
    }

    public static boolean hasVoiceFeatureAccess() {
        return checkFeatureAccess(VOICE_CAPABILITY);
    }

    @Deprecated
    public static boolean isClientSideFilteringEnabled() {
        return true;
    }

    public static boolean isDuplicateNotificationPreventionEnabled() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_VIPF_DUPLICATE_NOTIFICATION_PREVENTION);
    }

    public static boolean isMobilyticsSupported() {
        return checkFeatureAccessWithNamespace(ALEXA_MOBILE_ANDROID_VIP_FILTER_MOBILYTICS);
    }

    public static boolean shouldDisableAMNSCalls() {
        return checkFeatureAccess(ALEXA_OTG_ANDROID_DISABLE_AMNS_CALLS_WEBLAB);
    }

    @Deprecated
    public static boolean shouldMigrateAMNS() {
        return true;
    }

    public static boolean shouldUseSlushyCpnArtifact() {
        return hasCpnCommsAppAccess() || hasRingIntegrationAccess() || hasGenCastIntegrationAccess();
    }

    @VisibleForTesting
    public static boolean checkFeatureAccessWithNamespace(@NonNull String str, @NonNull String str2) {
        return checkFeatureAccess(DependencyProvider.getFeatureServiceV2(), str2, str);
    }

    @VisibleForTesting
    public static boolean checkFeatureAccess(@NonNull String str) {
        return checkFeatureAccess(DependencyProvider.getFeatureServiceV2(), str);
    }

    @VisibleForTesting
    public static boolean checkFeatureAccess(@Nullable FeatureServiceV2 featureServiceV2, @NonNull String str, @NonNull String str2) {
        return featureServiceV2 != null && featureServiceV2.hasAccess(str, str2, false);
    }

    public static boolean hasPhoneNotificationsUiAccess() {
        return hasPhoneNotificationsUiAccess(getLastConnectedDeviceType());
    }
}
