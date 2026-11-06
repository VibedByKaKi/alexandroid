package com.google.android.gms.fido.fido2.api.common;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes7.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();

    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2, type = "byte[]")
    private final zzgx zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3, type = "byte[]")
    private final zzgx zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorData", id = 4, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getSignature", id = 5, type = "byte[]")
    private final zzgx zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getUserHandle", id = 6, type = "byte[]")
    private final zzgx zze;

    @SafeParcelable.Constructor
    public AuthenticatorAssertionResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) byte[] bArr4, @Nullable @SafeParcelable.Param(id = 6) byte[] bArr5) {
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) Preconditions.checkNotNull(bArr4);
        zzgx zzl4 = zzgx.zzl(bArr9, 0, bArr9.length);
        zzgx zzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        this.zza = (zzgx) Preconditions.checkNotNull(zzl);
        this.zzb = (zzgx) Preconditions.checkNotNull(zzl2);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzl3);
        this.zzd = (zzgx) Preconditions.checkNotNull(zzl4);
        this.zze = zzl5;
    }

    @NonNull
    public static AuthenticatorAssertionResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAssertionResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Objects.equal(this.zza, authenticatorAssertionResponse.zza) && Objects.equal(this.zzb, authenticatorAssertionResponse.zzb) && Objects.equal(this.zzc, authenticatorAssertionResponse.zzc) && Objects.equal(this.zzd, authenticatorAssertionResponse.zzd) && Objects.equal(this.zze, authenticatorAssertionResponse.zze);
    }

    @NonNull
    public byte[] getAuthenticatorData() {
        return this.zzc.zzm();
    }

    public zzgx getAuthenticatorDataAsByteString() {
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

    @Deprecated
    public zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    @NonNull
    public byte[] getSignature() {
        return this.zzd.zzm();
    }

    public zzgx getSignatureAsByteString() {
        return this.zzd;
    }

    @Nullable
    public byte[] getUserHandle() {
        zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @Nullable
    public zzgx getUserHandleAsByteString() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.zza)), Integer.valueOf(Objects.hashCode(this.zzb)), Integer.valueOf(Objects.hashCode(this.zzc)), Integer.valueOf(Objects.hashCode(this.zzd)), Integer.valueOf(Objects.hashCode(this.zze)));
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
        byte[] authenticatorData = getAuthenticatorData();
        zza.zzb("authenticatorData", zzf3.zzg(authenticatorData, 0, authenticatorData.length));
        zzgf zzf4 = zzgf.zzf();
        byte[] signature = getSignature();
        zza.zzb(PayloadUtils.PayloadKeys.SIGNATURE, zzf4.zzg(signature, 0, signature.length));
        byte[] userHandle = getUserHandle();
        if (userHandle != null) {
            zza.zzb("userHandle", zzgf.zzf().zzg(userHandle, 0, userHandle.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAuthenticatorData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, getSignature(), false);
        SafeParcelWriter.writeByteArray(parcel, 6, getUserHandle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(getAuthenticatorData()));
            jSONObject.put(PayloadUtils.PayloadKeys.SIGNATURE, Base64Utils.encodeUrlSafeNoPadding(getSignature()));
            if (this.zze != null) {
                jSONObject.put("userHandle", Base64Utils.encodeUrlSafeNoPadding(getUserHandle()));
            }
            return jSONObject;
        } catch (JSONException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }
}
