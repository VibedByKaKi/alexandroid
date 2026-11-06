package com.amazon.alexa.statereporting.lib.model.api.event;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Cause {

    @CheckForNull
    private final CauseAttribute type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CauseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private CauseAttribute type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CauseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Cause build() {
            return new Cause(this.type);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Cause.CauseBuilder(type=", String.valueOf(this.type), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CauseBuilder type(@CheckForNull CauseAttribute causeAttribute) {
            this.type = causeAttribute;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Cause(@CheckForNull CauseAttribute causeAttribute) {
        this.type = causeAttribute;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CauseBuilder builder() {
        return new CauseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cause)) {
            return false;
        }
        CauseAttribute type = getType();
        CauseAttribute type2 = ((Cause) obj).getType();
        return type != null ? type.equals(type2) : type2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CauseAttribute getType() {
        return this.type;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        CauseAttribute type = getType();
        return 59 + (type == null ? 43 : type.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Cause(type=", String.valueOf(getType()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
