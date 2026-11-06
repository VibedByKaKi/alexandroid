package com.google.android.gms.internal.tflite;

import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzh implements InstallStatusListener {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ ModuleInstallClient zzb;

    public zzh(TaskCompletionSource taskCompletionSource, ModuleInstallClient moduleInstallClient) {
        this.zza = taskCompletionSource;
        this.zzb = moduleInstallClient;
    }

    @Override // com.google.android.gms.common.moduleinstall.InstallStatusListener
    public final void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        int installState = moduleInstallStatusUpdate.getInstallState();
        if (installState != 3) {
            if (installState == 4) {
                this.zza.trySetResult(Boolean.TRUE);
                this.zzb.unregisterListener(this);
                return;
            } else if (installState != 5) {
                return;
            }
        }
        this.zza.trySetResult(Boolean.FALSE);
        this.zzb.unregisterListener(this);
    }
}
