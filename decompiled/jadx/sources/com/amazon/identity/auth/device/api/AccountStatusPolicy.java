package com.amazon.identity.auth.device.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AccountStatusPolicy implements Parcelable {
    public static final Parcelable.Creator<AccountStatusPolicy> CREATOR = new Parcelable.Creator<AccountStatusPolicy>() { // from class: com.amazon.identity.auth.device.api.AccountStatusPolicy.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountStatusPolicy createFromParcel(Parcel parcel) {
            return new AccountStatusPolicy(Policy.values()[parcel.readInt()]);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountStatusPolicy[] newArray(int i) {
            return new AccountStatusPolicy[i];
        }
    };
    private final Policy mPolicy;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Policy {
        DEFAULT("DEFAULT"),
        P1("P1");

        private final String mValue;

        Policy(String str) {
            this.mValue = str;
        }

        @FireOsSdk
        public String getValue() {
            return this.mValue;
        }
    }

    @FireOsSdk
    public AccountStatusPolicy(Policy policy) {
        this.mPolicy = policy;
    }

    @Override // android.os.Parcelable
    @FireOsSdk
    public int describeContents() {
        return 0;
    }

    public Policy getAccountStatusPolicy() {
        return this.mPolicy;
    }

    @Override // android.os.Parcelable
    @FireOsSdk
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mPolicy.ordinal());
    }
}
