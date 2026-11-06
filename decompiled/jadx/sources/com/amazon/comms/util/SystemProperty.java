package com.amazon.comms.util;

import com.amazon.comms.log.CommsLogger;
import com.dee.app.metrics.MetricsConstants;
import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemProperty {
    private static final CommsLogger log = CommsLogger.getLogger(SystemProperty.class);

    public static int getIntSystemProperty(String str, int i) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i));
            return invoke != null ? ((Integer) invoke).intValue() : i;
        } catch (Exception e) {
            CommsLogger commsLogger = log;
            commsLogger.e("Unable to get system property: %s , using default value = %d ", str, Integer.valueOf(i));
            commsLogger.e("Got exception while reading system property.", e);
            return i;
        }
    }

    public static String getSystemProperty(String str, String str2) {
        String str3 = null;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(MetricsConstants.Method.CACHE_GET, String.class).invoke(null, str);
        } catch (Exception e) {
            log.e("unable to read system property: Exception ", e);
        }
        return (str3 == null || Strings.isNullOrEmpty(str3)) ? str2 : str3;
    }
}
