package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            Single$$ExternalSyntheticBUOutline0.m$1(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf.length() + 24, "null key in entry: null=", valueOf));
        } else {
            if (obj2 != null) {
                return;
            }
            String valueOf2 = String.valueOf(obj);
            Single$$ExternalSyntheticBUOutline0.m$1(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf2.length() + 26, "null value in entry: ", valueOf2, "=null"));
        }
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(CredentialConfig$$ExternalSyntheticOutline0.m(49, str));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkPositive(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(CredentialConfig$$ExternalSyntheticOutline0.m(38, str));
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkRemove(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(CredentialConfig$$ExternalSyntheticOutline0.m(40, str));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
