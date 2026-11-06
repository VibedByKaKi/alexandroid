package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
/* loaded from: classes7.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.Field(getter = "getVersion", id = 1)
    private final long zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientEid", id = 2, type = "byte[]")
    private final zzgx zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorEid", id = 3, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getSessionPreKey", id = 4, type = "byte[]")
    private final zzgx zzd;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 1) long j, @NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = j;
        this.zzb = (zzgx) Preconditions.checkNotNull(zzl);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzl2);
        this.zzd = (zzgx) Preconditions.checkNotNull(zzl3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza == zzqVar.zza && Objects.equal(this.zzb, zzqVar.zzb) && Objects.equal(this.zzc, zzqVar.zzc) && Objects.equal(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd.zzm(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
