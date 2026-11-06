package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MapKeyConstraint;
import com.amazon.coral.annotation.MapValueConstraint;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("CredentialConfig")
@Documentation("CredentialConfig represents an individual wifi credential\n        credentialId - It is a comma separated string containing wifi SSID and keyManagement\n        credentialContent - It is a map which contains properties of wifi credential such as password, frequency,\n        priority, lastconnectedtime etc\n        lastUpdatedDate - It is the latest date when wifi network was updated")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class CredentialConfig {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.CredentialConfig");
    private Map<String, String> credentialContent;
    private String credentialId;
    private long lastUpdatedDate;
    private String oldCredentialId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Map<String, String> credentialContent;
        protected String credentialId;
        protected long lastUpdatedDate;
        protected String oldCredentialId;

        public CredentialConfig build() {
            CredentialConfig credentialConfig = new CredentialConfig();
            populate(credentialConfig);
            return credentialConfig;
        }

        public void populate(CredentialConfig credentialConfig) {
            credentialConfig.setCredentialId(this.credentialId);
            credentialConfig.setCredentialContent(this.credentialContent);
            credentialConfig.setOldCredentialId(this.oldCredentialId);
            credentialConfig.setLastUpdatedDate(this.lastUpdatedDate);
        }

        public Builder withCredentialContent(Map<String, String> map) {
            this.credentialContent = map;
            return this;
        }

        public Builder withCredentialId(String str) {
            this.credentialId = str;
            return this;
        }

        public Builder withLastUpdatedDate(long j) {
            this.lastUpdatedDate = j;
            return this;
        }

        public Builder withOldCredentialId(String str) {
            this.oldCredentialId = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialConfig)) {
            return false;
        }
        CredentialConfig credentialConfig = (CredentialConfig) obj;
        return Objects.equals(getCredentialId(), credentialConfig.getCredentialId()) && Objects.equals(getCredentialContent(), credentialConfig.getCredentialContent()) && Objects.equals(getOldCredentialId(), credentialConfig.getOldCredentialId()) && Long.valueOf(getLastUpdatedDate()).equals(Long.valueOf(credentialConfig.getLastUpdatedDate()));
    }

    @MapKeyConstraint(@NestedConstraints)
    @MapValueConstraint(@NestedConstraints)
    public Map<String, String> getCredentialContent() {
        return this.credentialContent;
    }

    public String getCredentialId() {
        return this.credentialId;
    }

    public long getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public String getOldCredentialId() {
        return this.oldCredentialId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getCredentialId(), getCredentialContent(), getOldCredentialId(), Long.valueOf(getLastUpdatedDate()));
    }

    public void setCredentialContent(Map<String, String> map) {
        this.credentialContent = map;
    }

    public void setCredentialId(String str) {
        this.credentialId = str;
    }

    public void setLastUpdatedDate(long j) {
        this.lastUpdatedDate = j;
    }

    public void setOldCredentialId(String str) {
        this.oldCredentialId = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCredentialId(getCredentialId());
        builder.withCredentialContent(getCredentialContent());
        builder.withOldCredentialId(getOldCredentialId());
        builder.withLastUpdatedDate(getLastUpdatedDate());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CredentialConfig(credentialId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.credentialId, ", credentialContent=", sb);
        sb.append(String.valueOf(this.credentialContent));
        sb.append(", oldCredentialId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.oldCredentialId, ", lastUpdatedDate=", sb);
        sb.append(String.valueOf(this.lastUpdatedDate));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
