package com.google.android.gms.home.matter.commissioning;

import android.accounts.Account;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "CommissioningRequestCreator")
/* loaded from: classes7.dex */
public final class CommissioningRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CommissioningRequest> CREATOR = new zzd();

    @Nullable
    @SafeParcelable.Field(getter = "getAccount", id = 1)
    private final Account zza;

    @Nullable
    @SafeParcelable.Field(getter = "getStructureId", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getDeviceInfo", id = 3)
    private final DeviceInfo zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getOnboardingPayload", id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getDeviceNameHint", id = 5)
    private final String zze;

    @Nullable
    @SafeParcelable.Field(getter = "getCommissioningService", id = 6)
    private final ComponentName zzf;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Builder {
        @NonNull
        CommissioningRequest build();

        @NonNull
        Builder setCommissioningService(@Nullable ComponentName componentName);

        @NonNull
        Builder setDeviceInfo(@Nullable DeviceInfo deviceInfo);

        @NonNull
        Builder setDeviceNameHint(@Nullable String str);

        @NonNull
        Builder setOnboardingPayload(@Nullable String str);
    }

    @SafeParcelable.Constructor
    public CommissioningRequest(@Nullable @SafeParcelable.Param(id = 1) Account account, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) DeviceInfo deviceInfo, @Nullable @SafeParcelable.Param(id = 4) String str2, @Nullable @SafeParcelable.Param(id = 5) String str3, @Nullable @SafeParcelable.Param(id = 6) ComponentName componentName) {
        this.zza = account;
        this.zzb = str;
        this.zzc = deviceInfo;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = componentName;
    }

    @NonNull
    public static Builder builder() {
        return new zza();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissioningRequest)) {
            return false;
        }
        CommissioningRequest commissioningRequest = (CommissioningRequest) obj;
        return Objects.equal(this.zza, commissioningRequest.zza) && Objects.equal(this.zzb, commissioningRequest.zzb) && Objects.equal(this.zzc, commissioningRequest.zzc) && Objects.equal(this.zzd, commissioningRequest.zzd) && Objects.equal(this.zze, commissioningRequest.zze) && Objects.equal(this.zzf, commissioningRequest.zzf);
    }

    @Nullable
    public ComponentName getCommissioningService() {
        return this.zzf;
    }

    @Nullable
    public DeviceInfo getDeviceInfo() {
        return this.zzc;
    }

    @Nullable
    public String getDeviceNameHint() {
        return this.zze;
    }

    @Nullable
    public String getOnboardingPayload() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getDeviceInfo(), i, false);
        SafeParcelWriter.writeString(parcel, 4, getOnboardingPayload(), false);
        SafeParcelWriter.writeString(parcel, 5, getDeviceNameHint(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getCommissioningService(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
