package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzxg extends zzxn {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;

    public zzxg(float f, float f2, float f3, float f4, float f5) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
        this.zzd = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxn) {
            zzxn zzxnVar = (zzxn) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(zzxnVar.zzc()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzxnVar.zze()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(zzxnVar.zzb()) && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxnVar.zzd())) {
                int floatToIntBits = Float.floatToIntBits(0.0f);
                zzxnVar.zza();
                if (floatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = ((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc);
        return ((Float.floatToIntBits(this.zzd) ^ (floatToIntBits * 1000003)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictedArea{xMin=");
        sb.append(this.zza);
        sb.append(", yMin=");
        sb.append(this.zzb);
        sb.append(", xMax=");
        sb.append(this.zzc);
        sb.append(", yMax=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, ", confidenceScore=0.0}", this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zza() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zze() {
        return this.zzb;
    }
}
