package com.amazon.alexa.accessory.capabilities.bulkdata;

import com.amazon.alexa.accessory.capabilities.bulkdata.exceptions.InvalidBulkDataRequestException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class BulkDataRequestMetadata {
    private int blockStartIndex;
    private BulkDataCategory category;

    public BulkDataRequestMetadata(BulkDataCategory bulkDataCategory, int i) {
        this.category = bulkDataCategory;
        if (i < 0) {
            throw new InvalidBulkDataRequestException(String.format("blockStartIndex (%d) cannot be less than 0!", Integer.valueOf(i)));
        }
        this.blockStartIndex = i;
    }

    public int getBlockStartIndex() {
        return this.blockStartIndex;
    }

    public int getCategory() {
        return this.category.value();
    }

    public BulkDataRequestMetadata(BulkDataCategory bulkDataCategory) {
        this.category = bulkDataCategory;
        this.blockStartIndex = 0;
    }
}
