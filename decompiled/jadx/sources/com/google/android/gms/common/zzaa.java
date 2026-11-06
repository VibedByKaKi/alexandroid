package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzah;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzaa {

    @Nullable
    private String zza = null;
    private long zzb = -1;
    private zzah zzc = zzah.zzj();
    private zzah zzd = zzah.zzj();

    public final zzaa zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaa zzb(long j) {
        this.zzb = j;
        return this;
    }

    public final zzaa zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzah.zzp(list);
        return this;
    }

    public final zzaa zzd(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzah.zzp(list);
        return this;
    }

    public final zzab zze() {
        if (this.zza == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("packageName must be defined");
            return null;
        }
        if (this.zzb < 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("minimumStampedVersionNumber must be greater than or equal to 0");
            return null;
        }
        if (!this.zzc.isEmpty() || !this.zzd.isEmpty()) {
            return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        return null;
    }
}
