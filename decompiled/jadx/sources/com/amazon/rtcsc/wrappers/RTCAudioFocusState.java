package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCAudioFocusState {
    public static final RTCAudioFocusState RTC_AUDIO_FOCUS_DUCKED;
    public static final RTCAudioFocusState RTC_AUDIO_FOCUS_GAINED;
    public static final RTCAudioFocusState RTC_AUDIO_FOCUS_LOST;
    public static final RTCAudioFocusState RTC_AUDIO_FOCUS_UNKNOWN;
    private static int swigNext;
    private static RTCAudioFocusState[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCAudioFocusState rTCAudioFocusState = new RTCAudioFocusState("RTC_AUDIO_FOCUS_GAINED");
        RTC_AUDIO_FOCUS_GAINED = rTCAudioFocusState;
        RTCAudioFocusState rTCAudioFocusState2 = new RTCAudioFocusState("RTC_AUDIO_FOCUS_LOST");
        RTC_AUDIO_FOCUS_LOST = rTCAudioFocusState2;
        RTCAudioFocusState rTCAudioFocusState3 = new RTCAudioFocusState("RTC_AUDIO_FOCUS_DUCKED");
        RTC_AUDIO_FOCUS_DUCKED = rTCAudioFocusState3;
        RTCAudioFocusState rTCAudioFocusState4 = new RTCAudioFocusState("RTC_AUDIO_FOCUS_UNKNOWN");
        RTC_AUDIO_FOCUS_UNKNOWN = rTCAudioFocusState4;
        swigValues = new RTCAudioFocusState[]{rTCAudioFocusState, rTCAudioFocusState2, rTCAudioFocusState3, rTCAudioFocusState4};
        swigNext = 0;
    }

    private RTCAudioFocusState(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCAudioFocusState swigToEnum(int i) {
        RTCAudioFocusState[] rTCAudioFocusStateArr = swigValues;
        if (i < rTCAudioFocusStateArr.length && i >= 0) {
            RTCAudioFocusState rTCAudioFocusState = rTCAudioFocusStateArr[i];
            if (rTCAudioFocusState.swigValue == i) {
                return rTCAudioFocusState;
            }
        }
        int i2 = 0;
        while (true) {
            RTCAudioFocusState[] rTCAudioFocusStateArr2 = swigValues;
            if (i2 >= rTCAudioFocusStateArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCAudioFocusState.class, "No enum ", " with value ", i));
                return null;
            }
            RTCAudioFocusState rTCAudioFocusState2 = rTCAudioFocusStateArr2[i2];
            if (rTCAudioFocusState2.swigValue == i) {
                return rTCAudioFocusState2;
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

    private RTCAudioFocusState(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCAudioFocusState(String str, RTCAudioFocusState rTCAudioFocusState) {
        this.swigName = str;
        int i = rTCAudioFocusState.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
