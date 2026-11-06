package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzav {
    private final String zza;
    private final zzat zzb;
    private zzat zzc;

    public /* synthetic */ zzav(String str, zzau zzauVar) {
        zzat zzatVar = new zzat();
        this.zzb = zzatVar;
        this.zzc = zzatVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzat zzatVar = this.zzb.zzb;
        String str = "";
        while (zzatVar != null) {
            Object obj = zzatVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            zzatVar = zzatVar.zzb;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzav zza(@CheckForNull Object obj) {
        zzat zzatVar = new zzat();
        this.zzc.zzb = zzatVar;
        this.zzc = zzatVar;
        zzatVar.zza = obj;
        return this;
    }
}
