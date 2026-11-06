package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_buddy_status {
    public static final pjsua_buddy_status PJSUA_BUDDY_STATUS_OFFLINE;
    public static final pjsua_buddy_status PJSUA_BUDDY_STATUS_ONLINE;
    public static final pjsua_buddy_status PJSUA_BUDDY_STATUS_UNKNOWN;
    private static int swigNext;
    private static pjsua_buddy_status[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_buddy_status pjsua_buddy_statusVar = new pjsua_buddy_status("PJSUA_BUDDY_STATUS_UNKNOWN");
        PJSUA_BUDDY_STATUS_UNKNOWN = pjsua_buddy_statusVar;
        pjsua_buddy_status pjsua_buddy_statusVar2 = new pjsua_buddy_status("PJSUA_BUDDY_STATUS_ONLINE");
        PJSUA_BUDDY_STATUS_ONLINE = pjsua_buddy_statusVar2;
        pjsua_buddy_status pjsua_buddy_statusVar3 = new pjsua_buddy_status("PJSUA_BUDDY_STATUS_OFFLINE");
        PJSUA_BUDDY_STATUS_OFFLINE = pjsua_buddy_statusVar3;
        swigValues = new pjsua_buddy_status[]{pjsua_buddy_statusVar, pjsua_buddy_statusVar2, pjsua_buddy_statusVar3};
        swigNext = 0;
    }

    private pjsua_buddy_status(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_buddy_status swigToEnum(int i) {
        pjsua_buddy_status[] pjsua_buddy_statusVarArr = swigValues;
        if (i < pjsua_buddy_statusVarArr.length && i >= 0) {
            pjsua_buddy_status pjsua_buddy_statusVar = pjsua_buddy_statusVarArr[i];
            if (pjsua_buddy_statusVar.swigValue == i) {
                return pjsua_buddy_statusVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_buddy_status[] pjsua_buddy_statusVarArr2 = swigValues;
            if (i2 >= pjsua_buddy_statusVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_buddy_status.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_buddy_status pjsua_buddy_statusVar2 = pjsua_buddy_statusVarArr2[i2];
            if (pjsua_buddy_statusVar2.swigValue == i) {
                return pjsua_buddy_statusVar2;
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

    private pjsua_buddy_status(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_buddy_status(String str, pjsua_buddy_status pjsua_buddy_statusVar) {
        this.swigName = str;
        int i = pjsua_buddy_statusVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
