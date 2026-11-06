package com.amazon.alexa.statereporting.lib.model.api.discovery;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Properties<PropertyKey> {

    @CheckForNull
    private final Boolean proactivelyReported;

    @CheckForNull
    private final Boolean retrievable;

    @CheckForNull
    private final List<SupportedProperty<PropertyKey>> supported;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class PropertiesBuilder<PropertyKey> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean proactivelyReported;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Boolean retrievable;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<SupportedProperty<PropertyKey>> supported;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertiesBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Properties<PropertyKey> build() {
            return new Properties<>(this.supported, this.proactivelyReported, this.retrievable);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertiesBuilder<PropertyKey> proactivelyReported(@CheckForNull Boolean bool) {
            this.proactivelyReported = bool;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertiesBuilder<PropertyKey> retrievable(@CheckForNull Boolean bool) {
            this.retrievable = bool;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertiesBuilder<PropertyKey> supported(@CheckForNull List<SupportedProperty<PropertyKey>> list) {
            this.supported = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "Properties.PropertiesBuilder(supported=" + String.valueOf(this.supported) + ", proactivelyReported=" + this.proactivelyReported + ", retrievable=" + this.retrievable + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Properties(@CheckForNull List<SupportedProperty<PropertyKey>> list, @CheckForNull Boolean bool, @CheckForNull Boolean bool2) {
        this.supported = list;
        this.proactivelyReported = bool;
        this.retrievable = bool2;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <PropertyKey> PropertiesBuilder<PropertyKey> builder() {
        return new PropertiesBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Properties;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Properties)) {
            return false;
        }
        Properties properties = (Properties) obj;
        if (!properties.canEqual(this)) {
            return false;
        }
        Boolean proactivelyReported = getProactivelyReported();
        Boolean proactivelyReported2 = properties.getProactivelyReported();
        if (proactivelyReported != null ? !proactivelyReported.equals(proactivelyReported2) : proactivelyReported2 != null) {
            return false;
        }
        Boolean retrievable = getRetrievable();
        Boolean retrievable2 = properties.getRetrievable();
        if (retrievable != null ? !retrievable.equals(retrievable2) : retrievable2 != null) {
            return false;
        }
        List<SupportedProperty<PropertyKey>> supported = getSupported();
        List<SupportedProperty<PropertyKey>> supported2 = properties.getSupported();
        return supported != null ? supported.equals(supported2) : supported2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getProactivelyReported() {
        return this.proactivelyReported;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getRetrievable() {
        return this.retrievable;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<SupportedProperty<PropertyKey>> getSupported() {
        return this.supported;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Boolean proactivelyReported = getProactivelyReported();
        int hashCode = proactivelyReported == null ? 43 : proactivelyReported.hashCode();
        Boolean retrievable = getRetrievable();
        int i = (hashCode + 59) * 59;
        int hashCode2 = retrievable == null ? 43 : retrievable.hashCode();
        List<SupportedProperty<PropertyKey>> supported = getSupported();
        return ((i + hashCode2) * 59) + (supported != null ? supported.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Properties(supported=" + String.valueOf(getSupported()) + ", proactivelyReported=" + getProactivelyReported() + ", retrievable=" + getRetrievable() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
