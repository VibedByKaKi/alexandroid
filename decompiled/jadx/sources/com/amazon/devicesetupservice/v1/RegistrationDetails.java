package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("RegistrationDetails")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class RegistrationDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.RegistrationDetails");
    private long expiresAt;
    private String registrationToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected long expiresAt;
        protected String registrationToken;

        public RegistrationDetails build() {
            RegistrationDetails registrationDetails = new RegistrationDetails();
            populate(registrationDetails);
            return registrationDetails;
        }

        public void populate(RegistrationDetails registrationDetails) {
            registrationDetails.setRegistrationToken(this.registrationToken);
            registrationDetails.setExpiresAt(this.expiresAt);
        }

        public Builder withExpiresAt(long j) {
            this.expiresAt = j;
            return this;
        }

        public Builder withRegistrationToken(String str) {
            this.registrationToken = str;
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
        if (!(obj instanceof RegistrationDetails)) {
            return false;
        }
        RegistrationDetails registrationDetails = (RegistrationDetails) obj;
        return Objects.equals(getRegistrationToken(), registrationDetails.getRegistrationToken()) && Long.valueOf(getExpiresAt()).equals(Long.valueOf(registrationDetails.getExpiresAt()));
    }

    public long getExpiresAt() {
        return this.expiresAt;
    }

    @MaxLength(255)
    @MinLength(4)
    public String getRegistrationToken() {
        return this.registrationToken;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getRegistrationToken(), Long.valueOf(getExpiresAt()));
    }

    public void setExpiresAt(long j) {
        this.expiresAt = j;
    }

    public void setRegistrationToken(String str) {
        this.registrationToken = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withRegistrationToken(getRegistrationToken());
        builder.withExpiresAt(getExpiresAt());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RegistrationDetails(registrationToken=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.registrationToken, ", expiresAt=", sb);
        sb.append(String.valueOf(this.expiresAt));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
