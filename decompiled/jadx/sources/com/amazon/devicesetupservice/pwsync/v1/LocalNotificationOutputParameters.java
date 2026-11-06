package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.DiscoveryOutputParameters;
import com.amazon.devicesetupservice.v1.LegacyIdentifier;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("LocalNotificationOutputParameters")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class LocalNotificationOutputParameters extends DiscoveryOutputParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.LocalNotificationOutputParameters");
    private LegacyIdentifier provisioneeInformation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DiscoveryOutputParameters.Builder {
        protected LegacyIdentifier provisioneeInformation;

        public LocalNotificationOutputParameters build() {
            LocalNotificationOutputParameters localNotificationOutputParameters = new LocalNotificationOutputParameters();
            populate(localNotificationOutputParameters);
            return localNotificationOutputParameters;
        }

        public void populate(LocalNotificationOutputParameters localNotificationOutputParameters) {
            super.populate((DiscoveryOutputParameters) localNotificationOutputParameters);
            localNotificationOutputParameters.setProvisioneeInformation(this.provisioneeInformation);
        }

        public Builder withProvisioneeInformation(LegacyIdentifier legacyIdentifier) {
            this.provisioneeInformation = legacyIdentifier;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.DiscoveryOutputParameters
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalNotificationOutputParameters) {
            return super.equals(obj) && Objects.equals(getProvisioneeInformation(), ((LocalNotificationOutputParameters) obj).getProvisioneeInformation());
        }
        return false;
    }

    public LegacyIdentifier getProvisioneeInformation() {
        return this.provisioneeInformation;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryOutputParameters
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getProvisioneeInformation());
    }

    public void setProvisioneeInformation(LegacyIdentifier legacyIdentifier) {
        this.provisioneeInformation = legacyIdentifier;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProvisioneeInformation(getProvisioneeInformation());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryOutputParameters
    public String toString() {
        return "LocalNotificationOutputParameters(super=" + super.toString() + ", provisioneeInformation=" + String.valueOf(this.provisioneeInformation) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
