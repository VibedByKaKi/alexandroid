package chip.devicecontroller;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ThreadScanResult {
    public Integer channel;
    public byte[] extendedAddress;
    public Long extendedPanId;
    public Integer lqi;
    public String networkName;
    public Integer panId;
    public Integer rssi;
    public Integer version;

    public ThreadScanResult(Integer num, Long l, String str, Integer num2, Integer num3, byte[] bArr, Integer num4, Integer num5) {
        this.panId = num;
        this.extendedPanId = l;
        this.networkName = str;
        this.channel = num2;
        this.version = num3;
        this.extendedAddress = bArr;
        this.rssi = num4;
        this.lqi = num5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThreadScanResult {\n\tpanId: ");
        sb.append(this.panId);
        sb.append("\n\textendedPanId: ");
        sb.append(this.extendedPanId);
        sb.append("\n\tnetworkName: ");
        sb.append(this.networkName);
        sb.append("\n\tchannel: ");
        sb.append(this.channel);
        sb.append("\n\tversion: ");
        sb.append(this.version);
        sb.append("\n\textendedAddress: ");
        sb.append(Arrays.toString(this.extendedAddress));
        sb.append("\n\trssi: ");
        sb.append(this.rssi);
        sb.append("\n\tlqi: ");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.lqi, "\n}\n");
    }
}
