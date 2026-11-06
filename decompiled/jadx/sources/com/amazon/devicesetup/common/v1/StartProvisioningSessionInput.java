package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("StartProvisioningSessionInput")
@Documentation("Input structure for the \"start provisioning session\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class StartProvisioningSessionInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.StartProvisioningSessionInput");
    private String nonce;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String nonce;

        public StartProvisioningSessionInput build() {
            StartProvisioningSessionInput startProvisioningSessionInput = new StartProvisioningSessionInput();
            populate(startProvisioningSessionInput);
            return startProvisioningSessionInput;
        }

        public void populate(StartProvisioningSessionInput startProvisioningSessionInput) {
            startProvisioningSessionInput.setNonce(this.nonce);
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
        if (obj instanceof StartProvisioningSessionInput) {
            return Objects.equals(getNonce(), ((StartProvisioningSessionInput) obj).getNonce());
        }
        return false;
    }

    @Required
    @Documentation("Nonce from the device.")
    @Pattern("^[\\w+=,:\\-\\/\\.]+$")
    public String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNonce());
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNonce(getNonce());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.nonce, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("StartProvisioningSessionInput(nonce="));
    }
}
