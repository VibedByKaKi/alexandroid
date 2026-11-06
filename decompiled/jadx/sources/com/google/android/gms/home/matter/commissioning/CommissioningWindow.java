package com.google.android.gms.home.matter.commissioning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.home.matter.common.Discriminator;
import com.google.android.gms.internal.home.zzak;
import matter.onboardingpayload.OnboardingPayloadKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "CommissioningWindowCreator")
/* loaded from: classes7.dex */
public final class CommissioningWindow extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CommissioningWindow> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getDiscriminator", id = 1)
    private final Discriminator zza;

    @SafeParcelable.Field(getter = "getPasscode", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getWindowOpenMillis", id = 3)
    private final long zzc;

    @SafeParcelable.Field(getter = "getDurationSeconds", id = 4)
    private final long zzd;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private static final zzak zza = zzak.zzl(11111111L, 22222222L, 33333333L, 44444444L, 55555555L, 66666666L, 77777777L, 88888888L, 99999999L, 12345678L, 87654321L);

        @Nullable
        private Discriminator zzb;

        @Nullable
        private Long zzc;

        @Nullable
        private Long zzd;

        @Nullable
        private Long zze;

        @NonNull
        public CommissioningWindow build() {
            Preconditions.checkState(this.zzb != null, "A discriminator must be specified");
            Preconditions.checkState(this.zzc != null, "A passcode must be specified");
            Preconditions.checkState(this.zzd != null, "A window open timestamp must be specified");
            Preconditions.checkState(this.zze != null, "A duration must be specified");
            return new CommissioningWindow((Discriminator) Preconditions.checkNotNull(this.zzb), ((Long) Preconditions.checkNotNull(this.zzc)).longValue(), ((Long) Preconditions.checkNotNull(this.zzd)).longValue(), ((Long) Preconditions.checkNotNull(this.zze)).longValue());
        }

        @NonNull
        public Builder setDiscriminator(@NonNull Discriminator discriminator) {
            this.zzb = discriminator;
            return this;
        }

        @NonNull
        public Builder setDurationSeconds(@IntRange(from = 1) long j) {
            Preconditions.checkArgument(j >= 1, "Must provide a valid duration.");
            this.zze = Long.valueOf(j);
            return this;
        }

        @NonNull
        public Builder setPasscode(@IntRange(from = 0, to = 99999998) long j) {
            boolean z = false;
            if (j >= 0 && j <= OnboardingPayloadKt.kSetupPINCodeMaximumValue) {
                z = true;
            }
            Long valueOf = Long.valueOf(j);
            Preconditions.checkArgument(z, "Passcode %s out of range.", valueOf);
            Preconditions.checkArgument(!zza.contains(valueOf), "Passcode %s is insecure.", valueOf);
            this.zzc = valueOf;
            return this;
        }

        @NonNull
        public Builder setWindowOpenMillis(@IntRange(from = 1) long j) {
            Preconditions.checkArgument(j >= 1, "Must provide a valid timestamp.");
            this.zzd = Long.valueOf(j);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CommissioningWindow(@SafeParcelable.Param(id = 1) Discriminator discriminator, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) long j3) {
        this.zza = (Discriminator) Preconditions.checkNotNull(discriminator);
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissioningWindow)) {
            return false;
        }
        CommissioningWindow commissioningWindow = (CommissioningWindow) obj;
        return Objects.equal(this.zza, commissioningWindow.zza) && Objects.equal(Long.valueOf(this.zzb), Long.valueOf(commissioningWindow.zzb)) && Objects.equal(Long.valueOf(this.zzc), Long.valueOf(commissioningWindow.zzc)) && Objects.equal(Long.valueOf(this.zzd), Long.valueOf(commissioningWindow.zzd));
    }

    @NonNull
    public Discriminator getDiscriminator() {
        return this.zza;
    }

    public long getDurationSeconds() {
        return this.zzd;
    }

    @IntRange(from = 0, to = OnboardingPayloadKt.kSetupPINCodeMaximumValue)
    public long getPasscode() {
        return this.zzb;
    }

    public long getWindowOpenMillis() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb), Long.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getDiscriminator(), i, false);
        SafeParcelWriter.writeLong(parcel, 2, getPasscode());
        SafeParcelWriter.writeLong(parcel, 3, getWindowOpenMillis());
        SafeParcelWriter.writeLong(parcel, 4, getDurationSeconds());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
