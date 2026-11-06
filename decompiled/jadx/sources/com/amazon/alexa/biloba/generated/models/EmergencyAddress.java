package com.amazon.alexa.biloba.generated.models;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EmergencyAddress {

    @SerializedName("addressLine1")
    private String addressLine1 = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public EmergencyAddress addressLine1(String str) {
        this.addressLine1 = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.addressLine1, ((EmergencyAddress) obj).addressLine1);
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public int hashCode() {
        return Objects.hash(this.addressLine1);
    }

    public void setAddressLine1(String str) {
        this.addressLine1 = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("class EmergencyAddress {\n    addressLine1: "), toIndentedString(this.addressLine1), "\n}");
    }
}
