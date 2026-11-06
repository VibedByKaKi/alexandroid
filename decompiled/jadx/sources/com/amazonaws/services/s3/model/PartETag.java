package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PartETag {
    private String eTag;
    private int partNumber;

    public PartETag(int i, String str) {
        this.partNumber = i;
        this.eTag = str;
    }

    public String getETag() {
        return this.eTag;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setPartNumber(int i) {
        this.partNumber = i;
    }

    public PartETag withETag(String str) {
        this.eTag = str;
        return this;
    }

    public PartETag withPartNumber(int i) {
        this.partNumber = i;
        return this;
    }
}
