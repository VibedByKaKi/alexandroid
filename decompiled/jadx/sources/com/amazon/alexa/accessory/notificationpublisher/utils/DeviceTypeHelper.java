package com.amazon.alexa.accessory.notificationpublisher.utils;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DeviceTypeHelper {
    public static final String ARMSTRONG_DEVICE_TYPE = "A3HVREY4JWAZ6K";
    public static final String KARNISS_DEVICE_TYPE = "A21YKVRGQV9TET";
    public static final String POP_DEVICE_TYPE = "AN5E98JS518PS";
    public static final String SLUSHY_CASE_DEVICE_TYPE = "AJMM5LZMBFMM0";
    public static final String SLUSHY_DEVICE_TYPE = "A3JKY41C0S05FZ";
    private static final String TAG = "DeviceTypeHelper";
    public static final String ZEN_DEVICE_TYPE = "A2OUFCM11BT9RB";
    public static final String ZION_DEVICE_TYPE = "A3IYPH06PH1HRA";
    private static final Set<String> SET_OF_VIP_FILTER_SUPPORTED_DEVICE_TYPES = new ImmutableSet.Builder().add((ImmutableSet.Builder) "A3JKY41C0S05FZ").add((ImmutableSet.Builder) "AJMM5LZMBFMM0").add((ImmutableSet.Builder) "A3HVREY4JWAZ6K").add((ImmutableSet.Builder) "A21YKVRGQV9TET").add((ImmutableSet.Builder) "A3IYPH06PH1HRA").add((ImmutableSet.Builder) "A2OUFCM11BT9RB").add((ImmutableSet.Builder) "AN5E98JS518PS").build();
    private static final Set<String> SET_OF_GESTURE_SUPPORTED_DEVICE_TYPES = new ImmutableSet.Builder().add((ImmutableSet.Builder) "A3HVREY4JWAZ6K").add((ImmutableSet.Builder) "A21YKVRGQV9TET").add((ImmutableSet.Builder) "A3IYPH06PH1HRA").add((ImmutableSet.Builder) "A2OUFCM11BT9RB").add((ImmutableSet.Builder) "A3JKY41C0S05FZ").add((ImmutableSet.Builder) "AJMM5LZMBFMM0").add((ImmutableSet.Builder) "AN5E98JS518PS").build();
    private static final Set<String> SET_OF_PHONE_NOTIFICATION_ENHANCEMENT_DEVICE_TYPES = new ImmutableSet.Builder().add((ImmutableSet.Builder) "A3JKY41C0S05FZ").add((ImmutableSet.Builder) "AJMM5LZMBFMM0").add((ImmutableSet.Builder) "AN5E98JS518PS").build();

    private DeviceTypeHelper() {
        throw new UnsupportedOperationException();
    }

    private static boolean checkDeviceType(@NonNull String str, @NonNull String str2) {
        String str3 = TAG;
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("deviceType is: ", str2, str3);
        if (SET_OF_VIP_FILTER_SUPPORTED_DEVICE_TYPES.contains(str2)) {
            return str.equalsIgnoreCase(str2);
        }
        Log.w(str3, "checkDeviceType - invalid device type");
        return false;
    }

    public static boolean doesDeviceSupportHandover(String str) {
        if (str == null) {
            return false;
        }
        return isPop(str);
    }

    public static boolean eligibleForPhoneNotificationEnhancements(String str) {
        if (str == null) {
            return false;
        }
        return SET_OF_PHONE_NOTIFICATION_ENHANCEMENT_DEVICE_TYPES.contains(str);
    }

    @VisibleForTesting
    public static boolean isArmstrong(@NonNull String str) {
        return checkDeviceType("A3HVREY4JWAZ6K", str);
    }

    public static boolean isGestureSupported(@NonNull String str) {
        return SET_OF_GESTURE_SUPPORTED_DEVICE_TYPES.contains(str);
    }

    @VisibleForTesting
    public static boolean isKarniss(@NonNull String str) {
        return checkDeviceType("A21YKVRGQV9TET", str);
    }

    @VisibleForTesting
    public static boolean isPop(@NonNull String str) {
        return checkDeviceType("AN5E98JS518PS", str);
    }

    @VisibleForTesting
    public static boolean isSlushy(@NonNull String str) {
        return checkDeviceType("A3JKY41C0S05FZ", str) || checkDeviceType("AJMM5LZMBFMM0", str);
    }

    public static boolean isSupportedFrameDevice(@NonNull String str) {
        return isZion(str) || isZen(str) || isSlushy(str);
    }

    @VisibleForTesting
    public static boolean isZen(@NonNull String str) {
        return checkDeviceType("A2OUFCM11BT9RB", str);
    }

    @VisibleForTesting
    public static boolean isZion(@NonNull String str) {
        return checkDeviceType("A3IYPH06PH1HRA", str);
    }
}
