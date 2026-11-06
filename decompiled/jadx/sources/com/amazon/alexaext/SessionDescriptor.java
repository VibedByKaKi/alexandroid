package com.amazon.alexaext;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SessionDescriptor implements Parcelable {
    public static final Parcelable.Creator<SessionDescriptor> CREATOR = new Parcelable.Creator<SessionDescriptor>() { // from class: com.amazon.alexaext.SessionDescriptor.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionDescriptor createFromParcel(Parcel parcel) {
            return new SessionDescriptor(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionDescriptor[] newArray(int i) {
            return new SessionDescriptor[i];
        }
    };
    private final String mSessionId;

    public SessionDescriptor(Parcel parcel) {
        this.mSessionId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mSessionId.equals(((SessionDescriptor) obj).mSessionId);
    }

    public String getId() {
        return this.mSessionId;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSessionId);
    }

    public SessionDescriptor(String str) {
        this.mSessionId = str;
    }
}
