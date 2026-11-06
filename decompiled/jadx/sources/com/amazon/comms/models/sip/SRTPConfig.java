package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(builder = SRTPConfigBuilder.class)
/* loaded from: classes20.dex */
public final class SRTPConfig {
    private final String keying;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonPOJOBuilder(withPrefix = "")
    public static class SRTPConfigBuilder {
        private String keying;

        public SRTPConfig build() {
            return new SRTPConfig(this.keying);
        }

        public SRTPConfigBuilder keying(String str) {
            this.keying = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SRTPConfig.SRTPConfigBuilder(keying=", this.keying, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public SRTPConfig(String str) {
        this.keying = str;
    }

    public static SRTPConfigBuilder builder() {
        return new SRTPConfigBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SRTPConfig)) {
            return false;
        }
        String keying = getKeying();
        String keying2 = ((SRTPConfig) obj).getKeying();
        return keying != null ? keying.equals(keying2) : keying2 == null;
    }

    public String getKeying() {
        return this.keying;
    }

    public int hashCode() {
        String keying = getKeying();
        return 59 + (keying == null ? 43 : keying.hashCode());
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("SRTPConfig(keying=", getKeying(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
