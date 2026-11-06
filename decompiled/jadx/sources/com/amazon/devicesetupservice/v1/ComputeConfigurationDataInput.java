package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MapKeyConstraint;
import com.amazon.coral.annotation.MapValueConstraint;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.DataMapValue;
import com.amazon.devicesetup.common.v1.DeviceDetails;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ComputeConfigurationDataInput")
@Documentation("Input structure for the \"compute configuration data\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ComputeConfigurationDataInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.ComputeConfigurationDataInput");
    private Map<String, String> configuration;
    private Map<String, DataMapValue> configurationDataMap;
    private DeviceDetails deviceDetails;
    private String nonce;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Map<String, String> configuration;
        protected Map<String, DataMapValue> configurationDataMap;
        protected DeviceDetails deviceDetails;
        protected String nonce;

        public ComputeConfigurationDataInput build() {
            ComputeConfigurationDataInput computeConfigurationDataInput = new ComputeConfigurationDataInput();
            populate(computeConfigurationDataInput);
            return computeConfigurationDataInput;
        }

        public void populate(ComputeConfigurationDataInput computeConfigurationDataInput) {
            computeConfigurationDataInput.setNonce(this.nonce);
            computeConfigurationDataInput.setDeviceDetails(this.deviceDetails);
            computeConfigurationDataInput.setConfiguration(this.configuration);
            computeConfigurationDataInput.setConfigurationDataMap(this.configurationDataMap);
        }

        public Builder withConfiguration(Map<String, String> map) {
            this.configuration = map;
            return this;
        }

        public Builder withConfigurationDataMap(Map<String, DataMapValue> map) {
            this.configurationDataMap = map;
            return this;
        }

        public Builder withDeviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }

        public Builder withNonce(String str) {
            this.nonce = str;
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
        if (!(obj instanceof ComputeConfigurationDataInput)) {
            return false;
        }
        ComputeConfigurationDataInput computeConfigurationDataInput = (ComputeConfigurationDataInput) obj;
        return Objects.equals(getNonce(), computeConfigurationDataInput.getNonce()) && Objects.equals(getDeviceDetails(), computeConfigurationDataInput.getDeviceDetails()) && Objects.equals(getConfiguration(), computeConfigurationDataInput.getConfiguration()) && Objects.equals(getConfigurationDataMap(), computeConfigurationDataInput.getConfigurationDataMap());
    }

    @MapKeyConstraint(@NestedConstraints)
    @MapValueConstraint(@NestedConstraints)
    @Documentation("Configuration list for \"compute configuration data\" API.")
    public Map<String, String> getConfiguration() {
        return this.configuration;
    }

    @MapKeyConstraint(@NestedConstraints)
    @Documentation("Generic data map")
    public Map<String, DataMapValue> getConfigurationDataMap() {
        return this.configurationDataMap;
    }

    @Documentation("Device identifiers.")
    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce(), getDeviceDetails(), getConfiguration(), getConfigurationDataMap());
    }

    public void setConfiguration(Map<String, String> map) {
        this.configuration = map;
    }

    public void setConfigurationDataMap(Map<String, DataMapValue> map) {
        this.configurationDataMap = map;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        builder.withDeviceDetails(getDeviceDetails());
        builder.withConfiguration(getConfiguration());
        builder.withConfigurationDataMap(getConfigurationDataMap());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComputeConfigurationDataInput(nonce=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.nonce, ", deviceDetails=", sb);
        sb.append(String.valueOf(this.deviceDetails));
        sb.append(", configuration=");
        sb.append(String.valueOf(this.configuration));
        sb.append(", configurationDataMap=");
        sb.append(String.valueOf(this.configurationDataMap));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
