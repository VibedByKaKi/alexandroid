package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zza implements Parcelable.Creator {
    private static final zza zzb = new zza(new zzb());
    private final Parcelable.Creator zza;

    private zza(Parcelable.Creator creator) {
        this.zza = creator;
    }

    public static zza zza() {
        return zzb;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return zzb.zza(parcel);
        }
        parcel.setDataPosition(dataPosition - 4);
        return ApiMetadata.getEmptyInstance();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}
