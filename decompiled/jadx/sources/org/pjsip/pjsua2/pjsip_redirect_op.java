package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsip_redirect_op {
    public static final pjsip_redirect_op PJSIP_REDIRECT_ACCEPT;
    public static final pjsip_redirect_op PJSIP_REDIRECT_ACCEPT_REPLACE;
    public static final pjsip_redirect_op PJSIP_REDIRECT_PENDING;
    public static final pjsip_redirect_op PJSIP_REDIRECT_REJECT;
    public static final pjsip_redirect_op PJSIP_REDIRECT_STOP;
    private static int swigNext;
    private static pjsip_redirect_op[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsip_redirect_op pjsip_redirect_opVar = new pjsip_redirect_op("PJSIP_REDIRECT_REJECT");
        PJSIP_REDIRECT_REJECT = pjsip_redirect_opVar;
        pjsip_redirect_op pjsip_redirect_opVar2 = new pjsip_redirect_op("PJSIP_REDIRECT_ACCEPT");
        PJSIP_REDIRECT_ACCEPT = pjsip_redirect_opVar2;
        pjsip_redirect_op pjsip_redirect_opVar3 = new pjsip_redirect_op("PJSIP_REDIRECT_ACCEPT_REPLACE");
        PJSIP_REDIRECT_ACCEPT_REPLACE = pjsip_redirect_opVar3;
        pjsip_redirect_op pjsip_redirect_opVar4 = new pjsip_redirect_op("PJSIP_REDIRECT_PENDING");
        PJSIP_REDIRECT_PENDING = pjsip_redirect_opVar4;
        pjsip_redirect_op pjsip_redirect_opVar5 = new pjsip_redirect_op("PJSIP_REDIRECT_STOP");
        PJSIP_REDIRECT_STOP = pjsip_redirect_opVar5;
        swigValues = new pjsip_redirect_op[]{pjsip_redirect_opVar, pjsip_redirect_opVar2, pjsip_redirect_opVar3, pjsip_redirect_opVar4, pjsip_redirect_opVar5};
        swigNext = 0;
    }

    private pjsip_redirect_op(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsip_redirect_op swigToEnum(int i) {
        pjsip_redirect_op[] pjsip_redirect_opVarArr = swigValues;
        if (i < pjsip_redirect_opVarArr.length && i >= 0) {
            pjsip_redirect_op pjsip_redirect_opVar = pjsip_redirect_opVarArr[i];
            if (pjsip_redirect_opVar.swigValue == i) {
                return pjsip_redirect_opVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsip_redirect_op[] pjsip_redirect_opVarArr2 = swigValues;
            if (i2 >= pjsip_redirect_opVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsip_redirect_op.class, "No enum ", " with value ", i));
                return null;
            }
            pjsip_redirect_op pjsip_redirect_opVar2 = pjsip_redirect_opVarArr2[i2];
            if (pjsip_redirect_opVar2.swigValue == i) {
                return pjsip_redirect_opVar2;
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

    private pjsip_redirect_op(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsip_redirect_op(String str, pjsip_redirect_op pjsip_redirect_opVar) {
        this.swigName = str;
        int i = pjsip_redirect_opVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
