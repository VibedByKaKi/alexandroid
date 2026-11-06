package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketAclRequest extends AmazonWebServiceRequest {
    private AccessControlList acl;
    private String bucketName;
    private CannedAccessControlList cannedAcl;

    public SetBucketAclRequest(String str, AccessControlList accessControlList) {
        this.bucketName = str;
        this.acl = accessControlList;
        this.cannedAcl = null;
    }

    public AccessControlList getAcl() {
        return this.acl;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public CannedAccessControlList getCannedAcl() {
        return this.cannedAcl;
    }

    public SetBucketAclRequest(String str, CannedAccessControlList cannedAccessControlList) {
        this.bucketName = str;
        this.acl = null;
        this.cannedAcl = cannedAccessControlList;
    }
}
