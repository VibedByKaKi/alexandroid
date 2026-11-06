package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("GetCustomerProvisioneesSetupStatusOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetCustomerProvisioneesSetupStatusOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetCustomerProvisioneesSetupStatusOutput");
    private String endpointToUse;
    private List<ProvisioneeSetupInformation> provisioneeSetupInformationList;
    private String searchIntervalUsed;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;
        protected List<ProvisioneeSetupInformation> provisioneeSetupInformationList;
        protected String searchIntervalUsed;

        public GetCustomerProvisioneesSetupStatusOutput build() {
            GetCustomerProvisioneesSetupStatusOutput getCustomerProvisioneesSetupStatusOutput = new GetCustomerProvisioneesSetupStatusOutput();
            populate(getCustomerProvisioneesSetupStatusOutput);
            return getCustomerProvisioneesSetupStatusOutput;
        }

        public void populate(GetCustomerProvisioneesSetupStatusOutput getCustomerProvisioneesSetupStatusOutput) {
            getCustomerProvisioneesSetupStatusOutput.setSearchIntervalUsed(this.searchIntervalUsed);
            getCustomerProvisioneesSetupStatusOutput.setProvisioneeSetupInformationList(this.provisioneeSetupInformationList);
            getCustomerProvisioneesSetupStatusOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withProvisioneeSetupInformationList(List<ProvisioneeSetupInformation> list) {
            this.provisioneeSetupInformationList = list;
            return this;
        }

        public Builder withSearchIntervalUsed(String str) {
            this.searchIntervalUsed = str;
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
        if (!(obj instanceof GetCustomerProvisioneesSetupStatusOutput)) {
            return false;
        }
        GetCustomerProvisioneesSetupStatusOutput getCustomerProvisioneesSetupStatusOutput = (GetCustomerProvisioneesSetupStatusOutput) obj;
        return Objects.equals(getSearchIntervalUsed(), getCustomerProvisioneesSetupStatusOutput.getSearchIntervalUsed()) && Objects.equals(getProvisioneeSetupInformationList(), getCustomerProvisioneesSetupStatusOutput.getProvisioneeSetupInformationList()) && Objects.equals(getEndpointToUse(), getCustomerProvisioneesSetupStatusOutput.getEndpointToUse());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    public List<ProvisioneeSetupInformation> getProvisioneeSetupInformationList() {
        return this.provisioneeSetupInformationList;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getSearchIntervalUsed() {
        return this.searchIntervalUsed;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSearchIntervalUsed(), getProvisioneeSetupInformationList(), getEndpointToUse());
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setProvisioneeSetupInformationList(List<ProvisioneeSetupInformation> list) {
        this.provisioneeSetupInformationList = list;
    }

    public void setSearchIntervalUsed(String str) {
        this.searchIntervalUsed = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSearchIntervalUsed(getSearchIntervalUsed());
        builder.withProvisioneeSetupInformationList(getProvisioneeSetupInformationList());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetCustomerProvisioneesSetupStatusOutput(searchIntervalUsed=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.searchIntervalUsed, ", provisioneeSetupInformationList=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", endpointToUse=", (List) this.provisioneeSetupInformationList, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
