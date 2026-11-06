package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.internal.model.ModelUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AutoValue_ModelUtils_ModelLoggingInfo extends ModelUtils.ModelLoggingInfo {
    private final long zza;
    private final String zzb;
    private final boolean zzc;

    public AutoValue_ModelUtils_ModelLoggingInfo(long j, String str, boolean z) {
        this.zza = j;
        this.zzb = str;
        this.zzc = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.ModelLoggingInfo) {
            ModelUtils.ModelLoggingInfo modelLoggingInfo = (ModelUtils.ModelLoggingInfo) obj;
            if (this.zza == modelLoggingInfo.getSize() && this.zzb.equals(modelLoggingInfo.getHash()) && this.zzc == modelLoggingInfo.isManifestModel()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @KeepForSdk
    public String getHash() {
        return this.zzb;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @KeepForSdk
    public long getSize() {
        return this.zza;
    }

    public final int hashCode() {
        long j = this.zza;
        return (true != this.zzc ? 1237 : 1231) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003);
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @KeepForSdk
    public boolean isManifestModel() {
        return this.zzc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModelLoggingInfo{size=");
        sb.append(this.zza);
        sb.append(", hash=");
        sb.append(this.zzb);
        sb.append(", manifestModel=");
        return a$$ExternalSyntheticOutline0.m(sb, this.zzc, StringSubstitutor.DEFAULT_VAR_END);
    }
}
