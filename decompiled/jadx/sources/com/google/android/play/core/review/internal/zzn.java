package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzn extends zzj {
    final /* synthetic */ zzt zza;

    public zzn(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        IInterface iInterface;
        zzi zziVar;
        Context context;
        ServiceConnection serviceConnection;
        zzt zztVar = this.zza;
        iInterface = zztVar.zzn;
        if (iInterface != null) {
            zziVar = zztVar.zzc;
            zziVar.zzd("Unbind from service.", new Object[0]);
            zzt zztVar2 = this.zza;
            context = zztVar2.zzb;
            serviceConnection = zztVar2.zzm;
            context.unbindService(serviceConnection);
            this.zza.zzh = false;
            this.zza.zzn = null;
            this.zza.zzm = null;
        }
        this.zza.zzt();
    }
}
