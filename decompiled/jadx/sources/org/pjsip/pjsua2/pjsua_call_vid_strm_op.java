package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_call_vid_strm_op {
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_ADD;
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_CHANGE_CAP_DEV;
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_CHANGE_DIR;
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_NO_OP;
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_REMOVE;
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_SEND_KEYFRAME;
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_START_TRANSMIT;
    public static final pjsua_call_vid_strm_op PJSUA_CALL_VID_STRM_STOP_TRANSMIT;
    private static int swigNext;
    private static pjsua_call_vid_strm_op[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_NO_OP");
        PJSUA_CALL_VID_STRM_NO_OP = pjsua_call_vid_strm_opVar;
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar2 = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_ADD");
        PJSUA_CALL_VID_STRM_ADD = pjsua_call_vid_strm_opVar2;
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar3 = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_REMOVE");
        PJSUA_CALL_VID_STRM_REMOVE = pjsua_call_vid_strm_opVar3;
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar4 = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_CHANGE_DIR");
        PJSUA_CALL_VID_STRM_CHANGE_DIR = pjsua_call_vid_strm_opVar4;
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar5 = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_CHANGE_CAP_DEV");
        PJSUA_CALL_VID_STRM_CHANGE_CAP_DEV = pjsua_call_vid_strm_opVar5;
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar6 = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_START_TRANSMIT");
        PJSUA_CALL_VID_STRM_START_TRANSMIT = pjsua_call_vid_strm_opVar6;
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar7 = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_STOP_TRANSMIT");
        PJSUA_CALL_VID_STRM_STOP_TRANSMIT = pjsua_call_vid_strm_opVar7;
        pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar8 = new pjsua_call_vid_strm_op("PJSUA_CALL_VID_STRM_SEND_KEYFRAME");
        PJSUA_CALL_VID_STRM_SEND_KEYFRAME = pjsua_call_vid_strm_opVar8;
        swigValues = new pjsua_call_vid_strm_op[]{pjsua_call_vid_strm_opVar, pjsua_call_vid_strm_opVar2, pjsua_call_vid_strm_opVar3, pjsua_call_vid_strm_opVar4, pjsua_call_vid_strm_opVar5, pjsua_call_vid_strm_opVar6, pjsua_call_vid_strm_opVar7, pjsua_call_vid_strm_opVar8};
        swigNext = 0;
    }

    private pjsua_call_vid_strm_op(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_call_vid_strm_op swigToEnum(int i) {
        pjsua_call_vid_strm_op[] pjsua_call_vid_strm_opVarArr = swigValues;
        if (i < pjsua_call_vid_strm_opVarArr.length && i >= 0) {
            pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar = pjsua_call_vid_strm_opVarArr[i];
            if (pjsua_call_vid_strm_opVar.swigValue == i) {
                return pjsua_call_vid_strm_opVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_call_vid_strm_op[] pjsua_call_vid_strm_opVarArr2 = swigValues;
            if (i2 >= pjsua_call_vid_strm_opVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_call_vid_strm_op.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar2 = pjsua_call_vid_strm_opVarArr2[i2];
            if (pjsua_call_vid_strm_opVar2.swigValue == i) {
                return pjsua_call_vid_strm_opVar2;
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

    private pjsua_call_vid_strm_op(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_call_vid_strm_op(String str, pjsua_call_vid_strm_op pjsua_call_vid_strm_opVar) {
        this.swigName = str;
        int i = pjsua_call_vid_strm_opVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
