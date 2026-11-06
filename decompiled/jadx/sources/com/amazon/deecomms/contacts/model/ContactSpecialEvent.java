package com.amazon.deecomms.contacts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.clouddrive.cdasdk.cds.common.TimeGroupBy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ContactSpecialEvent implements Parcelable {
    public static final Parcelable.Creator<ContactSpecialEvent> CREATOR = new Parcelable.Creator<ContactSpecialEvent>() { // from class: com.amazon.deecomms.contacts.model.ContactSpecialEvent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactSpecialEvent createFromParcel(Parcel parcel) {
            return new ContactSpecialEvent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactSpecialEvent[] newArray(int i) {
            return new ContactSpecialEvent[i];
        }
    };

    @JsonProperty(TimeGroupBy.DAY)
    private int day;

    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty(TimeGroupBy.MONTH)
    private int month;

    @JsonProperty(TimeGroupBy.YEAR)
    private Integer year;

    public ContactSpecialEvent(Parcel parcel) {
        this.day = parcel.readInt();
        this.month = parcel.readInt();
        this.year = parcel.readString() != null ? Integer.valueOf(Integer.parseInt(parcel.readString())) : null;
        this.eventType = parcel.readString();
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
            ContactSpecialEvent contactSpecialEvent = (ContactSpecialEvent) obj;
            if (Objects.equal(Integer.valueOf(this.day), Integer.valueOf(contactSpecialEvent.day)) && Objects.equal(Integer.valueOf(this.month), Integer.valueOf(contactSpecialEvent.month)) && Objects.equal(this.year, contactSpecialEvent.year) && Objects.equal(this.eventType, contactSpecialEvent.eventType)) {
                return true;
            }
        }
        return false;
    }

    public int getDay() {
        return this.day;
    }

    public String getEventType() {
        return this.eventType;
    }

    public int getMonth() {
        return this.month;
    }

    public Integer getYear() {
        return this.year;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.day), Integer.valueOf(this.month), this.year, this.eventType);
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setYear(Integer num) {
        this.year = num;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("day=", this.day).add("month=", this.month).add("year=", this.year).add("eventType=", this.eventType).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.day);
        parcel.writeInt(this.month);
        Integer num = this.year;
        parcel.writeString(num != null ? num.toString() : null);
        parcel.writeString(this.eventType);
    }

    public ContactSpecialEvent() {
    }

    public ContactSpecialEvent(int i, int i2, Integer num, String str) {
        this.day = i;
        this.month = i2;
        this.year = num;
        this.eventType = str;
    }
}
