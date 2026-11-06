package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCFrameTransformer {
    public static final RTCFrameTransformer RTC_CERULEAN_SECURE_FRAME;
    public static final RTCFrameTransformer UNKNOWN_FRAME_TRANSFORMER;
    private static int swigNext;
    private static RTCFrameTransformer[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCFrameTransformer rTCFrameTransformer = new RTCFrameTransformer("RTC_CERULEAN_SECURE_FRAME");
        RTC_CERULEAN_SECURE_FRAME = rTCFrameTransformer;
        RTCFrameTransformer rTCFrameTransformer2 = new RTCFrameTransformer("UNKNOWN_FRAME_TRANSFORMER");
        UNKNOWN_FRAME_TRANSFORMER = rTCFrameTransformer2;
        swigValues = new RTCFrameTransformer[]{rTCFrameTransformer, rTCFrameTransformer2};
        swigNext = 0;
    }

    private RTCFrameTransformer(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCFrameTransformer swigToEnum(int i) {
        RTCFrameTransformer[] rTCFrameTransformerArr = swigValues;
        if (i < rTCFrameTransformerArr.length && i >= 0) {
            RTCFrameTransformer rTCFrameTransformer = rTCFrameTransformerArr[i];
            if (rTCFrameTransformer.swigValue == i) {
                return rTCFrameTransformer;
            }
        }
        int i2 = 0;
        while (true) {
            RTCFrameTransformer[] rTCFrameTransformerArr2 = swigValues;
            if (i2 >= rTCFrameTransformerArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCFrameTransformer.class, "No enum ", " with value ", i));
                return null;
            }
            RTCFrameTransformer rTCFrameTransformer2 = rTCFrameTransformerArr2[i2];
            if (rTCFrameTransformer2.swigValue == i) {
                return rTCFrameTransformer2;
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

    private RTCFrameTransformer(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCFrameTransformer(String str, RTCFrameTransformer rTCFrameTransformer) {
        this.swigName = str;
        int i = rTCFrameTransformer.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
