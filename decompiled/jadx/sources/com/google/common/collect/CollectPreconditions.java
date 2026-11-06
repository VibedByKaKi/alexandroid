package com.google.common.collect;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
/* loaded from: classes8.dex */
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(DoubleList$$ExternalSyntheticOutline0.m(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$1(BitVector$$ExternalSyntheticOutline0.m("null value in entry: ", obj, "=null"));
        }
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j);
    }

    public static void checkPositive(int i, String str) {
        if (i > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m(i, str, " must be positive but was: "));
    }

    public static void checkRemove(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m(i, str, " cannot be negative but was: "));
        return 0;
    }
}
