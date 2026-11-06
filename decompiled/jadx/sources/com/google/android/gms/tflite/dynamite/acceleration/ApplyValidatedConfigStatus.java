package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum ApplyValidatedConfigStatus implements Parcelable {
    SUCCESS(0),
    FAILURE_BENCHMARK_RUN_NOT_COMPLETED(1),
    FAILURE_HAS_NOT_PASSED_ACCURACY_CHECK(2);


    @NonNull
    public static final Parcelable.Creator<ApplyValidatedConfigStatus> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.tflite.dynamite.acceleration.zzb
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return ApplyValidatedConfigStatus.zza(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ApplyValidatedConfigStatus[i];
        }
    };
    private final int zza;

    ApplyValidatedConfigStatus(int i) {
        this.zza = i;
    }

    @NonNull
    public static ApplyValidatedConfigStatus zza(int i) {
        for (ApplyValidatedConfigStatus applyValidatedConfigStatus : values()) {
            if (applyValidatedConfigStatus.zza == i) {
                return applyValidatedConfigStatus;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("Invalid enum value: ", i, new StringBuilder(String.valueOf(i).length() + 20)));
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.zza);
    }
}
