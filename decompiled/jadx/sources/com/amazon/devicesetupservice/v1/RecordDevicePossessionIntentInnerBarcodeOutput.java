package com.amazon.devicesetupservice.v1;

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
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("RecordDevicePossessionIntentInnerBarcodeOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class RecordDevicePossessionIntentInnerBarcodeOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.RecordDevicePossessionIntentInnerBarcodeOutput");

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof RecordDevicePossessionIntentInnerBarcodeOutput);
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode));
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        return "RecordDevicePossessionIntentInnerBarcodeOutput()";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        public RecordDevicePossessionIntentInnerBarcodeOutput build() {
            RecordDevicePossessionIntentInnerBarcodeOutput recordDevicePossessionIntentInnerBarcodeOutput = new RecordDevicePossessionIntentInnerBarcodeOutput();
            populate(recordDevicePossessionIntentInnerBarcodeOutput);
            return recordDevicePossessionIntentInnerBarcodeOutput;
        }

        public void populate(RecordDevicePossessionIntentInnerBarcodeOutput recordDevicePossessionIntentInnerBarcodeOutput) {
        }
    }
}
