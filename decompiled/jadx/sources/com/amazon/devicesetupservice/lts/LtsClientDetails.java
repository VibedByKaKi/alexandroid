package com.amazon.devicesetupservice.lts;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.lts/")
@Generated
@XmlName("LtsClientDetails")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class LtsClientDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.lts.LtsClientDetails");
    private String clientApplicationName;
    private String clientApplicationVersion;
    private String clientPlatform;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String clientApplicationName;
        protected String clientApplicationVersion;
        protected String clientPlatform;

        public LtsClientDetails build() {
            LtsClientDetails ltsClientDetails = new LtsClientDetails();
            populate(ltsClientDetails);
            return ltsClientDetails;
        }

        public void populate(LtsClientDetails ltsClientDetails) {
            ltsClientDetails.setClientPlatform(this.clientPlatform);
            ltsClientDetails.setClientApplicationName(this.clientApplicationName);
            ltsClientDetails.setClientApplicationVersion(this.clientApplicationVersion);
        }

        public Builder withClientApplicationName(String str) {
            this.clientApplicationName = str;
            return this;
        }

        public Builder withClientApplicationVersion(String str) {
            this.clientApplicationVersion = str;
            return this;
        }

        public Builder withClientPlatform(String str) {
            this.clientPlatform = str;
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
        if (!(obj instanceof LtsClientDetails)) {
            return false;
        }
        LtsClientDetails ltsClientDetails = (LtsClientDetails) obj;
        return Objects.equals(getClientPlatform(), ltsClientDetails.getClientPlatform()) && Objects.equals(getClientApplicationName(), ltsClientDetails.getClientApplicationName()) && Objects.equals(getClientApplicationVersion(), ltsClientDetails.getClientApplicationVersion());
    }

    public String getClientApplicationName() {
        return this.clientApplicationName;
    }

    public String getClientApplicationVersion() {
        return this.clientApplicationVersion;
    }

    public String getClientPlatform() {
        return this.clientPlatform;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getClientPlatform(), getClientApplicationName(), getClientApplicationVersion());
    }

    public void setClientApplicationName(String str) {
        this.clientApplicationName = str;
    }

    public void setClientApplicationVersion(String str) {
        this.clientApplicationVersion = str;
    }

    public void setClientPlatform(String str) {
        this.clientPlatform = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withClientPlatform(getClientPlatform());
        builder.withClientApplicationName(getClientApplicationName());
        builder.withClientApplicationVersion(getClientApplicationVersion());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LtsClientDetails(clientPlatform=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientPlatform, ", clientApplicationName=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientApplicationName, ", clientApplicationVersion=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.clientApplicationVersion, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
