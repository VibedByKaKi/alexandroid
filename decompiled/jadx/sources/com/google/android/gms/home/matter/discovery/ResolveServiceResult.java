package com.google.android.gms.home.matter.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "ResolveServiceResultCreator")
/* loaded from: classes7.dex */
public final class ResolveServiceResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ResolveServiceResult> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getServiceInfo", id = 1)
    private final DnsSdServiceInfo zza;

    @SafeParcelable.Constructor
    public ResolveServiceResult(@SafeParcelable.Param(id = 1) DnsSdServiceInfo dnsSdServiceInfo) {
        dnsSdServiceInfo.getClass();
        this.zza = dnsSdServiceInfo;
    }

    @NonNull
    public static ResolveServiceResult create(@NonNull DnsSdServiceInfo dnsSdServiceInfo) {
        return new ResolveServiceResult(dnsSdServiceInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResolveServiceResult) {
            return this.zza.equals(((ResolveServiceResult) obj).zza);
        }
        return false;
    }

    @NonNull
    public DnsSdServiceInfo getServiceInfo() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @NonNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ResolveServiceResult{serviceInfo=", String.valueOf(this.zza), StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getServiceInfo(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
