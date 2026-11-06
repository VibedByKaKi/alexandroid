package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "GetInternalNativeInitializationHandleParamsCreator")
/* loaded from: classes7.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getCustomerInfo", id = 1)
    private final CustomerInfo zza;

    @SafeParcelable.Field(defaultValue = "false", getter = "loadGpuDelegate", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "loadTpuDelegate", id = 3)
    private final boolean zzc;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) CustomerInfo customerInfo, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2) {
        this.zza = customerInfo;
        this.zzb = z;
        this.zzc = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CustomerInfo customerInfo = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, customerInfo, i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
