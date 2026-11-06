package com.amazon.alexa.accessory.capabilities.firmware;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsService;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FirmwareUpdateMetricsRecorder {
    private final AccessoryMetricsService accessoryMetricsService;

    public FirmwareUpdateMetricsRecorder(AccessoryMetricsService accessoryMetricsService) {
        Preconditions.notNull(accessoryMetricsService, "accessoryMetricsService");
        this.accessoryMetricsService = accessoryMetricsService;
    }

    public void recordFirmwareMetric(String str, String str2) {
        Preconditions.notNull(str, ShortcutConstants.METRIC_NAME_KEY);
        Preconditions.notNull(str2, "deviceType");
        this.accessoryMetricsService.recordCounter(str, str2, 1.0d, null);
    }

    public void recordFirmwareUpdatePreferenceResponse(Common.ErrorCode errorCode, String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("firmware_accessory", String.valueOf(i));
        hashMap.put("firmware_accessory_0", String.valueOf(i2));
        this.accessoryMetricsService.recordCounter("AccessoryDfuGetFirmwareUpdatePreference:" + errorCode, str, 1.0d, hashMap);
    }

    public void recordGetFirmwareInformationResponse(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("firmware_accessory", String.valueOf(i));
        this.accessoryMetricsService.recordCounter(MetricsConstants.Dfu.GET_FIRMWARE_INFORMATION_RESPONSE, str, 1.0d, hashMap);
    }
}
