package com.amazon.alexa.client.metrics.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceInformation {
    private static final String APP_VERSION = "AppVersion";

    @VisibleForTesting
    public static final String DEVICE_COUNTRY = "DEVICE_COUNTRY";

    @VisibleForTesting
    public static final String DEVICE_DENSITY = "DEVICE_DENSITY";

    @VisibleForTesting
    public static final String DEVICE_HEIGHT = "DEVICE_HEIGHT";

    @VisibleForTesting
    public static final String DEVICE_LANGUAGE = "DEVICE_LANGUAGE";

    @VisibleForTesting
    public static final String DEVICE_MANUFACTURER = "DEVICE_MANUFACTURER";

    @VisibleForTesting
    public static final String DEVICE_MODEL = "DEVICE_MODEL";

    @VisibleForTesting
    public static final String DEVICE_PRODUCT = "DEVICE_PRODUCT";

    @VisibleForTesting
    public static final String DEVICE_WIDTH = "DEVICE_WIDTH";

    @VisibleForTesting
    public static final String FREE_RAM = "FREE_RAM";
    private static final int KH_MIN_API = 35;

    @VisibleForTesting
    public static final String NETWORK_TYPE = "NETWORK_TYPE";
    private static final String OS_ANDROID = "ANDROID";
    private static final String OS_FIREOS = "FIRE_OS";
    private static final String OS_KH = "KH_OS";

    @VisibleForTesting
    public static final String OS_TYPE = "OS_TYPE";

    @VisibleForTesting
    public static final String OS_VERSION = "OS_VERSION";

    @VisibleForTesting
    public static final String SDK_INT = "SDK_INT";

    @VisibleForTesting
    public static final String SERVICE_VERSION = "SERVICE_VERSION";

    @VisibleForTesting
    public static final String SIGNAL_STRENGTH = "SIGNAL_STRENGTH";
    private static final String TAG = "DeviceInformation";
    private final ActivityManager activityManager;
    private final AppInformation appInformation;
    private String countryCode;
    private final DeviceIdProvider deviceIdProvider;
    private volatile Map<String, Object> dynamicDeviceData;
    private final NetworkStateProvider networkStateProvider;
    private final ServiceVersionProvider serviceVersionProvider;
    private volatile Map<String, Object> staticDeviceData;
    private final TelephonyManager telephonyManager;
    private final WindowManager windowManager;
    private final Object staticDeviceDataUpdateLock = new Object();
    private final Object dynamicDeviceDataUpdateLock = new Object();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ServiceVersionProvider {
        String getServiceVersion();
    }

    public DeviceInformation(Context context, ActivityManager activityManager, TelephonyManager telephonyManager, WindowManager windowManager, NetworkStateProvider networkStateProvider, AppInformation appInformation, DeviceIdProvider deviceIdProvider, ServiceVersionProvider serviceVersionProvider) {
        this.activityManager = activityManager;
        this.telephonyManager = telephonyManager;
        this.windowManager = windowManager;
        this.networkStateProvider = networkStateProvider;
        this.appInformation = appInformation;
        this.deviceIdProvider = deviceIdProvider;
        this.serviceVersionProvider = serviceVersionProvider;
        setDefaultValues(context);
    }

    private Map<String, Object> computeCurrentDynamicDeviceData() {
        HashMap hashMap = new HashMap();
        long freeRam = getFreeRam();
        if (freeRam > 0) {
            freeRam /= 1048576;
        }
        hashMap.put("FREE_RAM", Long.valueOf(freeRam));
        hashMap.put("NETWORK_TYPE", this.networkStateProvider.getNetworkType());
        hashMap.put(SIGNAL_STRENGTH, this.networkStateProvider.getSignalStrength());
        return hashMap;
    }

    private Map<String, Object> createStaticDeviceProfileData() {
        HashMap hashMap = new HashMap();
        hashMap.put("DEVICE_MODEL", getModel());
        hashMap.put("DEVICE_LANGUAGE", getLanguage());
        hashMap.put("DEVICE_COUNTRY", getCountry());
        hashMap.put("DEVICE_MANUFACTURER", getManufacturer());
        hashMap.put("OS_VERSION", getOSVersion());
        hashMap.put("DEVICE_PRODUCT", getProduct());
        hashMap.put("SDK_INT", Integer.valueOf(getVersionSdkInt()));
        hashMap.put("OS_TYPE", getOsType());
        hashMap.put(SERVICE_VERSION, getVersionName());
        hashMap.put("AppVersion", this.appInformation.getHostAppVersion());
        Point point = new Point();
        this.windowManager.getDefaultDisplay().getSize(point);
        hashMap.put("DEVICE_WIDTH", Integer.valueOf(point.x));
        hashMap.put("DEVICE_HEIGHT", Integer.valueOf(point.y));
        hashMap.put("DEVICE_DENSITY", Float.valueOf(Resources.getSystem().getDisplayMetrics().density));
        return hashMap;
    }

    @NonNull
    private String getCountry() {
        return Locale.getDefault().getCountry();
    }

    private long getFreeRam() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    @NonNull
    private String getLanguage() {
        return Locale.getDefault().getDisplayLanguage();
    }

    @NonNull
    private String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    @NonNull
    private String getProduct() {
        return Build.PRODUCT;
    }

    private void setDefaultValues(Context context) {
        String simCountryIso = this.telephonyManager.getSimCountryIso();
        if (simCountryIso != null && !simCountryIso.isEmpty()) {
            this.countryCode = simCountryIso.toUpperCase();
        }
        String str = this.countryCode;
        if (str == null || str.isEmpty()) {
            Locale locale = context.getResources().getConfiguration().locale;
            Objects.toString(locale);
            this.countryCode = locale.getCountry();
        }
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @NonNull
    public Point getDeviceSize() {
        Point point = new Point();
        this.windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    @NonNull
    public PointF getDeviceSizeInInches() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = displayMetrics.heightPixels;
        return new PointF(displayMetrics.widthPixels / displayMetrics.ydpi, i / displayMetrics.xdpi);
    }

    @NonNull
    public Map<String, Object> getDynamicDeviceProfileData(boolean z) {
        if (z || this.dynamicDeviceData == null) {
            synchronized (this.dynamicDeviceDataUpdateLock) {
                if (!z) {
                    try {
                        if (this.dynamicDeviceData == null) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.dynamicDeviceData = Collections.unmodifiableMap(computeCurrentDynamicDeviceData());
            }
        }
        return this.dynamicDeviceData;
    }

    public String getId() {
        return this.deviceIdProvider.getDeviceId();
    }

    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public String getModel() {
        return Build.MODEL;
    }

    @NonNull
    public String getOsType() {
        return isKH() ? "KH_OS" : isFireOS() ? "FIRE_OS" : "ANDROID";
    }

    public String getSerial() {
        return Build.SERIAL;
    }

    @NonNull
    public Map<String, Object> getStaticDeviceProfileData() {
        if (this.staticDeviceData == null) {
            synchronized (this.staticDeviceDataUpdateLock) {
                try {
                    if (this.staticDeviceData == null) {
                        this.staticDeviceData = Collections.unmodifiableMap(createStaticDeviceProfileData());
                    }
                } finally {
                }
            }
        }
        return this.staticDeviceData;
    }

    public String getVersionName() {
        return this.serviceVersionProvider.getServiceVersion();
    }

    public int getVersionSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    public boolean isKH() {
        return isFireOS() && getVersionSdkInt() >= 35;
    }
}
