package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("GetRegistrationTokenOutput")
@Documentation("This output structure responds with the registration details for a pre-associated device")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetRegistrationTokenOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetRegistrationTokenOutput");
    private boolean canProceed;
    private RegistrationDetails registrationDetails;
    private String waitTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected boolean canProceed;
        protected RegistrationDetails registrationDetails;
        protected String waitTime;

        public GetRegistrationTokenOutput build() {
            GetRegistrationTokenOutput getRegistrationTokenOutput = new GetRegistrationTokenOutput();
            populate(getRegistrationTokenOutput);
            return getRegistrationTokenOutput;
        }

        public void populate(GetRegistrationTokenOutput getRegistrationTokenOutput) {
            getRegistrationTokenOutput.setRegistrationDetails(this.registrationDetails);
            getRegistrationTokenOutput.setWaitTime(this.waitTime);
            getRegistrationTokenOutput.setCanProceed(this.canProceed);
        }

        public Builder withCanProceed(boolean z) {
            this.canProceed = z;
            return this;
        }

        public Builder withRegistrationDetails(RegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }

        public Builder withWaitTime(String str) {
            this.waitTime = str;
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
        if (!(obj instanceof GetRegistrationTokenOutput)) {
            return false;
        }
        GetRegistrationTokenOutput getRegistrationTokenOutput = (GetRegistrationTokenOutput) obj;
        return Objects.equals(getRegistrationDetails(), getRegistrationTokenOutput.getRegistrationDetails()) && Objects.equals(getWaitTime(), getRegistrationTokenOutput.getWaitTime()) && Boolean.valueOf(isCanProceed()).equals(Boolean.valueOf(getRegistrationTokenOutput.isCanProceed()));
    }

    public RegistrationDetails getRegistrationDetails() {
        return this.registrationDetails;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getRegistrationDetails(), getWaitTime(), Boolean.valueOf(isCanProceed()));
    }

    public boolean isCanProceed() {
        return this.canProceed;
    }

    public void setCanProceed(boolean z) {
        this.canProceed = z;
    }

    public void setRegistrationDetails(RegistrationDetails registrationDetails) {
        this.registrationDetails = registrationDetails;
    }

    public void setWaitTime(String str) {
        this.waitTime = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withRegistrationDetails(getRegistrationDetails());
        builder.withWaitTime(getWaitTime());
        builder.withCanProceed(isCanProceed());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetRegistrationTokenOutput(registrationDetails=");
        sb.append(String.valueOf(this.registrationDetails));
        sb.append(", waitTime=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.waitTime, ", canProceed=", sb);
        sb.append(String.valueOf(this.canProceed));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
