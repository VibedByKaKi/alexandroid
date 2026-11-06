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
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes7.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzau();

    @NonNull
    @SafeParcelable.Field(getter = "getId", id = 2, type = "byte[]")
    private final zzgx zza;

    @NonNull
    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getIcon", id = 4)
    private final String zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final String zzd;

    public PublicKeyCredentialUserEntity(zzgx zzgxVar, String str, @Nullable String str2, String str3) {
        this.zza = (zzgx) Preconditions.checkNotNull(zzgxVar);
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = str2;
        this.zzd = (String) Preconditions.checkNotNull(str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Objects.equal(this.zza, publicKeyCredentialUserEntity.zza) && Objects.equal(this.zzb, publicKeyCredentialUserEntity.zzb) && Objects.equal(this.zzc, publicKeyCredentialUserEntity.zzc) && Objects.equal(this.zzd, publicKeyCredentialUserEntity.zzd);
    }

    @NonNull
    public String getDisplayName() {
        return this.zzd;
    }

    @Nullable
    public String getIcon() {
        return this.zzc;
    }

    @NonNull
    public byte[] getId() {
        return this.zza.zzm();
    }

    public zzgx getIdAsByteString() {
        return this.zza;
    }

    @NonNull
    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @NonNull
    public final String toString() {
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("PublicKeyCredentialUserEntity{\n id=", Base64Utils.encodeUrlSafeNoPadding(this.zza.zzm()), ", \n name='");
        m2m.append(this.zzb);
        m2m.append("', \n icon='");
        m2m.append(this.zzc);
        m2m.append("', \n displayName='");
        return a$$ExternalSyntheticOutline0.m(m2m, this.zzd, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicKeyCredentialUserEntity(@androidx.annotation.NonNull @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r3, @androidx.annotation.NonNull @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r4, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r5, @androidx.annotation.NonNull @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r6) {
        /*
            r2 = this;
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r3 = (byte[]) r3
            com.google.android.gms.internal.fido.zzgx r0 = com.google.android.gms.internal.fido.zzgx.zzb
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.fido.zzgx r3 = com.google.android.gms.internal.fido.zzgx.zzl(r3, r1, r0)
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.<init>(byte[], java.lang.String, java.lang.String, java.lang.String):void");
    }
}
