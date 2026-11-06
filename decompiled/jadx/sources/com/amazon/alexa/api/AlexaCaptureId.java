package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaCaptureId implements Parcelable {
    public static final Parcelable.Creator<AlexaCaptureId> CREATOR = new Parcelable.Creator<AlexaCaptureId>() { // from class: com.amazon.alexa.api.AlexaCaptureId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCaptureId createFromParcel(Parcel parcel) {
            Preconditions.notNull(parcel, "Parcel cannot be null");
            return new AlexaCaptureId(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaCaptureId[] newArray(int i) {
            return new AlexaCaptureId[i];
        }
    };
    private final String captureId;

    public AlexaCaptureId(String str) {
        Preconditions.isFalse(TextUtils.isEmpty(str), "captureId cannot be null or empty");
        this.captureId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.captureId, ((AlexaCaptureId) obj).captureId);
    }

    public String getValue() {
        return this.captureId;
    }

    public int hashCode() {
        return Objects.hashCode(this.captureId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.captureId);
    }

    public AlexaCaptureId(Parcel parcel) {
        this(parcel.readString());
    }
}
