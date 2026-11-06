package com.amazon.whisperjoin.provisioning.metrics.client.helpers;

import com.amazon.whisperjoin.provisioning.metrics.client.MinervaMetricHelper;
import com.amazon.whisperjoin.wifi.WifiKeyManagement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class CredentialLockerMetrics {
    private static final String NONE_LOCKER_NETWORK_SUCCESSFULLY_USED_METRIC = "NoneLockerNetworkSuccessfullyUsed";
    private static final String NONE_LOCKER_NETWORK_USED_METRIC = "NoneLockerNetworkUsed";
    private static final String WEP_LOCKER_NETWORK_SUCCESSFULLY_USED_METRIC = "WepLockerNetworkSuccessfullyUsed";
    private static final String WEP_LOCKER_NETWORK_USED_METRIC = "WepLockerNetworkUsed";
    private static final String WPA_LOCKER_NETWORK_SUCCESSFULLY_USED_METRIC = "WpaLockerNetworkSuccessfullyUsed";
    private static final String WPA_LOCKER_NETWORK_USED_METRIC = "WpaLockerNetworkUsed";
    private final MinervaMetricHelper mMinervaMetricHelper;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.provisioning.metrics.client.helpers.CredentialLockerMetrics$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement;

        static {
            int[] iArr = new int[WifiKeyManagement.values().length];
            $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement = iArr;
            try {
                iArr[WifiKeyManagement.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[WifiKeyManagement.WPA_PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[WifiKeyManagement.WEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CredentialLockerMetrics(MinervaMetricHelper minervaMetricHelper) {
        this.mMinervaMetricHelper = minervaMetricHelper;
    }

    public void onLockerNetworkUsed(WifiKeyManagement wifiKeyManagement, boolean z) {
        if (wifiKeyManagement == null) {
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$wifi$WifiKeyManagement[wifiKeyManagement.ordinal()];
        if (i == 1) {
            this.mMinervaMetricHelper.recordCounter(NONE_LOCKER_NETWORK_USED_METRIC, 1.0d, new Object[0]);
            this.mMinervaMetricHelper.recordCounter(NONE_LOCKER_NETWORK_SUCCESSFULLY_USED_METRIC, z ? 1.0d : 0.0d, new Object[0]);
        } else if (i == 2) {
            this.mMinervaMetricHelper.recordCounter(WPA_LOCKER_NETWORK_USED_METRIC, 1.0d, new Object[0]);
            this.mMinervaMetricHelper.recordCounter(WPA_LOCKER_NETWORK_SUCCESSFULLY_USED_METRIC, z ? 1.0d : 0.0d, new Object[0]);
        } else {
            if (i != 3) {
                return;
            }
            this.mMinervaMetricHelper.recordCounter(WEP_LOCKER_NETWORK_USED_METRIC, 1.0d, new Object[0]);
            this.mMinervaMetricHelper.recordCounter(WEP_LOCKER_NETWORK_SUCCESSFULLY_USED_METRIC, z ? 1.0d : 0.0d, new Object[0]);
        }
    }
}
