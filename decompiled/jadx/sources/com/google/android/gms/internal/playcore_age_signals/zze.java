package com.google.android.gms.internal.playcore_age_signals;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zze implements Runnable {

    @Nullable
    private final TaskCompletionSource zza;

    public zze() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzb();
        } catch (Exception e) {
            zza(e);
        }
    }

    public void zza(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void zzb();

    @Nullable
    public final TaskCompletionSource zzc() {
        return this.zza;
    }

    public zze(@Nullable TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
