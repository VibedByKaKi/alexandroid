package com.amazon.whisperjoin.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class FireOSUtil {
    static final String AMAZON_BUILD_CONFIGURATION_TABLET = "tablet";
    static final String AMAZON_DSHS_ZIGBEE_PACKAGE_NAME = "com.amazon.device.smarthome.adapters.zigbee";
    static final String AMAZON_FEATURE_FIREOS = "com.amazon.software.fireos";
    static final String AMAZON_FEATURE_FIRE_TV = "amazon.hardware.fire_tv";
    static final String BUILD_CONFIGURATION = "ro.build.configuration";
    private final PackageManager mPackageManager;

    public FireOSUtil(Context context) {
        this.mPackageManager = context.getPackageManager();
    }

    public boolean isFireTvDevice() {
        return this.mPackageManager.hasSystemFeature("amazon.hardware.fire_tv");
    }

    public boolean isPoweredDevice() {
        if (!this.mPackageManager.hasSystemFeature(AMAZON_FEATURE_FIREOS)) {
            return false;
        }
        String property = System.getProperty(BUILD_CONFIGURATION);
        return property == null || !AMAZON_BUILD_CONFIGURATION_TABLET.equals(property);
    }

    public boolean isZigbeeDevice() {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = this.mPackageManager.getApplicationInfo(AMAZON_DSHS_ZIGBEE_PACKAGE_NAME, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return applicationInfo != null;
    }
}
