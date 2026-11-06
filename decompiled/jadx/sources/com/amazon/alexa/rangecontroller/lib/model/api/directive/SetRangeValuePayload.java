package com.amazon.alexa.rangecontroller.lib.model.api.directive;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SetRangeValuePayload {

    @CheckForNull
    private final Double rangeValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SetRangeValuePayloadBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Double rangeValue;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetRangeValuePayloadBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetRangeValuePayload build() {
            return new SetRangeValuePayload(this.rangeValue);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetRangeValuePayloadBuilder rangeValue(@CheckForNull Double d) {
            this.rangeValue = d;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "SetRangeValuePayload.SetRangeValuePayloadBuilder(rangeValue=" + this.rangeValue + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetRangeValuePayload(@CheckForNull Double d) {
        this.rangeValue = d;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static SetRangeValuePayloadBuilder builder() {
        return new SetRangeValuePayloadBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetRangeValuePayload)) {
            return false;
        }
        Double rangeValue = getRangeValue();
        Double rangeValue2 = ((SetRangeValuePayload) obj).getRangeValue();
        return rangeValue != null ? rangeValue.equals(rangeValue2) : rangeValue2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Double getRangeValue() {
        return this.rangeValue;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Double rangeValue = getRangeValue();
        return 59 + (rangeValue == null ? 43 : rangeValue.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SetRangeValuePayload(rangeValue=" + getRangeValue() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
