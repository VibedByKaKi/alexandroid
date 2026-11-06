package com.amazon.comms.config.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.util.SystemProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceInfo {
    private static final String DEVICE_TYPE_PROPERTY_NAME = "ro.product.config.type";
    public static final String FEATURE_FIRE_TV = "amazon.hardware.fire_tv";
    private static final String MAP_DEVICE_TYPE_KEY = "MAPDeviceType";
    public static final String PRODUCT_MANUFACTURER_AMAZON = "Amazon";
    private static String deviceType;
    private static final CommsLogger log = CommsLogger.getLogger(DeviceInfo.class);
    public static final String MANUFACTURER = Build.MANUFACTURER;

    public static String getDeviceType(Context context, @NonNull String str) {
        if (deviceType == null) {
            deviceType = SystemProperty.getSystemProperty(DEVICE_TYPE_PROPERTY_NAME, "");
            if (!MANUFACTURER.equalsIgnoreCase("Amazon")) {
                try {
                    String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(MAP_DEVICE_TYPE_KEY, str);
                    if (string.equals("A2J0R2SD7G9LPA")) {
                        deviceType = VegaDeviceTypeProviderUtil.getDeviceType();
                    } else {
                        deviceType = string;
                    }
                    log.d("deviceType: " + deviceType);
                } catch (PackageManager.NameNotFoundException e) {
                    log.e("Failed to get ApplicationInfo, NameNotFound: " + e);
                }
            }
        }
        return deviceType;
    }

    public static boolean isAmazonDevice() {
        return MANUFACTURER.equalsIgnoreCase("Amazon");
    }

    public static boolean isFireTVDevice(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }
}
