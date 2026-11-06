package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzt extends zzn {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzw zzb;

    public zzt(zzw zzwVar, IBinder iBinder) {
        this.zzb = zzwVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        List list;
        List list2;
        this.zzb.zza.zzn = zze.zzb(this.zza);
        zzx.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
