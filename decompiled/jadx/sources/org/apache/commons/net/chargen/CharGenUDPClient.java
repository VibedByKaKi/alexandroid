package org.apache.commons.net.chargen;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class CharGenUDPClient extends DatagramSocketClient {
    public static final int CHARGEN_PORT = 19;
    public static final int DEFAULT_PORT = 19;
    public static final int NETSTAT_PORT = 15;
    public static final int QUOTE_OF_DAY_PORT = 17;
    public static final int SYSTAT_PORT = 11;
    private final byte[] receiveData;
    private final DatagramPacket receivePacket;
    private final DatagramPacket sendPacket = new DatagramPacket(NetConstants.EMPTY_BTYE_ARRAY, 0);

    public CharGenUDPClient() {
        byte[] bArr = new byte[512];
        this.receiveData = bArr;
        this.receivePacket = new DatagramPacket(bArr, bArr.length);
    }

    public byte[] receive() throws IOException {
        this._socket_.receive(this.receivePacket);
        int length = this.receivePacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(this.receiveData, 0, bArr, 0, length);
        return bArr;
    }

    public void send(InetAddress inetAddress, int i) throws IOException {
        this.sendPacket.setAddress(inetAddress);
        this.sendPacket.setPort(i);
        this._socket_.send(this.sendPacket);
    }

    public void send(InetAddress inetAddress) throws IOException {
        send(inetAddress, 19);
    }
}
