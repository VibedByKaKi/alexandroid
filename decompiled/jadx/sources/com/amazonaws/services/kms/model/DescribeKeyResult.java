package com.amazonaws.services.kms.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeKeyResult implements Serializable {
    private KeyMetadata keyMetadata;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeKeyResult)) {
            return false;
        }
        DescribeKeyResult describeKeyResult = (DescribeKeyResult) obj;
        if ((describeKeyResult.getKeyMetadata() == null) ^ (getKeyMetadata() == null)) {
            return false;
        }
        return describeKeyResult.getKeyMetadata() == null || describeKeyResult.getKeyMetadata().equals(getKeyMetadata());
    }

    public KeyMetadata getKeyMetadata() {
        return this.keyMetadata;
    }

    public int hashCode() {
        return 31 + (getKeyMetadata() == null ? 0 : getKeyMetadata().hashCode());
    }

    public void setKeyMetadata(KeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getKeyMetadata() != null) {
            sb.append("KeyMetadata: " + getKeyMetadata());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeKeyResult withKeyMetadata(KeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
        return this;
    }
}
