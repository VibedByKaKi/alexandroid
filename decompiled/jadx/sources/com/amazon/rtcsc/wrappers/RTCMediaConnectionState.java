package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCMediaConnectionState {
    public static final RTCMediaConnectionState MEDIA_CONNECTED;
    public static final RTCMediaConnectionState MEDIA_CONNECTING;
    public static final RTCMediaConnectionState MEDIA_DISCONNECTED;
    public static final RTCMediaConnectionState UNKNOWN_MEDIA_CONNECTION_STATE;
    private static int swigNext;
    private static RTCMediaConnectionState[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCMediaConnectionState rTCMediaConnectionState = new RTCMediaConnectionState("MEDIA_CONNECTING");
        MEDIA_CONNECTING = rTCMediaConnectionState;
        RTCMediaConnectionState rTCMediaConnectionState2 = new RTCMediaConnectionState("MEDIA_CONNECTED");
        MEDIA_CONNECTED = rTCMediaConnectionState2;
        RTCMediaConnectionState rTCMediaConnectionState3 = new RTCMediaConnectionState("MEDIA_DISCONNECTED");
        MEDIA_DISCONNECTED = rTCMediaConnectionState3;
        RTCMediaConnectionState rTCMediaConnectionState4 = new RTCMediaConnectionState("UNKNOWN_MEDIA_CONNECTION_STATE");
        UNKNOWN_MEDIA_CONNECTION_STATE = rTCMediaConnectionState4;
        swigValues = new RTCMediaConnectionState[]{rTCMediaConnectionState, rTCMediaConnectionState2, rTCMediaConnectionState3, rTCMediaConnectionState4};
        swigNext = 0;
    }

    private RTCMediaConnectionState(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCMediaConnectionState swigToEnum(int i) {
        RTCMediaConnectionState[] rTCMediaConnectionStateArr = swigValues;
        if (i < rTCMediaConnectionStateArr.length && i >= 0) {
            RTCMediaConnectionState rTCMediaConnectionState = rTCMediaConnectionStateArr[i];
            if (rTCMediaConnectionState.swigValue == i) {
                return rTCMediaConnectionState;
            }
        }
        int i2 = 0;
        while (true) {
            RTCMediaConnectionState[] rTCMediaConnectionStateArr2 = swigValues;
            if (i2 >= rTCMediaConnectionStateArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCMediaConnectionState.class, "No enum ", " with value ", i));
                return null;
            }
            RTCMediaConnectionState rTCMediaConnectionState2 = rTCMediaConnectionStateArr2[i2];
            if (rTCMediaConnectionState2.swigValue == i) {
                return rTCMediaConnectionState2;
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

    private RTCMediaConnectionState(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCMediaConnectionState(String str, RTCMediaConnectionState rTCMediaConnectionState) {
        this.swigName = str;
        int i = rTCMediaConnectionState.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
