package com.amazon.identity.auth.device;

import android.app.KeyguardManager;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ek extends fk {

    /* renamed from: a, reason: collision with root package name */
    public static final ek f604a = new ek();

    @Override // com.amazon.identity.auth.device.fk
    public final boolean a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("keyguard");
        systemService.getClass();
        if (((KeyguardManager) systemService).isDeviceSecure()) {
            return true;
        }
        yf.b("PasskeyEligibilityHandler", "Device is not secured with a screen lock", "MAPPasskeyEligibilityCheck:DeviceNotSecure");
        return false;
    }
}
