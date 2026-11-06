package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzs implements ServiceConnection {
    final /* synthetic */ zzt zza;

    public /* synthetic */ zzs(zzt zztVar, zzr zzrVar) {
        this.zza = zztVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzi zziVar;
        zziVar = this.zza.zzc;
        zziVar.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzt zztVar = this.zza;
        zztVar.zzc().post(new zzp(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzi zziVar;
        zziVar = this.zza.zzc;
        zziVar.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzt zztVar = this.zza;
        zztVar.zzc().post(new zzq(this));
    }
}
