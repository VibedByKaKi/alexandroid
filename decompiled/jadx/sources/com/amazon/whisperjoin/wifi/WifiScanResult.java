package com.amazon.whisperjoin.wifi;

import android.net.wifi.ScanResult;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final class WifiScanResult extends WifiNetwork implements Serializable, Validatable {
    private int freqMhz;
    private int rssi;

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement, int i, int i2) {
        super(str, wifiKeyManagement);
        this.freqMhz = i;
        this.rssi = InputValidator.getValidRssi(i2);
        validate();
    }

    public static WifiScanResult convertFromAndroidScanResult(ScanResult scanResult) {
        return new WifiScanResult(a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), scanResult.SSID, DeviceConfigConstants.DOUBLE_QUOTE), WifiKeyManagement.getWifiKeyManagement(scanResult), scanResult.frequency, scanResult.level);
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork
    public boolean canEqual(Object obj) {
        return obj instanceof WifiScanResult;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiScanResult)) {
            return false;
        }
        WifiScanResult wifiScanResult = (WifiScanResult) obj;
        return wifiScanResult.canEqual(this) && super.equals(obj) && getFreqMhz() == wifiScanResult.getFreqMhz() && getRssi() == wifiScanResult.getRssi();
    }

    public int getFreqMhz() {
        return this.freqMhz;
    }

    public int getRssi() {
        return this.rssi;
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork
    public int hashCode() {
        return getRssi() + ((getFreqMhz() + (super.hashCode() * 59)) * 59);
    }

    @Override // com.amazon.whisperjoin.wifi.WifiNetwork, com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        super.validate();
        if (InputValidator.isValidFrequency(this.freqMhz)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Frequency of Wifi network cannot be negative. Please use InputValidator methods to validate parameters.");
    }

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement) {
        this(str, wifiKeyManagement, 0, -100);
    }
}
