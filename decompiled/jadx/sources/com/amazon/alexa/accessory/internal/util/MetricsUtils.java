package com.amazon.alexa.accessory.internal.util;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.repositories.device.v2.Device;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MetricsUtils {
    private static final char EXCEPTION_SEPARATOR = ':';
    private static final int MAX_METRIC_NAME_LENGTH = 256;

    private MetricsUtils() {
    }

    public static String createMetricNameFromThrowable(String str, Throwable th) {
        Preconditions.notNull(str, "prefix");
        Preconditions.notNull(th, "throwable");
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        while (th != null) {
            sb.append(':');
            sb.append(th.getClass().getSimpleName());
            th = th.getCause();
        }
        return sb.substring(0, Math.min(sb.length(), 256));
    }

    @Nullable
    public static String getDeviceTypeOfHighestId(DeviceGroup deviceGroup) {
        Device deviceWithHighestId = deviceGroup.getDeviceWithHighestId();
        return deviceWithHighestId != null ? deviceWithHighestId.getType() : "unknown";
    }
}
