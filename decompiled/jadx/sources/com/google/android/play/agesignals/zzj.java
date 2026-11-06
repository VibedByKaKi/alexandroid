package com.google.android.play.agesignals;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzj extends AgeSignalsResult {

    @Nullable
    private final Integer zza;

    @Nullable
    private final Integer zzb;

    @Nullable
    private final Integer zzc;

    @Nullable
    private final Date zzd;

    @Nullable
    private final String zze;

    public /* synthetic */ zzj(Integer num, Integer num2, Integer num3, Date date, String str, zzi zziVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = num3;
        this.zzd = date;
        this.zze = str;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    @Nullable
    public final Integer ageLower() {
        return this.zzb;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    @Nullable
    public final Integer ageUpper() {
        return this.zzc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AgeSignalsResult) {
            AgeSignalsResult ageSignalsResult = (AgeSignalsResult) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(ageSignalsResult.userStatus()) : ageSignalsResult.userStatus() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(ageSignalsResult.ageLower()) : ageSignalsResult.ageLower() == null) {
                    Integer num3 = this.zzc;
                    if (num3 != null ? num3.equals(ageSignalsResult.ageUpper()) : ageSignalsResult.ageUpper() == null) {
                        Date date = this.zzd;
                        if (date != null ? date.equals(ageSignalsResult.mostRecentApprovalDate()) : ageSignalsResult.mostRecentApprovalDate() == null) {
                            String str = this.zze;
                            if (str != null ? str.equals(ageSignalsResult.installId()) : ageSignalsResult.installId() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.zzb;
        int hashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = hashCode ^ 1000003;
        Integer num3 = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.zzd;
        int hashCode4 = (hashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.zze;
        return hashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    @Nullable
    public final String installId() {
        return this.zze;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    @Nullable
    public final Date mostRecentApprovalDate() {
        return this.zzd;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder("AgeSignalsResult{userStatus=");
        sb.append(this.zza);
        sb.append(", ageLower=");
        sb.append(this.zzb);
        sb.append(", ageUpper=");
        sb.append(this.zzc);
        sb.append(", mostRecentApprovalDate=");
        sb.append(valueOf);
        sb.append(", installId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.zze, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    @Nullable
    public final Integer userStatus() {
        return this.zza;
    }
}
