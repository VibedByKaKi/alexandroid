package com.google.android.gms.internal.common;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzr {
    public static void zza(boolean z) {
        if (z) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    public static int zzb(int i, int i2, String str) {
        String zza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zza = zzx.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("negative size: ", i2, new StringBuilder(String.valueOf(i2).length() + 15)));
                return 0;
            }
            zza = zzx.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzc(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        XML$$ExternalSyntheticBUOutline0.m(zze(i, i2, "index"));
        return 0;
    }

    public static void zzd(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zze(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zze(i2, i3, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private static String zze(int i, int i2, String str) {
        if (i < 0) {
            return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("negative size: ", i2, new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
