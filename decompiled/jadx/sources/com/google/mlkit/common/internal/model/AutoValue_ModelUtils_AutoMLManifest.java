package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.internal.model.ModelUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AutoValue_ModelUtils_AutoMLManifest extends ModelUtils.AutoMLManifest {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public AutoValue_ModelUtils_AutoMLManifest(String str, String str2, String str3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null modelType");
            throw null;
        }
        this.zza = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null modelFile");
            throw null;
        }
        this.zzb = str2;
        if (str3 != null) {
            this.zzc = str3;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null labelsFile");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.AutoMLManifest) {
            ModelUtils.AutoMLManifest autoMLManifest = (ModelUtils.AutoMLManifest) obj;
            if (this.zza.equals(autoMLManifest.getModelType()) && this.zzb.equals(autoMLManifest.getModelFile()) && this.zzc.equals(autoMLManifest.getLabelsFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public String getLabelsFile() {
        return this.zzc;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public String getModelFile() {
        return this.zzb;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public String getModelType() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        return this.zzc.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoMLManifest{modelType=");
        sb.append(this.zza);
        sb.append(", modelFile=");
        sb.append(this.zzb);
        sb.append(", labelsFile=");
        return a$$ExternalSyntheticOutline0.m(sb, this.zzc, StringSubstitutor.DEFAULT_VAR_END);
    }
}
