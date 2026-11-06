package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteObjectsRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private boolean isRequesterPays;
    private final List<KeyVersion> keys = new ArrayList();
    private MultiFactorAuthentication mfa;
    private boolean quiet;

    public DeleteObjectsRequest(String str) {
        setBucketName(str);
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public List<KeyVersion> getKeys() {
        return this.keys;
    }

    public MultiFactorAuthentication getMfa() {
        return this.mfa;
    }

    public boolean getQuiet() {
        return this.quiet;
    }

    public boolean isRequesterPays() {
        return this.isRequesterPays;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setKeys(List<KeyVersion> list) {
        this.keys.clear();
        this.keys.addAll(list);
    }

    public void setMfa(MultiFactorAuthentication multiFactorAuthentication) {
        this.mfa = multiFactorAuthentication;
    }

    public void setQuiet(boolean z) {
        this.quiet = z;
    }

    public void setRequesterPays(boolean z) {
        this.isRequesterPays = z;
    }

    public DeleteObjectsRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public DeleteObjectsRequest withKeys(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new KeyVersion(str));
        }
        setKeys(arrayList);
        return this;
    }

    public DeleteObjectsRequest withMfa(MultiFactorAuthentication multiFactorAuthentication) {
        setMfa(multiFactorAuthentication);
        return this;
    }

    public DeleteObjectsRequest withQuiet(boolean z) {
        setQuiet(z);
        return this;
    }

    public DeleteObjectsRequest withRequesterPays(boolean z) {
        setRequesterPays(z);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class KeyVersion implements Serializable {
        private final String key;
        private final String version;

        public KeyVersion(String str, String str2) {
            this.key = str;
            this.version = str2;
        }

        public String getKey() {
            return this.key;
        }

        public String getVersion() {
            return this.version;
        }

        public KeyVersion(String str) {
            this(str, null);
        }
    }

    public DeleteObjectsRequest withKeys(List<KeyVersion> list) {
        setKeys(list);
        return this;
    }
}
