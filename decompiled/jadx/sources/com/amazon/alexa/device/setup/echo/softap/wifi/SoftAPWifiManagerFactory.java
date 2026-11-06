package com.amazon.alexa.device.setup.echo.softap.wifi;

import android.content.Context;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.protocols.service.api.LazyComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class SoftAPWifiManagerFactory {
    private SoftAPWifiManagerFactory() {
    }

    public static SoftAPWifiManager getSoftAPWifiManager(Context context, LazyComponent<IdentityService> lazyComponent) {
        return new SoftAPWifiManager(context, lazyComponent);
    }
}
