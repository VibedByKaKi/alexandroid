package com.google.android.odml.image;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzb extends zzh {
    private Integer zza;
    private Integer zzb;

    @Override // com.google.android.odml.image.zzh
    public final zzh zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final zzh zzb(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final ImageProperties zzc() {
        Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new zzc(num.intValue(), this.zzb.intValue(), null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" imageFormat");
        }
        if (this.zzb == null) {
            sb.append(" storageType");
        }
        String valueOf = String.valueOf(sb);
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 28), "Missing required properties:", valueOf));
        return null;
    }
}
