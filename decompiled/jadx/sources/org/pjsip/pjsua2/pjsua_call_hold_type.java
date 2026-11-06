package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_call_hold_type {
    public static final pjsua_call_hold_type PJSUA_CALL_HOLD_TYPE_RFC2543;
    public static final pjsua_call_hold_type PJSUA_CALL_HOLD_TYPE_RFC3264;
    private static int swigNext;
    private static pjsua_call_hold_type[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_call_hold_type pjsua_call_hold_typeVar = new pjsua_call_hold_type("PJSUA_CALL_HOLD_TYPE_RFC3264");
        PJSUA_CALL_HOLD_TYPE_RFC3264 = pjsua_call_hold_typeVar;
        pjsua_call_hold_type pjsua_call_hold_typeVar2 = new pjsua_call_hold_type("PJSUA_CALL_HOLD_TYPE_RFC2543");
        PJSUA_CALL_HOLD_TYPE_RFC2543 = pjsua_call_hold_typeVar2;
        swigValues = new pjsua_call_hold_type[]{pjsua_call_hold_typeVar, pjsua_call_hold_typeVar2};
        swigNext = 0;
    }

    private pjsua_call_hold_type(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_call_hold_type swigToEnum(int i) {
        pjsua_call_hold_type[] pjsua_call_hold_typeVarArr = swigValues;
        if (i < pjsua_call_hold_typeVarArr.length && i >= 0) {
            pjsua_call_hold_type pjsua_call_hold_typeVar = pjsua_call_hold_typeVarArr[i];
            if (pjsua_call_hold_typeVar.swigValue == i) {
                return pjsua_call_hold_typeVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_call_hold_type[] pjsua_call_hold_typeVarArr2 = swigValues;
            if (i2 >= pjsua_call_hold_typeVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_call_hold_type.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_call_hold_type pjsua_call_hold_typeVar2 = pjsua_call_hold_typeVarArr2[i2];
            if (pjsua_call_hold_typeVar2.swigValue == i) {
                return pjsua_call_hold_typeVar2;
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

    private pjsua_call_hold_type(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_call_hold_type(String str, pjsua_call_hold_type pjsua_call_hold_typeVar) {
        this.swigName = str;
        int i = pjsua_call_hold_typeVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
