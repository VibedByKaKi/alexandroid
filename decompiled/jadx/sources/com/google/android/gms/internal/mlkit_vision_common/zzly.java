package com.google.android.gms.internal.mlkit_vision_common;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzly extends zzmd {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zza(boolean z) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zzb(int i) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzmd zzc(String str) {
        this.zza = "vision-common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzme zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzma(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" firelogEventType");
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
