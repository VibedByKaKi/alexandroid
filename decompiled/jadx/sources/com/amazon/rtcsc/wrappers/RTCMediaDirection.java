package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCMediaDirection {
    public static final RTCMediaDirection RTC_DIRECTION_UNSET;
    public static final RTCMediaDirection RTC_INACTIVE;
    public static final RTCMediaDirection RTC_OFF;
    public static final RTCMediaDirection RTC_RECEIVE_ONLY;
    public static final RTCMediaDirection RTC_SEND_ONLY;
    public static final RTCMediaDirection RTC_SEND_RECEIVE;
    private static int swigNext;
    private static RTCMediaDirection[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCMediaDirection rTCMediaDirection = new RTCMediaDirection("RTC_DIRECTION_UNSET");
        RTC_DIRECTION_UNSET = rTCMediaDirection;
        RTCMediaDirection rTCMediaDirection2 = new RTCMediaDirection("RTC_SEND_RECEIVE");
        RTC_SEND_RECEIVE = rTCMediaDirection2;
        RTCMediaDirection rTCMediaDirection3 = new RTCMediaDirection("RTC_RECEIVE_ONLY");
        RTC_RECEIVE_ONLY = rTCMediaDirection3;
        RTCMediaDirection rTCMediaDirection4 = new RTCMediaDirection("RTC_SEND_ONLY");
        RTC_SEND_ONLY = rTCMediaDirection4;
        RTCMediaDirection rTCMediaDirection5 = new RTCMediaDirection("RTC_INACTIVE");
        RTC_INACTIVE = rTCMediaDirection5;
        RTCMediaDirection rTCMediaDirection6 = new RTCMediaDirection("RTC_OFF");
        RTC_OFF = rTCMediaDirection6;
        swigValues = new RTCMediaDirection[]{rTCMediaDirection, rTCMediaDirection2, rTCMediaDirection3, rTCMediaDirection4, rTCMediaDirection5, rTCMediaDirection6};
        swigNext = 0;
    }

    private RTCMediaDirection(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCMediaDirection swigToEnum(int i) {
        RTCMediaDirection[] rTCMediaDirectionArr = swigValues;
        if (i < rTCMediaDirectionArr.length && i >= 0) {
            RTCMediaDirection rTCMediaDirection = rTCMediaDirectionArr[i];
            if (rTCMediaDirection.swigValue == i) {
                return rTCMediaDirection;
            }
        }
        int i2 = 0;
        while (true) {
            RTCMediaDirection[] rTCMediaDirectionArr2 = swigValues;
            if (i2 >= rTCMediaDirectionArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCMediaDirection.class, "No enum ", " with value ", i));
                return null;
            }
            RTCMediaDirection rTCMediaDirection2 = rTCMediaDirectionArr2[i2];
            if (rTCMediaDirection2.swigValue == i) {
                return rTCMediaDirection2;
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

    private RTCMediaDirection(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCMediaDirection(String str, RTCMediaDirection rTCMediaDirection) {
        this.swigName = str;
        int i = rTCMediaDirection.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
