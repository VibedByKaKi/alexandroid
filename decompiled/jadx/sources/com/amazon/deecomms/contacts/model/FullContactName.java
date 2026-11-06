package com.amazon.deecomms.contacts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FullContactName implements Parcelable {
    public static final Parcelable.Creator<FullContactName> CREATOR = new Parcelable.Creator<FullContactName>() { // from class: com.amazon.deecomms.contacts.model.FullContactName.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FullContactName createFromParcel(Parcel parcel) {
            return new FullContactName(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FullContactName[] newArray(int i) {
            return new FullContactName[i];
        }
    };
    private String company;
    private ContactName contactName;

    @JsonIgnore
    public FullContactName(Parcel parcel) {
        this.contactName = (ContactName) parcel.readParcelable(ContactName.class.getClassLoader());
        this.company = parcel.readString();
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
            FullContactName fullContactName = (FullContactName) obj;
            if (Objects.equal(this.contactName, fullContactName.contactName) && Objects.equal(this.company, fullContactName.company)) {
                return true;
            }
        }
        return false;
    }

    public String getCompany() {
        return this.company;
    }

    public ContactName getContactName() {
        return this.contactName;
    }

    public int hashCode() {
        return Objects.hashCode(this.contactName, this.company);
    }

    public void setCompany(String str) {
        this.company = str;
    }

    public void setContactName(ContactName contactName) {
        this.contactName = contactName;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("contact name : ", this.contactName).add("company name : ", this.company).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.contactName, i);
        parcel.writeString(this.company);
    }

    public FullContactName(ContactName contactName, String str) {
        this.contactName = contactName;
        this.company = str;
    }

    public FullContactName(String str, String str2, String str3, String str4) {
        this.contactName = new ContactName(str, str2, str3);
        this.company = str4;
    }

    public FullContactName() {
    }
}
