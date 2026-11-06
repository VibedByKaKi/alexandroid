package com.amazon.alexa.statereporting.lib.model.api.event;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ChangeReportEventPayload<PropertyKey> {

    @CheckForNull
    private final Change<PropertyKey> change;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ChangeReportEventPayloadBuilder<PropertyKey> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Change<PropertyKey> change;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportEventPayloadBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportEventPayload<PropertyKey> build() {
            return new ChangeReportEventPayload<>(this.change);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportEventPayloadBuilder<PropertyKey> change(@CheckForNull Change<PropertyKey> change) {
            this.change = change;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ChangeReportEventPayload.ChangeReportEventPayloadBuilder(change=", String.valueOf(this.change), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ChangeReportEventPayload(@CheckForNull Change<PropertyKey> change) {
        this.change = change;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <PropertyKey> ChangeReportEventPayloadBuilder<PropertyKey> builder() {
        return new ChangeReportEventPayloadBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ChangeReportEventPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeReportEventPayload)) {
            return false;
        }
        ChangeReportEventPayload changeReportEventPayload = (ChangeReportEventPayload) obj;
        if (!changeReportEventPayload.canEqual(this)) {
            return false;
        }
        Change<PropertyKey> change = getChange();
        Change<PropertyKey> change2 = changeReportEventPayload.getChange();
        return change != null ? change.equals(change2) : change2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Change<PropertyKey> getChange() {
        return this.change;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Change<PropertyKey> change = getChange();
        return 59 + (change == null ? 43 : change.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ChangeReportEventPayload(change=", String.valueOf(getChange()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
