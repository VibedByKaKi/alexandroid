package com.google.android.gms.home.matter.common;

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
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "DeviceDescriptorCreator")
/* loaded from: classes7.dex */
public final class DeviceDescriptor extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceDescriptor> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getVendorId", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getProductId", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDeviceType", id = 3)
    private final int zzc;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private int zza;
        private int zzb;
        private int zzc;

        @NonNull
        public DeviceDescriptor build() {
            DeviceDescriptor.zzd(this.zza, this.zzb);
            return new DeviceDescriptor(this.zza, this.zzb, this.zzc);
        }

        @NonNull
        @Deprecated
        public Builder setDeviceType(int i) {
            this.zzc = i;
            return this;
        }

        @NonNull
        public Builder setProductId(int i) {
            this.zzb = i;
            return this;
        }

        @NonNull
        public Builder setVendorId(@IntRange(from = 0, to = 65535) int i) {
            DeviceDescriptor.zzc(i);
            this.zza = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DeviceDescriptor(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        zzd(i, i2);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(int i) {
        boolean z = false;
        if (i >= 0 && i <= 65535) {
            z = true;
        }
        Preconditions.checkArgument(z, "Vendor ID is not in valid range, found 0x%X", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(int i, int i2) {
        zzc(i);
        boolean z = true;
        if (i2 != 0 && i <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "A vendor ID must be specified when a product ID is specified.");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceDescriptor)) {
            return false;
        }
        DeviceDescriptor deviceDescriptor = (DeviceDescriptor) obj;
        return this.zza == deviceDescriptor.zza && this.zzb == deviceDescriptor.zzb && this.zzc == deviceDescriptor.zzc;
    }

    @Deprecated
    public int getDeviceType() {
        return this.zzc;
    }

    public int getProductId() {
        return this.zzb;
    }

    @IntRange(from = 0, to = WebSocketProtocol.PAYLOAD_SHORT_MAX)
    public int getVendorId() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @NonNull
    public String toString() {
        return String.format(Locale.ROOT, "DeviceDescriptor(VID=0x%04X, PID=0x%04X)", Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVendorId());
        SafeParcelWriter.writeInt(parcel, 2, getProductId());
        SafeParcelWriter.writeInt(parcel, 3, getDeviceType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
