package com.google.android.play.agesignals;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class AgeSignalsResult {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Builder {
        @NonNull
        public abstract AgeSignalsResult build();

        @NonNull
        public abstract Builder setAgeLower(@Nullable Integer num);

        @NonNull
        public abstract Builder setAgeUpper(@Nullable Integer num);

        @NonNull
        public abstract Builder setInstallId(@Nullable String str);

        @NonNull
        public abstract Builder setMostRecentApprovalDate(@Nullable Date date);

        @NonNull
        public abstract Builder setUserStatus(@Nullable Integer num);
    }

    @NonNull
    public static Builder builder() {
        return new zzh();
    }

    @NonNull
    public static AgeSignalsResult zza(@NonNull Bundle bundle) {
        if (!bundle.containsKey("user.status")) {
            return builder().build();
        }
        Builder builder = builder();
        builder.setUserStatus(zzb(bundle, "user.status"));
        builder.setAgeLower(zzb(bundle, "age.range.lower"));
        builder.setAgeUpper(zzb(bundle, "age.range.upper"));
        builder.setMostRecentApprovalDate(bundle.containsKey("most.recent.approval.date") ? new Date(bundle.getLong("most.recent.approval.date")) : null);
        builder.setInstallId(bundle.containsKey("install.id") ? bundle.getString("install.id") : null);
        return builder.build();
    }

    @Nullable
    private static Integer zzb(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    @Nullable
    public abstract Integer ageLower();

    @Nullable
    public abstract Integer ageUpper();

    @Nullable
    public abstract String installId();

    @Nullable
    public abstract Date mostRecentApprovalDate();

    @Nullable
    public abstract Integer userStatus();
}
