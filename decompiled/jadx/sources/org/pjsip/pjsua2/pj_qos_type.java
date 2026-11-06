package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pj_qos_type {
    public static final pj_qos_type PJ_QOS_TYPE_BACKGROUND;
    public static final pj_qos_type PJ_QOS_TYPE_BEST_EFFORT;
    public static final pj_qos_type PJ_QOS_TYPE_CONTROL;
    public static final pj_qos_type PJ_QOS_TYPE_VIDEO;
    public static final pj_qos_type PJ_QOS_TYPE_VOICE;
    private static int swigNext;
    private static pj_qos_type[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pj_qos_type pj_qos_typeVar = new pj_qos_type("PJ_QOS_TYPE_BEST_EFFORT");
        PJ_QOS_TYPE_BEST_EFFORT = pj_qos_typeVar;
        pj_qos_type pj_qos_typeVar2 = new pj_qos_type("PJ_QOS_TYPE_BACKGROUND");
        PJ_QOS_TYPE_BACKGROUND = pj_qos_typeVar2;
        pj_qos_type pj_qos_typeVar3 = new pj_qos_type("PJ_QOS_TYPE_VIDEO");
        PJ_QOS_TYPE_VIDEO = pj_qos_typeVar3;
        pj_qos_type pj_qos_typeVar4 = new pj_qos_type("PJ_QOS_TYPE_VOICE");
        PJ_QOS_TYPE_VOICE = pj_qos_typeVar4;
        pj_qos_type pj_qos_typeVar5 = new pj_qos_type("PJ_QOS_TYPE_CONTROL");
        PJ_QOS_TYPE_CONTROL = pj_qos_typeVar5;
        swigValues = new pj_qos_type[]{pj_qos_typeVar, pj_qos_typeVar2, pj_qos_typeVar3, pj_qos_typeVar4, pj_qos_typeVar5};
        swigNext = 0;
    }

    private pj_qos_type(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pj_qos_type swigToEnum(int i) {
        pj_qos_type[] pj_qos_typeVarArr = swigValues;
        if (i < pj_qos_typeVarArr.length && i >= 0) {
            pj_qos_type pj_qos_typeVar = pj_qos_typeVarArr[i];
            if (pj_qos_typeVar.swigValue == i) {
                return pj_qos_typeVar;
            }
        }
        int i2 = 0;
        while (true) {
            pj_qos_type[] pj_qos_typeVarArr2 = swigValues;
            if (i2 >= pj_qos_typeVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pj_qos_type.class, "No enum ", " with value ", i));
                return null;
            }
            pj_qos_type pj_qos_typeVar2 = pj_qos_typeVarArr2[i2];
            if (pj_qos_typeVar2.swigValue == i) {
                return pj_qos_typeVar2;
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

    private pj_qos_type(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pj_qos_type(String str, pj_qos_type pj_qos_typeVar) {
        this.swigName = str;
        int i = pj_qos_typeVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
