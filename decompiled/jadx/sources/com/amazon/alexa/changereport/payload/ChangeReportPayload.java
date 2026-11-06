package com.amazon.alexa.changereport.payload;

import com.amazon.alexa.changereport.Change;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ChangeReportPayload<NamespaceType, NameType, InstanceType, ValueType> {

    @CheckForNull
    private final Change<NamespaceType, NameType, InstanceType, ValueType> change;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ChangeReportPayloadBuilder<NamespaceType, NameType, InstanceType, ValueType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Change<NamespaceType, NameType, InstanceType, ValueType> change;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportPayloadBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportPayload<NamespaceType, NameType, InstanceType, ValueType> build() {
            return new ChangeReportPayload<>(this.change);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportPayloadBuilder<NamespaceType, NameType, InstanceType, ValueType> change(@CheckForNull Change<NamespaceType, NameType, InstanceType, ValueType> change) {
            this.change = change;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ChangeReportPayload.ChangeReportPayloadBuilder(change=", String.valueOf(this.change), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ChangeReportPayload(@CheckForNull Change<NamespaceType, NameType, InstanceType, ValueType> change) {
        this.change = change;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, NameType, InstanceType, ValueType> ChangeReportPayloadBuilder<NamespaceType, NameType, InstanceType, ValueType> builder() {
        return new ChangeReportPayloadBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ChangeReportPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeReportPayload)) {
            return false;
        }
        ChangeReportPayload changeReportPayload = (ChangeReportPayload) obj;
        if (!changeReportPayload.canEqual(this)) {
            return false;
        }
        Change<NamespaceType, NameType, InstanceType, ValueType> change = getChange();
        Change<NamespaceType, NameType, InstanceType, ValueType> change2 = changeReportPayload.getChange();
        return change != null ? change.equals(change2) : change2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Change<NamespaceType, NameType, InstanceType, ValueType> getChange() {
        return this.change;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Change<NamespaceType, NameType, InstanceType, ValueType> change = getChange();
        return 59 + (change == null ? 43 : change.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ChangeReportPayload(change=", String.valueOf(getChange()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
