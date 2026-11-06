package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "SimpleTransactionAuthorizationExtensionCreator")
/* loaded from: classes7.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();

    @Nullable
    @SafeParcelable.Field(getter = "getTxAuthSimple", id = 1)
    private final String zza;

    @SafeParcelable.Constructor
    public zzaw(@Nullable @SafeParcelable.Param(id = 1) String str) {
        this.zza = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzaw) {
            return Objects.equal(this.zza, ((zzaw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
