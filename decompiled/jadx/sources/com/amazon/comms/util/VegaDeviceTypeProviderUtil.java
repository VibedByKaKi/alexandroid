package com.amazon.comms.util;

import android.os.Build;
import com.amazon.comms.log.CommsLogger;
import com.google.common.collect.ImmutableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VegaDeviceTypeProviderUtil {
    private static final String VEGA_2020_DEVICE_TYPE_ID_CAPELLA = "A3V88YODYKUDL4";
    private static final String VEGA_2020_DEVICE_TYPE_ID_POLARIS = "A1GPRTT66OBCF0";
    public static final String VEGA_LEGACY_DEVICE_TYPE_ID = "A2J0R2SD7G9LPA";
    private static final CommsLogger mLog = CommsLogger.getLogger(VegaDeviceTypeProviderUtil.class);
    private static final ImmutableMap<String, String> MODEL_TO_DEVICE_TYPE_MAP = ImmutableMap.builder().put("Lenovo TB-X306FA", "A1GPRTT66OBCF0").put("Lenovo TB-X306XA", "A1GPRTT66OBCF0").put("Lenovo TB-X306F", "A1GPRTT66OBCF0").put("Lenovo TB-X306X", "A1GPRTT66OBCF0").put("Lenovo TB-X606FA", "A3V88YODYKUDL4").put("Lenovo TB-X606XA", "A3V88YODYKUDL4").put("Lenovo TB-X606F", "A3V88YODYKUDL4").put("Lenovo TB-X606X", "A3V88YODYKUDL4").build();

    public static String getDeviceType() {
        String str;
        String str2 = Build.MODEL;
        CommsLogger commsLogger = mLog;
        commsLogger.d("Got Model name: " + str2);
        ImmutableMap<String, String> immutableMap = MODEL_TO_DEVICE_TYPE_MAP;
        if (immutableMap.containsKey(str2)) {
            str = immutableMap.get(str2);
        } else {
            commsLogger.e("No model mapping, will use legacy device type: A2J0R2SD7G9LPA");
            str = "A2J0R2SD7G9LPA";
        }
        commsLogger.d("Providing model type: " + str);
        return str;
    }
}
