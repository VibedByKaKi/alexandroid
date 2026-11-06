package chip.devicecontroller;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class WiFiScanResult {
    public byte[] bssid;
    public Integer channel;
    public Integer rssi;
    public Integer security;
    public byte[] ssid;
    public Integer wiFiBand;

    public WiFiScanResult(Integer num, byte[] bArr, byte[] bArr2, Integer num2, Integer num3, Integer num4) {
        this.security = num;
        this.ssid = bArr;
        this.bssid = bArr2;
        this.channel = num2;
        this.wiFiBand = num3;
        this.rssi = num4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WiFiScanResult {\n\tsecurity: ");
        sb.append(this.security);
        sb.append("\n\tssid: ");
        sb.append(Arrays.toString(this.ssid));
        sb.append("\n\tbssid: ");
        sb.append(Arrays.toString(this.bssid));
        sb.append("\n\tchannel: ");
        sb.append(this.channel);
        sb.append("\n\twiFiBand: ");
        sb.append(this.wiFiBand);
        sb.append("\n\trssi: ");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.rssi, "\n}\n");
    }
}
