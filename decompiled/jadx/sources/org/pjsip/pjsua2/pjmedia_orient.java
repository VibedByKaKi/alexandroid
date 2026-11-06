package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjmedia_orient {
    public static final pjmedia_orient PJMEDIA_ORIENT_NATURAL;
    public static final pjmedia_orient PJMEDIA_ORIENT_ROTATE_180DEG;
    public static final pjmedia_orient PJMEDIA_ORIENT_ROTATE_270DEG;
    public static final pjmedia_orient PJMEDIA_ORIENT_ROTATE_90DEG;
    public static final pjmedia_orient PJMEDIA_ORIENT_UNKNOWN;
    private static int swigNext;
    private static pjmedia_orient[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjmedia_orient pjmedia_orientVar = new pjmedia_orient("PJMEDIA_ORIENT_UNKNOWN");
        PJMEDIA_ORIENT_UNKNOWN = pjmedia_orientVar;
        pjmedia_orient pjmedia_orientVar2 = new pjmedia_orient("PJMEDIA_ORIENT_NATURAL");
        PJMEDIA_ORIENT_NATURAL = pjmedia_orientVar2;
        pjmedia_orient pjmedia_orientVar3 = new pjmedia_orient("PJMEDIA_ORIENT_ROTATE_90DEG");
        PJMEDIA_ORIENT_ROTATE_90DEG = pjmedia_orientVar3;
        pjmedia_orient pjmedia_orientVar4 = new pjmedia_orient("PJMEDIA_ORIENT_ROTATE_180DEG");
        PJMEDIA_ORIENT_ROTATE_180DEG = pjmedia_orientVar4;
        pjmedia_orient pjmedia_orientVar5 = new pjmedia_orient("PJMEDIA_ORIENT_ROTATE_270DEG");
        PJMEDIA_ORIENT_ROTATE_270DEG = pjmedia_orientVar5;
        swigValues = new pjmedia_orient[]{pjmedia_orientVar, pjmedia_orientVar2, pjmedia_orientVar3, pjmedia_orientVar4, pjmedia_orientVar5};
        swigNext = 0;
    }

    private pjmedia_orient(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjmedia_orient swigToEnum(int i) {
        pjmedia_orient[] pjmedia_orientVarArr = swigValues;
        if (i < pjmedia_orientVarArr.length && i >= 0) {
            pjmedia_orient pjmedia_orientVar = pjmedia_orientVarArr[i];
            if (pjmedia_orientVar.swigValue == i) {
                return pjmedia_orientVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjmedia_orient[] pjmedia_orientVarArr2 = swigValues;
            if (i2 >= pjmedia_orientVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjmedia_orient.class, "No enum ", " with value ", i));
                return null;
            }
            pjmedia_orient pjmedia_orientVar2 = pjmedia_orientVarArr2[i2];
            if (pjmedia_orientVar2.swigValue == i) {
                return pjmedia_orientVar2;
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

    private pjmedia_orient(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjmedia_orient(String str, pjmedia_orient pjmedia_orientVar) {
        this.swigName = str;
        int i = pjmedia_orientVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
