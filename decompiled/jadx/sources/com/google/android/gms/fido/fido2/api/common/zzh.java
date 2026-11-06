package com.google.android.gms.fido.fido2.api.common;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsPrfOutputsCreator")
/* loaded from: classes7.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getSupported", id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getOutputs", id = 2, type = "byte[]")
    private final zzgx zzb;

    public zzh(boolean z, @Nullable zzgx zzgxVar) {
        this.zza = z;
        this.zzb = zzgxVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.zza == zzhVar.zza && Objects.equal(this.zzb, zzhVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return a$$ExternalSyntheticOutline0.m("AuthenticationExtensionsPrfOutputs{", zza().toString(), StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        boolean z = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z);
        SafeParcelWriter.writeByteArray(parcel, 2, zzb(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zza) {
                jSONObject.put("enabled", true);
            }
            byte[] zzb = zzb();
            if (zzb != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(DefaultPreloadManager.METRIC_PATH_FIRST, Base64.encodeToString(Arrays.copyOf(zzb, 32), 11));
                if (zzb.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(zzb, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    @Nullable
    public final byte[] zzb() {
        zzgx zzgxVar = this.zzb;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }
}
