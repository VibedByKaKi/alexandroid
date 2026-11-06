package com.amazon.alexa.accessory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryScanRecord {
    byte getColor();

    short getProductId();

    byte[] getProductSpecificData();

    short getVendorId();

    boolean hasAnUpdateAvailable();

    boolean isDiscoverableOverBTClassic();

    boolean isInOOBEMode();

    boolean prefersRFCOMMConnection();

    boolean supportsBridging();
}
