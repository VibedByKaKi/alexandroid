package com.amazon.deecomms.contacts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IdentityRawData implements Parcelable {

    @JsonIgnore
    public static final Parcelable.Creator<IdentityRawData> CREATOR = new Parcelable.Creator<IdentityRawData>() { // from class: com.amazon.deecomms.contacts.model.IdentityRawData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdentityRawData createFromParcel(Parcel parcel) {
            return new IdentityRawData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdentityRawData[] newArray(int i) {
            return new IdentityRawData[i];
        }
    };

    @JsonProperty(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR)
    private String aor;

    @JsonProperty("id")
    private String id;

    @JsonIgnore
    public IdentityRawData(Parcel parcel) {
        this.aor = parcel.readString();
        this.id = parcel.readString();
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
            IdentityRawData identityRawData = (IdentityRawData) obj;
            if (Objects.equal(this.aor, identityRawData.aor) && Objects.equal(this.id, identityRawData.id)) {
                return true;
            }
        }
        return false;
    }

    public String getAor() {
        return this.aor;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hashCode(this.aor, this.id);
    }

    public void setAor(String str) {
        this.aor = str;
    }

    public void setUser(String str) {
        this.id = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add(ContactProviderContract.PhoneNumberEntry.COLUMN_AOR, this.aor).add("id", this.id).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aor);
        parcel.writeString(this.id);
    }

    public IdentityRawData() {
    }
}
