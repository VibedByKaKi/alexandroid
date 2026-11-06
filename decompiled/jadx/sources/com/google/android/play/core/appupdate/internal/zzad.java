package com.google.android.play.core.appupdate.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzad implements zzaf {
    private static final Object zza = new Object();
    private volatile zzaf zzb;
    private volatile Object zzc = zza;

    private zzad(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public static zzaf zzb(zzaf zzafVar) {
        zzafVar.getClass();
        return zzafVar instanceof zzad ? zzafVar : new zzad(zzafVar);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        Object obj;
        Object obj2 = this.zzc;
        Object obj3 = zza;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.zzc;
                if (obj == obj3) {
                    obj = this.zzb.zza();
                    Object obj4 = this.zzc;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
