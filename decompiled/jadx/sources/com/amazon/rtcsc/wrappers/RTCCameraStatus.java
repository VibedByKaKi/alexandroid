package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCCameraStatus {
    public static final RTCCameraStatus RTC_CAMERA_CLOSE_FAILED;
    public static final RTCCameraStatus RTC_CAMERA_NOT_FOUND;
    public static final RTCCameraStatus RTC_CAMERA_NO_ERROR;
    public static final RTCCameraStatus RTC_CAMERA_OPEN_FAILED;
    public static final RTCCameraStatus RTC_CAMERA_UNAVAILABLE;
    public static final RTCCameraStatus RTC_CAMERA_UNKNOWN_ERROR;
    private static int swigNext;
    private static RTCCameraStatus[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCCameraStatus rTCCameraStatus = new RTCCameraStatus("RTC_CAMERA_NO_ERROR");
        RTC_CAMERA_NO_ERROR = rTCCameraStatus;
        RTCCameraStatus rTCCameraStatus2 = new RTCCameraStatus("RTC_CAMERA_NOT_FOUND");
        RTC_CAMERA_NOT_FOUND = rTCCameraStatus2;
        RTCCameraStatus rTCCameraStatus3 = new RTCCameraStatus("RTC_CAMERA_OPEN_FAILED");
        RTC_CAMERA_OPEN_FAILED = rTCCameraStatus3;
        RTCCameraStatus rTCCameraStatus4 = new RTCCameraStatus("RTC_CAMERA_CLOSE_FAILED");
        RTC_CAMERA_CLOSE_FAILED = rTCCameraStatus4;
        RTCCameraStatus rTCCameraStatus5 = new RTCCameraStatus("RTC_CAMERA_UNAVAILABLE");
        RTC_CAMERA_UNAVAILABLE = rTCCameraStatus5;
        RTCCameraStatus rTCCameraStatus6 = new RTCCameraStatus("RTC_CAMERA_UNKNOWN_ERROR");
        RTC_CAMERA_UNKNOWN_ERROR = rTCCameraStatus6;
        swigValues = new RTCCameraStatus[]{rTCCameraStatus, rTCCameraStatus2, rTCCameraStatus3, rTCCameraStatus4, rTCCameraStatus5, rTCCameraStatus6};
        swigNext = 0;
    }

    private RTCCameraStatus(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCCameraStatus swigToEnum(int i) {
        RTCCameraStatus[] rTCCameraStatusArr = swigValues;
        if (i < rTCCameraStatusArr.length && i >= 0) {
            RTCCameraStatus rTCCameraStatus = rTCCameraStatusArr[i];
            if (rTCCameraStatus.swigValue == i) {
                return rTCCameraStatus;
            }
        }
        int i2 = 0;
        while (true) {
            RTCCameraStatus[] rTCCameraStatusArr2 = swigValues;
            if (i2 >= rTCCameraStatusArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCCameraStatus.class, "No enum ", " with value ", i));
                return null;
            }
            RTCCameraStatus rTCCameraStatus2 = rTCCameraStatusArr2[i2];
            if (rTCCameraStatus2.swigValue == i) {
                return rTCCameraStatus2;
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

    private RTCCameraStatus(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCCameraStatus(String str, RTCCameraStatus rTCCameraStatus) {
        this.swigName = str;
        int i = rTCCameraStatus.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
