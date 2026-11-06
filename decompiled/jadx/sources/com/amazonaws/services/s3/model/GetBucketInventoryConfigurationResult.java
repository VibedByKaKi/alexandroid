package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetBucketInventoryConfigurationResult {
    private InventoryConfiguration inventoryConfiguration;

    public InventoryConfiguration getInventoryConfiguration() {
        return this.inventoryConfiguration;
    }

    public void setInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        this.inventoryConfiguration = inventoryConfiguration;
    }

    public GetBucketInventoryConfigurationResult withInventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
        setInventoryConfiguration(inventoryConfiguration);
        return this;
    }
}
