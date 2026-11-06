package com.google.android.gms.home.matter.commissioning;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.home.matter.common.DeviceDescriptor;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "CommissioningResultCreator")
@SafeParcelable.Reserved({2})
/* loaded from: classes7.dex */
public final class CommissioningResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CommissioningResult> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getCommissionedDeviceDescriptor", id = 1)
    private final DeviceDescriptor zza;

    @Nullable
    @SafeParcelable.Field(getter = "getRoom", id = 3)
    private final Room zzb;

    @SafeParcelable.Field(getter = "getDeviceName", id = 4)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getToken", id = 5)
    private final String zzd;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private DeviceDescriptor zza;

        @Nullable
        private Room zzb;

        @Nullable
        private String zzc;

        @Nullable
        private String zzd;

        @NonNull
        public CommissioningResult build() {
            Preconditions.checkState(this.zza != null, "No DeviceDescriptor set.");
            Preconditions.checkState(this.zzc != null, "No device name set.");
            return new CommissioningResult((DeviceDescriptor) Preconditions.checkNotNull(this.zza), this.zzb, (String) Preconditions.checkNotNull(this.zzc), this.zzd);
        }

        @Nullable
        public DeviceDescriptor getCommissionedDeviceDescriptor() {
            return this.zza;
        }

        @Nullable
        public String getDeviceName() {
            return this.zzc;
        }

        @Nullable
        @Deprecated
        public Room getRoom() {
            return this.zzb;
        }

        @Nullable
        public String getToken() {
            return this.zzd;
        }

        @NonNull
        public Builder setCommissionedDeviceDescriptor(@NonNull DeviceDescriptor deviceDescriptor) {
            this.zza = deviceDescriptor;
            return this;
        }

        @NonNull
        public Builder setDeviceName(@NonNull String str) {
            this.zzc = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setRoom(@Nullable Room room) {
            this.zzb = room;
            return this;
        }

        @NonNull
        public Builder setToken(@Nullable String str) {
            this.zzd = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CommissioningResult(@SafeParcelable.Param(id = 1) DeviceDescriptor deviceDescriptor, @Nullable @SafeParcelable.Param(id = 3) Room room, @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) String str2) {
        this.zza = (DeviceDescriptor) Preconditions.checkNotNull(deviceDescriptor);
        this.zzb = room;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = str2;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static CommissioningResult fromIntentSenderResult(int i, @Nullable Intent intent) throws ApiException {
        if (i == -1) {
            CommissioningResult commissioningResult = intent != null ? (CommissioningResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.home.matter.commissioning.EXTRA_COMMISSIONING_RESULT", CREATOR) : null;
            if (commissioningResult != null) {
                return commissioningResult;
            }
            throw new ApiException(new Status(8, "IntentSender result did not contain the expected data. This should only be called in response to an IntentSender result for the CommissioningClient.commissionDevice() API."));
        }
        Status status = intent != null ? (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.home.matter.commissioning.EXTRA_COMMISSIONING_ERROR_STATUS", Status.CREATOR) : null;
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        throw new ApiException(status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissioningResult)) {
            return false;
        }
        CommissioningResult commissioningResult = (CommissioningResult) obj;
        return this.zza.equals(commissioningResult.zza) && zzf.zza(this.zzb, commissioningResult.zzb) && this.zzc.equals(commissioningResult.zzc) && zzf.zza(this.zzd, commissioningResult.zzd);
    }

    @NonNull
    public DeviceDescriptor getCommissionedDeviceDescriptor() {
        return this.zza;
    }

    @NonNull
    public String getDeviceName() {
        return this.zzc;
    }

    @Nullable
    @Deprecated
    public Room getRoom() {
        return this.zzb;
    }

    @Nullable
    public String getToken() {
        return this.zzd;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getCommissionedDeviceDescriptor(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getRoom(), i, false);
        SafeParcelWriter.writeString(parcel, 4, getDeviceName(), false);
        SafeParcelWriter.writeString(parcel, 5, getToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
