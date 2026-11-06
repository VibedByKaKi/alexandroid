package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaCameraId implements Parcelable {
    public static final Parcelable.Creator<AlexaCameraId> CREATOR = new Parcelable.Creator<AlexaCameraId>() { // from class: com.amazon.alexa.api.AlexaCameraId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCameraId createFromParcel(Parcel parcel) {
            Preconditions.notNull(parcel, "Parcel cannot be null");
            return new AlexaCameraId(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCameraId[] newArray(int i) {
            return new AlexaCameraId[i];
        }
    };
    private final String cameraId;

    public AlexaCameraId(String str) {
        Preconditions.isFalse(TextUtils.isEmpty(str), "cameraId cannot be null or empty");
        this.cameraId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.cameraId, ((AlexaCameraId) obj).cameraId);
    }

    public String getValue() {
        return this.cameraId;
    }

    public int hashCode() {
        return Objects.hashCode(this.cameraId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cameraId);
    }

    public AlexaCameraId(Parcel parcel) {
        this(parcel.readString());
    }
}
