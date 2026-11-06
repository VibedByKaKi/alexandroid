package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class InventorySchedule implements Serializable {
    private String frequency;

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequency(InventoryFrequency inventoryFrequency) {
        setFrequency(inventoryFrequency == null ? null : inventoryFrequency.toString());
    }

    public InventorySchedule withFrequency(String str) {
        setFrequency(str);
        return this;
    }

    public InventorySchedule withFrequency(InventoryFrequency inventoryFrequency) {
        setFrequency(inventoryFrequency);
        return this;
    }

    public void setFrequency(String str) {
        this.frequency = str;
    }
}
