package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "StoreBytesDataCreator")
/* loaded from: classes7.dex */
public class StoreBytesData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new zze();

    @SafeParcelable.Field(getter = "getBytes", id = 1)
    private final byte[] zza;

    @SafeParcelable.Field(defaultValue = "false", getter = "shouldBackupToCloud", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = BlockstoreClient.DEFAULT_BYTES_DATA_KEY, getter = "getKey", id = 3)
    private final String zzc;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private byte[] zza;
        private boolean zzb;
        private String zzc = BlockstoreClient.DEFAULT_BYTES_DATA_KEY;

        @NonNull
        public StoreBytesData build() {
            return new StoreBytesData(this.zza, this.zzb, this.zzc);
        }

        @NonNull
        public Builder setBytes(@NonNull byte[] bArr) {
            this.zza = bArr;
            return this;
        }

        @NonNull
        public Builder setKey(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "key cannot be null or empty");
            this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setShouldBackupToCloud(boolean z) {
            this.zzb = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public StoreBytesData(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) String str) {
        this.zza = bArr;
        this.zzb = z;
        this.zzc = str;
    }

    @NonNull
    public byte[] getBytes() {
        return this.zza;
    }

    @NonNull
    public String getKey() {
        return this.zzc;
    }

    public boolean shouldBackupToCloud() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, getBytes(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, shouldBackupToCloud());
        SafeParcelWriter.writeString(parcel, 3, getKey(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
