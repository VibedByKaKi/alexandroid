package com.amazon.alexa.biloba.model;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ResourceOwner {

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("id")
    private String id;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("personIdV1")
    private String personIdV1;

    @SerializedName("type")
    private String resourceType;

    public ResourceOwner(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.resourceType = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.personIdV1 = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ResourceOwner resourceOwner = (ResourceOwner) obj;
            if (this.id.equals(resourceOwner.id) && this.resourceType.equals(resourceOwner.resourceType) && this.firstName.equals(resourceOwner.firstName) && this.lastName.equals(resourceOwner.lastName) && this.personIdV1.equals(resourceOwner.personIdV1)) {
                return true;
            }
        }
        return false;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getId() {
        return this.id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPersonIdV1() {
        return this.personIdV1;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.resourceType, this.firstName, this.lastName, this.personIdV1);
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setPersonIdV1(String str) {
        this.personIdV1 = str;
    }

    public void setResourceType(String str) {
        this.resourceType = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResourceOwner{directedPersonIdV2='");
        sb.append(this.id);
        sb.append("', resourceType='");
        sb.append(this.resourceType);
        sb.append("', firstName='");
        sb.append(this.firstName);
        sb.append("', lastName='");
        sb.append(this.lastName);
        sb.append("', personIdV1='");
        return a$$ExternalSyntheticOutline0.m(sb, this.personIdV1, "'}");
    }
}
