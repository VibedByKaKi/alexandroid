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
import com.google.android.gms.internal.home.zzv;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "TxtRecordCreator")
/* loaded from: classes7.dex */
public final class TxtRecord extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TxtRecord> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getKey", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getValue", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public TxtRecord(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        zzab.zze(!str.isEmpty(), "Key cannot be empty.");
        zzab.zzc(str2, "Value cannot be null.");
        this.zza = str;
        this.zzb = str2;
    }

    @NonNull
    public static TxtRecord create(@NonNull String str, @NonNull String str2) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (zzv.zzb(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (zzv.zzb(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                str = String.valueOf(charArray);
            } else {
                i++;
            }
        }
        return new TxtRecord(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxtRecord)) {
            return false;
        }
        TxtRecord txtRecord = (TxtRecord) obj;
        return this.zza.equals(txtRecord.zza) && this.zzb.equals(txtRecord.zzb);
    }

    @NonNull
    public String getKey() {
        return this.zza;
    }

    @NonNull
    public String getValue() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @NonNull
    public String toString() {
        boolean isEmpty = this.zzb.isEmpty();
        String str = this.zza;
        return isEmpty ? str : a$$ExternalSyntheticOutline0.m$1(str, "=", this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getKey(), false);
        SafeParcelWriter.writeString(parcel, 2, getValue(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
