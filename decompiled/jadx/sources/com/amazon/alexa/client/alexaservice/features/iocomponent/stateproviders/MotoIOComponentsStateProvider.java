package com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.device.DeviceType;
import com.amazon.alexa.client.alexaservice.base.device.FirmwareVersion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MotoIOComponentsStateProvider extends DeviceIOComponentsStateProvider {

    @VisibleForTesting
    static final String MOTOALEXA_PACKAGE_NAME = "com.motorola.motoalexa";

    @VisibleForTesting
    static final String MOTOVOICE_PACKAGE_NAME = "com.motorola.audiomonitor";
    private static final String TAG = "MotoIOComponentsStateProvider";

    @VisibleForTesting
    static final String VERSION_CODES_SEPARATOR = "-";
    private final PackageManager packageManager;

    public MotoIOComponentsStateProvider(String str, PackageManager packageManager, DeviceType deviceType) {
        super(str, deviceType, "com.motorola.motoalexa");
        this.packageManager = packageManager;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.DeviceIOComponentsStateProvider
    public FirmwareVersion getFirmwareVersion() {
        try {
            return FirmwareVersion.create(String.valueOf(this.packageManager.getPackageInfo("com.motorola.motoalexa", 0).versionCode) + "-" + String.valueOf(this.packageManager.getPackageInfo("com.motorola.audiomonitor", 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Unable to find Moto Hands-Free package: ", e);
            return FirmwareVersion.UNKNOWN;
        }
    }
}
