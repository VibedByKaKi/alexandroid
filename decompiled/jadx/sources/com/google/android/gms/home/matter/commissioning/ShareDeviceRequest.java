package com.google.android.gms.home.matter.commissioning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.home.matter.common.DeviceDescriptor;
import com.google.android.gms.home.matter.common.NetworkLocation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "ShareDeviceRequestCreator")
/* loaded from: classes7.dex */
public class ShareDeviceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ShareDeviceRequest> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getCommissioningWindow", id = 1)
    private final CommissioningWindow zza;

    @SafeParcelable.Field(getter = "getDeviceDescriptor", id = 2)
    private final DeviceDescriptor zzb;

    @SafeParcelable.Field(getter = "getDeviceName", id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getRoomName", id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getNetworkLocation", id = 5)
    private final NetworkLocation zze;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Builder {
        @NonNull
        ShareDeviceRequest build();

        @NonNull
        Builder setCommissioningWindow(@NonNull CommissioningWindow commissioningWindow);

        @NonNull
        Builder setDeviceDescriptor(@NonNull DeviceDescriptor deviceDescriptor);

        @NonNull
        Builder setDeviceName(@NonNull String str);

        @NonNull
        Builder setNetworkLocation(@Nullable NetworkLocation networkLocation);

        @NonNull
        Builder setRoomName(@Nullable String str);
    }

    @SafeParcelable.Constructor
    public ShareDeviceRequest(@SafeParcelable.Param(id = 1) CommissioningWindow commissioningWindow, @SafeParcelable.Param(id = 2) DeviceDescriptor deviceDescriptor, @SafeParcelable.Param(id = 3) String str, @Nullable @SafeParcelable.Param(id = 4) String str2, @Nullable @SafeParcelable.Param(id = 5) NetworkLocation networkLocation) {
        this.zza = (CommissioningWindow) Preconditions.checkNotNull(commissioningWindow);
        this.zzb = (DeviceDescriptor) Preconditions.checkNotNull(deviceDescriptor);
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = str2;
        this.zze = networkLocation;
    }

    @NonNull
    public static Builder builder() {
        return new zzb();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareDeviceRequest)) {
            return false;
        }
        ShareDeviceRequest shareDeviceRequest = (ShareDeviceRequest) obj;
        return Objects.equal(this.zza, shareDeviceRequest.zza) && Objects.equal(this.zzb, shareDeviceRequest.zzb) && Objects.equal(this.zzc, shareDeviceRequest.zzc) && Objects.equal(this.zzd, shareDeviceRequest.zzd) && Objects.equal(this.zze, shareDeviceRequest.zze);
    }

    @NonNull
    public CommissioningWindow getCommissioningWindow() {
        return this.zza;
    }

    @NonNull
    public DeviceDescriptor getDeviceDescriptor() {
        return this.zzb;
    }

    @NonNull
    public String getDeviceName() {
        return this.zzc;
    }

    @Nullable
    public NetworkLocation getNetworkLocation() {
        return this.zze;
    }

    @Nullable
    public String getRoomName() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getCommissioningWindow(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getDeviceDescriptor(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getDeviceName(), false);
        SafeParcelWriter.writeString(parcel, 4, getRoomName(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getNetworkLocation(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
