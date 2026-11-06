package com.amazonaws.services.s3.model.inventory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum InventoryFrequency {
    Daily("Daily"),
    Weekly("Weekly");

    private final String frequency;

    InventoryFrequency(String str) {
        this.frequency = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.frequency;
    }
}
