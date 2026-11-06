package com.amazon.alexa.biloba.model;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ErrorCodeResponse {

    @SerializedName("errorCode")
    private AlertErrorCode alertErrorCode;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.alertErrorCode == ((ErrorCodeResponse) obj).alertErrorCode;
    }

    public ErrorCodeResponse errorCode(AlertErrorCode alertErrorCode) {
        this.alertErrorCode = alertErrorCode;
        return this;
    }

    public AlertErrorCode getErrorCode() {
        return this.alertErrorCode;
    }

    public int hashCode() {
        return Objects.hash(this.alertErrorCode);
    }

    public void setErrorCode(AlertErrorCode alertErrorCode) {
        this.alertErrorCode = alertErrorCode;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("class ErrorCodeResponse {\n    errorMessage: "), toIndentedString(this.alertErrorCode), "\n}");
    }
}
