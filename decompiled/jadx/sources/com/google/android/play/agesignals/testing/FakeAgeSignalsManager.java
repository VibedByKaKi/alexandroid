package com.google.android.play.agesignals.testing;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.agesignals.AgeSignalsManager;
import com.google.android.play.agesignals.AgeSignalsRequest;
import com.google.android.play.agesignals.AgeSignalsResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class FakeAgeSignalsManager implements AgeSignalsManager {
    private AgeSignalsException zza;
    private AgeSignalsResult zzb;

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    @NonNull
    public Task<AgeSignalsResult> checkAgeSignals(@NonNull AgeSignalsRequest ageSignalsRequest) {
        AgeSignalsException ageSignalsException = this.zza;
        if (ageSignalsException != null) {
            return Tasks.forException(ageSignalsException);
        }
        AgeSignalsResult ageSignalsResult = this.zzb;
        return ageSignalsResult != null ? Tasks.forResult(ageSignalsResult) : Tasks.forException(new IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    public void setNextAgeSignalsException(@NonNull AgeSignalsException ageSignalsException) {
        this.zza = ageSignalsException;
        this.zzb = null;
    }

    public void setNextAgeSignalsResult(@NonNull AgeSignalsResult ageSignalsResult) {
        this.zza = null;
        this.zzb = ageSignalsResult;
    }
}
