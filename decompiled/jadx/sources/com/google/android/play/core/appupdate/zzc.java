package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzc extends com.google.android.play.core.appupdate.internal.zzl {
    public zzc(Context context) {
        super(new com.google.android.play.core.appupdate.internal.zzm("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzl
    public final void zza(Context context, Intent intent) {
        boolean equals = context.getPackageName().equals(intent.getStringExtra("package.name"));
        com.google.android.play.core.appupdate.internal.zzm zzmVar = this.zza;
        if (!equals) {
            zzmVar.zza("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        zzmVar.zza("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.zza.zza("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState zzb = InstallState.zzb(intent, this.zza);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", zzb);
        zzd(zzb);
    }
}
