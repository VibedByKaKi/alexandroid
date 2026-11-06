package com.google.android.gms.internal.common;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                Single$$ExternalSyntheticBUOutline0.m$1(TableInfo$$ExternalSyntheticOutline0.m("at index ", i2, new StringBuilder(String.valueOf(i2).length() + 9)));
                return null;
            }
        }
        return objArr;
    }
}
