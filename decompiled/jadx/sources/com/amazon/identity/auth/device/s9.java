package com.amazon.identity.auth.device;

import com.amazon.identity.kcpsdk.auth.RegisterDeviceErrorType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class s9 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f936a;

    static {
        int[] iArr = new int[RegisterDeviceErrorType.values().length];
        f936a = iArr;
        try {
            iArr[RegisterDeviceErrorType.RegisterDeviceErrorTypeCustomerNotFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f936a[RegisterDeviceErrorType.RegisterDeviceErrorTypeDeviceAlreadyRegistered.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f936a[RegisterDeviceErrorType.RegisterDeviceErrorTypeDuplicateDeviceName.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f936a[RegisterDeviceErrorType.RegisterDeviceErrorTypeUnrecognized.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f936a[RegisterDeviceErrorType.RegisterDeviceErrorTypeUnrecognizedFirs.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f936a[RegisterDeviceErrorType.RegisterDeviceErrorTypeUnrecognizedKindle.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f936a[RegisterDeviceErrorType.RegisterDeviceErrorTypeUnrecognizedPanda.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
