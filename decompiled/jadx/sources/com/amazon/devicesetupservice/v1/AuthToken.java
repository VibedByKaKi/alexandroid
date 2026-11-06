package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
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
@XmlName("AuthToken")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class AuthToken {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.AuthToken");
    private String marketplaceId;
    private long maxAgeSeconds;
    private String token;
    private String ubid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String marketplaceId;
        protected long maxAgeSeconds;
        protected String token;
        protected String ubid;

        public AuthToken build() {
            AuthToken authToken = new AuthToken();
            populate(authToken);
            return authToken;
        }

        public void populate(AuthToken authToken) {
            authToken.setToken(this.token);
            authToken.setUbid(this.ubid);
            authToken.setMarketplaceId(this.marketplaceId);
            authToken.setMaxAgeSeconds(this.maxAgeSeconds);
        }

        public Builder withMarketplaceId(String str) {
            this.marketplaceId = str;
            return this;
        }

        public Builder withMaxAgeSeconds(long j) {
            this.maxAgeSeconds = j;
            return this;
        }

        public Builder withToken(String str) {
            this.token = str;
            return this;
        }

        public Builder withUbid(String str) {
            this.ubid = str;
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
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        return Objects.equals(getToken(), authToken.getToken()) && Objects.equals(getUbid(), authToken.getUbid()) && Objects.equals(getMarketplaceId(), authToken.getMarketplaceId()) && Long.valueOf(getMaxAgeSeconds()).equals(Long.valueOf(authToken.getMaxAgeSeconds()));
    }

    @MaxLength(20)
    @MinLength(1)
    @Pattern("[a-zA-Z0-9]+")
    public String getMarketplaceId() {
        return this.marketplaceId;
    }

    public long getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @MaxLength(4096)
    @MinLength(0)
    public String getToken() {
        return this.token;
    }

    @MaxLength(4096)
    @MinLength(0)
    @Documentation("Universal Browser ID - used as client context when validating\n        authTokens.")
    public String getUbid() {
        return this.ubid;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getToken(), getUbid(), getMarketplaceId(), Long.valueOf(getMaxAgeSeconds()));
    }

    public void setMarketplaceId(String str) {
        this.marketplaceId = str;
    }

    public void setMaxAgeSeconds(long j) {
        this.maxAgeSeconds = j;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUbid(String str) {
        this.ubid = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withToken(getToken());
        builder.withUbid(getUbid());
        builder.withMarketplaceId(getMarketplaceId());
        builder.withMaxAgeSeconds(getMaxAgeSeconds());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthToken(token=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.token, ", ubid=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.ubid, ", marketplaceId=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.marketplaceId, ", maxAgeSeconds=", sb);
        sb.append(String.valueOf(this.maxAgeSeconds));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
