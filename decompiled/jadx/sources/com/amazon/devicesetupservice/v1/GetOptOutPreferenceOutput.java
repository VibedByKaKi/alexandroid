package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.CustomerFFSPreference;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("GetOptOutPreferenceOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetOptOutPreferenceOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetOptOutPreferenceOutput");
    private long createdUTC;
    private CustomerFFSOptOutPreference customerFFSOptOutPreference;
    private String customerFFSPreference;
    private CustomerSidewalkOptInPreference customerSidewalkPreference;
    private Boolean hasOptedOut;
    private long lastUpdatedUTC;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected long createdUTC;
        protected CustomerFFSOptOutPreference customerFFSOptOutPreference;
        protected String customerFFSPreference;
        protected CustomerSidewalkOptInPreference customerSidewalkPreference;
        protected Boolean hasOptedOut;
        protected long lastUpdatedUTC;

        public GetOptOutPreferenceOutput build() {
            GetOptOutPreferenceOutput getOptOutPreferenceOutput = new GetOptOutPreferenceOutput();
            populate(getOptOutPreferenceOutput);
            return getOptOutPreferenceOutput;
        }

        public void populate(GetOptOutPreferenceOutput getOptOutPreferenceOutput) {
            getOptOutPreferenceOutput.setHasOptedOut(this.hasOptedOut);
            getOptOutPreferenceOutput.setCustomerFFSPreference(this.customerFFSPreference);
            getOptOutPreferenceOutput.setCreatedUTC(this.createdUTC);
            getOptOutPreferenceOutput.setLastUpdatedUTC(this.lastUpdatedUTC);
            getOptOutPreferenceOutput.setCustomerSidewalkPreference(this.customerSidewalkPreference);
            getOptOutPreferenceOutput.setCustomerFFSOptOutPreference(this.customerFFSOptOutPreference);
        }

        public Builder withCreatedUTC(long j) {
            this.createdUTC = j;
            return this;
        }

        public Builder withCustomerFFSOptOutPreference(CustomerFFSOptOutPreference customerFFSOptOutPreference) {
            this.customerFFSOptOutPreference = customerFFSOptOutPreference;
            return this;
        }

        public Builder withCustomerFFSPreference(String str) {
            this.customerFFSPreference = str;
            return this;
        }

        public Builder withCustomerSidewalkPreference(CustomerSidewalkOptInPreference customerSidewalkOptInPreference) {
            this.customerSidewalkPreference = customerSidewalkOptInPreference;
            return this;
        }

        public Builder withHasOptedOut(Boolean bool) {
            this.hasOptedOut = bool;
            return this;
        }

        public Builder withLastUpdatedUTC(long j) {
            this.lastUpdatedUTC = j;
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
        if (!(obj instanceof GetOptOutPreferenceOutput)) {
            return false;
        }
        GetOptOutPreferenceOutput getOptOutPreferenceOutput = (GetOptOutPreferenceOutput) obj;
        return Objects.equals(isHasOptedOut(), getOptOutPreferenceOutput.isHasOptedOut()) && Objects.equals(getCustomerFFSPreference(), getOptOutPreferenceOutput.getCustomerFFSPreference()) && Long.valueOf(getCreatedUTC()).equals(Long.valueOf(getOptOutPreferenceOutput.getCreatedUTC())) && Long.valueOf(getLastUpdatedUTC()).equals(Long.valueOf(getOptOutPreferenceOutput.getLastUpdatedUTC())) && Objects.equals(getCustomerSidewalkPreference(), getOptOutPreferenceOutput.getCustomerSidewalkPreference()) && Objects.equals(getCustomerFFSOptOutPreference(), getOptOutPreferenceOutput.getCustomerFFSOptOutPreference());
    }

    @Documentation("Number of milliseconds since January 1, 1970, 00:00:00 UTC.")
    public long getCreatedUTC() {
        return this.createdUTC;
    }

    public CustomerFFSOptOutPreference getCustomerFFSOptOutPreference() {
        return this.customerFFSOptOutPreference;
    }

    @EnumValues({"OPTED_OUT", "OPTED_IN", CustomerFFSPreference.NO_DATA_ASSUME_OPTED_IN})
    public String getCustomerFFSPreference() {
        return this.customerFFSPreference;
    }

    public CustomerSidewalkOptInPreference getCustomerSidewalkPreference() {
        return this.customerSidewalkPreference;
    }

    @Documentation("Number of milliseconds since January 1, 1970, 00:00:00 UTC.")
    public long getLastUpdatedUTC() {
        return this.lastUpdatedUTC;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), isHasOptedOut(), getCustomerFFSPreference(), Long.valueOf(getCreatedUTC()), Long.valueOf(getLastUpdatedUTC()), getCustomerSidewalkPreference(), getCustomerFFSOptOutPreference());
    }

    public Boolean isHasOptedOut() {
        return this.hasOptedOut;
    }

    public void setCreatedUTC(long j) {
        this.createdUTC = j;
    }

    public void setCustomerFFSOptOutPreference(CustomerFFSOptOutPreference customerFFSOptOutPreference) {
        this.customerFFSOptOutPreference = customerFFSOptOutPreference;
    }

    public void setCustomerFFSPreference(String str) {
        this.customerFFSPreference = str;
    }

    public void setCustomerSidewalkPreference(CustomerSidewalkOptInPreference customerSidewalkOptInPreference) {
        this.customerSidewalkPreference = customerSidewalkOptInPreference;
    }

    public void setHasOptedOut(Boolean bool) {
        this.hasOptedOut = bool;
    }

    public void setLastUpdatedUTC(long j) {
        this.lastUpdatedUTC = j;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withHasOptedOut(isHasOptedOut());
        builder.withCustomerFFSPreference(getCustomerFFSPreference());
        builder.withCreatedUTC(getCreatedUTC());
        builder.withLastUpdatedUTC(getLastUpdatedUTC());
        builder.withCustomerSidewalkPreference(getCustomerSidewalkPreference());
        builder.withCustomerFFSOptOutPreference(getCustomerFFSOptOutPreference());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetOptOutPreferenceOutput(hasOptedOut=");
        sb.append(String.valueOf(this.hasOptedOut));
        sb.append(", customerFFSPreference=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerFFSPreference, ", createdUTC=", sb);
        sb.append(String.valueOf(this.createdUTC));
        sb.append(", lastUpdatedUTC=");
        sb.append(String.valueOf(this.lastUpdatedUTC));
        sb.append(", customerSidewalkPreference=");
        sb.append(String.valueOf(this.customerSidewalkPreference));
        sb.append(", customerFFSOptOutPreference=");
        sb.append(String.valueOf(this.customerFFSOptOutPreference));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
