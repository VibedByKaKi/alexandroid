package org.apache.commons.net.discard;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DiscardUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 9;
    private final DatagramPacket sendPacket = new DatagramPacket(NetConstants.EMPTY_BTYE_ARRAY, 0);

    public void send(byte[] bArr, int i, InetAddress inetAddress, int i2) throws IOException {
        this.sendPacket.setData(bArr);
        this.sendPacket.setLength(i);
        this.sendPacket.setAddress(inetAddress);
        this.sendPacket.setPort(i2);
        this._socket_.send(this.sendPacket);
    }

    public void send(byte[] bArr, int i, InetAddress inetAddress) throws IOException {
        send(bArr, i, inetAddress, 9);
    }

    public void send(byte[] bArr, InetAddress inetAddress) throws IOException {
        send(bArr, bArr.length, inetAddress, 9);
    }
}
