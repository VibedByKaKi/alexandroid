package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class InventoryS3BucketDestination implements Serializable {
    private String accountId;
    private String bucketArn;
    private String format;
    private String prefix;

    public String getAccountId() {
        return this.accountId;
    }

    public String getBucketArn() {
        return this.bucketArn;
    }

    public String getFormat() {
        return this.format;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setBucketArn(String str) {
        this.bucketArn = str;
    }

    public void setFormat(InventoryFormat inventoryFormat) {
        setFormat(inventoryFormat == null ? null : inventoryFormat.toString());
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public InventoryS3BucketDestination withAccountId(String str) {
        setAccountId(str);
        return this;
    }

    public InventoryS3BucketDestination withBucketArn(String str) {
        setBucketArn(str);
        return this;
    }

    public InventoryS3BucketDestination withFormat(String str) {
        setFormat(str);
        return this;
    }

    public InventoryS3BucketDestination withPrefix(String str) {
        setPrefix(str);
        return this;
    }

    public InventoryS3BucketDestination withFormat(InventoryFormat inventoryFormat) {
        setFormat(inventoryFormat);
        return this;
    }

    public void setFormat(String str) {
        this.format = str;
    }
}
