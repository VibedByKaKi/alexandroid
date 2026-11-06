package com.amazon.minerva.client.common.api;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.minerva.client.common.internal.util.DevicePlatformIdentifierUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MinervaVersionChecker {
    private static volatile MinervaVersionChecker sMinervaVersionCheckerInstance;
    private DevicePlatformIdentifierUtil mDevicePlatformIdentifierUtil = DevicePlatformIdentifierUtil.getInstance();
    private PackageManager mPackageManager;

    private MinervaVersionChecker(Context context) {
        this.mPackageManager = context.getPackageManager();
    }

    public static MinervaVersionChecker getInstance(Context context) {
        if (sMinervaVersionCheckerInstance == null) {
            synchronized (MinervaVersionChecker.class) {
                try {
                    if (sMinervaVersionCheckerInstance == null) {
                        sMinervaVersionCheckerInstance = new MinervaVersionChecker(context);
                    }
                } finally {
                }
            }
        }
        return sMinervaVersionCheckerInstance;
    }

    public boolean isVersionSupported(MinervaVersion minervaVersion) {
        if (this.mDevicePlatformIdentifierUtil.isDevicePlatformFireOS()) {
            return this.mPackageManager.hasSystemFeature("com.fireos.sdk.minerva") && this.mPackageManager.hasSystemFeature("com.fireos.sdk.minerva", minervaVersion.getVersionNumber());
        }
        return true;
    }
}
