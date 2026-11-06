package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetBucketInventoryConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private InventoryConfiguration inventoryConfiguration;

    public SetBucketInventoryConfigurationRequest(String str, InventoryConfiguration inventoryConfiguration) {
        this.bucketName = str;
        this.inventoryConfiguration = inventoryConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public InventoryConfiguration getInventoryConfiguration() {
        return this.inventoryConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        this.inventoryConfiguration = inventoryConfiguration;
    }

    public SetBucketInventoryConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketInventoryConfigurationRequest withInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        setInventoryConfiguration(inventoryConfiguration);
        return this;
    }

    public SetBucketInventoryConfigurationRequest() {
    }
}
