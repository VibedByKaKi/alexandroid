package com.amazon.alexa.statereporting.lib.model.api.event;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.statereporting.lib.model.api.Property;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Change<PropertyKey> {

    @CheckForNull
    private final Cause cause;

    @CheckForNull
    private final List<Property<PropertyKey, ?, ?>> properties;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ChangeBuilder<PropertyKey> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Cause cause;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<Property<PropertyKey, ?, ?>> properties;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Change<PropertyKey> build() {
            return new Change<>(this.cause, this.properties);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeBuilder<PropertyKey> cause(@CheckForNull Cause cause) {
            this.cause = cause;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ChangeBuilder<PropertyKey> properties(@CheckForNull List<Property<PropertyKey, ?, ?>> list) {
            this.properties = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Change.ChangeBuilder(cause=", String.valueOf(this.cause), ", properties=", String.valueOf(this.properties), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Change(@CheckForNull Cause cause, @CheckForNull List<Property<PropertyKey, ?, ?>> list) {
        this.cause = cause;
        this.properties = list;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <PropertyKey> ChangeBuilder<PropertyKey> builder() {
        return new ChangeBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Change)) {
            return false;
        }
        Change change = (Change) obj;
        Cause cause = getCause();
        Cause cause2 = change.getCause();
        if (cause != null ? !cause.equals(cause2) : cause2 != null) {
            return false;
        }
        List<Property<PropertyKey, ?, ?>> properties = getProperties();
        List<Property<PropertyKey, ?, ?>> properties2 = change.getProperties();
        return properties != null ? properties.equals(properties2) : properties2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Cause getCause() {
        return this.cause;
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
        Cause cause = getCause();
        int hashCode = cause == null ? 43 : cause.hashCode();
        List<Property<PropertyKey, ?, ?>> properties = getProperties();
        return ((hashCode + 59) * 59) + (properties != null ? properties.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Change(cause=", String.valueOf(getCause()), ", properties=", String.valueOf(getProperties()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
