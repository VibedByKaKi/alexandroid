package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class bk extends fk {

    /* renamed from: a, reason: collision with root package name */
    public static final bk f536a = new bk();

    @Override // com.amazon.identity.auth.device.fk
    public final boolean a(Context context) {
        context.getClass();
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            if (j >= 230815045) {
                return true;
            }
            yf.b("PasskeyEligibilityHandler", "Device is using old GMS version " + j, "MAPPasskeyEligibilityCheck:UnsupportedGMSVersion:" + j);
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            yf.b("PasskeyEligibilityHandler", "GMS package name is not found on the device", "MAPPasskeyEligibilityCheck:GMSPackageNameNotFound");
            return false;
        }
    }
}
