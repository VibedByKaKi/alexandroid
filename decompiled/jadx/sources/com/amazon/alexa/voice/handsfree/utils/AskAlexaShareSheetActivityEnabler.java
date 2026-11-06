package com.amazon.alexa.voice.handsfree.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.amazon.alexa.voice.handsfree.features.AskAlexaShareSheetActivity;
import com.amazon.alexa.voice.handsfree.settings.providers.BenefitsEntitlementProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AskAlexaShareSheetActivityEnabler {
    public static final String ALEXA_TNC_ACCEPTED_SECURE_SETTING_KEY = "alexa_tnc_accepted";
    private static final String ASK_ALEXA_SHARE_SHEET_ACTIVITY_CLASS = AskAlexaShareSheetActivity.class.getName();
    private static final String TAG = "AskAlexaShareSheetActivityEnabler";

    private AskAlexaShareSheetActivityEnabler() {
    }

    @VisibleForTesting
    public static void applyComponentState(@NonNull Context context, boolean z) {
        try {
            ComponentName componentName = new ComponentName(context.getPackageName(), ASK_ALEXA_SHARE_SHEET_ACTIVITY_CLASS);
            int i = z ? 1 : 2;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getComponentEnabledSetting(componentName) == i) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            Log.i(TAG, "AskAlexaShareSheetActivity enabled=" + z);
        } catch (IllegalArgumentException unused) {
            Log.i(TAG, "AskAlexaShareSheetActivity component not found, skipping toggle");
        } catch (Exception e) {
            Log.e(TAG, "Failed to toggle AskAlexaShareSheetActivity enabled state", e);
        }
    }

    public static void setEnabled(@NonNull Context context, boolean z) {
        if (FireTabletUtils.isKHTablet()) {
            boolean z2 = false;
            boolean z3 = Settings.Secure.getInt(context.getContentResolver(), ALEXA_TNC_ACCEPTED_SECURE_SETTING_KEY, 0) != 0;
            if (z && z3 && !FireTabletUtils.isChildProfile(context) && !KetDeviceCheck.isKetDevice(context)) {
                z2 = true;
            }
            applyComponentState(context, z2);
        }
    }

    public static void setEnabled(@NonNull Context context) {
        if (FireTabletUtils.isKHTablet()) {
            setEnabled(context, BenefitsEntitlementProvider.readEntitled(context));
        }
    }
}
