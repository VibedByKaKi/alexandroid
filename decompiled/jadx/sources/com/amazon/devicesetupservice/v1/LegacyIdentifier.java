package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
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
@XmlName("LegacyIdentifier")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class LegacyIdentifier {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.LegacyIdentifier");
    private String deviceType;
    private String dsn;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String deviceType;
        protected String dsn;

        public LegacyIdentifier build() {
            LegacyIdentifier legacyIdentifier = new LegacyIdentifier();
            populate(legacyIdentifier);
            return legacyIdentifier;
        }

        public void populate(LegacyIdentifier legacyIdentifier) {
            legacyIdentifier.setDsn(this.dsn);
            legacyIdentifier.setDeviceType(this.deviceType);
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        public Builder withDsn(String str) {
            this.dsn = str;
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
        if (!(obj instanceof LegacyIdentifier)) {
            return false;
        }
        LegacyIdentifier legacyIdentifier = (LegacyIdentifier) obj;
        return Objects.equals(getDsn(), legacyIdentifier.getDsn()) && Objects.equals(getDeviceType(), legacyIdentifier.getDeviceType());
    }

    @MaxLength(100)
    @MinLength(1)
    public String getDeviceType() {
        return this.deviceType;
    }

    @MaxLength(100)
    @Required
    @Sensitive
    @MinLength(1)
    public String getDsn() {
        return this.dsn;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDsn(), getDeviceType());
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDsn(getDsn());
        builder.withDeviceType(getDeviceType());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("LegacyIdentifier(dsn=*** REDACTED ***, deviceType="));
    }
}
