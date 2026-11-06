package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
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
import com.amazon.devicesetupservice.DiscoveryOutputParameters;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("DistressDiscoveryOutputParameters")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DistressDiscoveryOutputParameters extends DiscoveryOutputParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.DistressDiscoveryOutputParameters");
    private String sessionToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DiscoveryOutputParameters.Builder {
        protected String sessionToken;

        public DistressDiscoveryOutputParameters build() {
            DistressDiscoveryOutputParameters distressDiscoveryOutputParameters = new DistressDiscoveryOutputParameters();
            populate(distressDiscoveryOutputParameters);
            return distressDiscoveryOutputParameters;
        }

        public void populate(DistressDiscoveryOutputParameters distressDiscoveryOutputParameters) {
            super.populate((DiscoveryOutputParameters) distressDiscoveryOutputParameters);
            distressDiscoveryOutputParameters.setSessionToken(this.sessionToken);
        }

        public Builder withSessionToken(String str) {
            this.sessionToken = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.DiscoveryOutputParameters
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DistressDiscoveryOutputParameters) {
            return super.equals(obj) && Objects.equals(getSessionToken(), ((DistressDiscoveryOutputParameters) obj).getSessionToken());
        }
        return false;
    }

    @MaxLength(36)
    @MinLength(36)
    @Pattern("[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}")
    public String getSessionToken() {
        return this.sessionToken;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryOutputParameters
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getSessionToken());
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSessionToken(getSessionToken());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryOutputParameters
    public String toString() {
        StringBuilder sb = new StringBuilder("DistressDiscoveryOutputParameters(super=");
        sb.append(super.toString());
        sb.append(", sessionToken=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.sessionToken, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
