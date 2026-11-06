package com.google.android.gms.home.matter.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.home.zzab;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "ResolveServiceRequestCreator")
/* loaded from: classes7.dex */
public final class ResolveServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ResolveServiceRequest> CREATOR = new zzb();

    @NonNull
    public static final String SERVICE_TYPE_COMMISSIONABLE = "_matterc._udp";

    @NonNull
    public static final String SERVICE_TYPE_OPERATIONAL = "_matter._tcp";

    @SafeParcelable.Field(getter = "getInstanceName", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getServiceType", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public ResolveServiceRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        str.getClass();
        this.zza = str;
        str2.getClass();
        this.zzb = str2;
    }

    @NonNull
    public static ResolveServiceRequest create(@NonNull String str, @NonNull String str2) {
        zzab.zze((str == null || str.isEmpty()) ? false : true, "instanceName is required.");
        zzab.zze((str2 == null || str2.isEmpty()) ? false : true, "serviceType is required.");
        return new ResolveServiceRequest(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveServiceRequest)) {
            return false;
        }
        ResolveServiceRequest resolveServiceRequest = (ResolveServiceRequest) obj;
        return this.zzb.equals(resolveServiceRequest.zzb) && this.zza.equals(resolveServiceRequest.zza);
    }

    @NonNull
    public String getInstanceName() {
        return this.zza;
    }

    @NonNull
    public String getServiceType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, this.zza);
    }

    @NonNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ResolveServiceRequest{instanceName='", this.zza, "', serviceType='", this.zzb, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getInstanceName(), false);
        SafeParcelWriter.writeString(parcel, 2, getServiceType(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
