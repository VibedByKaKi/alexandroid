package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_sip_timer_use {
    public static final pjsua_sip_timer_use PJSUA_SIP_TIMER_ALWAYS;
    public static final pjsua_sip_timer_use PJSUA_SIP_TIMER_INACTIVE;
    public static final pjsua_sip_timer_use PJSUA_SIP_TIMER_OPTIONAL;
    public static final pjsua_sip_timer_use PJSUA_SIP_TIMER_REQUIRED;
    private static int swigNext;
    private static pjsua_sip_timer_use[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_sip_timer_use pjsua_sip_timer_useVar = new pjsua_sip_timer_use("PJSUA_SIP_TIMER_INACTIVE");
        PJSUA_SIP_TIMER_INACTIVE = pjsua_sip_timer_useVar;
        pjsua_sip_timer_use pjsua_sip_timer_useVar2 = new pjsua_sip_timer_use("PJSUA_SIP_TIMER_OPTIONAL");
        PJSUA_SIP_TIMER_OPTIONAL = pjsua_sip_timer_useVar2;
        pjsua_sip_timer_use pjsua_sip_timer_useVar3 = new pjsua_sip_timer_use("PJSUA_SIP_TIMER_REQUIRED");
        PJSUA_SIP_TIMER_REQUIRED = pjsua_sip_timer_useVar3;
        pjsua_sip_timer_use pjsua_sip_timer_useVar4 = new pjsua_sip_timer_use("PJSUA_SIP_TIMER_ALWAYS");
        PJSUA_SIP_TIMER_ALWAYS = pjsua_sip_timer_useVar4;
        swigValues = new pjsua_sip_timer_use[]{pjsua_sip_timer_useVar, pjsua_sip_timer_useVar2, pjsua_sip_timer_useVar3, pjsua_sip_timer_useVar4};
        swigNext = 0;
    }

    private pjsua_sip_timer_use(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_sip_timer_use swigToEnum(int i) {
        pjsua_sip_timer_use[] pjsua_sip_timer_useVarArr = swigValues;
        if (i < pjsua_sip_timer_useVarArr.length && i >= 0) {
            pjsua_sip_timer_use pjsua_sip_timer_useVar = pjsua_sip_timer_useVarArr[i];
            if (pjsua_sip_timer_useVar.swigValue == i) {
                return pjsua_sip_timer_useVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_sip_timer_use[] pjsua_sip_timer_useVarArr2 = swigValues;
            if (i2 >= pjsua_sip_timer_useVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_sip_timer_use.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_sip_timer_use pjsua_sip_timer_useVar2 = pjsua_sip_timer_useVarArr2[i2];
            if (pjsua_sip_timer_useVar2.swigValue == i) {
                return pjsua_sip_timer_useVar2;
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

    private pjsua_sip_timer_use(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_sip_timer_use(String str, pjsua_sip_timer_use pjsua_sip_timer_useVar) {
        this.swigName = str;
        int i = pjsua_sip_timer_useVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
