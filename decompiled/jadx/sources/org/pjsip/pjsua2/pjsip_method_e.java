package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsip_method_e {
    public static final pjsip_method_e PJSIP_ACK_METHOD;
    public static final pjsip_method_e PJSIP_BYE_METHOD;
    public static final pjsip_method_e PJSIP_CANCEL_METHOD;
    public static final pjsip_method_e PJSIP_INVITE_METHOD;
    public static final pjsip_method_e PJSIP_OPTIONS_METHOD;
    public static final pjsip_method_e PJSIP_OTHER_METHOD;
    public static final pjsip_method_e PJSIP_REGISTER_METHOD;
    private static int swigNext;
    private static pjsip_method_e[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsip_method_e pjsip_method_eVar = new pjsip_method_e("PJSIP_INVITE_METHOD");
        PJSIP_INVITE_METHOD = pjsip_method_eVar;
        pjsip_method_e pjsip_method_eVar2 = new pjsip_method_e("PJSIP_CANCEL_METHOD");
        PJSIP_CANCEL_METHOD = pjsip_method_eVar2;
        pjsip_method_e pjsip_method_eVar3 = new pjsip_method_e("PJSIP_ACK_METHOD");
        PJSIP_ACK_METHOD = pjsip_method_eVar3;
        pjsip_method_e pjsip_method_eVar4 = new pjsip_method_e("PJSIP_BYE_METHOD");
        PJSIP_BYE_METHOD = pjsip_method_eVar4;
        pjsip_method_e pjsip_method_eVar5 = new pjsip_method_e("PJSIP_REGISTER_METHOD");
        PJSIP_REGISTER_METHOD = pjsip_method_eVar5;
        pjsip_method_e pjsip_method_eVar6 = new pjsip_method_e("PJSIP_OPTIONS_METHOD");
        PJSIP_OPTIONS_METHOD = pjsip_method_eVar6;
        pjsip_method_e pjsip_method_eVar7 = new pjsip_method_e("PJSIP_OTHER_METHOD");
        PJSIP_OTHER_METHOD = pjsip_method_eVar7;
        swigValues = new pjsip_method_e[]{pjsip_method_eVar, pjsip_method_eVar2, pjsip_method_eVar3, pjsip_method_eVar4, pjsip_method_eVar5, pjsip_method_eVar6, pjsip_method_eVar7};
        swigNext = 0;
    }

    private pjsip_method_e(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsip_method_e swigToEnum(int i) {
        pjsip_method_e[] pjsip_method_eVarArr = swigValues;
        if (i < pjsip_method_eVarArr.length && i >= 0) {
            pjsip_method_e pjsip_method_eVar = pjsip_method_eVarArr[i];
            if (pjsip_method_eVar.swigValue == i) {
                return pjsip_method_eVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsip_method_e[] pjsip_method_eVarArr2 = swigValues;
            if (i2 >= pjsip_method_eVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsip_method_e.class, "No enum ", " with value ", i));
                return null;
            }
            pjsip_method_e pjsip_method_eVar2 = pjsip_method_eVarArr2[i2];
            if (pjsip_method_eVar2.swigValue == i) {
                return pjsip_method_eVar2;
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

    private pjsip_method_e(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsip_method_e(String str, pjsip_method_e pjsip_method_eVar) {
        this.swigName = str;
        int i = pjsip_method_eVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
