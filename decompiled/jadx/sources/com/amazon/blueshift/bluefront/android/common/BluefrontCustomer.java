package com.amazon.blueshift.bluefront.android.common;

import com.amazon.bluefront.api.common.TranslateToObfuscatedCustomerIdFrom;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BluefrontCustomer {
    private final String mCustomerId;
    private final TranslateToObfuscatedCustomerIdFrom mCustomerIdentiferType;

    public BluefrontCustomer(String str, TranslateToObfuscatedCustomerIdFrom translateToObfuscatedCustomerIdFrom) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "CustomerId cannot be null or empty");
        Preconditions.checkNotNull(translateToObfuscatedCustomerIdFrom, "Identifier type cannot be null");
        this.mCustomerId = str;
        this.mCustomerIdentiferType = translateToObfuscatedCustomerIdFrom;
    }

    public final String getCustomerId() {
        return this.mCustomerId;
    }

    public final TranslateToObfuscatedCustomerIdFrom getIdentifierType() {
        return this.mCustomerIdentiferType;
    }
}
