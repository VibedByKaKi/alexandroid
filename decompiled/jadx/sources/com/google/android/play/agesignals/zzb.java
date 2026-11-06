package com.google.android.play.agesignals;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzb implements AgeSignalsManager {
    private final zzg zza;

    public zzb(zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    @NonNull
    public final Task<AgeSignalsResult> checkAgeSignals(AgeSignalsRequest ageSignalsRequest) {
        return this.zza.zzb(ageSignalsRequest);
    }
}
