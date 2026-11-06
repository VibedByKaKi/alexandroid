package com.amazon.alexa.statereporting.lib.model.api.context;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.statereporting.lib.model.api.Property;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class StateReportContext<PropertyKey> {

    @CheckForNull
    private List<Property<PropertyKey, ?, ?>> properties;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class StateReportContextBuilder<PropertyKey> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<Property<PropertyKey, ?, ?>> properties;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public StateReportContextBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public StateReportContext<PropertyKey> build() {
            return new StateReportContext<>(this.properties);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public StateReportContextBuilder<PropertyKey> properties(@CheckForNull List<Property<PropertyKey, ?, ?>> list) {
            this.properties = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("StateReportContext.StateReportContextBuilder(properties=", String.valueOf(this.properties), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StateReportContext(@CheckForNull List<Property<PropertyKey, ?, ?>> list) {
        this.properties = list;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <PropertyKey> StateReportContextBuilder<PropertyKey> builder() {
        return new StateReportContextBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof StateReportContext;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateReportContext)) {
            return false;
        }
        StateReportContext stateReportContext = (StateReportContext) obj;
        if (!stateReportContext.canEqual(this)) {
            return false;
        }
        List<Property<PropertyKey, ?, ?>> properties = getProperties();
        List<Property<PropertyKey, ?, ?>> properties2 = stateReportContext.getProperties();
        return properties != null ? properties.equals(properties2) : properties2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<Property<PropertyKey, ?, ?>> getProperties() {
        return this.properties;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        List<Property<PropertyKey, ?, ?>> properties = getProperties();
        return 59 + (properties == null ? 43 : properties.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("StateReportContext(properties=", String.valueOf(getProperties()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
