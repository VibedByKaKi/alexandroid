package com.amazon.deecomms.contacts.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ContactInfo {
    private String mCompany;
    private final String mContactId;
    private String mFirstName;
    private String mLastName;
    private String mNickName;
    private String mRelationship;
    private List<ContactPhoneNumber> mPhoneList = new ArrayList();
    private List<ContactEmailAddress> mEmailAddressList = new ArrayList();

    public ContactInfo(String str) {
        this.mContactId = str;
    }

    public void addPhoneNumber(String str, PhoneNumberType phoneNumberType) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ContactPhoneNumber contactPhoneNumber = new ContactPhoneNumber();
        contactPhoneNumber.setType(phoneNumberType);
        contactPhoneNumber.setPhoneNumber(str);
        this.mPhoneList.add(contactPhoneNumber);
    }

    public String getCompany() {
        return this.mCompany;
    }

    public String getContactId() {
        return this.mContactId;
    }

    public List<ContactEmailAddress> getEmailAddressList() {
        return this.mEmailAddressList;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public String getNickName() {
        return this.mNickName;
    }

    public List<ContactPhoneNumber> getPhoneList() {
        return this.mPhoneList;
    }

    public String getRelationship() {
        return this.mRelationship;
    }

    public void setCompany(String str) {
        this.mCompany = str;
    }

    public void setEmailAddressList(@NonNull List<ContactEmailAddress> list) {
        this.mEmailAddressList = list;
    }

    public void setFirstName(String str) {
        this.mFirstName = str;
    }

    public void setLastName(String str) {
        this.mLastName = str;
    }

    public void setNickName(String str) {
        this.mNickName = str;
    }

    public void setPhoneList(@NonNull List<ContactPhoneNumber> list) {
        this.mPhoneList = list;
    }

    public void setRelationship(String str) {
        this.mRelationship = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(" firstName: ");
        sb.append(this.mFirstName);
        sb.append(" lastName: ");
        sb.append(this.mLastName);
        sb.append(" nickName: ");
        sb.append(this.mNickName);
        sb.append(" relationship: ");
        sb.append(this.mRelationship);
        sb.append(" company: ");
        sb.append(this.mCompany);
        sb.append(" contactId: ");
        sb.append(this.mContactId);
        for (ContactPhoneNumber contactPhoneNumber : this.mPhoneList) {
            sb.append(" Phone no: ");
            sb.append(contactPhoneNumber.getPhoneNumber());
            sb.append(" Phone type: ");
            sb.append(contactPhoneNumber.getType());
        }
        for (ContactEmailAddress contactEmailAddress : this.mEmailAddressList) {
            sb.append(" Email Address: ");
            sb.append(contactEmailAddress.getEmailAddress());
            sb.append(" Email Address type: ");
            sb.append(contactEmailAddress.getType());
        }
        return sb.toString();
    }
}
