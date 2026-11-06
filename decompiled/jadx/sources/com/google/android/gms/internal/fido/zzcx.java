package com.google.android.gms.internal.fido;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzcx extends zzcs implements Serializable {
    final zzcs zza;

    public zzcx(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcx) {
            return this.zza.equals(((zzcx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return this.zza;
    }
}
