package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjmedia_type {
    public static final pjmedia_type PJMEDIA_TYPE_APPLICATION;
    public static final pjmedia_type PJMEDIA_TYPE_AUDIO;
    public static final pjmedia_type PJMEDIA_TYPE_NONE;
    public static final pjmedia_type PJMEDIA_TYPE_UNKNOWN;
    public static final pjmedia_type PJMEDIA_TYPE_VIDEO;
    private static int swigNext;
    private static pjmedia_type[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjmedia_type pjmedia_typeVar = new pjmedia_type("PJMEDIA_TYPE_NONE");
        PJMEDIA_TYPE_NONE = pjmedia_typeVar;
        pjmedia_type pjmedia_typeVar2 = new pjmedia_type("PJMEDIA_TYPE_AUDIO");
        PJMEDIA_TYPE_AUDIO = pjmedia_typeVar2;
        pjmedia_type pjmedia_typeVar3 = new pjmedia_type("PJMEDIA_TYPE_VIDEO");
        PJMEDIA_TYPE_VIDEO = pjmedia_typeVar3;
        pjmedia_type pjmedia_typeVar4 = new pjmedia_type("PJMEDIA_TYPE_APPLICATION");
        PJMEDIA_TYPE_APPLICATION = pjmedia_typeVar4;
        pjmedia_type pjmedia_typeVar5 = new pjmedia_type("PJMEDIA_TYPE_UNKNOWN");
        PJMEDIA_TYPE_UNKNOWN = pjmedia_typeVar5;
        swigValues = new pjmedia_type[]{pjmedia_typeVar, pjmedia_typeVar2, pjmedia_typeVar3, pjmedia_typeVar4, pjmedia_typeVar5};
        swigNext = 0;
    }

    private pjmedia_type(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjmedia_type swigToEnum(int i) {
        pjmedia_type[] pjmedia_typeVarArr = swigValues;
        if (i < pjmedia_typeVarArr.length && i >= 0) {
            pjmedia_type pjmedia_typeVar = pjmedia_typeVarArr[i];
            if (pjmedia_typeVar.swigValue == i) {
                return pjmedia_typeVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjmedia_type[] pjmedia_typeVarArr2 = swigValues;
            if (i2 >= pjmedia_typeVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjmedia_type.class, "No enum ", " with value ", i));
                return null;
            }
            pjmedia_type pjmedia_typeVar2 = pjmedia_typeVarArr2[i2];
            if (pjmedia_typeVar2.swigValue == i) {
                return pjmedia_typeVar2;
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

    private pjmedia_type(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjmedia_type(String str, pjmedia_type pjmedia_typeVar) {
        this.swigName = str;
        int i = pjmedia_typeVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
