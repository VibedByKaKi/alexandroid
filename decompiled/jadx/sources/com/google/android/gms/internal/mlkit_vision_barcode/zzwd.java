package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzwd extends zzwh {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzwd(String str, boolean z, int i, zzwc zzwcVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzwh) {
            zzwh zzwhVar = (zzwh) obj;
            if (this.zza.equals(zzwhVar.zzb()) && this.zzb == zzwhVar.zzc() && this.zzc == zzwhVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        return this.zzc ^ (((hashCode * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.zza);
        sb.append(", enableFirelog=");
        sb.append(this.zzb);
        sb.append(", firelogEventType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.zzc, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final boolean zzc() {
        return this.zzb;
    }
}
