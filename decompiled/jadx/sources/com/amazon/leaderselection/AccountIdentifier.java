package com.amazon.leaderselection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class AccountIdentifier implements Parcelable {
    private final String value;
    static final AccountIdentifier UNKNOWN = create("UNKNOWN");
    public static final Parcelable.Creator<AccountIdentifier> CREATOR = new Parcelable.Creator<AccountIdentifier>() { // from class: com.amazon.leaderselection.AccountIdentifier.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountIdentifier createFromParcel(Parcel parcel) {
            return new AccountIdentifier(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountIdentifier[] newArray(int i) {
            return new AccountIdentifier[i];
        }
    };

    public AccountIdentifier(Parcel parcel) {
        this.value = parcel.readString();
    }

    public static AccountIdentifier create(String str) {
        return (str == null || str.isEmpty()) ? UNKNOWN : new AccountIdentifier(str);
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
        return Objects.equals(this.value, ((AccountIdentifier) obj).value);
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.value);
    }

    public String toString() {
        return getValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
    }

    private AccountIdentifier(String str) {
        this.value = str;
    }
}
