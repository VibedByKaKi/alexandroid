package com.google.android.gms.internal.playcore_age_signals;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzm implements ServiceConnection {
    final /* synthetic */ zzo zza;

    public /* synthetic */ zzm(zzo zzoVar, zzn zznVar) {
        Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzd zzdVar;
        zzo zzoVar = this.zza;
        zzdVar = zzoVar.zzc;
        zzdVar.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzoVar.zzc().post(new zzk(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzd zzdVar;
        zzo zzoVar = this.zza;
        zzdVar = zzoVar.zzc;
        zzdVar.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzoVar.zzc().post(new zzl(this));
    }
}
