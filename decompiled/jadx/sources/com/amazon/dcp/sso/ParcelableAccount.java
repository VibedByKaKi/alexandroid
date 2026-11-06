package com.amazon.dcp.sso;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ParcelableAccount implements Parcelable {
    public static final Parcelable.Creator<ParcelableAccount> CREATOR = new a();
    private final String mAccountName;
    private final String mAccountType;

    private ParcelableAccount(Parcel parcel) {
        this.mAccountName = parcel.readString();
        this.mAccountType = parcel.readString();
    }

    public static ParcelableAccount[] fromAccounts(Account... accountArr) {
        if (accountArr == null) {
            return null;
        }
        ParcelableAccount[] parcelableAccountArr = new ParcelableAccount[accountArr.length];
        for (int i = 0; i < accountArr.length; i++) {
            parcelableAccountArr[i] = new ParcelableAccount(accountArr[i]);
        }
        return parcelableAccountArr;
    }

    public static Account[] toAccounts(ParcelableAccount... parcelableAccountArr) {
        if (parcelableAccountArr == null) {
            return null;
        }
        Account[] accountArr = new Account[parcelableAccountArr.length];
        for (int i = 0; i < parcelableAccountArr.length; i++) {
            ParcelableAccount parcelableAccount = parcelableAccountArr[i];
            if (parcelableAccount != null) {
                accountArr[i] = parcelableAccount.getAccount();
            }
        }
        return accountArr;
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
            ParcelableAccount parcelableAccount = (ParcelableAccount) obj;
            if (TextUtils.equals(this.mAccountName, parcelableAccount.mAccountName) && TextUtils.equals(this.mAccountType, parcelableAccount.mAccountType)) {
                return true;
            }
        }
        return false;
    }

    public Account getAccount() {
        return new Account(this.mAccountName, this.mAccountType);
    }

    public int hashCode() {
        String str = this.mAccountName;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.mAccountType;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAccountName);
        parcel.writeString(this.mAccountType);
    }

    public ParcelableAccount(Account account) {
        this(account.name, account.type);
    }

    public ParcelableAccount(String str, String str2) {
        this.mAccountName = str;
        this.mAccountType = str2;
    }

    public /* synthetic */ ParcelableAccount(Parcel parcel, int i) {
        this(parcel);
    }
}
