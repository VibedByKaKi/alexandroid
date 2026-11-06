package com.amazon.devicesetupservice;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/")
@CoralSuppressWarnings
@Generated
@XmlName("ProvisioneeIdentifier")
@Documentation("This is the base structure for identifying a provisionee during a setup progress status check.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public abstract class ProvisioneeIdentifier {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.ProvisioneeIdentifier");

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ProvisioneeIdentifier);
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode));
    }

    public String toString() {
        return "ProvisioneeIdentifier()";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        public void populate(ProvisioneeIdentifier provisioneeIdentifier) {
        }
    }
}
