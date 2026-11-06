package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsip_event_id_e {
    public static final pjsip_event_id_e PJSIP_EVENT_RX_MSG;
    public static final pjsip_event_id_e PJSIP_EVENT_TIMER;
    public static final pjsip_event_id_e PJSIP_EVENT_TRANSPORT_ERROR;
    public static final pjsip_event_id_e PJSIP_EVENT_TSX_STATE;
    public static final pjsip_event_id_e PJSIP_EVENT_TX_MSG;
    public static final pjsip_event_id_e PJSIP_EVENT_UNKNOWN;
    public static final pjsip_event_id_e PJSIP_EVENT_USER;
    private static int swigNext;
    private static pjsip_event_id_e[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsip_event_id_e pjsip_event_id_eVar = new pjsip_event_id_e("PJSIP_EVENT_UNKNOWN");
        PJSIP_EVENT_UNKNOWN = pjsip_event_id_eVar;
        pjsip_event_id_e pjsip_event_id_eVar2 = new pjsip_event_id_e("PJSIP_EVENT_TIMER");
        PJSIP_EVENT_TIMER = pjsip_event_id_eVar2;
        pjsip_event_id_e pjsip_event_id_eVar3 = new pjsip_event_id_e("PJSIP_EVENT_TX_MSG");
        PJSIP_EVENT_TX_MSG = pjsip_event_id_eVar3;
        pjsip_event_id_e pjsip_event_id_eVar4 = new pjsip_event_id_e("PJSIP_EVENT_RX_MSG");
        PJSIP_EVENT_RX_MSG = pjsip_event_id_eVar4;
        pjsip_event_id_e pjsip_event_id_eVar5 = new pjsip_event_id_e("PJSIP_EVENT_TRANSPORT_ERROR");
        PJSIP_EVENT_TRANSPORT_ERROR = pjsip_event_id_eVar5;
        pjsip_event_id_e pjsip_event_id_eVar6 = new pjsip_event_id_e("PJSIP_EVENT_TSX_STATE");
        PJSIP_EVENT_TSX_STATE = pjsip_event_id_eVar6;
        pjsip_event_id_e pjsip_event_id_eVar7 = new pjsip_event_id_e("PJSIP_EVENT_USER");
        PJSIP_EVENT_USER = pjsip_event_id_eVar7;
        swigValues = new pjsip_event_id_e[]{pjsip_event_id_eVar, pjsip_event_id_eVar2, pjsip_event_id_eVar3, pjsip_event_id_eVar4, pjsip_event_id_eVar5, pjsip_event_id_eVar6, pjsip_event_id_eVar7};
        swigNext = 0;
    }

    private pjsip_event_id_e(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsip_event_id_e swigToEnum(int i) {
        pjsip_event_id_e[] pjsip_event_id_eVarArr = swigValues;
        if (i < pjsip_event_id_eVarArr.length && i >= 0) {
            pjsip_event_id_e pjsip_event_id_eVar = pjsip_event_id_eVarArr[i];
            if (pjsip_event_id_eVar.swigValue == i) {
                return pjsip_event_id_eVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsip_event_id_e[] pjsip_event_id_eVarArr2 = swigValues;
            if (i2 >= pjsip_event_id_eVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsip_event_id_e.class, "No enum ", " with value ", i));
                return null;
            }
            pjsip_event_id_e pjsip_event_id_eVar2 = pjsip_event_id_eVarArr2[i2];
            if (pjsip_event_id_eVar2.swigValue == i) {
                return pjsip_event_id_eVar2;
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

    private pjsip_event_id_e(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsip_event_id_e(String str, pjsip_event_id_e pjsip_event_id_eVar) {
        this.swigName = str;
        int i = pjsip_event_id_eVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
