package com.amazon.comms.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.amazon.comms.log.CommsLogger;
import com.google.common.base.Strings;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceInfo {
    private static final String DEVICE_TYPE_PROPERTY_NAME = "ro.product.config.type";
    private static final String MAP_DEVICE_TYPE_KEY = "MAPDeviceType";
    public static final String PRODUCT_MANUFACTURER_AMAZON = "Amazon";
    private static final CommsLogger mLog = CommsLogger.getLogger(DeviceInfo.class);
    public static final String MANUFACTURER = Build.MANUFACTURER;
    private static String deviceType = null;

    public static String getDeviceType(Context context, @NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("defaultDeviceType is marked non-null but is null");
            return null;
        }
        if (Strings.isNullOrEmpty(deviceType)) {
            deviceType = SystemProperty.getSystemProperty(DEVICE_TYPE_PROPERTY_NAME, "DEVICE_TYPE_NOT_FOUND");
            if (!MANUFACTURER.equalsIgnoreCase("Amazon")) {
                try {
                    String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(MAP_DEVICE_TYPE_KEY, str);
                    if (string.equals("A2J0R2SD7G9LPA")) {
                        deviceType = VegaDeviceTypeProviderUtil.getDeviceType();
                    } else {
                        deviceType = string;
                    }
                    mLog.d("deviceType: " + deviceType);
                } catch (PackageManager.NameNotFoundException e) {
                    mLog.e("Failed to get ApplicationInfo, NameNotFound: " + e);
                }
            }
        }
        return deviceType;
    }

    public static boolean isAmazonDevice() {
        return MANUFACTURER.equalsIgnoreCase("Amazon");
    }
}
