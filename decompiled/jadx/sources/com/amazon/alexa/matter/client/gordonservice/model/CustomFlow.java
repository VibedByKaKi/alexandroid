package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CustomFlow {
    private final String customFlowUrl;
    private final boolean isCustomFlowRequired;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CustomFlowBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String customFlowUrl;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean isCustomFlowRequired;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomFlowBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomFlow build() {
            return new CustomFlow(this.isCustomFlowRequired, this.customFlowUrl);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomFlowBuilder customFlowUrl(String str) {
            this.customFlowUrl = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomFlowBuilder isCustomFlowRequired(boolean z) {
            this.isCustomFlowRequired = z;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CustomFlow.CustomFlowBuilder(isCustomFlowRequired=");
            sb.append(this.isCustomFlowRequired);
            sb.append(", customFlowUrl=");
            return a$$ExternalSyntheticOutline0.m(sb, this.customFlowUrl, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CustomFlow() {
        this.isCustomFlowRequired = false;
        this.customFlowUrl = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CustomFlowBuilder builder() {
        return new CustomFlowBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomFlow)) {
            return false;
        }
        CustomFlow customFlow = (CustomFlow) obj;
        if (isCustomFlowRequired() != customFlow.isCustomFlowRequired()) {
            return false;
        }
        String customFlowUrl = getCustomFlowUrl();
        String customFlowUrl2 = customFlow.getCustomFlowUrl();
        return customFlowUrl != null ? customFlowUrl.equals(customFlowUrl2) : customFlowUrl2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCustomFlowUrl() {
        return this.customFlowUrl;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int i = isCustomFlowRequired() ? 79 : 97;
        String customFlowUrl = getCustomFlowUrl();
        return ((i + 59) * 59) + (customFlowUrl == null ? 43 : customFlowUrl.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean isCustomFlowRequired() {
        return this.isCustomFlowRequired;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CustomFlow(isCustomFlowRequired=" + isCustomFlowRequired() + ", customFlowUrl=" + getCustomFlowUrl() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomFlow withCustomFlowRequired(boolean z) {
        return this.isCustomFlowRequired == z ? this : new CustomFlow(z, this.customFlowUrl);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomFlow withCustomFlowUrl(String str) {
        return this.customFlowUrl == str ? this : new CustomFlow(this.isCustomFlowRequired, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomFlow(boolean z, String str) {
        this.isCustomFlowRequired = z;
        this.customFlowUrl = str;
    }
}
