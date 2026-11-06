package com.google.android.play.agesignals;

import androidx.annotation.Nullable;
import com.google.android.play.agesignals.AgeSignalsResult;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzh extends AgeSignalsResult.Builder {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private Date zzd;
    private String zze;

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult build() {
        return new zzj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setAgeLower(@Nullable Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setAgeUpper(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setInstallId(@Nullable String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setMostRecentApprovalDate(@Nullable Date date) {
        this.zzd = date;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final AgeSignalsResult.Builder setUserStatus(@Nullable Integer num) {
        this.zza = num;
        return this;
    }
}
