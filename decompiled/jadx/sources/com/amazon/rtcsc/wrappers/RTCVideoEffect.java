package com.amazon.rtcsc.wrappers;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCVideoEffect {
    public static final RTCVideoEffect FROST_EFFECT;
    public static final RTCVideoEffect NO_EFFECT;
    public static final RTCVideoEffect VIDEO_EFFECT_UNKNOWN;
    private static int swigNext;
    private static RTCVideoEffect[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCVideoEffect rTCVideoEffect = new RTCVideoEffect("NO_EFFECT");
        NO_EFFECT = rTCVideoEffect;
        RTCVideoEffect rTCVideoEffect2 = new RTCVideoEffect("FROST_EFFECT");
        FROST_EFFECT = rTCVideoEffect2;
        RTCVideoEffect rTCVideoEffect3 = new RTCVideoEffect("VIDEO_EFFECT_UNKNOWN");
        VIDEO_EFFECT_UNKNOWN = rTCVideoEffect3;
        swigValues = new RTCVideoEffect[]{rTCVideoEffect, rTCVideoEffect2, rTCVideoEffect3};
        swigNext = 0;
    }

    private RTCVideoEffect(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCVideoEffect swigToEnum(int i) {
        RTCVideoEffect[] rTCVideoEffectArr = swigValues;
        if (i < rTCVideoEffectArr.length && i >= 0) {
            RTCVideoEffect rTCVideoEffect = rTCVideoEffectArr[i];
            if (rTCVideoEffect.swigValue == i) {
                return rTCVideoEffect;
            }
        }
        int i2 = 0;
        while (true) {
            RTCVideoEffect[] rTCVideoEffectArr2 = swigValues;
            if (i2 >= rTCVideoEffectArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCVideoEffect.class, "No enum ", " with value ", i));
                return null;
            }
            RTCVideoEffect rTCVideoEffect2 = rTCVideoEffectArr2[i2];
            if (rTCVideoEffect2.swigValue == i) {
                return rTCVideoEffect2;
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

    private RTCVideoEffect(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCVideoEffect(String str, RTCVideoEffect rTCVideoEffect) {
        this.swigName = str;
        int i = rTCVideoEffect.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
