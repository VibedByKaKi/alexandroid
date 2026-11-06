package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb, @NonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, DeviceConfigConstants.DOUBLE_QUOTE, str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, DeviceConfigConstants.DOUBLE_QUOTE, str2, DeviceConfigConstants.DOUBLE_QUOTE);
            }
            z = false;
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
    }
}
