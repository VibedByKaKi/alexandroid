package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzdp extends zzcu {
    final transient Object[] zza;

    private zzdp(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zza = objArr;
    }

    public static zzdp zzg(int i, Object[] objArr, zzct zzctVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzby.zzb(obj, obj2);
        return new zzdp(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
        L3:
            r2 = r0
            goto L19
        L5:
            java.lang.Object[] r2 = r2.zza
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L3
            r3 = 1
            r2 = r2[r3]
            java.util.Objects.requireNonNull(r2)
        L19:
            if (r2 != 0) goto L1c
            return r0
        L1c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzdp.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    public final zzcn zza() {
        return new zzdo(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    public final zzcv zzd() {
        return new zzdm(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    public final zzcv zze() {
        return new zzdn(this, new zzdo(this.zza, 0, 1));
    }
}
