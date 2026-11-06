package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsip_inv_state {
    public static final pjsip_inv_state PJSIP_INV_STATE_CALLING;
    public static final pjsip_inv_state PJSIP_INV_STATE_CONFIRMED;
    public static final pjsip_inv_state PJSIP_INV_STATE_CONNECTING;
    public static final pjsip_inv_state PJSIP_INV_STATE_DISCONNECTED;
    public static final pjsip_inv_state PJSIP_INV_STATE_EARLY;
    public static final pjsip_inv_state PJSIP_INV_STATE_INCOMING;
    public static final pjsip_inv_state PJSIP_INV_STATE_NULL;
    private static int swigNext;
    private static pjsip_inv_state[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsip_inv_state pjsip_inv_stateVar = new pjsip_inv_state("PJSIP_INV_STATE_NULL");
        PJSIP_INV_STATE_NULL = pjsip_inv_stateVar;
        pjsip_inv_state pjsip_inv_stateVar2 = new pjsip_inv_state("PJSIP_INV_STATE_CALLING");
        PJSIP_INV_STATE_CALLING = pjsip_inv_stateVar2;
        pjsip_inv_state pjsip_inv_stateVar3 = new pjsip_inv_state("PJSIP_INV_STATE_INCOMING");
        PJSIP_INV_STATE_INCOMING = pjsip_inv_stateVar3;
        pjsip_inv_state pjsip_inv_stateVar4 = new pjsip_inv_state("PJSIP_INV_STATE_EARLY");
        PJSIP_INV_STATE_EARLY = pjsip_inv_stateVar4;
        pjsip_inv_state pjsip_inv_stateVar5 = new pjsip_inv_state("PJSIP_INV_STATE_CONNECTING");
        PJSIP_INV_STATE_CONNECTING = pjsip_inv_stateVar5;
        pjsip_inv_state pjsip_inv_stateVar6 = new pjsip_inv_state("PJSIP_INV_STATE_CONFIRMED");
        PJSIP_INV_STATE_CONFIRMED = pjsip_inv_stateVar6;
        pjsip_inv_state pjsip_inv_stateVar7 = new pjsip_inv_state("PJSIP_INV_STATE_DISCONNECTED");
        PJSIP_INV_STATE_DISCONNECTED = pjsip_inv_stateVar7;
        swigValues = new pjsip_inv_state[]{pjsip_inv_stateVar, pjsip_inv_stateVar2, pjsip_inv_stateVar3, pjsip_inv_stateVar4, pjsip_inv_stateVar5, pjsip_inv_stateVar6, pjsip_inv_stateVar7};
        swigNext = 0;
    }

    private pjsip_inv_state(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsip_inv_state swigToEnum(int i) {
        pjsip_inv_state[] pjsip_inv_stateVarArr = swigValues;
        if (i < pjsip_inv_stateVarArr.length && i >= 0) {
            pjsip_inv_state pjsip_inv_stateVar = pjsip_inv_stateVarArr[i];
            if (pjsip_inv_stateVar.swigValue == i) {
                return pjsip_inv_stateVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsip_inv_state[] pjsip_inv_stateVarArr2 = swigValues;
            if (i2 >= pjsip_inv_stateVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsip_inv_state.class, "No enum ", " with value ", i));
                return null;
            }
            pjsip_inv_state pjsip_inv_stateVar2 = pjsip_inv_stateVarArr2[i2];
            if (pjsip_inv_stateVar2.swigValue == i) {
                return pjsip_inv_stateVar2;
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

    private pjsip_inv_state(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsip_inv_state(String str, pjsip_inv_state pjsip_inv_stateVar) {
        this.swigName = str;
        int i = pjsip_inv_stateVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
