package com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.device.DeviceType;
import com.amazon.alexa.client.alexaservice.base.device.FirmwareVersion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class QualcommIOComponentsStateProvider extends DeviceIOComponentsStateProvider {

    @VisibleForTesting
    static final String ALEXA_APP_PACKAGE_NAME = "com.amazon.dee.app";

    @VisibleForTesting
    static final int MIN_VERSION_QUALCOMM_APP = 400001;

    @VisibleForTesting
    static final String QUALCOMM_PACKAGE_NAME = "com.quicinc.voice.activation";
    private static final String TAG = "QualcommIOComponentsStateProvider";
    private final String activeClientPackageName;
    private final PackageManager packageManager;

    public QualcommIOComponentsStateProvider(String str, PackageManager packageManager, DeviceType deviceType) {
        this(str, packageManager, deviceType, getPackageName(packageManager));
    }

    public static String getPackageName(PackageManager packageManager) {
        try {
            return packageManager.getPackageInfo("com.quicinc.voice.activation", 0).versionCode >= 400001 ? "com.amazon.dee.app" : "com.quicinc.voice.activation";
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Unable to find package: com.quicinc.voice.activation", e);
            return "com.quicinc.voice.activation";
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.DeviceIOComponentsStateProvider
    public FirmwareVersion getFirmwareVersion() {
        try {
            return FirmwareVersion.create(this.packageManager.getPackageInfo(this.activeClientPackageName, 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Unable to find package: " + this.activeClientPackageName, e);
            return FirmwareVersion.UNKNOWN;
        }
    }

    private QualcommIOComponentsStateProvider(String str, PackageManager packageManager, DeviceType deviceType, String str2) {
        super(str, deviceType, str2);
        this.packageManager = packageManager;
        this.activeClientPackageName = str2;
    }
}
