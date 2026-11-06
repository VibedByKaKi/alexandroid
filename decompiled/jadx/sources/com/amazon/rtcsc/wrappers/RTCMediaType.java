package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCMediaType {
    public static final RTCMediaType RTC_AUDIO;
    public static final RTCMediaType RTC_AUDIO_VIDEO;
    public static final RTCMediaType RTC_DATA;
    public static final RTCMediaType RTC_VIDEO;
    public static final RTCMediaType UNKNOWN_MEDIA_TYPE;
    private static int swigNext;
    private static RTCMediaType[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCMediaType rTCMediaType = new RTCMediaType("RTC_AUDIO");
        RTC_AUDIO = rTCMediaType;
        RTCMediaType rTCMediaType2 = new RTCMediaType("RTC_VIDEO");
        RTC_VIDEO = rTCMediaType2;
        RTCMediaType rTCMediaType3 = new RTCMediaType("RTC_DATA");
        RTC_DATA = rTCMediaType3;
        RTCMediaType rTCMediaType4 = new RTCMediaType("RTC_AUDIO_VIDEO");
        RTC_AUDIO_VIDEO = rTCMediaType4;
        RTCMediaType rTCMediaType5 = new RTCMediaType("UNKNOWN_MEDIA_TYPE");
        UNKNOWN_MEDIA_TYPE = rTCMediaType5;
        swigValues = new RTCMediaType[]{rTCMediaType, rTCMediaType2, rTCMediaType3, rTCMediaType4, rTCMediaType5};
        swigNext = 0;
    }

    private RTCMediaType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCMediaType swigToEnum(int i) {
        RTCMediaType[] rTCMediaTypeArr = swigValues;
        if (i < rTCMediaTypeArr.length && i >= 0) {
            RTCMediaType rTCMediaType = rTCMediaTypeArr[i];
            if (rTCMediaType.swigValue == i) {
                return rTCMediaType;
            }
        }
        int i2 = 0;
        while (true) {
            RTCMediaType[] rTCMediaTypeArr2 = swigValues;
            if (i2 >= rTCMediaTypeArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCMediaType.class, "No enum ", " with value ", i));
                return null;
            }
            RTCMediaType rTCMediaType2 = rTCMediaTypeArr2[i2];
            if (rTCMediaType2.swigValue == i) {
                return rTCMediaType2;
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

    private RTCMediaType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCMediaType(String str, RTCMediaType rTCMediaType) {
        this.swigName = str;
        int i = rTCMediaType.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
