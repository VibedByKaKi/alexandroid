package com.google.android.gms.fido.fido2.api.common;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbm;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SafeParcelable.Class(creator = "UvmEntriesCreator")
/* loaded from: classes7.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new zzbd();

    @Nullable
    @SafeParcelable.Field(getter = "getUvmEntryList", id = 1)
    private final List zza;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private final List zza = new ArrayList();

        @NonNull
        public Builder addAll(@NonNull List<UvmEntry> list) {
            zzbm.zzc(list.size() + this.zza.size() <= 3);
            this.zza.addAll(list);
            return this;
        }

        @NonNull
        public Builder addUvmEntry(@Nullable UvmEntry uvmEntry) {
            if (this.zza.size() >= 3) {
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            if (uvmEntry != null) {
                this.zza.add(uvmEntry);
            }
            return this;
        }

        @NonNull
        public UvmEntries build() {
            return new UvmEntries(this.zza);
        }
    }

    @SafeParcelable.Constructor
    public UvmEntries(@Nullable @SafeParcelable.Param(id = 1) List list) {
        this.zza = list;
    }

    public boolean equals(@Nullable Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.zza;
        if (list2 == null && uvmEntries.zza == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.zza) != null && list2.containsAll(list) && uvmEntries.zza.containsAll(this.zza);
    }

    @Nullable
    public List<UvmEntry> getUvmEntryList() {
        return this.zza;
    }

    public int hashCode() {
        List list = this.zza;
        return Objects.hashCode(list == null ? null : new HashSet(list));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getUvmEntryList(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final JSONArray zza() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.zza != null) {
                for (int i = 0; i < this.zza.size(); i++) {
                    UvmEntry uvmEntry = (UvmEntry) this.zza.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray2.put((int) uvmEntry.getKeyProtectionType());
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }
}
