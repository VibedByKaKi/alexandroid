package com.amazon.blueshift.bluefront.android.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.amazon.devicesetupservice.smarthome.ProtocolType;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class NetworkAnalyzer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NetworkType {
        EDGE("EDGE"),
        GPRS("GPRS"),
        LTE("LTE"),
        THREE_G("3G"),
        UNKNOWN("UNKNOWN"),
        WIFI(ProtocolType.WIFI),
        NONE("NONE");

        private final String mName;

        NetworkType(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    @VisibleForTesting
    public NetworkAnalyzer() {
    }

    private static NetworkType getMobileNetworkType(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return NetworkType.UNKNOWN;
        }
        switch (telephonyManager.getNetworkType()) {
        }
        return NetworkType.UNKNOWN;
    }

    public static NetworkType getNetworkType(Context context) {
        Preconditions.checkNotNull(context, "context cannot be null");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            NetworkInfo.State state = networkInfo != null ? networkInfo.getState() : null;
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
            NetworkInfo.State state2 = networkInfo2 != null ? networkInfo2.getState() : null;
            if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                return NetworkType.WIFI;
            }
            if (state != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                try {
                    return getMobileNetworkType(context);
                } catch (SecurityException unused) {
                    return NetworkType.UNKNOWN;
                }
            }
            if (state2 == null && state == null) {
                return NetworkType.UNKNOWN;
            }
        }
        return NetworkType.NONE;
    }
}
