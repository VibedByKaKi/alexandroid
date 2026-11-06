package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "ValidationSettingsCreator")
/* loaded from: classes7.dex */
public class ValidationSettings extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ValidationSettings> CREATOR = new zzf();

    @Nullable
    @SafeParcelable.Field(getter = "getBatchSize", id = 1)
    private final Integer zza;

    @SafeParcelable.Field(getter = "getInferenceTimeoutMillis", id = 2)
    private final long zzb;

    @SafeParcelable.Constructor
    public ValidationSettings(@Nullable @SafeParcelable.Param(id = 1) Integer num, @SafeParcelable.Param(id = 2) long j) {
        this.zza = num;
        this.zzb = j;
    }

    @NonNull
    public final String toString() {
        Integer num = this.zza;
        int length = String.valueOf(num).length();
        long j = this.zzb;
        StringBuilder sb = new StringBuilder(length + 54 + String.valueOf(j).length() + 1);
        sb.append("ValidationSettings{batchSize=");
        sb.append(num);
        sb.append(", inferenceTimeoutMillis=");
        return a$$ExternalSyntheticOutline0.m(j, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        Integer num = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 1, num, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
