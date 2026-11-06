package org.pjsip.pjsua2;

import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class pjrpid_activity {
    public static final pjrpid_activity PJRPID_ACTIVITY_AWAY;
    public static final pjrpid_activity PJRPID_ACTIVITY_BUSY;
    public static final pjrpid_activity PJRPID_ACTIVITY_UNKNOWN;
    private static int swigNext;
    private static pjrpid_activity[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        pjrpid_activity pjrpid_activityVar = new pjrpid_activity("PJRPID_ACTIVITY_UNKNOWN");
        PJRPID_ACTIVITY_UNKNOWN = pjrpid_activityVar;
        pjrpid_activity pjrpid_activityVar2 = new pjrpid_activity("PJRPID_ACTIVITY_AWAY");
        PJRPID_ACTIVITY_AWAY = pjrpid_activityVar2;
        pjrpid_activity pjrpid_activityVar3 = new pjrpid_activity("PJRPID_ACTIVITY_BUSY");
        PJRPID_ACTIVITY_BUSY = pjrpid_activityVar3;
        swigValues = new pjrpid_activity[]{pjrpid_activityVar, pjrpid_activityVar2, pjrpid_activityVar3};
        swigNext = 0;
    }

    private pjrpid_activity(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pjrpid_activity swigToEnum(int i) {
        pjrpid_activity[] pjrpid_activityVarArr = swigValues;
        if (i < pjrpid_activityVarArr.length && i >= 0) {
            pjrpid_activity pjrpid_activityVar = pjrpid_activityVarArr[i];
            if (pjrpid_activityVar.swigValue == i) {
                return pjrpid_activityVar;
            }
        }
        int i2 = 0;
        while (true) {
            pjrpid_activity[] pjrpid_activityVarArr2 = swigValues;
            if (i2 >= pjrpid_activityVarArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(pjrpid_activity.class, "No enum ", " with value ", i));
                return null;
            }
            pjrpid_activity pjrpid_activityVar2 = pjrpid_activityVarArr2[i2];
            if (pjrpid_activityVar2.swigValue == i) {
                return pjrpid_activityVar2;
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

    private pjrpid_activity(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pjrpid_activity(String str, pjrpid_activity pjrpid_activityVar) {
        this.swigName = str;
        int i = pjrpid_activityVar.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
