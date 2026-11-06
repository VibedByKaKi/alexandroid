package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_stun_use {
    public static final pjsua_stun_use PJSUA_STUN_USE_DEFAULT;
    public static final pjsua_stun_use PJSUA_STUN_USE_DISABLED;
    private static int swigNext;
    private static pjsua_stun_use[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_stun_use pjsua_stun_useVar = new pjsua_stun_use("PJSUA_STUN_USE_DEFAULT");
        PJSUA_STUN_USE_DEFAULT = pjsua_stun_useVar;
        pjsua_stun_use pjsua_stun_useVar2 = new pjsua_stun_use("PJSUA_STUN_USE_DISABLED");
        PJSUA_STUN_USE_DISABLED = pjsua_stun_useVar2;
        swigValues = new pjsua_stun_use[]{pjsua_stun_useVar, pjsua_stun_useVar2};
        swigNext = 0;
    }

    private pjsua_stun_use(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_stun_use swigToEnum(int i) {
        pjsua_stun_use[] pjsua_stun_useVarArr = swigValues;
        if (i < pjsua_stun_useVarArr.length && i >= 0) {
            pjsua_stun_use pjsua_stun_useVar = pjsua_stun_useVarArr[i];
            if (pjsua_stun_useVar.swigValue == i) {
                return pjsua_stun_useVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_stun_use[] pjsua_stun_useVarArr2 = swigValues;
            if (i2 >= pjsua_stun_useVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_stun_use.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_stun_use pjsua_stun_useVar2 = pjsua_stun_useVarArr2[i2];
            if (pjsua_stun_useVar2.swigValue == i) {
                return pjsua_stun_useVar2;
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

    private pjsua_stun_use(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_stun_use(String str, pjsua_stun_use pjsua_stun_useVar) {
        this.swigName = str;
        int i = pjsua_stun_useVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
