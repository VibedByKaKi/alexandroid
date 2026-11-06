package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes7.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();

    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2, type = "byte[]")
    private final zzgx zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3, type = "byte[]")
    private final zzgx zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAttestationObject", id = 4, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getTransports", id = 5)
    private final String[] zzd;

    @SafeParcelable.Constructor
    public AuthenticatorAttestationResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) String[] strArr) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = (zzgx) Preconditions.checkNotNull(zzl);
        this.zzb = (zzgx) Preconditions.checkNotNull(zzl2);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzl3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    @NonNull
    public static AuthenticatorAttestationResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Objects.equal(this.zza, authenticatorAttestationResponse.zza) && Objects.equal(this.zzb, authenticatorAttestationResponse.zzb) && Objects.equal(this.zzc, authenticatorAttestationResponse.zzc);
    }

    @NonNull
    public byte[] getAttestationObject() {
        return this.zzc.zzm();
    }

    public zzgx getAttestationObjectAsByteString() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] getClientDataJSON() {
        return this.zzb.zzm();
    }

    public zzgx getClientDataJSONAsByteString() {
        return this.zzb;
    }

    @NonNull
    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza.zzm();
    }

    public zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    @NonNull
    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.zza)), Integer.valueOf(Objects.hashCode(this.zzb)), Integer.valueOf(Objects.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toString() {
        zzbi zza = zzbj.zza(this);
        zzgf zzf = zzgf.zzf();
        byte[] keyHandle = getKeyHandle();
        zza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzf.zzg(keyHandle, 0, keyHandle.length));
        zzgf zzf2 = zzgf.zzf();
        byte[] clientDataJSON = getClientDataJSON();
        zza.zzb("clientDataJSON", zzf2.zzg(clientDataJSON, 0, clientDataJSON.length));
        zzgf zzf3 = zzgf.zzf();
        byte[] attestationObject = getAttestationObject();
        zza.zzb("attestationObject", zzf3.zzg(attestationObject, 0, attestationObject.length));
        zza.zzb("transports", Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1 A[Catch: JSONException -> 0x0244, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0244, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0018, B:8:0x001c, B:9:0x0029, B:10:0x0030, B:12:0x0035, B:14:0x0043, B:16:0x0050, B:17:0x0049, B:20:0x0053, B:22:0x005c, B:24:0x0064, B:26:0x0076, B:27:0x007e, B:29:0x0082, B:31:0x0094, B:33:0x00b2, B:34:0x00ca, B:39:0x00f0, B:45:0x01dd, B:47:0x01f1, B:50:0x010f, B:52:0x0121, B:57:0x0135, B:60:0x0157, B:62:0x016d, B:64:0x0173, B:65:0x018a, B:66:0x018f, B:67:0x0190, B:68:0x0195, B:73:0x01a0, B:75:0x01b0, B:77:0x01be, B:78:0x01d1, B:79:0x01d6, B:80:0x01d7, B:81:0x01dc, B:82:0x01fb, B:83:0x0200, B:85:0x0202, B:86:0x0209, B:87:0x020a, B:88:0x020f, B:91:0x0211, B:92:0x0218, B:93:0x0219, B:94:0x0220, B:96:0x0222, B:97:0x0229, B:98:0x022a, B:99:0x0231, B:101:0x0233, B:102:0x023a, B:105:0x023c, B:106:0x0243), top: B:2:0x0002, inners: #0, #1, #3, #4, #5 }] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject zza() {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.zza():org.json.JSONObject");
    }
}
