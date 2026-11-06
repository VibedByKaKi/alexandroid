package com.amazon.comms.config.tablets;

import com.amazon.comms.calling.service.DynamicAcousticParams;
import com.amazon.comms.calling.service.PlatformVoIPSelection;
import com.amazon.comms.config.util.DeviceConfigConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HDTabletASPVoIPConfig extends HDTabletConfig {
    private static HDTabletASPVoIPConfig tabletVoIPConfig = new HDTabletASPVoIPConfig();

    public static HDTabletASPVoIPConfig getDeviceConfigInstance() {
        return tabletVoIPConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public DynamicAcousticParams.ConfigPath getDynamicAcousticParamsConfigPath() {
        return DeviceConfigConstants.DYNAMIC_ACOUSTIC_PARAMS_CONFIG_PATH_LIBASP;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public PlatformVoIPSelection getPlatformVoIPSelection() {
        return new PlatformVoIPSelection(true, false);
    }
}
