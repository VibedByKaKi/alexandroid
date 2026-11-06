package com.amazon.whisperjoin.softap.helpers;

import com.amazon.whisperjoin.softap.pojos.WifiConfiguration;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class WifiConfigurationHelper {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.softap.helpers.WifiConfigurationHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$softap$pojos$WifiConfiguration$WifiKeyManagement;

        static {
            int[] iArr = new int[WifiConfiguration.WifiKeyManagement.values().length];
            $SwitchMap$com$amazon$whisperjoin$softap$pojos$WifiConfiguration$WifiKeyManagement = iArr;
            try {
                iArr[WifiConfiguration.WifiKeyManagement.WEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$softap$pojos$WifiConfiguration$WifiKeyManagement[WifiConfiguration.WifiKeyManagement.WPA_PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$softap$pojos$WifiConfiguration$WifiKeyManagement[WifiConfiguration.WifiKeyManagement.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static com.amazon.whisperjoin.wifi.WifiConfiguration toWhisperjoinWifiConfiguration(WifiConfiguration wifiConfiguration) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$softap$pojos$WifiConfiguration$WifiKeyManagement[wifiConfiguration.getKeyMgmt().ordinal()];
        if (i == 1) {
            return com.amazon.whisperjoin.wifi.WifiConfiguration.createWepWifiConfiguration(wifiConfiguration.getSsid(), wifiConfiguration.getKey());
        }
        if (i == 2) {
            return com.amazon.whisperjoin.wifi.WifiConfiguration.createWpaWifiConfiguration(wifiConfiguration.getSsid(), wifiConfiguration.getKey());
        }
        if (i == 3) {
            return com.amazon.whisperjoin.wifi.WifiConfiguration.createOpenWifiConfiguration(wifiConfiguration.getSsid());
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unknown network");
        return null;
    }
}
