package com.amazon.alexa.sharing.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.sharing.Constants;
import com.amazon.comms.log.CommsLogger;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DeviceInfoUtil {
    private static final String DEFAULT_APP_VERSION = "2.2.0.0";
    private static final String DEVICE_PLATFORM = "Android";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, DeviceInfoUtil.class);
    private static Double deviceScreenSize;
    private static Boolean isPhoneDevice;
    private Context context;

    public DeviceInfoUtil() {
        this.context = null;
    }

    private double calculateScreenSize(@NonNull Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        double d = displayMetrics.widthPixels;
        int i = displayMetrics.densityDpi;
        double d2 = d / i;
        double d3 = displayMetrics.heightPixels / i;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isInfinite(d2) || Double.isInfinite(d3)) {
            CommsLogger commsLogger = LOG;
            StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("Device dimensions are invalid. H: ", d3, ", W: ");
            m.append(d2);
            commsLogger.e(m.toString());
            return 0.0d;
        }
        double sqrt = Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d2, 2.0d));
        LOG.d("Device Screen size is: " + sqrt);
        return sqrt;
    }

    private DisplayMetrics getDisplayMetrics(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public String getAppVersionName() {
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            CommsLogger commsLogger = LOG;
            commsLogger.e("Could not find the package name. ", e);
            commsLogger.w("Could not get the version name. Returning default version name.");
            return DEFAULT_APP_VERSION;
        }
    }

    public double getDeviceScreenSize(@NonNull Context context) {
        if (deviceScreenSize == null) {
            deviceScreenSize = Double.valueOf(calculateScreenSize(context));
        }
        return deviceScreenSize.doubleValue();
    }

    public String getPlatformName() {
        return "Android";
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public boolean isBelowLolliPop() {
        return false;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public boolean isKitKatAndAbove() {
        return true;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public boolean isMAndAbove() {
        return true;
    }

    public boolean isPhone(@NonNull Context context) {
        if (isPhoneDevice == null) {
            isPhoneDevice = Boolean.valueOf(6.5d > getDeviceScreenSize(context));
        }
        LOG.d("Is device a phone: " + isPhoneDevice);
        return isPhoneDevice.booleanValue();
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public boolean isQAndAbove() {
        return true;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public boolean isSAndAbove() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public void resetStatus() {
        isPhoneDevice = null;
        deviceScreenSize = null;
    }

    @Inject
    public DeviceInfoUtil(Context context) {
        this.context = context;
    }
}
