package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.SigninOption;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f736a;

    static {
        int[] iArr = new int[SigninOption.values().length];
        f736a = iArr;
        try {
            iArr[SigninOption.WebviewSignin.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f736a[SigninOption.WebviewCreateAccount.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f736a[SigninOption.MyAccountSignin.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f736a[SigninOption.WebviewForgotPassword.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f736a[SigninOption.WebviewConfirmCredentials.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
