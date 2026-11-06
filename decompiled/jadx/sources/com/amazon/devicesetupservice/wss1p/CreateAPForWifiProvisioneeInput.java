package com.amazon.devicesetupservice.wss1p;

import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinValue;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.v1.AuthenticatedInput;
import com.amazon.devicesetupservice.v1.ProvisionerInfo;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.wss1p/")
@CoralSuppressWarnings
@Generated
@XmlName("CreateAPForWifiProvisioneeInput")
@Documentation("Input structure for \"Create AP For Wifi Provisionee\" API. Its input includes\n        discovered device, provisioner info and active connections count")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CreateAPForWifiProvisioneeInput extends AuthenticatedInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.wss1p.CreateAPForWifiProvisioneeInput");
    private int activeConnectionsCount;
    private DiscoveredDevice discoveredDevice;
    private ProvisionerInfo provisionerInfo;

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
        if (!(obj instanceof CreateAPForWifiProvisioneeInput)) {
            return false;
        }
        CreateAPForWifiProvisioneeInput createAPForWifiProvisioneeInput = (CreateAPForWifiProvisioneeInput) obj;
        return super.equals(obj) && Objects.equals(getDiscoveredDevice(), createAPForWifiProvisioneeInput.getDiscoveredDevice()) && Objects.equals(getProvisionerInfo(), createAPForWifiProvisioneeInput.getProvisionerInfo()) && Integer.valueOf(getActiveConnectionsCount()).equals(Integer.valueOf(createAPForWifiProvisioneeInput.getActiveConnectionsCount()));
    }

    @Documentation("Count of number of active connections for the provisioner device")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public int getActiveConnectionsCount() {
        return this.activeConnectionsCount;
    }

    @Required
    @Documentation("Structure holds discovered device's mac, rssi and encodedSsid")
    public DiscoveredDevice getDiscoveredDevice() {
        return this.discoveredDevice;
    }

    @Required
    public ProvisionerInfo getProvisionerInfo() {
        return this.provisionerInfo;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getDiscoveredDevice(), getProvisionerInfo(), Integer.valueOf(getActiveConnectionsCount()));
    }

    public void setActiveConnectionsCount(int i) {
        this.activeConnectionsCount = i;
    }

    public void setDiscoveredDevice(DiscoveredDevice discoveredDevice) {
        this.discoveredDevice = discoveredDevice;
    }

    public void setProvisionerInfo(ProvisionerInfo provisionerInfo) {
        this.provisionerInfo = provisionerInfo;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withAccessToken(getAccessToken());
        builder.withDiscoveredDevice(getDiscoveredDevice());
        builder.withProvisionerInfo(getProvisionerInfo());
        builder.withActiveConnectionsCount(getActiveConnectionsCount());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput
    public String toString() {
        return "CreateAPForWifiProvisioneeInput(super=" + super.toString() + ", , , discoveredDevice=" + String.valueOf(this.discoveredDevice) + ", provisionerInfo=" + String.valueOf(this.provisionerInfo) + ", activeConnectionsCount=" + String.valueOf(this.activeConnectionsCount) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends AuthenticatedInput.Builder {
        protected int activeConnectionsCount;
        protected DiscoveredDevice discoveredDevice;
        protected ProvisionerInfo provisionerInfo;

        public CreateAPForWifiProvisioneeInput build() {
            CreateAPForWifiProvisioneeInput createAPForWifiProvisioneeInput = new CreateAPForWifiProvisioneeInput();
            populate(createAPForWifiProvisioneeInput);
            return createAPForWifiProvisioneeInput;
        }

        public void populate(CreateAPForWifiProvisioneeInput createAPForWifiProvisioneeInput) {
            super.populate((AuthenticatedInput) createAPForWifiProvisioneeInput);
            createAPForWifiProvisioneeInput.setDiscoveredDevice(this.discoveredDevice);
            createAPForWifiProvisioneeInput.setProvisionerInfo(this.provisionerInfo);
            createAPForWifiProvisioneeInput.setActiveConnectionsCount(this.activeConnectionsCount);
        }

        public Builder withActiveConnectionsCount(int i) {
            this.activeConnectionsCount = i;
            return this;
        }

        public Builder withDiscoveredDevice(DiscoveredDevice discoveredDevice) {
            this.discoveredDevice = discoveredDevice;
            return this;
        }

        public Builder withProvisionerInfo(ProvisionerInfo provisionerInfo) {
            this.provisionerInfo = provisionerInfo;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.AuthenticatedInput.Builder
        public Builder withAccessToken(String str) {
            super.withAccessToken(str);
            return this;
        }
    }
}
