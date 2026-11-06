package com.amazon.whisperjoin.provisionerSDK.configuration.defaults;

import com.amazon.whisperjoin.common.sharedtypes.radios.RadioPreferences;
import com.amazon.whisperjoin.common.sharedtypes.radios.SupportedRadios;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class BasicAmazonBLERadioPreference implements RadioPreferences.RadioPreference {
    @Override // com.amazon.whisperjoin.common.sharedtypes.radios.RadioPreferences.RadioPreference
    public long getMaximumWaitTime(TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.convert(10L, timeUnit);
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.radios.RadioPreferences.RadioPreference
    public long getMinimumSignalStrength() {
        return 10L;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.radios.RadioPreferences.RadioPreference
    public String getRadioType() {
        return SupportedRadios.BLE.getString();
    }
}
