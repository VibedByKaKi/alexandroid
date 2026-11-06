package com.amazon.whisperjoin.wifi;

import android.net.wifi.ScanResult;
import java.util.BitSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public enum WifiKeyManagement {
    NONE,
    WPA_PSK,
    WEP,
    OTHER;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.wifi.WifiKeyManagement$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement;

        static {
            int[] iArr = new int[WifiKeyManagement.values().length];
            $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement = iArr;
            try {
                iArr[WifiKeyManagement.WEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[WifiKeyManagement.WPA_PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[WifiKeyManagement.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[WifiKeyManagement.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static WifiKeyManagement getWifiKeyManagement(android.net.wifi.WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot convert a null wifi-configuration's key-management.");
            return null;
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return WPA_PSK;
        }
        if (!wifiConfiguration.allowedKeyManagement.get(0)) {
            return OTHER;
        }
        String[] strArr = wifiConfiguration.wepKeys;
        return (strArr == null || strArr.length <= 0 || strArr[0] == null) ? NONE : WEP;
    }

    public BitSet toAndroidKeyManagement() {
        BitSet bitSet = new BitSet();
        int i = AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[ordinal()];
        if (i == 1) {
            bitSet.set(0);
            return bitSet;
        }
        if (i == 2) {
            bitSet.set(1);
            return bitSet;
        }
        if (i == 3) {
            bitSet.set(0);
            return bitSet;
        }
        if (i != 4) {
            return bitSet;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Network type of OTHER key management not supported.");
        return null;
    }

    public static WifiKeyManagement getWifiKeyManagement(ScanResult scanResult) {
        if (scanResult.capabilities.contains("WEP")) {
            return WEP;
        }
        if (scanResult.capabilities.contains("PSK")) {
            return WPA_PSK;
        }
        if (scanResult.capabilities.contains("EAP")) {
            return OTHER;
        }
        return NONE;
    }
}
