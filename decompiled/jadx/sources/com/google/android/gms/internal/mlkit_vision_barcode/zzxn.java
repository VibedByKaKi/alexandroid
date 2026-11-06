package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzxn {
    public static zzxn zzg(@NonNull Iterable iterable, int i, int i2, float f) {
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        int i4 = i;
        int i5 = i2;
        int i6 = 0;
        while (it2.hasNext()) {
            Point point = (Point) it2.next();
            i4 = Math.min(i4, point.x);
            i5 = Math.min(i5, point.y);
            i3 = Math.max(i3, point.x);
            i6 = Math.max(i6, point.y);
        }
        float f2 = i;
        float f3 = i2;
        return new zzxg((i4 + 0.0f) / f2, (i5 + 0.0f) / f3, (i3 + 0.0f) / f2, (i6 + 0.0f) / f3, 0.0f);
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public final float zzf() {
        if (!zzh()) {
            return 0.0f;
        }
        return (zzd() - zze()) * (zzb() - zzc());
    }

    public final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }
}
