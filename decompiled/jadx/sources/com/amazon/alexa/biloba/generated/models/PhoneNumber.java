package com.amazon.alexa.biloba.generated.models;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PhoneNumber {

    @SerializedName("countryCode")
    private String countryCode = null;

    @SerializedName("localPhoneNumber")
    private String localPhoneNumber = null;

    @SerializedName("phoneNumberType")
    private String phoneNumberType = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public PhoneNumber countryCode(String str) {
        this.countryCode = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PhoneNumber phoneNumber = (PhoneNumber) obj;
            if (Objects.equals(this.countryCode, phoneNumber.countryCode) && Objects.equals(this.localPhoneNumber, phoneNumber.localPhoneNumber) && Objects.equals(this.phoneNumberType, phoneNumber.phoneNumberType)) {
                return true;
            }
        }
        return false;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getLocalPhoneNumber() {
        return this.localPhoneNumber;
    }

    public String getPhoneNumberType() {
        return this.phoneNumberType;
    }

    public int hashCode() {
        return Objects.hash(this.countryCode, this.localPhoneNumber, this.phoneNumberType);
    }

    public PhoneNumber localPhoneNumber(String str) {
        this.localPhoneNumber = str;
        return this;
    }

    public PhoneNumber phoneNumberType(String str) {
        this.phoneNumberType = str;
        return this;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setLocalPhoneNumber(String str) {
        this.localPhoneNumber = str;
    }

    public void setPhoneNumberType(String str) {
        this.phoneNumberType = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class PhoneNumber {\n    countryCode: ");
        sb.append(toIndentedString(this.countryCode));
        sb.append("\n    localPhoneNumber: ");
        sb.append(toIndentedString(this.localPhoneNumber));
        sb.append("\n    phoneNumberType: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.phoneNumberType), "\n}");
    }
}
