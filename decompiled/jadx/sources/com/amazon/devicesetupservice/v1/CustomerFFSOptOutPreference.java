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
@XmlName("CustomerFFSOptOutPreference")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CustomerFFSOptOutPreference {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.CustomerFFSOptOutPreference");
    private long createdUTC;
    private String customerFFSPreference;
    private long lastUpdatedUTC;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected long createdUTC;
        protected String customerFFSPreference;
        protected long lastUpdatedUTC;

        public CustomerFFSOptOutPreference build() {
            CustomerFFSOptOutPreference customerFFSOptOutPreference = new CustomerFFSOptOutPreference();
            populate(customerFFSOptOutPreference);
            return customerFFSOptOutPreference;
        }

        public void populate(CustomerFFSOptOutPreference customerFFSOptOutPreference) {
            customerFFSOptOutPreference.setCustomerFFSPreference(this.customerFFSPreference);
            customerFFSOptOutPreference.setCreatedUTC(this.createdUTC);
            customerFFSOptOutPreference.setLastUpdatedUTC(this.lastUpdatedUTC);
        }

        public Builder withCreatedUTC(long j) {
            this.createdUTC = j;
            return this;
        }

        public Builder withCustomerFFSPreference(String str) {
            this.customerFFSPreference = str;
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
        if (!(obj instanceof CustomerFFSOptOutPreference)) {
            return false;
        }
        CustomerFFSOptOutPreference customerFFSOptOutPreference = (CustomerFFSOptOutPreference) obj;
        return Objects.equals(getCustomerFFSPreference(), customerFFSOptOutPreference.getCustomerFFSPreference()) && Long.valueOf(getCreatedUTC()).equals(Long.valueOf(customerFFSOptOutPreference.getCreatedUTC())) && Long.valueOf(getLastUpdatedUTC()).equals(Long.valueOf(customerFFSOptOutPreference.getLastUpdatedUTC()));
    }

    @Documentation("Number of milliseconds since January 1, 1970, 00:00:00 UTC.")
    public long getCreatedUTC() {
        return this.createdUTC;
    }

    @EnumValues({"OPTED_OUT", "OPTED_IN", CustomerFFSPreference.NO_DATA_ASSUME_OPTED_IN})
    public String getCustomerFFSPreference() {
        return this.customerFFSPreference;
    }

    @Documentation("Number of milliseconds since January 1, 1970, 00:00:00 UTC.")
    public long getLastUpdatedUTC() {
        return this.lastUpdatedUTC;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCustomerFFSPreference(), Long.valueOf(getCreatedUTC()), Long.valueOf(getLastUpdatedUTC()));
    }

    public void setCreatedUTC(long j) {
        this.createdUTC = j;
    }

    public void setCustomerFFSPreference(String str) {
        this.customerFFSPreference = str;
    }

    public void setLastUpdatedUTC(long j) {
        this.lastUpdatedUTC = j;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCustomerFFSPreference(getCustomerFFSPreference());
        builder.withCreatedUTC(getCreatedUTC());
        builder.withLastUpdatedUTC(getLastUpdatedUTC());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerFFSOptOutPreference(customerFFSPreference=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.customerFFSPreference, ", createdUTC=", sb);
        sb.append(String.valueOf(this.createdUTC));
        sb.append(", lastUpdatedUTC=");
        sb.append(String.valueOf(this.lastUpdatedUTC));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
