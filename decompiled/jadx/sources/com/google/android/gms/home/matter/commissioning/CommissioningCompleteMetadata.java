package com.google.android.gms.home.matter.commissioning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.home.zzaj;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "CommissioningCompleteMetadataCreator")
/* loaded from: classes7.dex */
public final class CommissioningCompleteMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CommissioningCompleteMetadata> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getRooms", id = 1)
    private final List zza;

    @Nullable
    @SafeParcelable.Field(getter = "getDeviceNameHint", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getToken", id = 3)
    private final String zzc;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private List zza = zzaj.zzm();

        @Nullable
        private String zzb;

        @Nullable
        private String zzc;

        @NonNull
        public CommissioningCompleteMetadata build() {
            return new CommissioningCompleteMetadata(this.zza, this.zzb, this.zzc);
        }

        @Nullable
        public String getDeviceNameHint() {
            return this.zzb;
        }

        @NonNull
        @Deprecated
        public List<Room> getRooms() {
            return this.zza;
        }

        @Nullable
        public String getToken() {
            return this.zzc;
        }

        @NonNull
        public Builder setDeviceNameHint(@Nullable String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setRooms(@NonNull List<Room> list) {
            list.getClass();
            this.zza = list;
            return this;
        }

        @NonNull
        public Builder setToken(@Nullable String str) {
            this.zzc = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CommissioningCompleteMetadata(@SafeParcelable.Param(id = 1) List list, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2) {
        this.zza = zzaj.zzl(list);
        this.zzb = str;
        this.zzc = str2;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissioningCompleteMetadata)) {
            return false;
        }
        CommissioningCompleteMetadata commissioningCompleteMetadata = (CommissioningCompleteMetadata) obj;
        return this.zza.equals(commissioningCompleteMetadata.zza) && Objects.equal(this.zzb, commissioningCompleteMetadata.zzb) && Objects.equal(this.zzc, commissioningCompleteMetadata.zzc);
    }

    @Nullable
    public String getDeviceNameHint() {
        return this.zzb;
    }

    @NonNull
    @Deprecated
    public List<Room> getRooms() {
        return this.zza;
    }

    @Nullable
    public String getToken() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getRooms(), false);
        SafeParcelWriter.writeString(parcel, 2, getDeviceNameHint(), false);
        SafeParcelWriter.writeString(parcel, 3, getToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
