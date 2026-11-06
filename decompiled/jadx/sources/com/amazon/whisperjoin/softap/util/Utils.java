package com.amazon.whisperjoin.softap.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class Utils {
    public static String getStringWithoutWrappingQuotesIfPresent(String str) {
        if (str == null) {
            return null;
        }
        return isStringWrappedInQuotes(str) ? AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str) : str;
    }

    public static boolean isStringWrappedInQuotes(String str) {
        return str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) && str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE);
    }
}
