package com.amazon.identity.auth.device.framework.sso;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f662a;

    static {
        int[] iArr = new int[SingleSignOnEligibilityChecker$SSOType.values().length];
        f662a = iArr;
        try {
            iArr[SingleSignOnEligibilityChecker$SSOType.BOOTSTRAP_SSO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f662a[SingleSignOnEligibilityChecker$SSOType.FULL_SSO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
