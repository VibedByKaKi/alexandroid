package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_ipv6_use {
    public static final pjsua_ipv6_use PJSUA_IPV6_DISABLED;
    public static final pjsua_ipv6_use PJSUA_IPV6_ENABLED;
    private static int swigNext;
    private static pjsua_ipv6_use[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_ipv6_use pjsua_ipv6_useVar = new pjsua_ipv6_use("PJSUA_IPV6_DISABLED");
        PJSUA_IPV6_DISABLED = pjsua_ipv6_useVar;
        pjsua_ipv6_use pjsua_ipv6_useVar2 = new pjsua_ipv6_use("PJSUA_IPV6_ENABLED");
        PJSUA_IPV6_ENABLED = pjsua_ipv6_useVar2;
        swigValues = new pjsua_ipv6_use[]{pjsua_ipv6_useVar, pjsua_ipv6_useVar2};
        swigNext = 0;
    }

    private pjsua_ipv6_use(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_ipv6_use swigToEnum(int i) {
        pjsua_ipv6_use[] pjsua_ipv6_useVarArr = swigValues;
        if (i < pjsua_ipv6_useVarArr.length && i >= 0) {
            pjsua_ipv6_use pjsua_ipv6_useVar = pjsua_ipv6_useVarArr[i];
            if (pjsua_ipv6_useVar.swigValue == i) {
                return pjsua_ipv6_useVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_ipv6_use[] pjsua_ipv6_useVarArr2 = swigValues;
            if (i2 >= pjsua_ipv6_useVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_ipv6_use.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_ipv6_use pjsua_ipv6_useVar2 = pjsua_ipv6_useVarArr2[i2];
            if (pjsua_ipv6_useVar2.swigValue == i) {
                return pjsua_ipv6_useVar2;
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

    private pjsua_ipv6_use(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_ipv6_use(String str, pjsua_ipv6_use pjsua_ipv6_useVar) {
        this.swigName = str;
        int i = pjsua_ipv6_useVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
