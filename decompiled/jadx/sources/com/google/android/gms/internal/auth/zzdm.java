package com.google.android.gms.internal.auth;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzdm implements zzdj {
    private static final zzdj zza = new zzdj() { // from class: com.google.android.gms.internal.auth.zzdl
        @Override // com.google.android.gms.internal.auth.zzdj
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzdj zzb;

    @CheckForNull
    private Object zzc;

    public zzdm(zzdj zzdjVar) {
        this.zzb = zzdjVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = a$$ExternalSyntheticOutline0.m("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return a$$ExternalSyntheticOutline0.m("Suppliers.memoize(", String.valueOf(obj), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        zzdj zzdjVar = this.zzb;
        zzdj zzdjVar2 = zza;
        if (zzdjVar != zzdjVar2) {
            synchronized (this) {
                try {
                    if (this.zzb != zzdjVar2) {
                        Object zza2 = this.zzb.zza();
                        this.zzc = zza2;
                        this.zzb = zzdjVar2;
                        return zza2;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
