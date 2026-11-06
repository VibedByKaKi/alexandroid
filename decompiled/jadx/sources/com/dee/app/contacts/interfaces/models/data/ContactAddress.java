package com.dee.app.contacts.interfaces.models.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactAddress implements Parcelable {
    public static final Parcelable.Creator<ContactAddress> CREATOR = new Parcelable.Creator<ContactAddress>() { // from class: com.dee.app.contacts.interfaces.models.data.ContactAddress.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactAddress createFromParcel(Parcel parcel) {
            return new ContactAddress(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactAddress[] newArray(int i) {
            return new ContactAddress[i];
        }
    };

    @JsonProperty(ContactProviderContract.AddressEntry.COLUMN_ADDRESS_RAW_TYPE)
    private String rawType;

    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private String value;

    private ContactAddress(Parcel parcel) {
        this.value = parcel.readString();
        this.rawType = parcel.readString();
        this.type = parcel.readString();
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
            ContactAddress contactAddress = (ContactAddress) obj;
            if (Objects.equal(this.value, contactAddress.value) && Objects.equal(this.rawType, contactAddress.rawType) && Objects.equal(this.type, contactAddress.type)) {
                return true;
            }
        }
        return false;
    }

    public String getRawType() {
        return this.rawType;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hashCode(this.value, this.rawType, this.type);
    }

    public void setRawType(String str) {
        this.rawType = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("value", this.value).add(ContactProviderContract.AddressEntry.COLUMN_ADDRESS_RAW_TYPE, this.rawType).add("type", this.type).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        parcel.writeString(this.rawType);
        parcel.writeString(this.type);
    }

    public ContactAddress() {
    }

    public ContactAddress(String str, String str2, String str3) {
        this.value = str;
        this.rawType = str2;
        this.type = str3;
    }

    public /* synthetic */ ContactAddress(Parcel parcel, int i) {
        this(parcel);
    }
}
