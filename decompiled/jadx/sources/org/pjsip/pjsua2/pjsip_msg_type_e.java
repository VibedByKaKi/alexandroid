package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsip_msg_type_e {
    public static final pjsip_msg_type_e PJSIP_REQUEST_MSG;
    public static final pjsip_msg_type_e PJSIP_RESPONSE_MSG;
    private static int swigNext;
    private static pjsip_msg_type_e[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsip_msg_type_e pjsip_msg_type_eVar = new pjsip_msg_type_e("PJSIP_REQUEST_MSG");
        PJSIP_REQUEST_MSG = pjsip_msg_type_eVar;
        pjsip_msg_type_e pjsip_msg_type_eVar2 = new pjsip_msg_type_e("PJSIP_RESPONSE_MSG");
        PJSIP_RESPONSE_MSG = pjsip_msg_type_eVar2;
        swigValues = new pjsip_msg_type_e[]{pjsip_msg_type_eVar, pjsip_msg_type_eVar2};
        swigNext = 0;
    }

    private pjsip_msg_type_e(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsip_msg_type_e swigToEnum(int i) {
        pjsip_msg_type_e[] pjsip_msg_type_eVarArr = swigValues;
        if (i < pjsip_msg_type_eVarArr.length && i >= 0) {
            pjsip_msg_type_e pjsip_msg_type_eVar = pjsip_msg_type_eVarArr[i];
            if (pjsip_msg_type_eVar.swigValue == i) {
                return pjsip_msg_type_eVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsip_msg_type_e[] pjsip_msg_type_eVarArr2 = swigValues;
            if (i2 >= pjsip_msg_type_eVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsip_msg_type_e.class, "No enum ", " with value ", i));
                return null;
            }
            pjsip_msg_type_e pjsip_msg_type_eVar2 = pjsip_msg_type_eVarArr2[i2];
            if (pjsip_msg_type_eVar2.swigValue == i) {
                return pjsip_msg_type_eVar2;
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

    private pjsip_msg_type_e(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsip_msg_type_e(String str, pjsip_msg_type_e pjsip_msg_type_eVar) {
        this.swigName = str;
        int i = pjsip_msg_type_eVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
