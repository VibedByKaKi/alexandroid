package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("InternalDiscoveredProvisioneeInput")
@Documentation("Input structure for the \"discovered provisionee\" internal API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalDiscoveredProvisioneeInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalDiscoveredProvisioneeInput");
    private DiscoveredProvisioneeInput discoveredProvisioneeInputData;
    private ProvisionerIdentity provisionerIdentity;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected DiscoveredProvisioneeInput discoveredProvisioneeInputData;
        protected ProvisionerIdentity provisionerIdentity;

        public InternalDiscoveredProvisioneeInput build() {
            InternalDiscoveredProvisioneeInput internalDiscoveredProvisioneeInput = new InternalDiscoveredProvisioneeInput();
            populate(internalDiscoveredProvisioneeInput);
            return internalDiscoveredProvisioneeInput;
        }

        public void populate(InternalDiscoveredProvisioneeInput internalDiscoveredProvisioneeInput) {
            internalDiscoveredProvisioneeInput.setDiscoveredProvisioneeInputData(this.discoveredProvisioneeInputData);
            internalDiscoveredProvisioneeInput.setProvisionerIdentity(this.provisionerIdentity);
        }

        public Builder withDiscoveredProvisioneeInputData(DiscoveredProvisioneeInput discoveredProvisioneeInput) {
            this.discoveredProvisioneeInputData = discoveredProvisioneeInput;
            return this;
        }

        public Builder withProvisionerIdentity(ProvisionerIdentity provisionerIdentity) {
            this.provisionerIdentity = provisionerIdentity;
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
        if (!(obj instanceof InternalDiscoveredProvisioneeInput)) {
            return false;
        }
        InternalDiscoveredProvisioneeInput internalDiscoveredProvisioneeInput = (InternalDiscoveredProvisioneeInput) obj;
        return Objects.equals(getDiscoveredProvisioneeInputData(), internalDiscoveredProvisioneeInput.getDiscoveredProvisioneeInputData()) && Objects.equals(getProvisionerIdentity(), internalDiscoveredProvisioneeInput.getProvisionerIdentity());
    }

    @Required
    public DiscoveredProvisioneeInput getDiscoveredProvisioneeInputData() {
        return this.discoveredProvisioneeInputData;
    }

    @Required
    @Documentation("Pseudo-provisioner-identity for the \"discovered provisionee\" internal API.")
    public ProvisionerIdentity getProvisionerIdentity() {
        return this.provisionerIdentity;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDiscoveredProvisioneeInputData(), getProvisionerIdentity());
    }

    public void setDiscoveredProvisioneeInputData(DiscoveredProvisioneeInput discoveredProvisioneeInput) {
        this.discoveredProvisioneeInputData = discoveredProvisioneeInput;
    }

    public void setProvisionerIdentity(ProvisionerIdentity provisionerIdentity) {
        this.provisionerIdentity = provisionerIdentity;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDiscoveredProvisioneeInputData(getDiscoveredProvisioneeInputData());
        builder.withProvisionerIdentity(getProvisionerIdentity());
        return builder;
    }

    public String toString() {
        return "InternalDiscoveredProvisioneeInput(discoveredProvisioneeInputData=" + String.valueOf(this.discoveredProvisioneeInputData) + ", provisionerIdentity=" + String.valueOf(this.provisionerIdentity) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
