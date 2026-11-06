package com.amazon.identity.auth.attributes;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CORPFMResponse$ComputationConfidenceValue {
    CUSTOMER_PROVIDED("CUSTOMER_PROVIDED", false),
    CUSTOMER_BASED_GUESS("CUSTOMER_BASED_GUESS", true),
    DEVICE_BASED_GUESS("DEVICE_BASED_GUESS", true);

    private static final Map<String, CORPFMResponse$ComputationConfidenceValue> LOOKUP_BY_VALUE = new HashMap();
    private final boolean mIsGuess;
    private final String mValue;

    static {
        for (CORPFMResponse$ComputationConfidenceValue cORPFMResponse$ComputationConfidenceValue : values()) {
            LOOKUP_BY_VALUE.put(cORPFMResponse$ComputationConfidenceValue.getValue(), cORPFMResponse$ComputationConfidenceValue);
        }
    }

    CORPFMResponse$ComputationConfidenceValue(String str, boolean z) {
        this.mValue = str;
        this.mIsGuess = z;
    }

    public static CORPFMResponse$ComputationConfidenceValue parseFromValue(String str, CORPFMResponse$ComputationConfidenceValue cORPFMResponse$ComputationConfidenceValue) {
        CORPFMResponse$ComputationConfidenceValue cORPFMResponse$ComputationConfidenceValue2 = LOOKUP_BY_VALUE.get(str);
        return cORPFMResponse$ComputationConfidenceValue2 != null ? cORPFMResponse$ComputationConfidenceValue2 : cORPFMResponse$ComputationConfidenceValue;
    }

    public String getValue() {
        return this.mValue;
    }

    public boolean isGuess() {
        return this.mIsGuess;
    }
}
