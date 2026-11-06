package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class zzm extends zzj {
    private static final WeakReference zzb = new WeakReference(null);
    private WeakReference zza;

    public zzm(byte[] bArr) {
        super(bArr);
        this.zza = zzb;
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzc() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.zza.get();
                if (bArr == null) {
                    bArr = zzb();
                    this.zza = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }
}
