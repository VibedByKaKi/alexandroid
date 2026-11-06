package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCSessionState {
    public static final RTCSessionState SESSION_ACTIVE;
    public static final RTCSessionState SESSION_FINISHING;
    public static final RTCSessionState SESSION_PAUSED;
    public static final RTCSessionState SESSION_PREPARING;
    public static final RTCSessionState SESSION_STATE_UNKNOWN;
    private static int swigNext;
    private static RTCSessionState[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCSessionState rTCSessionState = new RTCSessionState("SESSION_STATE_UNKNOWN");
        SESSION_STATE_UNKNOWN = rTCSessionState;
        RTCSessionState rTCSessionState2 = new RTCSessionState("SESSION_PREPARING");
        SESSION_PREPARING = rTCSessionState2;
        RTCSessionState rTCSessionState3 = new RTCSessionState("SESSION_ACTIVE");
        SESSION_ACTIVE = rTCSessionState3;
        RTCSessionState rTCSessionState4 = new RTCSessionState("SESSION_PAUSED");
        SESSION_PAUSED = rTCSessionState4;
        RTCSessionState rTCSessionState5 = new RTCSessionState("SESSION_FINISHING");
        SESSION_FINISHING = rTCSessionState5;
        swigValues = new RTCSessionState[]{rTCSessionState, rTCSessionState2, rTCSessionState3, rTCSessionState4, rTCSessionState5};
        swigNext = 0;
    }

    private RTCSessionState(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCSessionState swigToEnum(int i) {
        RTCSessionState[] rTCSessionStateArr = swigValues;
        if (i < rTCSessionStateArr.length && i >= 0) {
            RTCSessionState rTCSessionState = rTCSessionStateArr[i];
            if (rTCSessionState.swigValue == i) {
                return rTCSessionState;
            }
        }
        int i2 = 0;
        while (true) {
            RTCSessionState[] rTCSessionStateArr2 = swigValues;
            if (i2 >= rTCSessionStateArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCSessionState.class, "No enum ", " with value ", i));
                return null;
            }
            RTCSessionState rTCSessionState2 = rTCSessionStateArr2[i2];
            if (rTCSessionState2.swigValue == i) {
                return rTCSessionState2;
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

    private RTCSessionState(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCSessionState(String str, RTCSessionState rTCSessionState) {
        this.swigName = str;
        int i = rTCSessionState.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
