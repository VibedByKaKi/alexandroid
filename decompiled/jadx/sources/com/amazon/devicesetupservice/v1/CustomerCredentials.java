package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
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
@XmlName("CustomerCredentials")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CustomerCredentials {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.CustomerCredentials");
    private String accessToken;
    private AuthToken authToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String accessToken;
        protected AuthToken authToken;

        public CustomerCredentials build() {
            CustomerCredentials customerCredentials = new CustomerCredentials();
            populate(customerCredentials);
            return customerCredentials;
        }

        public void populate(CustomerCredentials customerCredentials) {
            customerCredentials.setAccessToken(this.accessToken);
            customerCredentials.setAuthToken(this.authToken);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder withAuthToken(AuthToken authToken) {
            this.authToken = authToken;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCredentials)) {
            return false;
        }
        CustomerCredentials customerCredentials = (CustomerCredentials) obj;
        return Objects.equals(getAccessToken(), customerCredentials.getAccessToken()) && Objects.equals(getAuthToken(), customerCredentials.getAuthToken());
    }

    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
    }

    public AuthToken getAuthToken() {
        return this.authToken;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getAccessToken(), getAuthToken());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAuthToken(AuthToken authToken) {
        this.authToken = authToken;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withAuthToken(getAuthToken());
        return builder;
    }

    public String toString() {
        return "CustomerCredentials(accessToken=*** REDACTED ***, authToken=" + String.valueOf(this.authToken) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
