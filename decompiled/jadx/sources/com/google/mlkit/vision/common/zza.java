package com.google.mlkit.vision.common;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class zza extends PointF3D {
    private final float zza;
    private final float zzb;
    private final float zzc;

    public zza(float f, float f2, float f3) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PointF3D) {
            PointF3D pointF3D = (PointF3D) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(pointF3D.getZ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.zza;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.zzc;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.zzc) ^ ((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003);
    }

    public final String toString() {
        float f = this.zza;
        float f2 = this.zzb;
        float f3 = this.zzc;
        StringBuilder sb = new StringBuilder("PointF3D{x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, f3);
    }
}
