package com.amazon.alexaext;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ActivityDescriptor implements Parcelable {
    public static final Parcelable.Creator<ActivityDescriptor> CREATOR = new Parcelable.Creator<ActivityDescriptor>() { // from class: com.amazon.alexaext.ActivityDescriptor.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityDescriptor createFromParcel(Parcel parcel) {
            return new ActivityDescriptor(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityDescriptor[] newArray(int i) {
            return new ActivityDescriptor[i];
        }
    };
    private final String mActivityId;
    private final SessionDescriptor mSession;
    private final String mURI;

    public ActivityDescriptor(Parcel parcel) {
        this.mURI = parcel.readString();
        this.mSession = (SessionDescriptor) parcel.readParcelable(SessionDescriptor.class.getClassLoader());
        this.mActivityId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityDescriptor activityDescriptor = (ActivityDescriptor) obj;
            if (this.mURI.equals(activityDescriptor.mURI) && this.mSession.equals(activityDescriptor.mSession) && this.mActivityId.equals(activityDescriptor.mActivityId)) {
                return true;
            }
        }
        return false;
    }

    public String getActivityId() {
        return this.mActivityId;
    }

    public SessionDescriptor getSession() {
        return this.mSession;
    }

    public String getURI() {
        return this.mURI;
    }

    public int hashCode() {
        return Objects.hash(this.mURI, this.mSession, this.mActivityId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mURI);
        parcel.writeParcelable(this.mSession, i);
        parcel.writeString(this.mActivityId);
    }

    public ActivityDescriptor(String str, SessionDescriptor sessionDescriptor, String str2) {
        this.mURI = str;
        this.mSession = sessionDescriptor;
        this.mActivityId = str2;
    }
}
