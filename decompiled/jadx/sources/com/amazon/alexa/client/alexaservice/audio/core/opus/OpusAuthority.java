package com.amazon.alexa.client.alexaservice.audio.core.opus;

import android.util.Log;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.device.battery.BatteryAuthority;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.utils.device.AlexaHandsFreeDeviceInformation;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class OpusAuthority {
    private static final String TAG = "OpusAuthority";
    private final AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation;
    private final BatteryAuthority batteryAuthority;
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;

    @Inject
    public OpusAuthority(BatteryAuthority batteryAuthority, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation) {
        this.batteryAuthority = batteryAuthority;
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
        this.alexaHandsFreeDeviceInformation = alexaHandsFreeDeviceInformation;
    }

    public boolean enableOpus() {
        if (!this.featureFlagConfigurationAuthority.isEnabled(Feature.ALEXA_VOX_ANDROID_OPUS)) {
            Log.i(TAG, "Opus WebLab not dialed-up. Opus feature is disabled");
            return false;
        }
        String str = TAG;
        Log.i(str, "Opus WebLab dialed-up");
        if (this.alexaHandsFreeDeviceInformation.isCurrentDeviceHandsFree()) {
            Log.i(str, "The current device is AMPD device");
            if (this.alexaHandsFreeDeviceInformation.isCurrentDeviceMTK() || !this.alexaHandsFreeDeviceInformation.isCurrentDeviceTrueTurnkeyAudio()) {
                Log.i(str, "The current device is MTK / Amok / Amok Lite");
                if (!this.featureFlagConfigurationAuthority.isEnabled(Feature.ALEXA_VOX_ANDROID_OPUS_MTK)) {
                    Log.i(str, "MTK/Amok/AmokLite WebLab not dialed-up. Opus feature is disabled");
                    return false;
                }
                Log.i(str, "MTK/Amok/AmokLite WebLab dialed-up");
            } else {
                Log.i(str, "The current device is QC TT");
            }
        }
        if (this.batteryAuthority.isCharging()) {
            Log.i(str, "Device is charging. Opus feature is enabled");
            return true;
        }
        if (this.batteryAuthority.isLowBattery()) {
            Log.i(str, "Battery level is low. Opus feature is disabled");
            return false;
        }
        Log.i(str, "Battery level isn't low. Opus feature is enabled");
        return true;
    }
}
