package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCSCAppDisconnectCode {
    public static final RTCSCAppDisconnectCode APPCLIENT_NOT_FOUND;
    public static final RTCSCAppDisconnectCode APPCLIENT_START_FAILED;
    public static final RTCSCAppDisconnectCode CAMERA_UNAVAILABLE;
    public static final RTCSCAppDisconnectCode DEVICE_UNAVAILABLE;
    public static final RTCSCAppDisconnectCode ENCRYPTION_KEY_UNAVAILABLE;
    public static final RTCSCAppDisconnectCode HIGHER_PRIORITY_SESSION_INTERRUPTED;
    public static final RTCSCAppDisconnectCode HIGHER_PRIORITY_SESSION_ONGOING;
    public static final RTCSCAppDisconnectCode PERMISSION_CHECKS_FAILED;
    public static final RTCSCAppDisconnectCode SESSION_DOMAIN_ERROR;
    public static final RTCSCAppDisconnectCode USER_DECLINED_SESSION;
    public static final RTCSCAppDisconnectCode USER_TERMINATED_SESSION;
    private static int swigNext;
    private static RTCSCAppDisconnectCode[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode = new RTCSCAppDisconnectCode("USER_TERMINATED_SESSION");
        USER_TERMINATED_SESSION = rTCSCAppDisconnectCode;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode2 = new RTCSCAppDisconnectCode("USER_DECLINED_SESSION");
        USER_DECLINED_SESSION = rTCSCAppDisconnectCode2;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode3 = new RTCSCAppDisconnectCode("APPCLIENT_NOT_FOUND");
        APPCLIENT_NOT_FOUND = rTCSCAppDisconnectCode3;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode4 = new RTCSCAppDisconnectCode("APPCLIENT_START_FAILED");
        APPCLIENT_START_FAILED = rTCSCAppDisconnectCode4;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode5 = new RTCSCAppDisconnectCode("PERMISSION_CHECKS_FAILED");
        PERMISSION_CHECKS_FAILED = rTCSCAppDisconnectCode5;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode6 = new RTCSCAppDisconnectCode("DEVICE_UNAVAILABLE");
        DEVICE_UNAVAILABLE = rTCSCAppDisconnectCode6;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode7 = new RTCSCAppDisconnectCode("CAMERA_UNAVAILABLE");
        CAMERA_UNAVAILABLE = rTCSCAppDisconnectCode7;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode8 = new RTCSCAppDisconnectCode("HIGHER_PRIORITY_SESSION_ONGOING");
        HIGHER_PRIORITY_SESSION_ONGOING = rTCSCAppDisconnectCode8;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode9 = new RTCSCAppDisconnectCode("HIGHER_PRIORITY_SESSION_INTERRUPTED");
        HIGHER_PRIORITY_SESSION_INTERRUPTED = rTCSCAppDisconnectCode9;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode10 = new RTCSCAppDisconnectCode("SESSION_DOMAIN_ERROR");
        SESSION_DOMAIN_ERROR = rTCSCAppDisconnectCode10;
        RTCSCAppDisconnectCode rTCSCAppDisconnectCode11 = new RTCSCAppDisconnectCode("ENCRYPTION_KEY_UNAVAILABLE");
        ENCRYPTION_KEY_UNAVAILABLE = rTCSCAppDisconnectCode11;
        swigValues = new RTCSCAppDisconnectCode[]{rTCSCAppDisconnectCode, rTCSCAppDisconnectCode2, rTCSCAppDisconnectCode3, rTCSCAppDisconnectCode4, rTCSCAppDisconnectCode5, rTCSCAppDisconnectCode6, rTCSCAppDisconnectCode7, rTCSCAppDisconnectCode8, rTCSCAppDisconnectCode9, rTCSCAppDisconnectCode10, rTCSCAppDisconnectCode11};
        swigNext = 0;
    }

    private RTCSCAppDisconnectCode(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCSCAppDisconnectCode swigToEnum(int i) {
        RTCSCAppDisconnectCode[] rTCSCAppDisconnectCodeArr = swigValues;
        if (i < rTCSCAppDisconnectCodeArr.length && i >= 0) {
            RTCSCAppDisconnectCode rTCSCAppDisconnectCode = rTCSCAppDisconnectCodeArr[i];
            if (rTCSCAppDisconnectCode.swigValue == i) {
                return rTCSCAppDisconnectCode;
            }
        }
        int i2 = 0;
        while (true) {
            RTCSCAppDisconnectCode[] rTCSCAppDisconnectCodeArr2 = swigValues;
            if (i2 >= rTCSCAppDisconnectCodeArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCSCAppDisconnectCode.class, "No enum ", " with value ", i));
                return null;
            }
            RTCSCAppDisconnectCode rTCSCAppDisconnectCode2 = rTCSCAppDisconnectCodeArr2[i2];
            if (rTCSCAppDisconnectCode2.swigValue == i) {
                return rTCSCAppDisconnectCode2;
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

    private RTCSCAppDisconnectCode(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCSCAppDisconnectCode(String str, RTCSCAppDisconnectCode rTCSCAppDisconnectCode) {
        this.swigName = str;
        int i = rTCSCAppDisconnectCode.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
