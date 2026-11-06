package com.google.android.play.agesignals;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.playcore_age_signals.zzo;
import com.google.android.gms.internal.playcore_age_signals.zzr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzg {
    private static final com.google.android.gms.internal.playcore_age_signals.zzd zzb = new com.google.android.gms.internal.playcore_age_signals.zzd("AgeSignalsService");

    @VisibleForTesting
    final zzo zza;
    private final Context zzc;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.play.agesignals.zzd] */
    public zzg(Context context) {
        this.zzc = context;
        if (zzr.zzb(context)) {
            this.zza = new zzo(context, zzb, "AgeSignalsService", zza.zza, new Object() { // from class: com.google.android.play.agesignals.zzd
            }, null);
        } else {
            this.zza = null;
        }
    }

    private static Task zzd(int i) {
        zzb.zza("onError(%d)", Integer.valueOf(i));
        return Tasks.forException(new AgeSignalsException(i));
    }

    public final Task zzb(AgeSignalsRequest ageSignalsRequest) {
        zzo zzoVar = this.zza;
        if (zzoVar == null) {
            return zzd(-2);
        }
        if (zzr.zza(this.zzc) < 82380000) {
            return zzd(-6);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzoVar.zzt(new zze(this, taskCompletionSource, taskCompletionSource, ageSignalsRequest), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
