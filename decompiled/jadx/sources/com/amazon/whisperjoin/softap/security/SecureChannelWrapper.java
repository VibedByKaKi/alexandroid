package com.amazon.whisperjoin.softap.security;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whispercloak.SecureChannel;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class SecureChannelWrapper {
    private int scheme;
    private SecureChannel secureChannel;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SecureChannelWrapperBuilder {
        private int scheme;
        private SecureChannel secureChannel;

        public SecureChannelWrapper build() {
            return new SecureChannelWrapper(this.secureChannel, this.scheme);
        }

        public SecureChannelWrapperBuilder scheme(int i) {
            this.scheme = i;
            return this;
        }

        public SecureChannelWrapperBuilder secureChannel(SecureChannel secureChannel) {
            this.secureChannel = secureChannel;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SecureChannelWrapper.SecureChannelWrapperBuilder(secureChannel=");
            sb.append(this.secureChannel);
            sb.append(", scheme=");
            return a$$ExternalSyntheticOutline0.m(sb, this.scheme, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public SecureChannelWrapper(SecureChannel secureChannel, int i) {
        this.secureChannel = secureChannel;
        this.scheme = i;
    }

    public static SecureChannelWrapperBuilder builder() {
        return new SecureChannelWrapperBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SecureChannelWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SecureChannelWrapper)) {
            return false;
        }
        SecureChannelWrapper secureChannelWrapper = (SecureChannelWrapper) obj;
        if (!secureChannelWrapper.canEqual(this) || getScheme() != secureChannelWrapper.getScheme()) {
            return false;
        }
        SecureChannel secureChannel = getSecureChannel();
        SecureChannel secureChannel2 = secureChannelWrapper.getSecureChannel();
        return secureChannel != null ? secureChannel.equals(secureChannel2) : secureChannel2 == null;
    }

    public int getScheme() {
        return this.scheme;
    }

    public SecureChannel getSecureChannel() {
        return this.secureChannel;
    }

    public int hashCode() {
        int scheme = getScheme() + 59;
        SecureChannel secureChannel = getSecureChannel();
        return (scheme * 59) + (secureChannel == null ? 43 : secureChannel.hashCode());
    }

    public void setScheme(int i) {
        this.scheme = i;
    }

    public void setSecureChannel(SecureChannel secureChannel) {
        this.secureChannel = secureChannel;
    }

    public String toString() {
        return "SecureChannelWrapper(secureChannel=" + getSecureChannel() + ", scheme=" + getScheme() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
