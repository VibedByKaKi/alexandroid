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
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("GetCustomerDevicesCredentialsV2Output")
@Documentation("Output structure for the \"Get Customer Devices Credentials V2\" API. It will contain a list of credentials\n        corresponding to many different Radio protocols (Zigbee, BLE Device, BLE Mesh) as well as a versioning. The\n        output of this API will be sent to a DSHS instance on an Amazon SH device (EFD, FireTV).")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetCustomerDevicesCredentialsV2Output {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.GetCustomerDevicesCredentialsV2Output");
    private SmartHomeDeviceCredentials credentials;
    private String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected SmartHomeDeviceCredentials credentials;
        protected String version;

        public GetCustomerDevicesCredentialsV2Output build() {
            GetCustomerDevicesCredentialsV2Output getCustomerDevicesCredentialsV2Output = new GetCustomerDevicesCredentialsV2Output();
            populate(getCustomerDevicesCredentialsV2Output);
            return getCustomerDevicesCredentialsV2Output;
        }

        public void populate(GetCustomerDevicesCredentialsV2Output getCustomerDevicesCredentialsV2Output) {
            getCustomerDevicesCredentialsV2Output.setVersion(this.version);
            getCustomerDevicesCredentialsV2Output.setCredentials(this.credentials);
        }

        public Builder withCredentials(SmartHomeDeviceCredentials smartHomeDeviceCredentials) {
            this.credentials = smartHomeDeviceCredentials;
            return this;
        }

        public Builder withVersion(String str) {
            this.version = str;
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
        if (!(obj instanceof GetCustomerDevicesCredentialsV2Output)) {
            return false;
        }
        GetCustomerDevicesCredentialsV2Output getCustomerDevicesCredentialsV2Output = (GetCustomerDevicesCredentialsV2Output) obj;
        return Objects.equals(getVersion(), getCustomerDevicesCredentialsV2Output.getVersion()) && Objects.equals(getCredentials(), getCustomerDevicesCredentialsV2Output.getCredentials());
    }

    @Documentation("An object containing lists of customers device credentials.")
    public SmartHomeDeviceCredentials getCredentials() {
        return this.credentials;
    }

    @Documentation("String indicating the DSHS API Version that is used on the device. It should correspond to the associated structure of the rest\n        of the object.")
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getVersion(), getCredentials());
    }

    public void setCredentials(SmartHomeDeviceCredentials smartHomeDeviceCredentials) {
        this.credentials = smartHomeDeviceCredentials;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withVersion(getVersion());
        builder.withCredentials(getCredentials());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetCustomerDevicesCredentialsV2Output(version=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.version, ", credentials=", sb);
        sb.append(String.valueOf(this.credentials));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
