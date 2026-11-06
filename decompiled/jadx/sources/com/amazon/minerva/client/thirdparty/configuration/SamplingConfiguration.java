package com.amazon.minerva.client.thirdparty.configuration;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SamplingConfiguration {
    private static final String TAG = "SamplingConfiguration";
    private int mDefaultSamplingRate;

    public SamplingConfiguration(int i) {
        if (isValidInput(i)) {
            this.mDefaultSamplingRate = i;
        } else {
            this.mDefaultSamplingRate = 100;
        }
    }

    private boolean isValidInput(int i) {
        if (i >= 0 && i <= 100) {
            return true;
        }
        Log.e(TAG, String.format("Invalid defaultSamplingRate: %d.", Integer.valueOf(i)));
        return false;
    }

    public int getDefaultSamplingRate() {
        return this.mDefaultSamplingRate;
    }
}
