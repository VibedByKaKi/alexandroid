package com.amazon.blueshift.bluefront.android.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DeviceUtils {
    private static final String TAG = "com.amazon.blueshift.bluefront.android.common.DeviceUtils";

    private DeviceUtils() {
    }

    public static String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static String getCarrierName(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        return (telephonyManager == null || Strings.isNullOrEmpty(telephonyManager.getNetworkOperatorName())) ? "NONE" : telephonyManager.getNetworkOperatorName();
    }

    public static Location getLocation(Context context) {
        return null;
    }
}
