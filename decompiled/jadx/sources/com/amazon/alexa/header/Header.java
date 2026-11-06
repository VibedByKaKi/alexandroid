package com.amazon.alexa.header;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.UUID;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Header<NamespaceType, NameType, InstanceType> {

    @CheckForNull
    private final String correlationToken;

    @CheckForNull
    private final InstanceType instance;

    @CheckForNull
    private final UUID messageId;

    @CheckForNull
    private final NameType name;

    @CheckForNull
    private final NamespaceType namespace;

    @CheckForNull
    private final String payloadVersion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class HeaderBuilder<NamespaceType, NameType, InstanceType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String correlationToken;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private InstanceType instance;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private UUID messageId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private NameType name;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private NamespaceType namespace;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String payloadVersion;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HeaderBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Header<NamespaceType, NameType, InstanceType> build() {
            return new Header<>(this.namespace, this.instance, this.name, this.payloadVersion, this.messageId, this.correlationToken);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HeaderBuilder<NamespaceType, NameType, InstanceType> correlationToken(@CheckForNull String str) {
            this.correlationToken = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HeaderBuilder<NamespaceType, NameType, InstanceType> instance(@CheckForNull InstanceType instancetype) {
            this.instance = instancetype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HeaderBuilder<NamespaceType, NameType, InstanceType> messageId(@CheckForNull UUID uuid) {
            this.messageId = uuid;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HeaderBuilder<NamespaceType, NameType, InstanceType> name(@CheckForNull NameType nametype) {
            this.name = nametype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HeaderBuilder<NamespaceType, NameType, InstanceType> namespace(@CheckForNull NamespaceType namespacetype) {
            this.namespace = namespacetype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HeaderBuilder<NamespaceType, NameType, InstanceType> payloadVersion(@CheckForNull String str) {
            this.payloadVersion = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            String valueOf = String.valueOf(this.namespace);
            String valueOf2 = String.valueOf(this.instance);
            String valueOf3 = String.valueOf(this.name);
            String str = this.payloadVersion;
            String valueOf4 = String.valueOf(this.messageId);
            String str2 = this.correlationToken;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Header.HeaderBuilder(namespace=", valueOf, ", instance=", valueOf2, ", name=");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, valueOf3, ", payloadVersion=", str, ", messageId=");
            return DoubleList$$ExternalSyntheticOutline0.m(m, valueOf4, ", correlationToken=", str2, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Header(@CheckForNull NamespaceType namespacetype, @CheckForNull InstanceType instancetype, @CheckForNull NameType nametype, @CheckForNull String str, @CheckForNull UUID uuid, @CheckForNull String str2) {
        this.namespace = namespacetype;
        this.instance = instancetype;
        this.name = nametype;
        this.payloadVersion = str;
        this.messageId = uuid;
        this.correlationToken = str2;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, NameType, InstanceType> HeaderBuilder<NamespaceType, NameType, InstanceType> builder() {
        return new HeaderBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Header;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (!header.canEqual(this)) {
            return false;
        }
        NamespaceType namespace = getNamespace();
        Object namespace2 = header.getNamespace();
        if (namespace != null ? !namespace.equals(namespace2) : namespace2 != null) {
            return false;
        }
        InstanceType header2 = getInstance();
        Object header3 = header.getInstance();
        if (header2 != null ? !header2.equals(header3) : header3 != null) {
            return false;
        }
        NameType name = getName();
        Object name2 = header.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String payloadVersion = getPayloadVersion();
        String payloadVersion2 = header.getPayloadVersion();
        if (payloadVersion != null ? !payloadVersion.equals(payloadVersion2) : payloadVersion2 != null) {
            return false;
        }
        UUID messageId = getMessageId();
        UUID messageId2 = header.getMessageId();
        if (messageId != null ? !messageId.equals(messageId2) : messageId2 != null) {
            return false;
        }
        String correlationToken = getCorrelationToken();
        String correlationToken2 = header.getCorrelationToken();
        return correlationToken != null ? correlationToken.equals(correlationToken2) : correlationToken2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCorrelationToken() {
        return this.correlationToken;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public InstanceType getInstance() {
        return this.instance;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public UUID getMessageId() {
        return this.messageId;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NameType getName() {
        return this.name;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NamespaceType getNamespace() {
        return this.namespace;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPayloadVersion() {
        return this.payloadVersion;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        NamespaceType namespace = getNamespace();
        int hashCode = namespace == null ? 43 : namespace.hashCode();
        InstanceType header = getInstance();
        int hashCode2 = ((hashCode + 59) * 59) + (header == null ? 43 : header.hashCode());
        NameType name = getName();
        int hashCode3 = (hashCode2 * 59) + (name == null ? 43 : name.hashCode());
        String payloadVersion = getPayloadVersion();
        int hashCode4 = (hashCode3 * 59) + (payloadVersion == null ? 43 : payloadVersion.hashCode());
        UUID messageId = getMessageId();
        int i = hashCode4 * 59;
        int hashCode5 = messageId == null ? 43 : messageId.hashCode();
        String correlationToken = getCorrelationToken();
        return ((i + hashCode5) * 59) + (correlationToken != null ? correlationToken.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        String valueOf = String.valueOf(getNamespace());
        String valueOf2 = String.valueOf(getInstance());
        String valueOf3 = String.valueOf(getName());
        String payloadVersion = getPayloadVersion();
        String valueOf4 = String.valueOf(getMessageId());
        String correlationToken = getCorrelationToken();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Header(namespace=", valueOf, ", instance=", valueOf2, ", name=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, valueOf3, ", payloadVersion=", payloadVersion, ", messageId=");
        return DoubleList$$ExternalSyntheticOutline0.m(m, valueOf4, ", correlationToken=", correlationToken, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
