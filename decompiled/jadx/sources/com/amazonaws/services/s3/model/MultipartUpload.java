package com.amazonaws.services.s3.model;

import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MultipartUpload {
    private Date initiated;
    private Owner initiator;
    private String key;
    private Owner owner;
    private String storageClass;
    private String uploadId;

    public Date getInitiated() {
        return this.initiated;
    }

    public Owner getInitiator() {
        return this.initiator;
    }

    public String getKey() {
        return this.key;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public String getStorageClass() {
        return this.storageClass;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public void setInitiated(Date date) {
        this.initiated = date;
    }

    public void setInitiator(Owner owner) {
        this.initiator = owner;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }
}
