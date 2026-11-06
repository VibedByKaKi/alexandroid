package com.amazon.comms.calling.service;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DataChannelConfiguration {
    private final String label;
    private final int maxRetransmits;
    private final boolean ordered;
    private final String protocol;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DataChannelConfigurationBuilder {
        private String label;
        private boolean maxRetransmits$set;
        private int maxRetransmits$value;
        private boolean ordered;
        private String protocol;

        public DataChannelConfiguration build() {
            int i = this.maxRetransmits$value;
            if (!this.maxRetransmits$set) {
                i = DataChannelConfiguration.$default$maxRetransmits();
            }
            return new DataChannelConfiguration(this.label, this.ordered, this.protocol, i);
        }

        public DataChannelConfigurationBuilder label(String str) {
            this.label = str;
            return this;
        }

        public DataChannelConfigurationBuilder maxRetransmits(int i) {
            this.maxRetransmits$value = i;
            this.maxRetransmits$set = true;
            return this;
        }

        public DataChannelConfigurationBuilder ordered(boolean z) {
            this.ordered = z;
            return this;
        }

        public DataChannelConfigurationBuilder protocol(String str) {
            this.protocol = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DataChannelConfiguration.DataChannelConfigurationBuilder(label=");
            sb.append(this.label);
            sb.append(", ordered=");
            sb.append(this.ordered);
            sb.append(", protocol=");
            sb.append(this.protocol);
            sb.append(", maxRetransmits$value=");
            return a$$ExternalSyntheticOutline0.m(sb, this.maxRetransmits$value, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int $default$maxRetransmits() {
        return -1;
    }

    public DataChannelConfiguration(String str, boolean z, String str2, int i) {
        this.label = str;
        this.ordered = z;
        this.protocol = str2;
        this.maxRetransmits = i;
    }

    public static DataChannelConfigurationBuilder builder() {
        return new DataChannelConfigurationBuilder();
    }

    public String getLabel() {
        return this.label;
    }

    public int getMaxRetransmits() {
        return this.maxRetransmits;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public boolean isOrdered() {
        return this.ordered;
    }
}
