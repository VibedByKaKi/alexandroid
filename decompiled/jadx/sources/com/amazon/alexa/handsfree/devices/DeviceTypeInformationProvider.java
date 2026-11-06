package com.amazon.alexa.handsfree.devices;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.constants.Carrier;
import com.amazon.alexa.handsfree.devices.constants.VoiceApp;
import com.amazon.alexa.handsfree.devices.locales.CertifiedLocaleVoiceAppProvider;
import com.amazon.alexa.handsfree.devices.locales.NotificationsSupportedLocales;
import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceTypeInformationProvider {
    private static final String TAG = "DeviceTypeInfoProvider";
    private static DeviceTypeInformationProvider sInstance;
    private Context mContext;
    private List<DeviceConstant> mDeviceConstants;
    private DeviceInformation mDeviceInformation;

    @VisibleForTesting
    public DeviceTypeInformationProvider(@NonNull Context context) {
        this.mContext = context;
    }

    @NonNull
    private synchronized DeviceInformation getDeviceInformationForCurrentFireOSDevice() {
        getDeviceType();
        return new DeviceInformation(getDeviceType(), Build.MODEL, Build.MANUFACTURER, Build.PRODUCT, Build.DEVICE, Carrier.NO_CARRIER.getCarrier(), false, null, new CertifiedLocaleVoiceAppProvider(R.array.fire_tablet_certified_locales, R.string.fire_tablet_default_certified_locale), new NotificationsSupportedLocales(R.array.notifications_supported_locales_default_list), VoiceApp.FOXTROT, null, false);
    }

    public static String getDeviceType() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(MetricsConstants.Method.CACHE_GET, String.class).invoke(null, "ro.product.config.type");
        } catch (Exception unused) {
            Log.e(TAG, "Exception thrown when retrieving device type");
            return null;
        }
    }

    @NonNull
    public static synchronized DeviceTypeInformationProvider getInstance(@NonNull Context context) {
        DeviceTypeInformationProvider deviceTypeInformationProvider;
        synchronized (DeviceTypeInformationProvider.class) {
            try {
                if (sInstance == null) {
                    sInstance = new DeviceTypeInformationProvider(context);
                }
                deviceTypeInformationProvider = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceTypeInformationProvider;
    }

    @NonNull
    public synchronized DeviceInformation getDeviceInformationForCurrentDevice(@NonNull Resources resources) {
        DeviceInformation supportedDeviceInformation = getSupportedDeviceInformation();
        if (supportedDeviceInformation != null) {
            return supportedDeviceInformation;
        }
        return new DeviceInformation(resources.getString(R.string.com_amazon_pmet_device_type), Build.MODEL, Build.MANUFACTURER, Build.PRODUCT, Build.DEVICE, Carrier.NO_CARRIER.getCarrier(), false, null, new CertifiedLocaleVoiceAppProvider(R.array.voice_app_certified_locales_default_list, R.string.voice_app_no_default_provided), new NotificationsSupportedLocales(R.array.notifications_supported_locales_default_list), null, null, false);
    }

    @Nullable
    public synchronized DeviceInformation getSupportedDeviceInformation() {
        try {
            if (this.mDeviceConstants == null) {
                List<DeviceConstant> asList = Arrays.asList(DeviceConstant.values());
                this.mDeviceConstants = asList;
                Iterator<DeviceConstant> it2 = asList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DeviceConstant next = it2.next();
                    if (next.getDeviceInformation().compareByBuildInformation()) {
                        String str = Build.MANUFACTURER;
                        String str2 = Build.DEVICE;
                        String str3 = Build.PRODUCT;
                        StringBuilder sb = new StringBuilder();
                        sb.append("DeviceType found for Manufacturer ");
                        sb.append(str);
                        sb.append(" - Device: ");
                        sb.append(str2);
                        sb.append(" - Product: ");
                        sb.append(str3);
                        sb.append(".");
                        this.mDeviceInformation = next.getDeviceInformation();
                        break;
                    }
                }
            }
            if (isFireOS()) {
                this.mDeviceInformation = getDeviceInformationForCurrentFireOSDevice();
            }
            if (this.mDeviceInformation == null) {
                Log.w(TAG, "DeviceType not found for Manufacturer " + Build.MANUFACTURER + " - Device: " + Build.DEVICE + " - Product: " + Build.PRODUCT + ".");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mDeviceInformation;
    }

    @NonNull
    public synchronized List<DeviceInformation> getSupportedDevicesList() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (DeviceConstant deviceConstant : DeviceConstant.values()) {
            arrayList.add(deviceConstant.getDeviceInformation());
        }
        return arrayList;
    }

    public boolean isFireOS() {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    @NonNull
    public synchronized DeviceInformation getDeviceInformationForCurrentDevice(@NonNull Context context) {
        return getDeviceInformationForCurrentDevice(context.getResources());
    }

    @Nullable
    public synchronized DeviceInformation getSupportedDeviceInformation(@Nullable Context context) {
        try {
            if (this.mDeviceConstants == null) {
                List<DeviceConstant> asList = Arrays.asList(DeviceConstant.values());
                this.mDeviceConstants = asList;
                Iterator<DeviceConstant> it2 = asList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DeviceConstant next = it2.next();
                    if (next.getDeviceInformation().compareByBuildInformation()) {
                        String str = Build.MANUFACTURER;
                        String str2 = Build.DEVICE;
                        String str3 = Build.PRODUCT;
                        StringBuilder sb = new StringBuilder();
                        sb.append("DeviceType found for Manufacturer ");
                        sb.append(str);
                        sb.append(" - Device: ");
                        sb.append(str2);
                        sb.append(" - Product: ");
                        sb.append(str3);
                        sb.append(".");
                        this.mDeviceInformation = next.getDeviceInformation();
                        break;
                    }
                }
            }
            if (isFireOS()) {
                this.mDeviceInformation = getDeviceInformationForCurrentFireOSDevice();
            }
            if (this.mDeviceInformation == null) {
                Log.w(TAG, "DeviceType not found for Manufacturer " + Build.MANUFACTURER + " - Device: " + Build.DEVICE + " - Product: " + Build.PRODUCT + ".");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mDeviceInformation;
    }
}
