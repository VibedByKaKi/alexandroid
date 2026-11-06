package com.amazon.alexa.accessorykit.cloudpairing;

import android.os.Build;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DefaultAutoSetupHelper {
    private static final String TAG = "DefaultAutoSetupHelper";
    private static final String FIRE_HD_10_2023_13TH_GEN_MODEL_CODE = "KFTUWI";
    private static final Set<String> DeviceSupportAutoPairingSet = ImmutableSet.of(FIRE_HD_10_2023_13TH_GEN_MODEL_CODE);

    public boolean doesDeviceSupportAutoPairing(String str) {
        return DeviceSupportAutoPairingSet.contains(str.trim().toUpperCase());
    }

    public boolean isFireOS() {
        boolean equals = "Amazon".equals(Build.MANUFACTURER);
        Logger.d("%s Is Fire OS :: %b", TAG, Boolean.valueOf(equals));
        return equals;
    }
}
