package com.amazon.alexa.accessory.frames.wifiap;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.protocol.Wificonfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class WifiApInfo {
    private String additionalInfo;
    private String hostname;
    private String ipAddress;
    private String passPhrase;
    private String ssid;

    @Nullable
    private byte[] tlsFingerprintSha256;

    public WifiApInfo(Wificonfig.WiFiConfigAPInfo wiFiConfigAPInfo) {
        updateDetails(wiFiConfigAPInfo);
    }

    public String getAdditionalInfo() {
        String str;
        synchronized (this) {
            str = this.additionalInfo;
        }
        return str;
    }

    public String getHostname() {
        String str;
        synchronized (this) {
            str = this.hostname;
        }
        return str;
    }

    public String getIpAddress() {
        String str;
        synchronized (this) {
            str = this.ipAddress;
        }
        return str;
    }

    public String getPassPhrase() {
        String str;
        synchronized (this) {
            str = this.passPhrase;
        }
        return str;
    }

    public String getSsid() {
        String str;
        synchronized (this) {
            str = this.ssid;
        }
        return str;
    }

    @Nullable
    public byte[] getTlsFingerprintSha256() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.tlsFingerprintSha256;
        }
        return bArr;
    }

    public void setTlsFingerprintSha256(@Nullable byte[] bArr) {
        synchronized (this) {
            this.tlsFingerprintSha256 = bArr;
        }
    }

    public void updateDetails(Wificonfig.WiFiConfigAPInfo wiFiConfigAPInfo) {
        if (wiFiConfigAPInfo != null) {
            synchronized (this) {
                this.ssid = wiFiConfigAPInfo.getSsid().toStringUtf8();
                this.passPhrase = wiFiConfigAPInfo.getPassphrase();
                this.ipAddress = wiFiConfigAPInfo.getIpAddress();
                this.hostname = wiFiConfigAPInfo.getHostname();
                this.additionalInfo = wiFiConfigAPInfo.getAdditionalInfo();
            }
        }
    }
}
