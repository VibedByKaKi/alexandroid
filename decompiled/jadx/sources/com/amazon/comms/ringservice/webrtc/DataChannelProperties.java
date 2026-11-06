package com.amazon.comms.ringservice.webrtc;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DataChannelProperties {
    private final int id;
    private final String label;
    private final String protocol;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DataChannelPropertiesBuilder {
        private int id;
        private String label;
        private String protocol;

        public DataChannelProperties build() {
            return new DataChannelProperties(this.id, this.label, this.protocol);
        }

        public DataChannelPropertiesBuilder id(int i) {
            this.id = i;
            return this;
        }

        public DataChannelPropertiesBuilder label(String str) {
            this.label = str;
            return this;
        }

        public DataChannelPropertiesBuilder protocol(String str) {
            this.protocol = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DataChannelProperties.DataChannelPropertiesBuilder(id=");
            sb.append(this.id);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", protocol=");
            return a$$ExternalSyntheticOutline0.m(sb, this.protocol, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public DataChannelProperties(int i, String str, String str2) {
        this.id = i;
        this.label = str;
        this.protocol = str2;
    }

    public static DataChannelPropertiesBuilder builder() {
        return new DataChannelPropertiesBuilder();
    }

    public int getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public String getProtocol() {
        return this.protocol;
    }
}
