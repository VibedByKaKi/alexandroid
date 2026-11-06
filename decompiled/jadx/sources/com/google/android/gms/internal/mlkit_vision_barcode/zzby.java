package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzby {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m(i, str, " cannot be negative but was: "));
        return 0;
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
