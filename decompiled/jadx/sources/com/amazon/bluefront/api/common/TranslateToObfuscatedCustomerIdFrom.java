package com.amazon.bluefront.api.common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum TranslateToObfuscatedCustomerIdFrom {
    DIRECTED_ID("DIRECTED_ID"),
    NO_TRANSLATION("NO_TRANSLATION");

    private final String mType;

    TranslateToObfuscatedCustomerIdFrom(String str) {
        this.mType = str;
    }

    public static TranslateToObfuscatedCustomerIdFrom fromSerializedForm(String str) {
        for (TranslateToObfuscatedCustomerIdFrom translateToObfuscatedCustomerIdFrom : values()) {
            if (translateToObfuscatedCustomerIdFrom.toSerializedForm().equals(str)) {
                return translateToObfuscatedCustomerIdFrom;
            }
        }
        return null;
    }

    public String toSerializedForm() {
        return this.mType;
    }
}
