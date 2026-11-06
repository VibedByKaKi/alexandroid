package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_100rel_use {
    public static final pjsua_100rel_use PJSUA_100REL_MANDATORY;
    public static final pjsua_100rel_use PJSUA_100REL_NOT_USED;
    public static final pjsua_100rel_use PJSUA_100REL_OPTIONAL;
    private static int swigNext;
    private static pjsua_100rel_use[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_100rel_use pjsua_100rel_useVar = new pjsua_100rel_use("PJSUA_100REL_NOT_USED");
        PJSUA_100REL_NOT_USED = pjsua_100rel_useVar;
        pjsua_100rel_use pjsua_100rel_useVar2 = new pjsua_100rel_use("PJSUA_100REL_MANDATORY");
        PJSUA_100REL_MANDATORY = pjsua_100rel_useVar2;
        pjsua_100rel_use pjsua_100rel_useVar3 = new pjsua_100rel_use("PJSUA_100REL_OPTIONAL");
        PJSUA_100REL_OPTIONAL = pjsua_100rel_useVar3;
        swigValues = new pjsua_100rel_use[]{pjsua_100rel_useVar, pjsua_100rel_useVar2, pjsua_100rel_useVar3};
        swigNext = 0;
    }

    private pjsua_100rel_use(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_100rel_use swigToEnum(int i) {
        pjsua_100rel_use[] pjsua_100rel_useVarArr = swigValues;
        if (i < pjsua_100rel_useVarArr.length && i >= 0) {
            pjsua_100rel_use pjsua_100rel_useVar = pjsua_100rel_useVarArr[i];
            if (pjsua_100rel_useVar.swigValue == i) {
                return pjsua_100rel_useVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_100rel_use[] pjsua_100rel_useVarArr2 = swigValues;
            if (i2 >= pjsua_100rel_useVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_100rel_use.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_100rel_use pjsua_100rel_useVar2 = pjsua_100rel_useVarArr2[i2];
            if (pjsua_100rel_useVar2.swigValue == i) {
                return pjsua_100rel_useVar2;
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

    private pjsua_100rel_use(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_100rel_use(String str, pjsua_100rel_use pjsua_100rel_useVar) {
        this.swigName = str;
        int i = pjsua_100rel_useVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
