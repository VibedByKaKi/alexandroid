package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_call_media_status {
    public static final pjsua_call_media_status PJSUA_CALL_MEDIA_ACTIVE;
    public static final pjsua_call_media_status PJSUA_CALL_MEDIA_ERROR;
    public static final pjsua_call_media_status PJSUA_CALL_MEDIA_LOCAL_HOLD;
    public static final pjsua_call_media_status PJSUA_CALL_MEDIA_NONE;
    public static final pjsua_call_media_status PJSUA_CALL_MEDIA_REMOTE_HOLD;
    private static int swigNext;
    private static pjsua_call_media_status[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_call_media_status pjsua_call_media_statusVar = new pjsua_call_media_status("PJSUA_CALL_MEDIA_NONE");
        PJSUA_CALL_MEDIA_NONE = pjsua_call_media_statusVar;
        pjsua_call_media_status pjsua_call_media_statusVar2 = new pjsua_call_media_status("PJSUA_CALL_MEDIA_ACTIVE");
        PJSUA_CALL_MEDIA_ACTIVE = pjsua_call_media_statusVar2;
        pjsua_call_media_status pjsua_call_media_statusVar3 = new pjsua_call_media_status("PJSUA_CALL_MEDIA_LOCAL_HOLD");
        PJSUA_CALL_MEDIA_LOCAL_HOLD = pjsua_call_media_statusVar3;
        pjsua_call_media_status pjsua_call_media_statusVar4 = new pjsua_call_media_status("PJSUA_CALL_MEDIA_REMOTE_HOLD");
        PJSUA_CALL_MEDIA_REMOTE_HOLD = pjsua_call_media_statusVar4;
        pjsua_call_media_status pjsua_call_media_statusVar5 = new pjsua_call_media_status("PJSUA_CALL_MEDIA_ERROR");
        PJSUA_CALL_MEDIA_ERROR = pjsua_call_media_statusVar5;
        swigValues = new pjsua_call_media_status[]{pjsua_call_media_statusVar, pjsua_call_media_statusVar2, pjsua_call_media_statusVar3, pjsua_call_media_statusVar4, pjsua_call_media_statusVar5};
        swigNext = 0;
    }

    private pjsua_call_media_status(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_call_media_status swigToEnum(int i) {
        pjsua_call_media_status[] pjsua_call_media_statusVarArr = swigValues;
        if (i < pjsua_call_media_statusVarArr.length && i >= 0) {
            pjsua_call_media_status pjsua_call_media_statusVar = pjsua_call_media_statusVarArr[i];
            if (pjsua_call_media_statusVar.swigValue == i) {
                return pjsua_call_media_statusVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_call_media_status[] pjsua_call_media_statusVarArr2 = swigValues;
            if (i2 >= pjsua_call_media_statusVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_call_media_status.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_call_media_status pjsua_call_media_statusVar2 = pjsua_call_media_statusVarArr2[i2];
            if (pjsua_call_media_statusVar2.swigValue == i) {
                return pjsua_call_media_statusVar2;
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

    private pjsua_call_media_status(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_call_media_status(String str, pjsua_call_media_status pjsua_call_media_statusVar) {
        this.swigName = str;
        int i = pjsua_call_media_statusVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
