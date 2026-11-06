package com.amazon.alexa.statereporting.lib.model.api.discovery;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SupportedProperty<PropertyKey> {

    @CheckForNull
    private final PropertyKey name;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SupportedPropertyBuilder<PropertyKey> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PropertyKey name;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SupportedPropertyBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SupportedProperty<PropertyKey> build() {
            return new SupportedProperty<>(this.name);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SupportedPropertyBuilder<PropertyKey> name(@CheckForNull PropertyKey propertykey) {
            this.name = propertykey;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SupportedProperty.SupportedPropertyBuilder(name=", String.valueOf(this.name), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SupportedProperty(@CheckForNull PropertyKey propertykey) {
        this.name = propertykey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <PropertyKey> SupportedPropertyBuilder<PropertyKey> builder() {
        return new SupportedPropertyBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportedProperty)) {
            return false;
        }
        PropertyKey name = getName();
        Object name2 = ((SupportedProperty) obj).getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PropertyKey getName() {
        return this.name;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        PropertyKey name = getName();
        return 59 + (name == null ? 43 : name.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("SupportedProperty(name=", String.valueOf(getName()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
