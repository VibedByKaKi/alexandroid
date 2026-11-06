package com.amazon.alexa.accessory.notificationpublisher.providers;

import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import java.util.BitSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DistractionMode {
    private static final int LOW_DISTRACTION_BIT = 0;
    public static final int LOW_DISTRACTION_MODE = 2;
    public static final int NORMAL_DISTRACTION_MODE = 1;
    private static final int NO_DISTRACTION_BIT = 1;
    public static final int NO_DISTRACTION_MODE = 4;
    private static final int SILENT_DISTRACTION_BIT = 2;
    public static final int SILENT_DISTRACTION_MODE = 3;
    private static final String TAG = "DistractionMode";
    private final BitSet currentDistractionMode = new BitSet(3);

    public DistractionMode(boolean z, boolean z2) {
        setLowDistractionMode(z);
        setSilentDistractionMode(z2);
    }

    public int getCurrentDistractionMode() {
        if (this.currentDistractionMode.get(1)) {
            Log.i(TAG, "getCurrentDistractionMode - No distraction mode");
            return 4;
        }
        if (this.currentDistractionMode.get(2)) {
            Log.i(TAG, "getCurrentDistractionMode - Silent distraction mode");
            return 3;
        }
        if (!this.currentDistractionMode.get(0)) {
            return 1;
        }
        Log.i(TAG, "getCurrentDistractionMode - Low distraction mode");
        return 2;
    }

    public void setLowDistractionMode(boolean z) {
        String str = TAG;
        Log.i(str, "setLowDistractionMode - enabled = " + z);
        this.currentDistractionMode.set(0, z);
        Log.d(str, "setLowDistractionMode - Low distraction bit = " + this.currentDistractionMode.get(0));
    }

    public void setNoDistractionMode(boolean z) {
        String str = TAG;
        Log.i(str, "setNoDistractionMode - enabled = " + z);
        this.currentDistractionMode.set(1, z);
        Log.d(str, "setNoDistractionMode - No distraction bit = " + this.currentDistractionMode.get(1));
    }

    public void setSilentDistractionMode(boolean z) {
        String str = TAG;
        Log.i(str, "setSilentDistractionMode - enabled = " + z);
        this.currentDistractionMode.set(2, z);
        Log.d(str, "setSilentDistractionMode - Silent distraction bit = " + this.currentDistractionMode.get(2));
    }
}
