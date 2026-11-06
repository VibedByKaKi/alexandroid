package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_state {
    public static final pjsua_state PJSUA_STATE_CLOSING;
    public static final pjsua_state PJSUA_STATE_CREATED;
    public static final pjsua_state PJSUA_STATE_INIT;
    public static final pjsua_state PJSUA_STATE_NULL;
    public static final pjsua_state PJSUA_STATE_RUNNING;
    public static final pjsua_state PJSUA_STATE_STARTING;
    private static int swigNext;
    private static pjsua_state[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_state pjsua_stateVar = new pjsua_state("PJSUA_STATE_NULL");
        PJSUA_STATE_NULL = pjsua_stateVar;
        pjsua_state pjsua_stateVar2 = new pjsua_state("PJSUA_STATE_CREATED");
        PJSUA_STATE_CREATED = pjsua_stateVar2;
        pjsua_state pjsua_stateVar3 = new pjsua_state("PJSUA_STATE_INIT");
        PJSUA_STATE_INIT = pjsua_stateVar3;
        pjsua_state pjsua_stateVar4 = new pjsua_state("PJSUA_STATE_STARTING");
        PJSUA_STATE_STARTING = pjsua_stateVar4;
        pjsua_state pjsua_stateVar5 = new pjsua_state("PJSUA_STATE_RUNNING");
        PJSUA_STATE_RUNNING = pjsua_stateVar5;
        pjsua_state pjsua_stateVar6 = new pjsua_state("PJSUA_STATE_CLOSING");
        PJSUA_STATE_CLOSING = pjsua_stateVar6;
        swigValues = new pjsua_state[]{pjsua_stateVar, pjsua_stateVar2, pjsua_stateVar3, pjsua_stateVar4, pjsua_stateVar5, pjsua_stateVar6};
        swigNext = 0;
    }

    private pjsua_state(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_state swigToEnum(int i) {
        pjsua_state[] pjsua_stateVarArr = swigValues;
        if (i < pjsua_stateVarArr.length && i >= 0) {
            pjsua_state pjsua_stateVar = pjsua_stateVarArr[i];
            if (pjsua_stateVar.swigValue == i) {
                return pjsua_stateVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_state[] pjsua_stateVarArr2 = swigValues;
            if (i2 >= pjsua_stateVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_state.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_state pjsua_stateVar2 = pjsua_stateVarArr2[i2];
            if (pjsua_stateVar2.swigValue == i) {
                return pjsua_stateVar2;
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

    private pjsua_state(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_state(String str, pjsua_state pjsua_stateVar) {
        this.swigName = str;
        int i = pjsua_stateVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
