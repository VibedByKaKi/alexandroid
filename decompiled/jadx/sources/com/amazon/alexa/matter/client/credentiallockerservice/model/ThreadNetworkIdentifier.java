package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ThreadNetworkIdentifier {
    private final String extendedPanId;
    private final String networkName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ThreadNetworkIdentifierBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String extendedPanId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String networkName;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkIdentifierBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkIdentifier build() {
            return new ThreadNetworkIdentifier(this.extendedPanId, this.networkName);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkIdentifierBuilder extendedPanId(String str) {
            this.extendedPanId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkIdentifierBuilder networkName(String str) {
            this.networkName = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadNetworkIdentifier.ThreadNetworkIdentifierBuilder(extendedPanId=");
            sb.append(this.extendedPanId);
            sb.append(", networkName=");
            return a$$ExternalSyntheticOutline0.m(sb, this.networkName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private ThreadNetworkIdentifier() {
        this.extendedPanId = null;
        this.networkName = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ThreadNetworkIdentifierBuilder builder() {
        return new ThreadNetworkIdentifierBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreadNetworkIdentifier)) {
            return false;
        }
        ThreadNetworkIdentifier threadNetworkIdentifier = (ThreadNetworkIdentifier) obj;
        String extendedPanId = getExtendedPanId();
        String extendedPanId2 = threadNetworkIdentifier.getExtendedPanId();
        if (extendedPanId != null ? !extendedPanId.equals(extendedPanId2) : extendedPanId2 != null) {
            return false;
        }
        String networkName = getNetworkName();
        String networkName2 = threadNetworkIdentifier.getNetworkName();
        return networkName != null ? networkName.equals(networkName2) : networkName2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkName() {
        return this.networkName;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String extendedPanId = getExtendedPanId();
        int hashCode = extendedPanId == null ? 43 : extendedPanId.hashCode();
        String networkName = getNetworkName();
        return ((hashCode + 59) * 59) + (networkName != null ? networkName.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ThreadNetworkIdentifier(extendedPanId=" + getExtendedPanId() + ", networkName=" + getNetworkName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkIdentifier withExtendedPanId(String str) {
        return this.extendedPanId == str ? this : new ThreadNetworkIdentifier(str, this.networkName);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkIdentifier withNetworkName(String str) {
        return this.networkName == str ? this : new ThreadNetworkIdentifier(this.extendedPanId, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkIdentifier(String str, String str2) {
        this.extendedPanId = str;
        this.networkName = str2;
    }
}
