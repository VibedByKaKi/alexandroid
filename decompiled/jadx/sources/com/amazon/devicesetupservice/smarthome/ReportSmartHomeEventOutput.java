package com.amazon.devicesetupservice.smarthome;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@Generated
@XmlName("ReportSmartHomeEventOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ReportSmartHomeEventOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.ReportSmartHomeEventOutput");

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ReportSmartHomeEventOutput);
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode));
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        return "ReportSmartHomeEventOutput()";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        public ReportSmartHomeEventOutput build() {
            ReportSmartHomeEventOutput reportSmartHomeEventOutput = new ReportSmartHomeEventOutput();
            populate(reportSmartHomeEventOutput);
            return reportSmartHomeEventOutput;
        }

        public void populate(ReportSmartHomeEventOutput reportSmartHomeEventOutput) {
        }
    }
}
