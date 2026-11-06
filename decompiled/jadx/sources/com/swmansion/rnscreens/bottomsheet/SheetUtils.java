package com.swmansion.rnscreens.bottomsheet;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetUtils;", "", "<init>", "()V", "isStateStable", "", "state", "", "sheetStateFromDetentIndex", "index", "detentCount", "detentIndexFromSheetState", "isStateLessEqualThan", "otherState", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SheetUtils {

    @NotNull
    public static final SheetUtils INSTANCE = new SheetUtils();

    private SheetUtils() {
    }

    public final int detentIndexFromSheetState(int state, int detentCount) {
        if (detentCount == 1) {
            if (state == 3) {
                return 0;
            }
            if (state == 5) {
                return -1;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid state ", state, " for detentCount ", detentCount));
            return 0;
        }
        if (detentCount == 2) {
            if (state == 3) {
                return 1;
            }
            if (state == 4) {
                return 0;
            }
            if (state == 5) {
                return -1;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid state ", state, " for detentCount ", detentCount));
            return 0;
        }
        if (detentCount != 3) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid state ", state, " for detentCount ", detentCount));
            return 0;
        }
        if (state == 3) {
            return 2;
        }
        if (state == 4) {
            return 0;
        }
        if (state == 5) {
            return -1;
        }
        if (state == 6) {
            return 1;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid state ", state, " for detentCount ", detentCount));
        return 0;
    }

    public final boolean isStateLessEqualThan(int state, int otherState) {
        if (state == otherState) {
            return true;
        }
        return (state == 6 || otherState == 6) ? state == 6 ? otherState == 3 : state == 4 && otherState != 5 : state > otherState;
    }

    public final boolean isStateStable(int state) {
        return state == 3 || state == 4 || state == 5 || state == 6;
    }

    public final int sheetStateFromDetentIndex(int index, int detentCount) {
        if (detentCount == 1) {
            if (index == -1) {
                return 5;
            }
            if (index == 0) {
                return 3;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid detentCount/index combination ", detentCount, " / ", index));
            return 0;
        }
        if (detentCount == 2) {
            if (index == -1) {
                return 5;
            }
            if (index == 0) {
                return 4;
            }
            if (index == 1) {
                return 3;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid detentCount/index combination ", detentCount, " / ", index));
            return 0;
        }
        if (detentCount != 3) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid detentCount/index combination ", detentCount, " / ", index));
            return 0;
        }
        if (index == -1) {
            return 5;
        }
        if (index == 0) {
            return 4;
        }
        if (index == 1) {
            return 6;
        }
        if (index == 2) {
            return 3;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("[RNScreens] Invalid detentCount/index combination ", detentCount, " / ", index));
        return 0;
    }
}
