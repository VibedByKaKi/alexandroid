package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsip_transport_state {
    public static final pjsip_transport_state PJSIP_TP_STATE_CONNECTED;
    public static final pjsip_transport_state PJSIP_TP_STATE_DESTROY;
    public static final pjsip_transport_state PJSIP_TP_STATE_DISCONNECTED;
    public static final pjsip_transport_state PJSIP_TP_STATE_SHUTDOWN;
    private static int swigNext;
    private static pjsip_transport_state[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsip_transport_state pjsip_transport_stateVar = new pjsip_transport_state("PJSIP_TP_STATE_CONNECTED");
        PJSIP_TP_STATE_CONNECTED = pjsip_transport_stateVar;
        pjsip_transport_state pjsip_transport_stateVar2 = new pjsip_transport_state("PJSIP_TP_STATE_DISCONNECTED");
        PJSIP_TP_STATE_DISCONNECTED = pjsip_transport_stateVar2;
        pjsip_transport_state pjsip_transport_stateVar3 = new pjsip_transport_state("PJSIP_TP_STATE_SHUTDOWN");
        PJSIP_TP_STATE_SHUTDOWN = pjsip_transport_stateVar3;
        pjsip_transport_state pjsip_transport_stateVar4 = new pjsip_transport_state("PJSIP_TP_STATE_DESTROY");
        PJSIP_TP_STATE_DESTROY = pjsip_transport_stateVar4;
        swigValues = new pjsip_transport_state[]{pjsip_transport_stateVar, pjsip_transport_stateVar2, pjsip_transport_stateVar3, pjsip_transport_stateVar4};
        swigNext = 0;
    }

    private pjsip_transport_state(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsip_transport_state swigToEnum(int i) {
        pjsip_transport_state[] pjsip_transport_stateVarArr = swigValues;
        if (i < pjsip_transport_stateVarArr.length && i >= 0) {
            pjsip_transport_state pjsip_transport_stateVar = pjsip_transport_stateVarArr[i];
            if (pjsip_transport_stateVar.swigValue == i) {
                return pjsip_transport_stateVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsip_transport_state[] pjsip_transport_stateVarArr2 = swigValues;
            if (i2 >= pjsip_transport_stateVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsip_transport_state.class, "No enum ", " with value ", i));
                return null;
            }
            pjsip_transport_state pjsip_transport_stateVar2 = pjsip_transport_stateVarArr2[i2];
            if (pjsip_transport_stateVar2.swigValue == i) {
                return pjsip_transport_stateVar2;
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

    private pjsip_transport_state(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsip_transport_state(String str, pjsip_transport_state pjsip_transport_stateVar) {
        this.swigName = str;
        int i = pjsip_transport_stateVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
