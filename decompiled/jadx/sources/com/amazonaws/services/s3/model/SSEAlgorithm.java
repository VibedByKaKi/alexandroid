package com.amazonaws.services.s3.model;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum SSEAlgorithm {
    AES256("AES256"),
    KMS("aws:kms");

    private final String algorithm;

    SSEAlgorithm(String str) {
        this.algorithm = str;
    }

    public static SSEAlgorithm fromString(String str) {
        if (str == null) {
            return null;
        }
        for (SSEAlgorithm sSEAlgorithm : values()) {
            if (sSEAlgorithm.getAlgorithm().equals(str)) {
                return sSEAlgorithm;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unsupported algorithm ".concat(str));
        return null;
    }

    public static SSEAlgorithm getDefault() {
        return AES256;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.algorithm;
    }
}
