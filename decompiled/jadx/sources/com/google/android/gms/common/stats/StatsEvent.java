package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.internal.util.DeviceDatabaseUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
@Deprecated
/* loaded from: classes7.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @KeepForSdk
    public interface Types {

        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;

        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    @NonNull
    public final String toString() {
        long zza = zza();
        int zzb = zzb();
        String zzc = zzc();
        int length = String.valueOf(zza).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(zzb).length() + 3 + zzc.length());
        sb.append(zza);
        sb.append(DeviceDatabaseUtils.DELIMITER);
        sb.append(zzb);
        return a$$ExternalSyntheticOutline0.m(sb, "\t-1", zzc);
    }

    public abstract long zza();

    public abstract int zzb();

    @NonNull
    public abstract String zzc();
}
