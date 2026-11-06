package com.amazon.identity.auth.device;

import com.amazon.identity.kcpsdk.common.FIRSErrorType;
import com.amazon.identity.kcpsdk.common.KindleWebserviceErrorType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class dm {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f583a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[KindleWebserviceErrorType.values().length];
        b = iArr;
        try {
            iArr[KindleWebserviceErrorType.KindleWebserviceErrorTypeDeviceAlreadyRegistered.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[KindleWebserviceErrorType.KindleWebserviceErrorTypeDuplicateDeviceName.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[KindleWebserviceErrorType.KindleWebserviceErrorTypeInternalError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[FIRSErrorType.values().length];
        f583a = iArr2;
        try {
            iArr2[FIRSErrorType.FIRSErrorTypeCustomerNotFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f583a[FIRSErrorType.FIRSErrorTypeDeviceAlreadyRegistered.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f583a[FIRSErrorType.FIRSErrorTypeDuplicateAccountName.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f583a[FIRSErrorType.FIRSErrorTypeInternalError.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f583a[FIRSErrorType.FIRSErrorTypeInvalidAccountFound.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
