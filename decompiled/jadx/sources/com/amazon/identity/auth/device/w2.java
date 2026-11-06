package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.framework.AuthEndpointErrorParser$AuthErrorType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1040a;

    static {
        int[] iArr = new int[AuthEndpointErrorParser$AuthErrorType.values().length];
        f1040a = iArr;
        try {
            iArr[AuthEndpointErrorParser$AuthErrorType.MissingValue.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1040a[AuthEndpointErrorParser$AuthErrorType.InvalidToken.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1040a[AuthEndpointErrorParser$AuthErrorType.InvalidRequest.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
