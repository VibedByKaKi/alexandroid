package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "RegisterRequestCreator")
@Deprecated
/* loaded from: classes7.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zzg();
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 2, type = "java.lang.String")
    private final ProtocolVersion zzb;

    @SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final String zzd;

    public RegisterRequest(@NonNull ProtocolVersion protocolVersion, @NonNull byte[] bArr, @NonNull String str) {
        this.zza = 1;
        this.zzb = (ProtocolVersion) Preconditions.checkNotNull(protocolVersion);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
        if (protocolVersion == ProtocolVersion.V1) {
            Preconditions.checkArgument(bArr.length == 65, "invalid challengeValue length for V1");
        }
        this.zzd = str;
    }

    @NonNull
    public static RegisterRequest parseFromJson(@NonNull JSONObject jSONObject) throws JSONException {
        try {
            try {
                try {
                    return new RegisterRequest(ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), Base64.decode(jSONObject.getString(ClientData.KEY_CHALLENGE), 8), jSONObject.has(SettingsStorageModule.FILTER_SETTINGS_APP_ID_KEY) ? jSONObject.getString(SettingsStorageModule.FILTER_SETTINGS_APP_ID_KEY) : null);
                } catch (IllegalArgumentException e) {
                    XML$$ExternalSyntheticBUOutline0.m$1(e.getMessage());
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                throw new JSONException(e2.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e3) {
            throw new JSONException(e3.toString());
        }
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.zzc, registerRequest.zzc) || this.zzb != registerRequest.zzb) {
            return false;
        }
        String str = this.zzd;
        String str2 = registerRequest.zzd;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getAppId() {
        return this.zzd;
    }

    @NonNull
    public byte[] getChallengeValue() {
        return this.zzc;
    }

    @NonNull
    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        int hashCode = this.zzb.hashCode() + ((Arrays.hashCode(this.zzc) + 31) * 31);
        String str = this.zzd;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.zzb.toString());
            jSONObject.put(ClientData.KEY_CHALLENGE, Base64.encodeToString(this.zzc, 11));
            String str = this.zzd;
            if (str != null) {
                jSONObject.put(SettingsStorageModule.FILTER_SETTINGS_APP_ID_KEY, str);
            }
            return jSONObject;
        } catch (JSONException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zzb.toString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public RegisterRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = i;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = bArr;
            this.zzd = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(e);
            throw null;
        }
    }
}
