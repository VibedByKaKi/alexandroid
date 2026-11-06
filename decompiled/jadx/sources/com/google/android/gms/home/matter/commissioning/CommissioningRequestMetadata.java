package com.google.android.gms.home.matter.commissioning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.home.matter.common.DeviceDescriptor;
import com.google.android.gms.home.matter.common.NetworkLocation;
import java.util.Arrays;
import matter.onboardingpayload.OnboardingPayloadKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "CommissioningRequestMetadataCreator")
/* loaded from: classes7.dex */
public final class CommissioningRequestMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CommissioningRequestMetadata> CREATOR = new zze();

    @SafeParcelable.Field(getter = "getNetworkLocation", id = 1)
    private final NetworkLocation zza;

    @SafeParcelable.Field(getter = "getPasscode", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getDeviceDescriptor", id = 3)
    private final DeviceDescriptor zzc;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private NetworkLocation zza;
        private long zzb = 0;

        @Nullable
        private DeviceDescriptor zzc;

        @NonNull
        public CommissioningRequestMetadata build() {
            Preconditions.checkState(this.zza != null, "NetworkLocation was not set.");
            Preconditions.checkState(this.zzb != 0, "Passcode was not set.");
            Preconditions.checkState(this.zzc != null, "DeviceDescriptor was not set.");
            return new CommissioningRequestMetadata((NetworkLocation) Preconditions.checkNotNull(this.zza), ((Long) Preconditions.checkNotNull(Long.valueOf(this.zzb))).longValue(), (DeviceDescriptor) Preconditions.checkNotNull(this.zzc));
        }

        @Nullable
        public DeviceDescriptor getDeviceDescriptor() {
            return this.zzc;
        }

        @Nullable
        public NetworkLocation getNetworkLocation() {
            return this.zza;
        }

        public long getPasscode() {
            return this.zzb;
        }

        @NonNull
        public Builder setDeviceDescriptor(@NonNull DeviceDescriptor deviceDescriptor) {
            this.zzc = deviceDescriptor;
            return this;
        }

        @NonNull
        public Builder setNetworkLocation(@NonNull NetworkLocation networkLocation) {
            this.zza = networkLocation;
            return this;
        }

        @NonNull
        public Builder setPasscode(@IntRange(from = 1, to = 99999998) long j) {
            CommissioningRequestMetadata.zza(j);
            this.zzb = j;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CommissioningRequestMetadata(@SafeParcelable.Param(id = 1) NetworkLocation networkLocation, @IntRange(from = 1, to = 99999998) @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) DeviceDescriptor deviceDescriptor) {
        this.zza = (NetworkLocation) Preconditions.checkNotNull(networkLocation);
        zzb(j);
        this.zzb = j;
        this.zzc = (DeviceDescriptor) Preconditions.checkNotNull(deviceDescriptor);
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public static /* bridge */ /* synthetic */ long zza(long j) {
        zzb(j);
        return j;
    }

    private static long zzb(long j) {
        boolean z = false;
        if (j >= 1 && j <= OnboardingPayloadKt.kSetupPINCodeMaximumValue) {
            z = true;
        }
        Preconditions.checkArgument(z, "Invalid passcode %d", Long.valueOf(j));
        return j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissioningRequestMetadata)) {
            return false;
        }
        CommissioningRequestMetadata commissioningRequestMetadata = (CommissioningRequestMetadata) obj;
        return this.zza.equals(commissioningRequestMetadata.zza) && this.zzb == commissioningRequestMetadata.zzb && this.zzc.equals(commissioningRequestMetadata.zzc);
    }

    @NonNull
    public DeviceDescriptor getDeviceDescriptor() {
        return this.zzc;
    }

    @NonNull
    public NetworkLocation getNetworkLocation() {
        return this.zza;
    }

    @IntRange(from = 1, to = OnboardingPayloadKt.kSetupPINCodeMaximumValue)
    public long getPasscode() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Long.valueOf(this.zzb), this.zzc});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getNetworkLocation(), i, false);
        SafeParcelWriter.writeLong(parcel, 2, getPasscode());
        SafeParcelWriter.writeParcelable(parcel, 3, getDeviceDescriptor(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
