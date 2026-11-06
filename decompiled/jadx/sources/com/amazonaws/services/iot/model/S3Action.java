package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class S3Action implements Serializable {
    private String bucketName;
    private String cannedAcl;
    private String key;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S3Action)) {
            return false;
        }
        S3Action s3Action = (S3Action) obj;
        if ((s3Action.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (s3Action.getRoleArn() != null && !s3Action.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((s3Action.getBucketName() == null) ^ (getBucketName() == null)) {
            return false;
        }
        if (s3Action.getBucketName() != null && !s3Action.getBucketName().equals(getBucketName())) {
            return false;
        }
        if ((s3Action.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        if (s3Action.getKey() != null && !s3Action.getKey().equals(getKey())) {
            return false;
        }
        if ((s3Action.getCannedAcl() == null) ^ (getCannedAcl() == null)) {
            return false;
        }
        return s3Action.getCannedAcl() == null || s3Action.getCannedAcl().equals(getCannedAcl());
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getCannedAcl() {
        return this.cannedAcl;
    }

    public String getKey() {
        return this.key;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getBucketName() == null ? 0 : getBucketName().hashCode())) * 31) + (getKey() == null ? 0 : getKey().hashCode())) * 31) + (getCannedAcl() != null ? getCannedAcl().hashCode() : 0);
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setCannedAcl(CannedAccessControlList cannedAccessControlList) {
        this.cannedAcl = cannedAccessControlList.toString();
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getBucketName() != null) {
            sb.append("bucketName: " + getBucketName() + ",");
        }
        if (getKey() != null) {
            sb.append("key: " + getKey() + ",");
        }
        if (getCannedAcl() != null) {
            sb.append("cannedAcl: " + getCannedAcl());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public S3Action withBucketName(String str) {
        this.bucketName = str;
        return this;
    }

    public S3Action withCannedAcl(CannedAccessControlList cannedAccessControlList) {
        this.cannedAcl = cannedAccessControlList.toString();
        return this;
    }

    public S3Action withKey(String str) {
        this.key = str;
        return this;
    }

    public S3Action withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public void setCannedAcl(String str) {
        this.cannedAcl = str;
    }

    public S3Action withCannedAcl(String str) {
        this.cannedAcl = str;
        return this;
    }
}
