package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzw implements ServiceConnection {
    final /* synthetic */ zzx zza;

    public /* synthetic */ zzw(zzx zzxVar, zzv zzvVar) {
        this.zza = zzxVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzm zzmVar;
        zzmVar = this.zza.zzc;
        zzmVar.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzx zzxVar = this.zza;
        zzxVar.zzc().post(new zzt(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzm zzmVar;
        zzmVar = this.zza.zzc;
        zzmVar.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzx zzxVar = this.zza;
        zzxVar.zzc().post(new zzu(this));
    }
}
