package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjmedia_srtp_use {
    public static final pjmedia_srtp_use PJMEDIA_SRTP_DISABLED;
    public static final pjmedia_srtp_use PJMEDIA_SRTP_MANDATORY;
    public static final pjmedia_srtp_use PJMEDIA_SRTP_OPTIONAL;
    private static int swigNext;
    private static pjmedia_srtp_use[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjmedia_srtp_use pjmedia_srtp_useVar = new pjmedia_srtp_use("PJMEDIA_SRTP_DISABLED");
        PJMEDIA_SRTP_DISABLED = pjmedia_srtp_useVar;
        pjmedia_srtp_use pjmedia_srtp_useVar2 = new pjmedia_srtp_use("PJMEDIA_SRTP_OPTIONAL");
        PJMEDIA_SRTP_OPTIONAL = pjmedia_srtp_useVar2;
        pjmedia_srtp_use pjmedia_srtp_useVar3 = new pjmedia_srtp_use("PJMEDIA_SRTP_MANDATORY");
        PJMEDIA_SRTP_MANDATORY = pjmedia_srtp_useVar3;
        swigValues = new pjmedia_srtp_use[]{pjmedia_srtp_useVar, pjmedia_srtp_useVar2, pjmedia_srtp_useVar3};
        swigNext = 0;
    }

    private pjmedia_srtp_use(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjmedia_srtp_use swigToEnum(int i) {
        pjmedia_srtp_use[] pjmedia_srtp_useVarArr = swigValues;
        if (i < pjmedia_srtp_useVarArr.length && i >= 0) {
            pjmedia_srtp_use pjmedia_srtp_useVar = pjmedia_srtp_useVarArr[i];
            if (pjmedia_srtp_useVar.swigValue == i) {
                return pjmedia_srtp_useVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjmedia_srtp_use[] pjmedia_srtp_useVarArr2 = swigValues;
            if (i2 >= pjmedia_srtp_useVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjmedia_srtp_use.class, "No enum ", " with value ", i));
                return null;
            }
            pjmedia_srtp_use pjmedia_srtp_useVar2 = pjmedia_srtp_useVarArr2[i2];
            if (pjmedia_srtp_useVar2.swigValue == i) {
                return pjmedia_srtp_useVar2;
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

    private pjmedia_srtp_use(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjmedia_srtp_use(String str, pjmedia_srtp_use pjmedia_srtp_useVar) {
        this.swigName = str;
        int i = pjmedia_srtp_useVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
