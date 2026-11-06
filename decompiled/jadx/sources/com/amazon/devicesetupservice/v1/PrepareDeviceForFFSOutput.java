package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
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
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("PrepareDeviceForFFSOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class PrepareDeviceForFFSOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.PrepareDeviceForFFSOutput");
    private String durationToWait;
    private Boolean success;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String durationToWait;
        protected Boolean success;

        public PrepareDeviceForFFSOutput build() {
            PrepareDeviceForFFSOutput prepareDeviceForFFSOutput = new PrepareDeviceForFFSOutput();
            populate(prepareDeviceForFFSOutput);
            return prepareDeviceForFFSOutput;
        }

        public void populate(PrepareDeviceForFFSOutput prepareDeviceForFFSOutput) {
            prepareDeviceForFFSOutput.setSuccess(this.success);
            prepareDeviceForFFSOutput.setDurationToWait(this.durationToWait);
        }

        public Builder withDurationToWait(String str) {
            this.durationToWait = str;
            return this;
        }

        public Builder withSuccess(Boolean bool) {
            this.success = bool;
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
        if (!(obj instanceof PrepareDeviceForFFSOutput)) {
            return false;
        }
        PrepareDeviceForFFSOutput prepareDeviceForFFSOutput = (PrepareDeviceForFFSOutput) obj;
        return Objects.equals(isSuccess(), prepareDeviceForFFSOutput.isSuccess()) && Objects.equals(getDurationToWait(), prepareDeviceForFFSOutput.getDurationToWait());
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getDurationToWait() {
        return this.durationToWait;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), isSuccess(), getDurationToWait());
    }

    public Boolean isSuccess() {
        return this.success;
    }

    public void setDurationToWait(String str) {
        this.durationToWait = str;
    }

    public void setSuccess(Boolean bool) {
        this.success = bool;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSuccess(isSuccess());
        builder.withDurationToWait(getDurationToWait());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrepareDeviceForFFSOutput(success=");
        sb.append(String.valueOf(this.success));
        sb.append(", durationToWait=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.durationToWait, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
