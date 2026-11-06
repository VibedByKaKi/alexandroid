package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetObjectTaggingRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private String key;
    private String versionId;

    public GetObjectTaggingRequest(String str, String str2, String str3) {
        this.bucketName = str;
        this.key = str2;
        this.versionId = str3;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getKey() {
        return this.key;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }

    public GetObjectTaggingRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public GetObjectTaggingRequest withKey(String str) {
        setKey(str);
        return this;
    }

    public GetObjectTaggingRequest withVersionId(String str) {
        setVersionId(str);
        return this;
    }

    public GetObjectTaggingRequest(String str, String str2) {
        this(str, str2, null);
    }
}
