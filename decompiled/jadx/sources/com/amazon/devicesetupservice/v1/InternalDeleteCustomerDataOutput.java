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
@XmlName("InternalDeleteCustomerDataOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class InternalDeleteCustomerDataOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.InternalDeleteCustomerDataOutput");
    private Boolean isDataPresent;
    private Boolean isDeletionSuccessful;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Boolean isDataPresent;
        protected Boolean isDeletionSuccessful;

        public InternalDeleteCustomerDataOutput build() {
            InternalDeleteCustomerDataOutput internalDeleteCustomerDataOutput = new InternalDeleteCustomerDataOutput();
            populate(internalDeleteCustomerDataOutput);
            return internalDeleteCustomerDataOutput;
        }

        public void populate(InternalDeleteCustomerDataOutput internalDeleteCustomerDataOutput) {
            internalDeleteCustomerDataOutput.setIsDataPresent(this.isDataPresent);
            internalDeleteCustomerDataOutput.setIsDeletionSuccessful(this.isDeletionSuccessful);
        }

        public Builder withIsDataPresent(Boolean bool) {
            this.isDataPresent = bool;
            return this;
        }

        public Builder withIsDeletionSuccessful(Boolean bool) {
            this.isDeletionSuccessful = bool;
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
        if (!(obj instanceof InternalDeleteCustomerDataOutput)) {
            return false;
        }
        InternalDeleteCustomerDataOutput internalDeleteCustomerDataOutput = (InternalDeleteCustomerDataOutput) obj;
        return Objects.equals(isIsDataPresent(), internalDeleteCustomerDataOutput.isIsDataPresent()) && Objects.equals(isIsDeletionSuccessful(), internalDeleteCustomerDataOutput.isIsDeletionSuccessful());
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), isIsDataPresent(), isIsDeletionSuccessful());
    }

    public Boolean isIsDataPresent() {
        return this.isDataPresent;
    }

    public Boolean isIsDeletionSuccessful() {
        return this.isDeletionSuccessful;
    }

    public void setIsDataPresent(Boolean bool) {
        this.isDataPresent = bool;
    }

    public void setIsDeletionSuccessful(Boolean bool) {
        this.isDeletionSuccessful = bool;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withIsDataPresent(isIsDataPresent());
        builder.withIsDeletionSuccessful(isIsDeletionSuccessful());
        return builder;
    }

    public String toString() {
        return "InternalDeleteCustomerDataOutput(isDataPresent=" + String.valueOf(this.isDataPresent) + ", isDeletionSuccessful=" + String.valueOf(this.isDeletionSuccessful) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
