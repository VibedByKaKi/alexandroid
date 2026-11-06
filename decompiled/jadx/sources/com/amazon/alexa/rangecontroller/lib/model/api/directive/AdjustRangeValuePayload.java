package com.amazon.alexa.rangecontroller.lib.model.api.directive;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AdjustRangeValuePayload {

    @CheckForNull
    private final Double rangeValueDelta;

    @CheckForNull
    private final Boolean rangeValueDeltaDefault;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class AdjustRangeValuePayloadBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Double rangeValueDelta;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean rangeValueDeltaDefault;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AdjustRangeValuePayloadBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AdjustRangeValuePayload build() {
            return new AdjustRangeValuePayload(this.rangeValueDelta, this.rangeValueDeltaDefault);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AdjustRangeValuePayloadBuilder rangeValueDelta(@CheckForNull Double d) {
            this.rangeValueDelta = d;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AdjustRangeValuePayloadBuilder rangeValueDeltaDefault(@CheckForNull Boolean bool) {
            this.rangeValueDeltaDefault = bool;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "AdjustRangeValuePayload.AdjustRangeValuePayloadBuilder(rangeValueDelta=" + this.rangeValueDelta + ", rangeValueDeltaDefault=" + this.rangeValueDeltaDefault + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AdjustRangeValuePayload(@CheckForNull Double d, @CheckForNull Boolean bool) {
        this.rangeValueDelta = d;
        this.rangeValueDeltaDefault = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static AdjustRangeValuePayloadBuilder builder() {
        return new AdjustRangeValuePayloadBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdjustRangeValuePayload)) {
            return false;
        }
        AdjustRangeValuePayload adjustRangeValuePayload = (AdjustRangeValuePayload) obj;
        Double rangeValueDelta = getRangeValueDelta();
        Double rangeValueDelta2 = adjustRangeValuePayload.getRangeValueDelta();
        if (rangeValueDelta != null ? !rangeValueDelta.equals(rangeValueDelta2) : rangeValueDelta2 != null) {
            return false;
        }
        Boolean rangeValueDeltaDefault = getRangeValueDeltaDefault();
        Boolean rangeValueDeltaDefault2 = adjustRangeValuePayload.getRangeValueDeltaDefault();
        return rangeValueDeltaDefault != null ? rangeValueDeltaDefault.equals(rangeValueDeltaDefault2) : rangeValueDeltaDefault2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Double getRangeValueDelta() {
        return this.rangeValueDelta;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getRangeValueDeltaDefault() {
        return this.rangeValueDeltaDefault;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Double rangeValueDelta = getRangeValueDelta();
        int hashCode = rangeValueDelta == null ? 43 : rangeValueDelta.hashCode();
        Boolean rangeValueDeltaDefault = getRangeValueDeltaDefault();
        return ((hashCode + 59) * 59) + (rangeValueDeltaDefault != null ? rangeValueDeltaDefault.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "AdjustRangeValuePayload(rangeValueDelta=" + getRangeValueDelta() + ", rangeValueDeltaDefault=" + getRangeValueDeltaDefault() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
