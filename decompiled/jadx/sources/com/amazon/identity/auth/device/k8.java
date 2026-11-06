package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class k8 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f767a;

    static {
        int[] iArr = new int[MAPAgeClassificationManager.AgeClassification.values().length];
        f767a = iArr;
        try {
            iArr[MAPAgeClassificationManager.AgeClassification.ADULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f767a[MAPAgeClassificationManager.AgeClassification.TEEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f767a[MAPAgeClassificationManager.AgeClassification.CHILD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
