package com.amazon.identity.auth.device;

import com.amazon.identity.auth.attributes.CORPFMResponse$ComputationConfidenceValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class v8 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1024a;

    static {
        int[] iArr = new int[CORPFMResponse$ComputationConfidenceValue.values().length];
        f1024a = iArr;
        try {
            iArr[CORPFMResponse$ComputationConfidenceValue.CUSTOMER_PROVIDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1024a[CORPFMResponse$ComputationConfidenceValue.CUSTOMER_BASED_GUESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1024a[CORPFMResponse$ComputationConfidenceValue.DEVICE_BASED_GUESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
