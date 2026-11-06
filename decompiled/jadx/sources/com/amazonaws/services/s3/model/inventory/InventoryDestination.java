package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class InventoryDestination implements Serializable {
    private InventoryS3BucketDestination s3BucketDestination;

    public InventoryS3BucketDestination getS3BucketDestination() {
        return this.s3BucketDestination;
    }

    public void setS3BucketDestination(InventoryS3BucketDestination inventoryS3BucketDestination) {
        this.s3BucketDestination = inventoryS3BucketDestination;
    }

    public InventoryDestination withS3BucketDestination(InventoryS3BucketDestination inventoryS3BucketDestination) {
        setS3BucketDestination(inventoryS3BucketDestination);
        return this;
    }
}
