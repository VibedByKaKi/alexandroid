package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pj_qos_wmm_prio {
    public static final pj_qos_wmm_prio PJ_QOS_WMM_PRIO_BULK;
    public static final pj_qos_wmm_prio PJ_QOS_WMM_PRIO_BULK_EFFORT;
    public static final pj_qos_wmm_prio PJ_QOS_WMM_PRIO_VIDEO;
    public static final pj_qos_wmm_prio PJ_QOS_WMM_PRIO_VOICE;
    private static int swigNext;
    private static pj_qos_wmm_prio[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pj_qos_wmm_prio pj_qos_wmm_prioVar = new pj_qos_wmm_prio("PJ_QOS_WMM_PRIO_BULK_EFFORT");
        PJ_QOS_WMM_PRIO_BULK_EFFORT = pj_qos_wmm_prioVar;
        pj_qos_wmm_prio pj_qos_wmm_prioVar2 = new pj_qos_wmm_prio("PJ_QOS_WMM_PRIO_BULK");
        PJ_QOS_WMM_PRIO_BULK = pj_qos_wmm_prioVar2;
        pj_qos_wmm_prio pj_qos_wmm_prioVar3 = new pj_qos_wmm_prio("PJ_QOS_WMM_PRIO_VIDEO");
        PJ_QOS_WMM_PRIO_VIDEO = pj_qos_wmm_prioVar3;
        pj_qos_wmm_prio pj_qos_wmm_prioVar4 = new pj_qos_wmm_prio("PJ_QOS_WMM_PRIO_VOICE");
        PJ_QOS_WMM_PRIO_VOICE = pj_qos_wmm_prioVar4;
        swigValues = new pj_qos_wmm_prio[]{pj_qos_wmm_prioVar, pj_qos_wmm_prioVar2, pj_qos_wmm_prioVar3, pj_qos_wmm_prioVar4};
        swigNext = 0;
    }

    private pj_qos_wmm_prio(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pj_qos_wmm_prio swigToEnum(int i) {
        pj_qos_wmm_prio[] pj_qos_wmm_prioVarArr = swigValues;
        if (i < pj_qos_wmm_prioVarArr.length && i >= 0) {
            pj_qos_wmm_prio pj_qos_wmm_prioVar = pj_qos_wmm_prioVarArr[i];
            if (pj_qos_wmm_prioVar.swigValue == i) {
                return pj_qos_wmm_prioVar;
            }
        }
        int i2 = 0;
        while (true) {
            pj_qos_wmm_prio[] pj_qos_wmm_prioVarArr2 = swigValues;
            if (i2 >= pj_qos_wmm_prioVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pj_qos_wmm_prio.class, "No enum ", " with value ", i));
                return null;
            }
            pj_qos_wmm_prio pj_qos_wmm_prioVar2 = pj_qos_wmm_prioVarArr2[i2];
            if (pj_qos_wmm_prioVar2.swigValue == i) {
                return pj_qos_wmm_prioVar2;
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

    private pj_qos_wmm_prio(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pj_qos_wmm_prio(String str, pj_qos_wmm_prio pj_qos_wmm_prioVar) {
        this.swigName = str;
        int i = pj_qos_wmm_prioVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
