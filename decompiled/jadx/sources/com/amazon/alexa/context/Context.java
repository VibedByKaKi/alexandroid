package com.amazon.alexa.context;

import com.amazon.alexa.property.Property;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Context {

    @CheckForNull
    private final List<Property> properties;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ContextBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<Property> properties;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ContextBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Context build() {
            return new Context(this.properties);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ContextBuilder properties(@CheckForNull List<Property> list) {
            this.properties = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Context.ContextBuilder(properties=", String.valueOf(this.properties), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Context(@CheckForNull List<Property> list) {
        this.properties = list;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ContextBuilder builder() {
        return new ContextBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Context)) {
            return false;
        }
        List<Property> properties = getProperties();
        List<Property> properties2 = ((Context) obj).getProperties();
        return properties != null ? properties.equals(properties2) : properties2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<Property> getProperties() {
        return this.properties;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        List<Property> properties = getProperties();
        return 59 + (properties == null ? 43 : properties.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Context(properties=", String.valueOf(getProperties()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
