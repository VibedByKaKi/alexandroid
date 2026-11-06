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
import com.amazon.devicesetupservice.CustomerOptInPreference;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("CustomerSidewalkOptInPreference")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CustomerSidewalkOptInPreference {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.CustomerSidewalkOptInPreference");
    private String customerOptInPreference;
    private long ringLastUpdatedTimeStamp;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String customerOptInPreference;
        protected long ringLastUpdatedTimeStamp;

        public CustomerSidewalkOptInPreference build() {
            CustomerSidewalkOptInPreference customerSidewalkOptInPreference = new CustomerSidewalkOptInPreference();
            populate(customerSidewalkOptInPreference);
            return customerSidewalkOptInPreference;
        }

        public void populate(CustomerSidewalkOptInPreference customerSidewalkOptInPreference) {
            customerSidewalkOptInPreference.setCustomerOptInPreference(this.customerOptInPreference);
            customerSidewalkOptInPreference.setRingLastUpdatedTimeStamp(this.ringLastUpdatedTimeStamp);
        }

        public Builder withCustomerOptInPreference(String str) {
            this.customerOptInPreference = str;
            return this;
        }

        public Builder withRingLastUpdatedTimeStamp(long j) {
            this.ringLastUpdatedTimeStamp = j;
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
        if (!(obj instanceof CustomerSidewalkOptInPreference)) {
            return false;
        }
        CustomerSidewalkOptInPreference customerSidewalkOptInPreference = (CustomerSidewalkOptInPreference) obj;
        return Objects.equals(getCustomerOptInPreference(), customerSidewalkOptInPreference.getCustomerOptInPreference()) && Long.valueOf(getRingLastUpdatedTimeStamp()).equals(Long.valueOf(customerSidewalkOptInPreference.getRingLastUpdatedTimeStamp()));
    }

    @EnumValues({"OPTED_OUT", "OPTED_IN", CustomerOptInPreference.NO_DATA_ASSUME_OPTED_OUT})
    public String getCustomerOptInPreference() {
        return this.customerOptInPreference;
    }

    @Documentation("Number of milliseconds since January 1, 1970, 00:00:00 UTC.")
    public long getRingLastUpdatedTimeStamp() {
        return this.ringLastUpdatedTimeStamp;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerOptInPreference(), Long.valueOf(getRingLastUpdatedTimeStamp()));
    }

    public void setCustomerOptInPreference(String str) {
        this.customerOptInPreference = str;
    }

    public void setRingLastUpdatedTimeStamp(long j) {
        this.ringLastUpdatedTimeStamp = j;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerOptInPreference(getCustomerOptInPreference());
        builder.withRingLastUpdatedTimeStamp(getRingLastUpdatedTimeStamp());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerSidewalkOptInPreference(customerOptInPreference=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerOptInPreference, ", ringLastUpdatedTimeStamp=", sb);
        sb.append(String.valueOf(this.ringLastUpdatedTimeStamp));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
