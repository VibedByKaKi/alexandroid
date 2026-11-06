package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CredentialConfig {
    private final Map<String, String> credentialContent;
    private final String credentialId;
    private final long lastUpdatedDate;
    private final String oldCredentialId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CredentialConfigBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Map<String, String> credentialContent;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String credentialId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private long lastUpdatedDate;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String oldCredentialId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfig build() {
            return new CredentialConfig(this.credentialContent, this.credentialId, this.oldCredentialId, this.lastUpdatedDate);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigBuilder credentialContent(Map<String, String> map) {
            this.credentialContent = map;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigBuilder credentialId(String str) {
            this.credentialId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigBuilder lastUpdatedDate(long j) {
            this.lastUpdatedDate = j;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CredentialConfigBuilder oldCredentialId(String str) {
            this.oldCredentialId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CredentialConfig.CredentialConfigBuilder(credentialContent=");
            sb.append(this.credentialContent);
            sb.append(", credentialId=");
            sb.append(this.credentialId);
            sb.append(", oldCredentialId=");
            sb.append(this.oldCredentialId);
            sb.append(", lastUpdatedDate=");
            return a$$ExternalSyntheticOutline0.m(this.lastUpdatedDate, MarkdownConstants.RIGHT_PARENTHESIS, sb);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CredentialConfig() {
        this.credentialContent = null;
        this.credentialId = null;
        this.oldCredentialId = null;
        this.lastUpdatedDate = 0L;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CredentialConfigBuilder builder() {
        return new CredentialConfigBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CredentialConfig)) {
            return false;
        }
        CredentialConfig credentialConfig = (CredentialConfig) obj;
        if (getLastUpdatedDate() != credentialConfig.getLastUpdatedDate()) {
            return false;
        }
        Map<String, String> credentialContent = getCredentialContent();
        Map<String, String> credentialContent2 = credentialConfig.getCredentialContent();
        if (credentialContent != null ? !credentialContent.equals(credentialContent2) : credentialContent2 != null) {
            return false;
        }
        String credentialId = getCredentialId();
        String credentialId2 = credentialConfig.getCredentialId();
        if (credentialId != null ? !credentialId.equals(credentialId2) : credentialId2 != null) {
            return false;
        }
        String oldCredentialId = getOldCredentialId();
        String oldCredentialId2 = credentialConfig.getOldCredentialId();
        return oldCredentialId != null ? oldCredentialId.equals(oldCredentialId2) : oldCredentialId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Map<String, String> getCredentialContent() {
        return this.credentialContent;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCredentialId() {
        return this.credentialId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getOldCredentialId() {
        return this.oldCredentialId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long lastUpdatedDate = getLastUpdatedDate();
        Map<String, String> credentialContent = getCredentialContent();
        int hashCode = ((((int) (lastUpdatedDate ^ (lastUpdatedDate >>> 32))) + 59) * 59) + (credentialContent == null ? 43 : credentialContent.hashCode());
        String credentialId = getCredentialId();
        int i = hashCode * 59;
        int hashCode2 = credentialId == null ? 43 : credentialId.hashCode();
        String oldCredentialId = getOldCredentialId();
        return ((i + hashCode2) * 59) + (oldCredentialId != null ? oldCredentialId.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CredentialConfig(credentialContent=" + getCredentialContent() + ", credentialId=" + getCredentialId() + ", oldCredentialId=" + getOldCredentialId() + ", lastUpdatedDate=" + getLastUpdatedDate() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfig withCredentialContent(Map<String, String> map) {
        return this.credentialContent == map ? this : new CredentialConfig(map, this.credentialId, this.oldCredentialId, this.lastUpdatedDate);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfig withCredentialId(String str) {
        return this.credentialId == str ? this : new CredentialConfig(this.credentialContent, str, this.oldCredentialId, this.lastUpdatedDate);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfig withLastUpdatedDate(long j) {
        return this.lastUpdatedDate == j ? this : new CredentialConfig(this.credentialContent, this.credentialId, this.oldCredentialId, j);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfig withOldCredentialId(String str) {
        return this.oldCredentialId == str ? this : new CredentialConfig(this.credentialContent, this.credentialId, str, this.lastUpdatedDate);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfig(Map<String, String> map, String str, String str2, long j) {
        this.credentialContent = map;
        this.credentialId = str;
        this.oldCredentialId = str2;
        this.lastUpdatedDate = j;
    }
}
