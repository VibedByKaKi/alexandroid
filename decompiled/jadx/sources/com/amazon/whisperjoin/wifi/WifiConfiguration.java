package com.amazon.whisperjoin.wifi;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.BitSet;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class WifiConfiguration extends WifiBaseConfiguration implements Serializable, Validatable {
    private String psk;
    private String wepKey;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.wifi.WifiConfiguration$1, reason: invalid class name */
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

    private WifiConfiguration(String str, WifiKeyManagement wifiKeyManagement, String str2, String str3, int i, boolean z) {
        super(str, wifiKeyManagement, i, z);
        if (wifiKeyManagement == WifiKeyManagement.WEP) {
            this.wepKey = getValidWepKey(str2);
        } else if (wifiKeyManagement == WifiKeyManagement.WPA_PSK) {
            this.psk = getValidPsk(str3);
        }
        validate();
    }

    public static WifiConfiguration createOpenWifiConfiguration(String str) {
        return new WifiConfiguration(str, WifiKeyManagement.NONE, null, null, 0, false);
    }

    public static WifiConfiguration createWepWifiConfiguration(String str, String str2) {
        return new WifiConfiguration(str, WifiKeyManagement.WEP, str2, null, 0, false);
    }

    public static WifiConfiguration createWpaWifiConfiguration(String str, String str2) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, null, str2, 0, false);
    }

    private String getValidPsk(String str) {
        if (str != null && str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) && str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid wifi configuration. PSK is not quoted. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
        return null;
    }

    private String getValidWepKey(String str) {
        if (str == null || !str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            return str;
        }
        String m = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        StringBuilder sb = new StringBuilder();
        for (char c : m.toCharArray()) {
            sb.append(Integer.toHexString(c).toUpperCase());
        }
        return sb.toString();
    }

    @Override // com.amazon.whisperjoin.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.wifi.WifiNetwork
    public boolean canEqual(Object obj) {
        return obj instanceof WifiConfiguration;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConfiguration)) {
            return false;
        }
        WifiConfiguration wifiConfiguration = (WifiConfiguration) obj;
        if (!wifiConfiguration.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String wepKey = getWepKey();
        String wepKey2 = wifiConfiguration.getWepKey();
        if (wepKey != null ? !wepKey.equals(wepKey2) : wepKey2 != null) {
            return false;
        }
        String psk = getPsk();
        String psk2 = wifiConfiguration.getPsk();
        return psk != null ? psk.equals(psk2) : psk2 == null;
    }

    public String getPsk() {
        if (this.psk == null) {
            return null;
        }
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), this.psk, DeviceConfigConstants.DOUBLE_QUOTE);
    }

    public String getWepKey() {
        return this.wepKey;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.wifi.WifiNetwork
    public int hashCode() {
        int hashCode = super.hashCode();
        String wepKey = getWepKey();
        int i = hashCode * 59;
        int hashCode2 = wepKey == null ? 43 : wepKey.hashCode();
        String psk = getPsk();
        return ((i + hashCode2) * 59) + (psk != null ? psk.hashCode() : 43);
    }

    public android.net.wifi.WifiConfiguration toAndroidConfiguration() throws UnsupportedOperationException {
        android.net.wifi.WifiConfiguration wifiConfiguration = new android.net.wifi.WifiConfiguration();
        wifiConfiguration.SSID = getSsid();
        wifiConfiguration.hiddenSSID = this.hidden;
        wifiConfiguration.priority = this.priority;
        wifiConfiguration.allowedKeyManagement = new BitSet();
        wifiConfiguration.allowedAuthAlgorithms = new BitSet();
        wifiConfiguration.allowedGroupCiphers = new BitSet();
        int i = AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[this.keyMgmt.ordinal()];
        if (i == 1) {
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedAuthAlgorithms.set(1);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            String str = this.wepKey;
            if (str != null) {
                wifiConfiguration.wepTxKeyIndex = 0;
                wifiConfiguration.wepKeys[0] = str;
            }
        } else {
            if (i == 2) {
                wifiConfiguration.preSharedKey = getPsk();
                wifiConfiguration.allowedKeyManagement.set(1);
                return wifiConfiguration;
            }
            if (i == 3) {
                wifiConfiguration.allowedKeyManagement.set(0);
                return wifiConfiguration;
            }
            if (i == 4) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Network type of OTHER key management not supported");
                return null;
            }
        }
        return wifiConfiguration;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiBaseConfiguration, com.amazon.whisperjoin.wifi.WifiNetwork
    public String toString() {
        return "WifiConfiguration(wepKey=" + getWepKey() + ", psk=" + getPsk() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork, com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        super.validate();
        String str = this.psk;
        if (str != null && this.wepKey != null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Wifi configuration cannot have both WEP-key and PSK. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            return;
        }
        if (str != null && !InputValidator.isValidWPAWifiConfiguration(this.keyMgmt, getPsk())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid PSK in wifi configuration. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            return;
        }
        String str2 = this.wepKey;
        if (str2 != null && !InputValidator.isValidWEPWifiConfiguration(this.keyMgmt, str2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid WEP-key in wifi configuration. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
        } else if (this.psk == null && this.wepKey == null && !InputValidator.isValidOpenWifiConfiguration(this.keyMgmt)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid open wifi configuration. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
        }
    }

    public static WifiConfiguration createOpenWifiConfiguration(String str, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.NONE, null, null, i, z);
    }

    public static WifiConfiguration createWepWifiConfiguration(String str, String str2, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WEP, str2, null, i, z);
    }

    public static WifiConfiguration createWpaWifiConfiguration(String str, String str2, int i, boolean z) {
        return new WifiConfiguration(str, WifiKeyManagement.WPA_PSK, null, str2, i, z);
    }

    public WifiConfiguration(WifiConfiguration wifiConfiguration) {
        this(wifiConfiguration.getSsid(), wifiConfiguration.getKeyMgmt(), wifiConfiguration.getWepKey(), wifiConfiguration.getPsk(), wifiConfiguration.priority, false);
    }
}
