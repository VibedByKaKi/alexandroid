package com.amazon.identity.auth.device;

import com.amazon.identity.kcpsdk.auth.PandaError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class mj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f812a;

    static {
        int[] iArr = new int[PandaError.values().length];
        f812a = iArr;
        try {
            iArr[PandaError.PandaErrorMissingValue.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f812a[PandaError.PandaErrorCredentialError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f812a[PandaError.PandaErrorInvalidValue.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f812a[PandaError.PandaErrorServerError.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f812a[PandaError.PandaErrorServiceUnavailable.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f812a[PandaError.PandaErrorForbidden.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f812a[PandaError.PandaErrorUnknown.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
