package com.amazon.identity.auth.device.framework;

import com.amazon.identity.auth.device.framework.IsolatedModeSwitcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f646a;

    static {
        int[] iArr = new int[IsolatedModeSwitcher.SealedIsolationSource.values().length];
        f646a = iArr;
        try {
            iArr[IsolatedModeSwitcher.SealedIsolationSource.DE_READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f646a[IsolatedModeSwitcher.SealedIsolationSource.CE_FALLBACK_WITH_MIGRATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f646a[IsolatedModeSwitcher.SealedIsolationSource.CE_DIRECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
