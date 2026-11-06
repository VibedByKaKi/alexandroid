package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes8.dex */
public abstract class InstallationTokenResult {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract InstallationTokenResult build();

        @NonNull
        public abstract Builder setToken(@NonNull String str);

        @NonNull
        public abstract Builder setTokenCreationTimestamp(long j);

        @NonNull
        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    @NonNull
    public abstract String getToken();

    @NonNull
    public abstract long getTokenCreationTimestamp();

    @NonNull
    public abstract long getTokenExpirationTimestamp();

    @NonNull
    public abstract Builder toBuilder();
}
