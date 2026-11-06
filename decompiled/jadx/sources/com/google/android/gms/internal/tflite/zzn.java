package com.google.android.gms.internal.tflite;

import android.content.Context;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzn extends zzp {
    private final Context zza;

    @Nullable
    private final zzt zzb;

    public zzn(Context context, @Nullable zzt zztVar) {
        this.zza = context;
        this.zzb = zztVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            zzp zzpVar = (zzp) obj;
            if (this.zza.equals(zzpVar.zza()) && this.zzb.equals(zzpVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        return this.zzb.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 45 + obj2.length() + 1);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", obj2);
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.tflite.zzp
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.tflite.zzp
    @Nullable
    public final zzt zzb() {
        return this.zzb;
    }
}
