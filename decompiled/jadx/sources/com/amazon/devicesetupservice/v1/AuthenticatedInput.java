package com.amazon.devicesetupservice.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("AuthenticatedInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.AuthenticatedInput");
    private String accessToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected String accessToken;

        public void populate(AuthenticatedInput authenticatedInput) {
            authenticatedInput.setAccessToken(this.accessToken);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticatedInput) {
            return Objects.equals(getAccessToken(), ((AuthenticatedInput) obj).getAccessToken());
        }
        return false;
    }

    @HttpHeader("x-amz-access-token")
    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getAccessToken());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public String toString() {
        return "AuthenticatedInput(accessToken=*** REDACTED ***)";
    }
}
