package com.amazon.alexa.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaUserProfile implements Parcelable {
    private static final int BOOL_FALSE_VALUE = 0;
    private static final int BOOL_TRUE_VALUE = 1;
    public static final Parcelable.Creator<AlexaUserProfile> CREATOR = new Parcelable.Creator<AlexaUserProfile>() { // from class: com.amazon.alexa.api.AlexaUserProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaUserProfile createFromParcel(Parcel parcel) {
            return new AlexaUserProfile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlexaUserProfile[] newArray(int i) {
            return new AlexaUserProfile[i];
        }
    };
    private final String firstName;
    private final boolean isChildProfile;
    private final String personId;

    public AlexaUserProfile(Parcel parcel) {
        this.personId = parcel.readString();
        this.firstName = parcel.readString();
        this.isChildProfile = parcel.readInt() != 0;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPersonId() {
        return this.personId;
    }

    public boolean isChildProfile() {
        return this.isChildProfile;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.personId);
        parcel.writeString(this.firstName);
        parcel.writeInt(this.isChildProfile ? 1 : 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String firstName;
        private boolean isChildProfile;
        private String personId;

        public AlexaUserProfile build() {
            Preconditions.notNull(this.personId, "Person id can not be null");
            return new AlexaUserProfile(this);
        }

        public Builder setFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder setIsChildProfile(boolean z) {
            this.isChildProfile = z;
            return this;
        }

        public Builder setPersonId(String str) {
            this.personId = str;
            return this;
        }

        private Builder() {
        }
    }

    private AlexaUserProfile(String str, String str2, boolean z) {
        this.personId = str;
        this.firstName = str2;
        this.isChildProfile = z;
    }

    public AlexaUserProfile(Builder builder) {
        this(builder.personId, builder.firstName, builder.isChildProfile);
    }
}
