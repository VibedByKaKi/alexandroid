package com.amazon.alexa.changereport;

import com.amazon.alexa.context.Context;
import com.amazon.alexa.event.Event;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ChangeReport<NamespaceType, NameType, InstanceType, PayloadType> {

    @CheckForNull
    private final Context context;

    @CheckForNull
    private final Event<NamespaceType, NameType, InstanceType, PayloadType> event;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ChangeReportBuilder<NamespaceType, NameType, InstanceType, PayloadType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Context context;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Event<NamespaceType, NameType, InstanceType, PayloadType> event;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReport<NamespaceType, NameType, InstanceType, PayloadType> build() {
            return new ChangeReport<>(this.event, this.context);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportBuilder<NamespaceType, NameType, InstanceType, PayloadType> context(@CheckForNull Context context) {
            this.context = context;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeReportBuilder<NamespaceType, NameType, InstanceType, PayloadType> event(@CheckForNull Event<NamespaceType, NameType, InstanceType, PayloadType> event) {
            this.event = event;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ChangeReport.ChangeReportBuilder(event=", String.valueOf(this.event), ", context=", String.valueOf(this.context), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ChangeReport(@CheckForNull Event<NamespaceType, NameType, InstanceType, PayloadType> event, @CheckForNull Context context) {
        this.event = event;
        this.context = context;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, NameType, InstanceType, PayloadType> ChangeReportBuilder<NamespaceType, NameType, InstanceType, PayloadType> builder() {
        return new ChangeReportBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ChangeReport;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeReport)) {
            return false;
        }
        ChangeReport changeReport = (ChangeReport) obj;
        if (!changeReport.canEqual(this)) {
            return false;
        }
        Event<NamespaceType, NameType, InstanceType, PayloadType> event = getEvent();
        Event<NamespaceType, NameType, InstanceType, PayloadType> event2 = changeReport.getEvent();
        if (event != null ? !event.equals(event2) : event2 != null) {
            return false;
        }
        Context context = getContext();
        Context context2 = changeReport.getContext();
        return context != null ? context.equals(context2) : context2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Context getContext() {
        return this.context;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Event<NamespaceType, NameType, InstanceType, PayloadType> getEvent() {
        return this.event;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Event<NamespaceType, NameType, InstanceType, PayloadType> event = getEvent();
        int hashCode = event == null ? 43 : event.hashCode();
        Context context = getContext();
        return ((hashCode + 59) * 59) + (context != null ? context.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ChangeReport(event=", String.valueOf(getEvent()), ", context=", String.valueOf(getContext()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
