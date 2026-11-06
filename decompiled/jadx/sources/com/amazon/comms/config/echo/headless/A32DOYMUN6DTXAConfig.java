package com.amazon.comms.config.echo.headless;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class A32DOYMUN6DTXAConfig extends HeadlessFos6FastMixerCommonConfig {
    private static A32DOYMUN6DTXAConfig a32DOYMUN6DTXAConfig = new A32DOYMUN6DTXAConfig();

    public static A32DOYMUN6DTXAConfig getDeviceConfigInstance() {
        return a32DOYMUN6DTXAConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsReducedRegistrationTraffic() {
        return true;
    }
}
