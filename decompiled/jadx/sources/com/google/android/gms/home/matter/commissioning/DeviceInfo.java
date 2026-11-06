package com.google.android.gms.home.matter.commissioning;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.home.matter.common.Discriminator;
import com.google.android.gms.home.matter.common.NetworkLocation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "DeviceInfoCreator", validate = true)
/* loaded from: classes7.dex */
public final class DeviceInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new zzj();

    @SafeParcelable.Field(getter = "getVendorId", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getProductId", id = 2)
    private final int zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getDiscriminator", id = 3)
    private final Discriminator zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getBluetoothAddress", id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getNetworkLocation", id = 5)
    private final NetworkLocation zze;

    @Nullable
    @SafeParcelable.Field(getter = "getHotspotSsid", id = 6)
    private final String zzf;

    @SafeParcelable.Constructor
    public DeviceInfo(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @Nullable @SafeParcelable.Param(id = 3) Discriminator discriminator, @Nullable @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) NetworkLocation networkLocation, @Nullable @SafeParcelable.Param(id = 6) String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = discriminator;
        this.zzd = str;
        this.zze = networkLocation;
        this.zzf = str2;
    }

    @NonNull
    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.zza == deviceInfo.zza && this.zzb == deviceInfo.zzb && Objects.equal(this.zzc, deviceInfo.zzc) && Objects.equal(this.zzd, deviceInfo.zzd) && Objects.equal(this.zze, deviceInfo.zze) && Objects.equal(this.zzf, deviceInfo.zzf);
    }

    @Nullable
    public Discriminator getDiscriminator() {
        return this.zzc;
    }

    public int getProductId() {
        return this.zzb;
    }

    public int getVendorId() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVendorId());
        SafeParcelWriter.writeInt(parcel, 2, getProductId());
        SafeParcelWriter.writeParcelable(parcel, 3, getDiscriminator(), i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zza() {
        String str = this.zzd;
        boolean z = true;
        if (str != null && !BluetoothAdapter.checkBluetoothAddress(str)) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid Bluetooth address %s", String.valueOf(str));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private Discriminator zza;
        private int zzb;
        private int zzc;

        private Builder() {
        }

        @NonNull
        public DeviceInfo build() {
            return new DeviceInfo(this.zzb, this.zzc, this.zza, null, null, null);
        }

        @NonNull
        public Builder setDiscriminator(@Nullable Discriminator discriminator) {
            this.zza = (Discriminator) Preconditions.checkNotNull(discriminator);
            return this;
        }

        @NonNull
        public Builder setProductId(int i) {
            this.zzc = i;
            return this;
        }

        @NonNull
        public Builder setVendorId(int i) {
            this.zzb = i;
            return this;
        }

        public /* synthetic */ Builder(zzi zziVar) {
        }
    }
}
