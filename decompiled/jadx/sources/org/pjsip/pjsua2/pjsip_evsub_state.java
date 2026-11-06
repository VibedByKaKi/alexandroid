package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsip_evsub_state {
    public static final pjsip_evsub_state PJSIP_EVSUB_STATE_ACCEPTED;
    public static final pjsip_evsub_state PJSIP_EVSUB_STATE_ACTIVE;
    public static final pjsip_evsub_state PJSIP_EVSUB_STATE_NULL;
    public static final pjsip_evsub_state PJSIP_EVSUB_STATE_PENDING;
    public static final pjsip_evsub_state PJSIP_EVSUB_STATE_SENT;
    public static final pjsip_evsub_state PJSIP_EVSUB_STATE_TERMINATED;
    public static final pjsip_evsub_state PJSIP_EVSUB_STATE_UNKNOWN;
    private static int swigNext;
    private static pjsip_evsub_state[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsip_evsub_state pjsip_evsub_stateVar = new pjsip_evsub_state("PJSIP_EVSUB_STATE_NULL");
        PJSIP_EVSUB_STATE_NULL = pjsip_evsub_stateVar;
        pjsip_evsub_state pjsip_evsub_stateVar2 = new pjsip_evsub_state("PJSIP_EVSUB_STATE_SENT");
        PJSIP_EVSUB_STATE_SENT = pjsip_evsub_stateVar2;
        pjsip_evsub_state pjsip_evsub_stateVar3 = new pjsip_evsub_state("PJSIP_EVSUB_STATE_ACCEPTED");
        PJSIP_EVSUB_STATE_ACCEPTED = pjsip_evsub_stateVar3;
        pjsip_evsub_state pjsip_evsub_stateVar4 = new pjsip_evsub_state("PJSIP_EVSUB_STATE_PENDING");
        PJSIP_EVSUB_STATE_PENDING = pjsip_evsub_stateVar4;
        pjsip_evsub_state pjsip_evsub_stateVar5 = new pjsip_evsub_state("PJSIP_EVSUB_STATE_ACTIVE");
        PJSIP_EVSUB_STATE_ACTIVE = pjsip_evsub_stateVar5;
        pjsip_evsub_state pjsip_evsub_stateVar6 = new pjsip_evsub_state("PJSIP_EVSUB_STATE_TERMINATED");
        PJSIP_EVSUB_STATE_TERMINATED = pjsip_evsub_stateVar6;
        pjsip_evsub_state pjsip_evsub_stateVar7 = new pjsip_evsub_state("PJSIP_EVSUB_STATE_UNKNOWN");
        PJSIP_EVSUB_STATE_UNKNOWN = pjsip_evsub_stateVar7;
        swigValues = new pjsip_evsub_state[]{pjsip_evsub_stateVar, pjsip_evsub_stateVar2, pjsip_evsub_stateVar3, pjsip_evsub_stateVar4, pjsip_evsub_stateVar5, pjsip_evsub_stateVar6, pjsip_evsub_stateVar7};
        swigNext = 0;
    }

    private pjsip_evsub_state(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsip_evsub_state swigToEnum(int i) {
        pjsip_evsub_state[] pjsip_evsub_stateVarArr = swigValues;
        if (i < pjsip_evsub_stateVarArr.length && i >= 0) {
            pjsip_evsub_state pjsip_evsub_stateVar = pjsip_evsub_stateVarArr[i];
            if (pjsip_evsub_stateVar.swigValue == i) {
                return pjsip_evsub_stateVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsip_evsub_state[] pjsip_evsub_stateVarArr2 = swigValues;
            if (i2 >= pjsip_evsub_stateVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsip_evsub_state.class, "No enum ", " with value ", i));
                return null;
            }
            pjsip_evsub_state pjsip_evsub_stateVar2 = pjsip_evsub_stateVarArr2[i2];
            if (pjsip_evsub_stateVar2.swigValue == i) {
                return pjsip_evsub_stateVar2;
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

    private pjsip_evsub_state(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsip_evsub_state(String str, pjsip_evsub_state pjsip_evsub_stateVar) {
        this.swigName = str;
        int i = pjsip_evsub_stateVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
