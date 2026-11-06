package com.amazonaws.mobileconnectors.iot;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
enum PEMObjectType {
    PRIVATE_KEY_PKCS1("-----BEGIN RSA PRIVATE KEY-----"),
    PRIVATE_KEY_PKCS8("-----BEGIN PRIVATE KEY-----"),
    PUBLIC_KEY_X509("-----BEGIN PUBLIC KEY-----"),
    CERTIFICATE_X509("-----BEGIN CERTIFICATE-----");

    private final String beginMarker;

    PEMObjectType(String str) {
        this.beginMarker = str;
    }

    public static PEMObjectType fromBeginMarker(String str) {
        for (PEMObjectType pEMObjectType : values()) {
            if (pEMObjectType.getBeginMarker().equals(str)) {
                return pEMObjectType;
            }
        }
        return null;
    }

    public String getBeginMarker() {
        return this.beginMarker;
    }
}
