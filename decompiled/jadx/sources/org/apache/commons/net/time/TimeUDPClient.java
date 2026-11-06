package org.apache.commons.net.time;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Date;
import org.apache.commons.net.DatagramSocketClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TimeUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 37;
    public static final long SECONDS_1900_TO_1970 = 2208988800L;
    private final byte[] dummyData = new byte[1];
    private final byte[] timeData = new byte[4];

    public Date getDate(InetAddress inetAddress) throws IOException {
        return new Date((getTime(inetAddress, 37) - 2208988800L) * 1000);
    }

    public long getTime(InetAddress inetAddress, int i) throws IOException {
        byte[] bArr = this.dummyData;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i);
        byte[] bArr2 = this.timeData;
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr2, bArr2.length);
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        byte[] bArr3 = this.timeData;
        return (((bArr3[0] & 255) << 24) & 4294967295L) | (((bArr3[1] & 255) << 16) & 4294967295L) | (((bArr3[2] & 255) << 8) & 4294967295L) | (4294967295L & bArr3[3] & 255);
    }

    public Date getDate(InetAddress inetAddress, int i) throws IOException {
        return new Date((getTime(inetAddress, i) - 2208988800L) * 1000);
    }

    public long getTime(InetAddress inetAddress) throws IOException {
        return getTime(inetAddress, 37);
    }
}
