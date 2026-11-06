package org.apache.commons.net.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.discard.DiscardUDPClient;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class EchoUDPClient extends DiscardUDPClient {
    public static final int DEFAULT_PORT = 7;
    private final DatagramPacket receivePacket = new DatagramPacket(NetConstants.EMPTY_BTYE_ARRAY, 0);

    public int receive(byte[] bArr, int i) throws IOException {
        this.receivePacket.setData(bArr);
        this.receivePacket.setLength(i);
        this._socket_.receive(this.receivePacket);
        return this.receivePacket.getLength();
    }

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public void send(byte[] bArr, InetAddress inetAddress) throws IOException {
        send(bArr, bArr.length, inetAddress, 7);
    }

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public void send(byte[] bArr, int i, InetAddress inetAddress) throws IOException {
        send(bArr, i, inetAddress, 7);
    }

    public int receive(byte[] bArr) throws IOException {
        return receive(bArr, bArr.length);
    }
}
