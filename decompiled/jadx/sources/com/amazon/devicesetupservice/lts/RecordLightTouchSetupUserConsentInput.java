package com.amazon.devicesetupservice.lts;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.lts/")
@Generated
@XmlName("RecordLightTouchSetupUserConsentInput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class RecordLightTouchSetupUserConsentInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.lts.RecordLightTouchSetupUserConsentInput");
    private LtsClientDetails ltsClientDetails;
    private String ltsSessionId;
    private String userSelectedConsent;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordLightTouchSetupUserConsentInput)) {
            return false;
        }
        RecordLightTouchSetupUserConsentInput recordLightTouchSetupUserConsentInput = (RecordLightTouchSetupUserConsentInput) obj;
        return super.equals(obj) && Objects.equals(getLtsSessionId(), recordLightTouchSetupUserConsentInput.getLtsSessionId()) && Objects.equals(getUserSelectedConsent(), recordLightTouchSetupUserConsentInput.getUserSelectedConsent()) && Objects.equals(getLtsClientDetails(), recordLightTouchSetupUserConsentInput.getLtsClientDetails());
    }

    @Required
    public LtsClientDetails getLtsClientDetails() {
        return this.ltsClientDetails;
    }

    @Required
    public String getLtsSessionId() {
        return this.ltsSessionId;
    }

    @EnumValues({UserConsentValues.CONTINUE_SETUP, UserConsentValues.CONTINUE_SETUP_MATTER_UGS, UserConsentValues.NOT_MY_DEVICE, UserConsentValues.NOT_MY_DEVICE_MATTER_UGS})
    @Required
    @Documentation("An enum to contain defined user consent values for LTS")
    public String getUserSelectedConsent() {
        return this.userSelectedConsent;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getLtsSessionId(), getUserSelectedConsent(), getLtsClientDetails());
    }

    public void setLtsClientDetails(LtsClientDetails ltsClientDetails) {
        this.ltsClientDetails = ltsClientDetails;
    }

    public void setLtsSessionId(String str) {
        this.ltsSessionId = str;
    }

    public void setUserSelectedConsent(String str) {
        this.userSelectedConsent = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withLtsSessionId(getLtsSessionId());
        builder.withUserSelectedConsent(getUserSelectedConsent());
        builder.withLtsClientDetails(getLtsClientDetails());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        StringBuilder sb = new StringBuilder("RecordLightTouchSetupUserConsentInput(super=");
        sb.append(super.toString());
        sb.append(", , , ltsSessionId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.ltsSessionId, ", userSelectedConsent=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.userSelectedConsent, ", ltsClientDetails=", sb);
        sb.append(String.valueOf(this.ltsClientDetails));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected LtsClientDetails ltsClientDetails;
        protected String ltsSessionId;
        protected String userSelectedConsent;

        public RecordLightTouchSetupUserConsentInput build() {
            RecordLightTouchSetupUserConsentInput recordLightTouchSetupUserConsentInput = new RecordLightTouchSetupUserConsentInput();
            populate(recordLightTouchSetupUserConsentInput);
            return recordLightTouchSetupUserConsentInput;
        }

        public void populate(RecordLightTouchSetupUserConsentInput recordLightTouchSetupUserConsentInput) {
            super.populate((AuthenticatedInput) recordLightTouchSetupUserConsentInput);
            recordLightTouchSetupUserConsentInput.setLtsSessionId(this.ltsSessionId);
            recordLightTouchSetupUserConsentInput.setUserSelectedConsent(this.userSelectedConsent);
            recordLightTouchSetupUserConsentInput.setLtsClientDetails(this.ltsClientDetails);
        }

        public Builder withLtsClientDetails(LtsClientDetails ltsClientDetails) {
            this.ltsClientDetails = ltsClientDetails;
            return this;
        }

        public Builder withLtsSessionId(String str) {
            this.ltsSessionId = str;
            return this;
        }

        public Builder withUserSelectedConsent(String str) {
            this.userSelectedConsent = str;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
