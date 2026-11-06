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
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "FidoAppIdExtensionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes7.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new zzx();

    @NonNull
    @SafeParcelable.Field(getter = "getAppId", id = 2)
    private final String zza;

    @SafeParcelable.Constructor
    public FidoAppIdExtension(@NonNull @SafeParcelable.Param(id = 2) String str) {
        this.zza = (String) Preconditions.checkNotNull(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.zza.equals(((FidoAppIdExtension) obj).zza);
        }
        return false;
    }

    @NonNull
    public String getAppId() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @NonNull
    public final String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("FidoAppIdExtension{appid='"), this.zza, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
