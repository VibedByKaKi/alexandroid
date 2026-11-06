package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzq {
    private final String zza;
    private final zzo zzb;
    private zzo zzc;

    public /* synthetic */ zzq(String str, zzp zzpVar) {
        zzo zzoVar = new zzo();
        this.zzb = zzoVar;
        this.zzc = zzoVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzo zzoVar = this.zzb.zzc;
        String str = "";
        while (zzoVar != null) {
            Object obj = zzoVar.zzb;
            sb.append(str);
            String str2 = zzoVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            zzoVar = zzoVar.zzc;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzq zza(String str, @CheckForNull Object obj) {
        zzo zzoVar = new zzo();
        this.zzc.zzc = zzoVar;
        this.zzc = zzoVar;
        zzoVar.zzb = obj;
        zzoVar.zza = str;
        return this;
    }

    public final zzq zzb(String str, boolean z) {
        String valueOf = String.valueOf(z);
        zzn zznVar = new zzn(null);
        this.zzc.zzc = zznVar;
        this.zzc = zznVar;
        zznVar.zzb = valueOf;
        zznVar.zza = "isManifestFile";
        return this;
    }
}
