package com.amazon.coral.annotation.customtrait;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class JavaEmitterUtil {
    public static String escapeForJavaStringLiteral(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\\", "\\\\").replace("\n", "\\n").replace(DeviceConfigConstants.DOUBLE_QUOTE, "\\\"").replaceAll("\\\\u005D", "\\u005D").replaceAll("\\\\u005B", "\\u005B");
    }
}
