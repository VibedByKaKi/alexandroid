package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCAudioUsage {
    public static final RTCAudioUsage RTC_AUDIO_USAGE_COMMUNICATION;
    public static final RTCAudioUsage RTC_AUDIO_USAGE_MEDIA;
    public static final RTCAudioUsage RTC_AUDIO_USAGE_UNKNOWN;
    private static int swigNext;
    private static RTCAudioUsage[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCAudioUsage rTCAudioUsage = new RTCAudioUsage("RTC_AUDIO_USAGE_MEDIA");
        RTC_AUDIO_USAGE_MEDIA = rTCAudioUsage;
        RTCAudioUsage rTCAudioUsage2 = new RTCAudioUsage("RTC_AUDIO_USAGE_COMMUNICATION");
        RTC_AUDIO_USAGE_COMMUNICATION = rTCAudioUsage2;
        RTCAudioUsage rTCAudioUsage3 = new RTCAudioUsage("RTC_AUDIO_USAGE_UNKNOWN");
        RTC_AUDIO_USAGE_UNKNOWN = rTCAudioUsage3;
        swigValues = new RTCAudioUsage[]{rTCAudioUsage, rTCAudioUsage2, rTCAudioUsage3};
        swigNext = 0;
    }

    private RTCAudioUsage(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCAudioUsage swigToEnum(int i) {
        RTCAudioUsage[] rTCAudioUsageArr = swigValues;
        if (i < rTCAudioUsageArr.length && i >= 0) {
            RTCAudioUsage rTCAudioUsage = rTCAudioUsageArr[i];
            if (rTCAudioUsage.swigValue == i) {
                return rTCAudioUsage;
            }
        }
        int i2 = 0;
        while (true) {
            RTCAudioUsage[] rTCAudioUsageArr2 = swigValues;
            if (i2 >= rTCAudioUsageArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCAudioUsage.class, "No enum ", " with value ", i));
                return null;
            }
            RTCAudioUsage rTCAudioUsage2 = rTCAudioUsageArr2[i2];
            if (rTCAudioUsage2.swigValue == i) {
                return rTCAudioUsage2;
            }
            i2++;
        }
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    private RTCAudioUsage(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCAudioUsage(String str, RTCAudioUsage rTCAudioUsage) {
        this.swigName = str;
        int i = rTCAudioUsage.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
