package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.MAPConfigKeys;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class xe {
    public static xe b;

    /* renamed from: a, reason: collision with root package name */
    public final int f1068a;

    public xe(Bundle bundle) {
        this.f1068a = bundle.getInt(MAPConfigKeys.MAPConfigUI.SYSTEM_BAR_COLOR);
    }

    public static synchronized void a(Bundle bundle) {
        synchronized (xe.class) {
            if (b == null) {
                b = new xe(bundle);
            }
        }
    }
}
