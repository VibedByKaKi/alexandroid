package com.amazon.devicesetupservice.smarthome;

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
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("GetCustomerDevicesCredentialsOutput")
@Documentation("Output structure for the \"Get Customer Devices Credentials\" API. It will contain\n        a list of CredentialResponses.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetCustomerDevicesCredentialsOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.GetCustomerDevicesCredentialsOutput");
    private List<SmartHomeCredential> credentialsList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<SmartHomeCredential> credentialsList;

        public GetCustomerDevicesCredentialsOutput build() {
            GetCustomerDevicesCredentialsOutput getCustomerDevicesCredentialsOutput = new GetCustomerDevicesCredentialsOutput();
            populate(getCustomerDevicesCredentialsOutput);
            return getCustomerDevicesCredentialsOutput;
        }

        public void populate(GetCustomerDevicesCredentialsOutput getCustomerDevicesCredentialsOutput) {
            getCustomerDevicesCredentialsOutput.setCredentialsList(this.credentialsList);
        }

        public Builder withCredentialsList(List<SmartHomeCredential> list) {
            this.credentialsList = list;
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
        if (obj instanceof GetCustomerDevicesCredentialsOutput) {
            return Objects.equals(getCredentialsList(), ((GetCustomerDevicesCredentialsOutput) obj).getCredentialsList());
        }
        return false;
    }

    @Documentation("A list of SmartHomeCredential objects.")
    public List<SmartHomeCredential> getCredentialsList() {
        return this.credentialsList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCredentialsList());
    }

    public void setCredentialsList(List<SmartHomeCredential> list) {
        this.credentialsList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCredentialsList(getCredentialsList());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.credentialsList, new StringBuilder("GetCustomerDevicesCredentialsOutput(credentialsList="));
    }
}
