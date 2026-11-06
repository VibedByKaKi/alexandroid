package com.amazon.alexa.directive;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaDirective<NamespaceType, DirectiveType, InstanceType, PayloadType> {

    @CheckForNull
    private final Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> directive;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class AlexaDirectiveBuilder<NamespaceType, DirectiveType, InstanceType, PayloadType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> directive;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AlexaDirectiveBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AlexaDirective<NamespaceType, DirectiveType, InstanceType, PayloadType> build() {
            return new AlexaDirective<>(this.directive);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AlexaDirectiveBuilder<NamespaceType, DirectiveType, InstanceType, PayloadType> directive(@CheckForNull Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> directive) {
            this.directive = directive;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("AlexaDirective.AlexaDirectiveBuilder(directive=", String.valueOf(this.directive), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AlexaDirective(@CheckForNull Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> directive) {
        this.directive = directive;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, DirectiveType, InstanceType, PayloadType> AlexaDirectiveBuilder<NamespaceType, DirectiveType, InstanceType, PayloadType> builder() {
        return new AlexaDirectiveBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AlexaDirective;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlexaDirective)) {
            return false;
        }
        AlexaDirective alexaDirective = (AlexaDirective) obj;
        if (!alexaDirective.canEqual(this)) {
            return false;
        }
        Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> directive = getDirective();
        Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> directive2 = alexaDirective.getDirective();
        return directive != null ? directive.equals(directive2) : directive2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> getDirective() {
        return this.directive;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Directive<NamespaceType, DirectiveType, InstanceType, PayloadType> directive = getDirective();
        return 59 + (directive == null ? 43 : directive.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AlexaDirective(directive=", String.valueOf(getDirective()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
