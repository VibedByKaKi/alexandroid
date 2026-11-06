package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.storage.PropagationPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class y8 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1085a;

    static {
        int[] iArr = new int[PropagationPolicy.values().length];
        f1085a = iArr;
        try {
            iArr[PropagationPolicy.ASYNC_BEST_EFFORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
