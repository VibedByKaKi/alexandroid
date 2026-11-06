package com.amazon.whisperjoin.common.sharedtypes.provisioning.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ValidatableUuid implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<ValidatableUuid> CREATOR = new Parcelable.ClassLoaderCreator<ValidatableUuid>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.ValidatableUuid.1
        @Override // android.os.Parcelable.Creator
        public ValidatableUuid createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new ValidatableUuid(parcel, ValidatableUuid.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public ValidatableUuid[] newArray(int i) {
            if (i >= 0) {
                return new ValidatableUuid[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ValidatableUuid createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new ValidatableUuid(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private final UUID mValue;

    public ValidatableUuid(UUID uuid) {
        if (uuid != null) {
            this.mValue = uuid;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UUID getValue() {
        return this.mValue;
    }

    public String toString() {
        return this.mValue.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.mValue.toString());
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
        }
    }

    public ValidatableUuid(Parcel parcel, ClassLoader classLoader) {
        this.mValue = UUID.fromString(parcel.readString());
    }
}
