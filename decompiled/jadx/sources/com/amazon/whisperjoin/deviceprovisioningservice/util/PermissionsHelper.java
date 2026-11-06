package com.amazon.whisperjoin.deviceprovisioningservice.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PermissionsHelper {
    private final Context mContext;

    public PermissionsHelper(Context context) {
        this.mContext = context;
    }

    @TargetApi(23)
    public boolean isAppPermissionsGranted() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.mContext;
        return i >= 31 ? context.checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0 && this.mContext.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0 && this.mContext.checkSelfPermission("android.permission.BLUETOOTH_ADVERTISE") == 0 : context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean isPermissionNeededForBLEScanning() {
        return true;
    }

    public boolean isSystemLocationServicesEnabled() {
        try {
            return Settings.Secure.getInt(this.mContext.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }

    public boolean requiresGrantingAppPermissionsBeforeBLEScanning() {
        return !isAppPermissionsGranted();
    }
}
