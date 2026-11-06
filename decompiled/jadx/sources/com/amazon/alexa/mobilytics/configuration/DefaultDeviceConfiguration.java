package com.amazon.alexa.mobilytics.configuration;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.base.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class DefaultDeviceConfiguration implements DeviceConfiguration {
    public static final String AMAZON = "Amazon";
    private static final int KH_MIN_API = 35;
    private static final String NETWORK_NOT_CONNECTED = "NOT_CONNECTED";
    private static final String TAG = Log.tag((Class<?>) DefaultDeviceConfiguration.class);
    private final Context context;
    private final MobilyticsDeviceProvider deviceProvider;
    private final DisplayMetrics displayMetrics;
    private final String osType;
    private final String osVersion;

    @Inject
    public DefaultDeviceConfiguration(@NonNull Context context, @NonNull MobilyticsConfiguration mobilyticsConfiguration) {
        String androidVersion;
        String str;
        this.context = (Context) Preconditions.checkNotNull(context);
        if (isKH()) {
            androidVersion = getFireOSVersion();
            str = OperatingSystemType.KH_OS;
        } else if (isFireOS()) {
            androidVersion = getFireOSVersion();
            str = "FIRE_OS";
        } else {
            androidVersion = getAndroidVersion();
            str = "ANDROID";
        }
        this.deviceProvider = mobilyticsConfiguration.deviceProvider();
        this.osType = str;
        this.osVersion = androidVersion;
        this.displayMetrics = Resources.getSystem().getDisplayMetrics();
    }

    @NonNull
    private String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    @NonNull
    private String getFireOSVersion() {
        if (!isFireOS()) {
            return "Unknown";
        }
        int i = Build.VERSION.SDK_INT;
        return i < 30 ? "7.0" : i == 30 ? "8.0" : String.valueOf(i);
    }

    private boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    private boolean isKH() {
        return isFireOS() && Build.VERSION.SDK_INT >= 35;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String country() {
        /*
            r3 = this;
            android.content.Context r0 = r3.context
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getSimCountryIso()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            goto L1f
        L1e:
            r0 = 0
        L1f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L3f
            java.lang.String r3 = r3.locale()
            java.lang.String r0 = "Unknown"
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L32
            return r0
        L32:
            java.lang.String r1 = "_"
            java.lang.String[] r3 = r3.split(r1)
            int r1 = r3.length
            r2 = 1
            if (r1 <= r2) goto L3f
            r3 = r3[r2]
            return r3
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.mobilytics.configuration.DefaultDeviceConfiguration.country():java.lang.String");
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    public String deviceSerialNumber() {
        MobilyticsDeviceProvider mobilyticsDeviceProvider = this.deviceProvider;
        if (mobilyticsDeviceProvider == null || mobilyticsDeviceProvider.device() == null) {
            return "Unknown";
        }
        String deviceSerialNumber = this.deviceProvider.device().deviceSerialNumber();
        return !TextUtils.isEmpty(deviceSerialNumber) ? deviceSerialNumber : "Unknown";
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    public String deviceType() {
        MobilyticsDeviceProvider mobilyticsDeviceProvider = this.deviceProvider;
        if (mobilyticsDeviceProvider != null && mobilyticsDeviceProvider.device() != null) {
            String deviceType = this.deviceProvider.device().deviceType();
            if (!TextUtils.isEmpty(deviceType)) {
                return deviceType;
            }
        }
        return "Unknown";
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String language() {
        String locale = locale();
        if ("Unknown".equals(locale)) {
            return "Unknown";
        }
        String[] split = locale.split("_");
        return split.length > 0 ? split[0] : "Unknown";
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String locale() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.toString() : "Unknown";
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String manufacturer() {
        return Build.MANUFACTURER;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String model() {
        return Build.MODEL;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String networkType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "NOT_CONNECTED";
        }
        String typeName = activeNetworkInfo.getTypeName();
        String subtypeName = activeNetworkInfo.getSubtypeName();
        return (subtypeName == null || subtypeName.length() <= 0) ? typeName : a$$ExternalSyntheticOutline0.m$1(typeName, " ", subtypeName);
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String operatingSystemType() {
        return this.osType;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String operatingSystemVersion() {
        return this.osVersion;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String platform() {
        return "ANDROID";
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public String platformVersion() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public float screenDensity() {
        return this.displayMetrics.density;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public int screenHeight() {
        return this.displayMetrics.heightPixels;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    @NonNull
    public int screenWidth() {
        return this.displayMetrics.widthPixels;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.DeviceConfiguration
    public String timezone() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "Unknown";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceConfiguration[");
        sb.append("operatingSystemType: " + this.osType + "; ");
        sb.append("operatingSystemVersion: " + this.osVersion + "; ");
        sb.append("platform: " + platform() + "; ");
        sb.append("platformVersion: " + platformVersion() + "; ");
        sb.append("manufacturer: " + manufacturer() + "; ");
        sb.append("model: " + model() + "; ");
        sb.append("locale: " + locale() + "; ");
        sb.append("language: " + language() + "; ");
        sb.append("country: " + country() + "; ");
        sb.append("deviceType: " + this.deviceProvider.device().deviceType() + "; ");
        sb.append("deviceSerialNumber: " + this.deviceProvider.device().deviceSerialNumber() + "; ");
        sb.append("timezone: " + timezone() + "; ");
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
