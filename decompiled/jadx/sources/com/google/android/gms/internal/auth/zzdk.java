package com.google.android.gms.internal.auth;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzdk implements Serializable, zzdj {
    final zzdj zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;

    public zzdk(zzdj zzdjVar) {
        this.zza = zzdjVar;
    }

    public final String toString() {
        return a$$ExternalSyntheticOutline0.m("Suppliers.memoize(", (this.zzb ? a$$ExternalSyntheticOutline0.m("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
