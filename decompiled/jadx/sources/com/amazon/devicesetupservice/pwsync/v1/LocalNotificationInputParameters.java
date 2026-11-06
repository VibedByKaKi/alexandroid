package com.amazon.devicesetupservice.pwsync.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.DiscoveryInputParameters;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.pwsync.v1/")
@Generated
@XmlName("LocalNotificationInputParameters")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class LocalNotificationInputParameters extends DiscoveryInputParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.pwsync.v1.LocalNotificationInputParameters");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends DiscoveryInputParameters.Builder {
        public LocalNotificationInputParameters build() {
            LocalNotificationInputParameters localNotificationInputParameters = new LocalNotificationInputParameters();
            populate(localNotificationInputParameters);
            return localNotificationInputParameters;
        }

        public void populate(LocalNotificationInputParameters localNotificationInputParameters) {
            super.populate((DiscoveryInputParameters) localNotificationInputParameters);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalNotificationInputParameters) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode));
    }

    public Builder toBuilder() {
        return new Builder();
    }

    @Override // com.amazon.devicesetupservice.DiscoveryInputParameters
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("LocalNotificationInputParameters(super="), super.toString(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
