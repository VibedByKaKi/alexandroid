package com.amazon.minerva.client.thirdparty.configuration;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ThrottleConfiguration {
    private static final String TAG = "ThrottleConfiguration";
    private int mDefaultThrottleCreditHour;
    private int mMaxThrottleCredit;
    private int mThrottleSwitch;

    public ThrottleConfiguration(int i, int i2, int i3, ThrottleConfiguration throttleConfiguration) {
        if (isValidInput(i, i2, i3)) {
            this.mThrottleSwitch = Math.max(i, throttleConfiguration.getThrottleSwitch());
            this.mMaxThrottleCredit = Math.min(i2, throttleConfiguration.getMaxThrottleCredit());
            this.mDefaultThrottleCreditHour = Math.min(i3, throttleConfiguration.getDefaultThrottleCreditHour());
        }
    }

    private boolean isValidInput(int i, int i2, int i3) {
        if (i != 0 && i != 1) {
            Log.e(TAG, String.format("Invalid throttleSwitch: %d.", Integer.valueOf(i)));
            return false;
        }
        if (i2 <= 0 || i3 <= 0) {
            Log.e(TAG, String.format("Credit should be positive numbers. Found maxThrottleCredit: %d, defaultThrottleCreditHour: %d.", Integer.valueOf(i2), Integer.valueOf(i3)));
            return false;
        }
        if (i3 <= i2) {
            return true;
        }
        Log.e(TAG, String.format("The maxThrottleCredit (%d) should not smaller than defaultThrottleCreditHour (%d).", Integer.valueOf(i2), Integer.valueOf(i3)));
        return false;
    }

    public int getDefaultThrottleCreditHour() {
        return this.mDefaultThrottleCreditHour;
    }

    public int getMaxThrottleCredit() {
        return this.mMaxThrottleCredit;
    }

    public int getThrottleSwitch() {
        return this.mThrottleSwitch;
    }

    public ThrottleConfiguration(int i, int i2, int i3) {
        if (isValidInput(i, i2, i3)) {
            this.mThrottleSwitch = i;
            this.mMaxThrottleCredit = i2;
            this.mDefaultThrottleCreditHour = i3;
        }
    }
}
