package com.amazon.alexa.location.phase3.sensor.wifidetection;

import android.net.wifi.WifiInfo;
import com.amazon.alexa.location.phase3.LocationSignal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WifiDataInput extends LocationSignal {
    public static final String DATA_TYPE = "WIFI_DETAIL_INFO";
    public static final int WIFI_STATUS_CONNECTED = 1;
    public static final int WIFI_STATUS_DISCONNECTED = 0;
    public final String bssid;
    public final int rssi;
    public final String ssid;
    public final int wifiStatus;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface WifiStatus {
    }

    public WifiDataInput(long j, WifiInfo wifiInfo) {
        super(DATA_TYPE, 1, j);
        this.ssid = wifiInfo.getSSID();
        String bssid = wifiInfo.getBSSID();
        this.bssid = bssid;
        this.rssi = wifiInfo.getRssi();
        this.wifiStatus = bssid == null ? 0 : 1;
    }

    public WifiDataInput(long j) {
        super(DATA_TYPE, 1, j);
        this.wifiStatus = 0;
        this.ssid = "";
        this.bssid = "";
        this.rssi = 0;
    }
}
