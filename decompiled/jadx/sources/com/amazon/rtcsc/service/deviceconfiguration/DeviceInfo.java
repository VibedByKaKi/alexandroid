package com.amazon.rtcsc.service.deviceconfiguration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.rtcsc.utils.RtcscLogger;
import com.dee.app.metrics.MetricsConstants;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DeviceInfo {
    private static final int ANDROID14_SDK_VERSION = 34;
    private static final String DEVICE_TYPE_PROPERTY_NAME = "ro.product.config.type";
    public static final String FEATURE_FIRE_TV = "amazon.hardware.fire_tv";
    public static final String FEATURE_LOW_LATENCY_SUPPORT = "com.amazon.hardware.hdmi_low_latency.supported";
    private static final String MAP_DEVICE_TYPE_KEY = "MAPDeviceType";
    public static final String PRODUCT_MANUFACTURER_AMAZON = "Amazon";
    private static String deviceType;
    private static RtcscLogger mLog = RtcscLogger.getLogger(DeviceInfo.class);
    public static final String MANUFACTURER = Build.MANUFACTURER;

    public static String getDeviceType(Context context, @NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("defaultDeviceType is marked non-null but is null");
            return null;
        }
        if (deviceType == null) {
            deviceType = getSystemProperty(DEVICE_TYPE_PROPERTY_NAME, "");
            if (!MANUFACTURER.equalsIgnoreCase("Amazon")) {
                try {
                    deviceType = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(MAP_DEVICE_TYPE_KEY, str);
                } catch (PackageManager.NameNotFoundException e) {
                    mLog.e("Failed to get ApplicationInfo, NameNotFound: " + e);
                }
            }
        }
        mLog.d("DeviceType is: " + deviceType);
        return deviceType;
    }

    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static String getSystemProperty(String str, String str2) {
        String str3 = null;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(MetricsConstants.Method.CACHE_GET, String.class).invoke(null, str);
        } catch (Exception e) {
            mLog.e("unable to read system property: Exception ", e);
        }
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public static boolean isALLMEnabledDevice(Context context) {
        return context.getPackageManager().hasSystemFeature(FEATURE_LOW_LATENCY_SUPPORT);
    }

    public static boolean isAmazonDevice() {
        return MANUFACTURER.equalsIgnoreCase("Amazon");
    }

    public static boolean isFireTVDevice(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static boolean isStreamlineFireTV(Context context) {
        return isFireTVDevice(context) && Build.VERSION.SDK_INT >= 34;
    }
}
