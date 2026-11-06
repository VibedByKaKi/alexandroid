package org.apache.commons.net.daytime;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class DaytimeUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 13;
    private final byte[] dummyData = new byte[1];
    private final byte[] timeData = new byte[256];

    public String getTime(InetAddress inetAddress, int i) throws IOException {
        byte[] bArr = this.dummyData;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i);
        byte[] bArr2 = this.timeData;
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr2, bArr2.length);
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        return new String(datagramPacket2.getData(), 0, datagramPacket2.getLength(), getCharset());
    }

    public String getTime(InetAddress inetAddress) throws IOException {
        return getTime(inetAddress, 13);
    }
}
