package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput");
    private Boolean activeZeroTouchSetupSession;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Boolean activeZeroTouchSetupSession;

        public InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput build() {
            InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput internalGetCustomerProvisioneeZeroTouchSetupStatusOutput = new InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput();
            populate(internalGetCustomerProvisioneeZeroTouchSetupStatusOutput);
            return internalGetCustomerProvisioneeZeroTouchSetupStatusOutput;
        }

        public void populate(InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput internalGetCustomerProvisioneeZeroTouchSetupStatusOutput) {
            internalGetCustomerProvisioneeZeroTouchSetupStatusOutput.setActiveZeroTouchSetupSession(this.activeZeroTouchSetupSession);
        }

        public Builder withActiveZeroTouchSetupSession(Boolean bool) {
            this.activeZeroTouchSetupSession = bool;
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
        if (obj instanceof InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput) {
            return Objects.equals(isActiveZeroTouchSetupSession(), ((InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput) obj).isActiveZeroTouchSetupSession());
        }
        return false;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), isActiveZeroTouchSetupSession());
    }

    public Boolean isActiveZeroTouchSetupSession() {
        return this.activeZeroTouchSetupSession;
    }

    public void setActiveZeroTouchSetupSession(Boolean bool) {
        this.activeZeroTouchSetupSession = bool;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withActiveZeroTouchSetupSession(isActiveZeroTouchSetupSession());
        return builder;
    }

    public String toString() {
        return "InternalGetCustomerProvisioneeZeroTouchSetupStatusOutput(activeZeroTouchSetupSession=" + String.valueOf(this.activeZeroTouchSetupSession) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
