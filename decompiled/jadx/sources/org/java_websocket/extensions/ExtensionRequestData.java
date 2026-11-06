package org.java_websocket.extensions;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ExtensionRequestData {
    public static final String EMPTY_VALUE = "";
    private String extensionName;
    private Map<String, String> extensionParameters = new LinkedHashMap();

    private ExtensionRequestData() {
    }

    public static ExtensionRequestData parseExtensionRequest(String str) {
        String str2;
        ExtensionRequestData extensionRequestData = new ExtensionRequestData();
        String[] split = str.split(";");
        extensionRequestData.extensionName = split[0].trim();
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length > 1) {
                str2 = split2[1].trim();
                if ((str2.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) && str2.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) || (str2.startsWith("'") && str2.endsWith("'") && str2.length() > 2)) {
                    str2 = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str2);
                }
            } else {
                str2 = "";
            }
            extensionRequestData.extensionParameters.put(split2[0].trim(), str2);
        }
        return extensionRequestData;
    }

    public String getExtensionName() {
        return this.extensionName;
    }

    public Map<String, String> getExtensionParameters() {
        return this.extensionParameters;
    }
}
