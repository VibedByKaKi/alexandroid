package com.amazon.alexa.statereporting.lib.model.api.discovery;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.calling.incallcommands.constants.CommsFocusConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Capability<PropertyKey, Configuration> {

    @SerializedName(CommsFocusConstants.INTERFACE)
    @CheckForNull
    private final String capabilityInterface;

    @CheckForNull
    private final Configuration configuration;

    @CheckForNull
    private final Properties<PropertyKey> properties;

    @CheckForNull
    private final String type;

    @CheckForNull
    private final String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CapabilityBuilder<PropertyKey, Configuration> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String capabilityInterface;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Configuration configuration;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Properties<PropertyKey> properties;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String version;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CapabilityBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Capability<PropertyKey, Configuration> build() {
            return new Capability<>(this.type, this.capabilityInterface, this.version, this.properties, this.configuration);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CapabilityBuilder<PropertyKey, Configuration> capabilityInterface(@CheckForNull String str) {
            this.capabilityInterface = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CapabilityBuilder<PropertyKey, Configuration> configuration(@CheckForNull Configuration configuration) {
            this.configuration = configuration;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CapabilityBuilder<PropertyKey, Configuration> properties(@CheckForNull Properties<PropertyKey> properties) {
            this.properties = properties;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            String str = this.type;
            String str2 = this.capabilityInterface;
            String str3 = this.version;
            String valueOf = String.valueOf(this.properties);
            String valueOf2 = String.valueOf(this.configuration);
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Capability.CapabilityBuilder(type=", str, ", capabilityInterface=", str2, ", version=");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", properties=", valueOf, ", configuration=");
            return a$$ExternalSyntheticOutline0.m(m, valueOf2, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CapabilityBuilder<PropertyKey, Configuration> type(@CheckForNull String str) {
            this.type = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CapabilityBuilder<PropertyKey, Configuration> version(@CheckForNull String str) {
            this.version = str;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Capability(@CheckForNull String str, @CheckForNull String str2, @CheckForNull String str3, @CheckForNull Properties<PropertyKey> properties, @CheckForNull Configuration configuration) {
        this.type = str;
        this.capabilityInterface = str2;
        this.version = str3;
        this.properties = properties;
        this.configuration = configuration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <PropertyKey, Configuration> CapabilityBuilder<PropertyKey, Configuration> builder() {
        return new CapabilityBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Capability;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Capability)) {
            return false;
        }
        Capability capability = (Capability) obj;
        if (!capability.canEqual(this)) {
            return false;
        }
        String type = getType();
        String type2 = capability.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String capabilityInterface = getCapabilityInterface();
        String capabilityInterface2 = capability.getCapabilityInterface();
        if (capabilityInterface != null ? !capabilityInterface.equals(capabilityInterface2) : capabilityInterface2 != null) {
            return false;
        }
        String version = getVersion();
        String version2 = capability.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        Properties<PropertyKey> properties = getProperties();
        Properties<PropertyKey> properties2 = capability.getProperties();
        if (properties != null ? !properties.equals(properties2) : properties2 != null) {
            return false;
        }
        Configuration configuration = getConfiguration();
        Object configuration2 = capability.getConfiguration();
        return configuration != null ? configuration.equals(configuration2) : configuration2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCapabilityInterface() {
        return this.capabilityInterface;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Configuration getConfiguration() {
        return this.configuration;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Properties<PropertyKey> getProperties() {
        return this.properties;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getType() {
        return this.type;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getVersion() {
        return this.version;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        String capabilityInterface = getCapabilityInterface();
        int hashCode2 = ((hashCode + 59) * 59) + (capabilityInterface == null ? 43 : capabilityInterface.hashCode());
        String version = getVersion();
        int hashCode3 = (hashCode2 * 59) + (version == null ? 43 : version.hashCode());
        Properties<PropertyKey> properties = getProperties();
        int i = hashCode3 * 59;
        int hashCode4 = properties == null ? 43 : properties.hashCode();
        Configuration configuration = getConfiguration();
        return ((i + hashCode4) * 59) + (configuration != null ? configuration.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        String type = getType();
        String capabilityInterface = getCapabilityInterface();
        String version = getVersion();
        String valueOf = String.valueOf(getProperties());
        String valueOf2 = String.valueOf(getConfiguration());
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Capability(type=", type, ", capabilityInterface=", capabilityInterface, ", version=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, version, ", properties=", valueOf, ", configuration=");
        return a$$ExternalSyntheticOutline0.m(m, valueOf2, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
