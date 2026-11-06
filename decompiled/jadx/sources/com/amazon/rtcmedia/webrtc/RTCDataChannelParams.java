package com.amazon.rtcmedia.webrtc;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCDataChannelParams {
    private final String label;
    private final boolean ordered;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RTCDataChannelParamsBuilder {
        private String label;
        private boolean ordered;

        public RTCDataChannelParams build() {
            return new RTCDataChannelParams(this.label, this.ordered);
        }

        public RTCDataChannelParamsBuilder label(String str) {
            this.label = str;
            return this;
        }

        public RTCDataChannelParamsBuilder ordered(boolean z) {
            this.ordered = z;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RTCDataChannelParams.RTCDataChannelParamsBuilder(label=");
            sb.append(this.label);
            sb.append(", ordered=");
            return a$$ExternalSyntheticOutline0.m(sb, this.ordered, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public RTCDataChannelParams(String str, boolean z) {
        this.label = str;
        this.ordered = z;
    }

    public static RTCDataChannelParamsBuilder builder() {
        return new RTCDataChannelParamsBuilder();
    }

    public String getLabel() {
        return this.label;
    }

    public boolean isOrdered() {
        return this.ordered;
    }
}
