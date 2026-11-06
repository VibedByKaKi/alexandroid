package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjsua_med_tp_st {
    public static final pjsua_med_tp_st PJSUA_MED_TP_CREATING;
    public static final pjsua_med_tp_st PJSUA_MED_TP_DISABLED;
    public static final pjsua_med_tp_st PJSUA_MED_TP_IDLE;
    public static final pjsua_med_tp_st PJSUA_MED_TP_INIT;
    public static final pjsua_med_tp_st PJSUA_MED_TP_NULL;
    public static final pjsua_med_tp_st PJSUA_MED_TP_RUNNING;
    private static int swigNext;
    private static pjsua_med_tp_st[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjsua_med_tp_st pjsua_med_tp_stVar = new pjsua_med_tp_st("PJSUA_MED_TP_NULL");
        PJSUA_MED_TP_NULL = pjsua_med_tp_stVar;
        pjsua_med_tp_st pjsua_med_tp_stVar2 = new pjsua_med_tp_st("PJSUA_MED_TP_CREATING");
        PJSUA_MED_TP_CREATING = pjsua_med_tp_stVar2;
        pjsua_med_tp_st pjsua_med_tp_stVar3 = new pjsua_med_tp_st("PJSUA_MED_TP_IDLE");
        PJSUA_MED_TP_IDLE = pjsua_med_tp_stVar3;
        pjsua_med_tp_st pjsua_med_tp_stVar4 = new pjsua_med_tp_st("PJSUA_MED_TP_INIT");
        PJSUA_MED_TP_INIT = pjsua_med_tp_stVar4;
        pjsua_med_tp_st pjsua_med_tp_stVar5 = new pjsua_med_tp_st("PJSUA_MED_TP_RUNNING");
        PJSUA_MED_TP_RUNNING = pjsua_med_tp_stVar5;
        pjsua_med_tp_st pjsua_med_tp_stVar6 = new pjsua_med_tp_st("PJSUA_MED_TP_DISABLED");
        PJSUA_MED_TP_DISABLED = pjsua_med_tp_stVar6;
        swigValues = new pjsua_med_tp_st[]{pjsua_med_tp_stVar, pjsua_med_tp_stVar2, pjsua_med_tp_stVar3, pjsua_med_tp_stVar4, pjsua_med_tp_stVar5, pjsua_med_tp_stVar6};
        swigNext = 0;
    }

    private pjsua_med_tp_st(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjsua_med_tp_st swigToEnum(int i) {
        pjsua_med_tp_st[] pjsua_med_tp_stVarArr = swigValues;
        if (i < pjsua_med_tp_stVarArr.length && i >= 0) {
            pjsua_med_tp_st pjsua_med_tp_stVar = pjsua_med_tp_stVarArr[i];
            if (pjsua_med_tp_stVar.swigValue == i) {
                return pjsua_med_tp_stVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjsua_med_tp_st[] pjsua_med_tp_stVarArr2 = swigValues;
            if (i2 >= pjsua_med_tp_stVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjsua_med_tp_st.class, "No enum ", " with value ", i));
                return null;
            }
            pjsua_med_tp_st pjsua_med_tp_stVar2 = pjsua_med_tp_stVarArr2[i2];
            if (pjsua_med_tp_stVar2.swigValue == i) {
                return pjsua_med_tp_stVar2;
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

    private pjsua_med_tp_st(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjsua_med_tp_st(String str, pjsua_med_tp_st pjsua_med_tp_stVar) {
        this.swigName = str;
        int i = pjsua_med_tp_stVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
