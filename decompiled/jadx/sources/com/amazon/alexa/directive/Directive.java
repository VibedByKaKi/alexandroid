package com.amazon.alexa.directive;

import com.amazon.alexa.header.Header;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> {

    @CheckForNull
    private final Header<NamespaceType, DirectiveType, InstanceType> header;

    @CheckForNull
    private final PayloadType payload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class DirectiveBuilder<NamespaceType, DirectiveType, InstanceType, PayloadType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Header<NamespaceType, DirectiveType, InstanceType> header;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PayloadType payload;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DirectiveBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> build() {
            return new Directive<>(this.header, this.payload);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DirectiveBuilder<NamespaceType, DirectiveType, InstanceType, PayloadType> header(@CheckForNull Header<NamespaceType, DirectiveType, InstanceType> header) {
            this.header = header;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DirectiveBuilder<NamespaceType, DirectiveType, InstanceType, PayloadType> payload(@CheckForNull PayloadType payloadtype) {
            this.payload = payloadtype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Directive.DirectiveBuilder(header=", String.valueOf(this.header), ", payload=", String.valueOf(this.payload), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Directive(@CheckForNull Header<NamespaceType, DirectiveType, InstanceType> header, @CheckForNull PayloadType payloadtype) {
        this.header = header;
        this.payload = payloadtype;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, DirectiveType, InstanceType, PayloadType> DirectiveBuilder<NamespaceType, DirectiveType, InstanceType, PayloadType> builder() {
        return new DirectiveBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Directive;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Directive)) {
            return false;
        }
        Directive directive = (Directive) obj;
        if (!directive.canEqual(this)) {
            return false;
        }
        Header<NamespaceType, DirectiveType, InstanceType> header = getHeader();
        Header<NamespaceType, DirectiveType, InstanceType> header2 = directive.getHeader();
        if (header != null ? !header.equals(header2) : header2 != null) {
            return false;
        }
        PayloadType payload = getPayload();
        Object payload2 = directive.getPayload();
        return payload != null ? payload.equals(payload2) : payload2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Header<NamespaceType, DirectiveType, InstanceType> getHeader() {
        return this.header;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PayloadType getPayload() {
        return this.payload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Header<NamespaceType, DirectiveType, InstanceType> header = getHeader();
        int hashCode = header == null ? 43 : header.hashCode();
        PayloadType payload = getPayload();
        return ((hashCode + 59) * 59) + (payload != null ? payload.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Directive(header=", String.valueOf(getHeader()), ", payload=", String.valueOf(getPayload()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
