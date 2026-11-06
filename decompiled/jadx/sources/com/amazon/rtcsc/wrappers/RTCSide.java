package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCSide {
    public static final RTCSide RTC_LOCAL;
    public static final RTCSide RTC_REMOTE;
    public static final RTCSide UNKNOWN_SIDE;
    private static int swigNext;
    private static RTCSide[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCSide rTCSide = new RTCSide("RTC_LOCAL");
        RTC_LOCAL = rTCSide;
        RTCSide rTCSide2 = new RTCSide("RTC_REMOTE");
        RTC_REMOTE = rTCSide2;
        RTCSide rTCSide3 = new RTCSide("UNKNOWN_SIDE");
        UNKNOWN_SIDE = rTCSide3;
        swigValues = new RTCSide[]{rTCSide, rTCSide2, rTCSide3};
        swigNext = 0;
    }

    private RTCSide(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCSide swigToEnum(int i) {
        RTCSide[] rTCSideArr = swigValues;
        if (i < rTCSideArr.length && i >= 0) {
            RTCSide rTCSide = rTCSideArr[i];
            if (rTCSide.swigValue == i) {
                return rTCSide;
            }
        }
        int i2 = 0;
        while (true) {
            RTCSide[] rTCSideArr2 = swigValues;
            if (i2 >= rTCSideArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCSide.class, "No enum ", " with value ", i));
                return null;
            }
            RTCSide rTCSide2 = rTCSideArr2[i2];
            if (rTCSide2.swigValue == i) {
                return rTCSide2;
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

    private RTCSide(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCSide(String str, RTCSide rTCSide) {
        this.swigName = str;
        int i = rTCSide.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
