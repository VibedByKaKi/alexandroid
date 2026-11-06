package com.amazon.alexa.biloba.model;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Subscription {

    @SerializedName("id")
    private String id = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("payer")
    private Boolean isPayer = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Subscription subscription = (Subscription) obj;
            if (Objects.equals(this.id, subscription.id) && Objects.equals(this.status, subscription.status)) {
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.status);
    }

    public Subscription id(String str) {
        this.id = str;
        return this;
    }

    public Subscription isPayer(Boolean bool) {
        this.isPayer = bool;
        return this;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsPayer(Boolean bool) {
        this.isPayer = bool;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public Subscription status(String str) {
        this.status = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Subscription {\n    id: ");
        sb.append(toIndentedString(this.id));
        sb.append("\n    status: ");
        sb.append(toIndentedString(this.status));
        sb.append("\n    isPayer: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.isPayer), "\n}");
    }

    public Boolean isPayer() {
        return this.isPayer;
    }
}
