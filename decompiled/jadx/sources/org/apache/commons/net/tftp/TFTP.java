package org.apache.commons.net.tftp;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import org.apache.commons.net.DatagramSocketClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TFTP extends DatagramSocketClient {
    public static final int ASCII_MODE = 0;
    public static final int BINARY_MODE = 1;
    public static final int DEFAULT_PORT = 69;
    public static final int DEFAULT_TIMEOUT = 5000;
    public static final int IMAGE_MODE = 1;
    public static final int NETASCII_MODE = 0;
    public static final int OCTET_MODE = 1;
    static final int PACKET_SIZE = 516;
    private byte[] receiveBuffer;
    private DatagramPacket receiveDatagram;
    byte[] sendBuffer;
    private DatagramPacket sendDatagram;

    public TFTP() {
        setDefaultTimeout(5000);
        this.receiveBuffer = null;
        this.receiveDatagram = null;
    }

    public static final String getModeName(int i) {
        return TFTPRequestPacket.modeStrings[i];
    }

    public final void beginBufferedOps() {
        this.receiveBuffer = new byte[PACKET_SIZE];
        byte[] bArr = this.receiveBuffer;
        this.receiveDatagram = new DatagramPacket(bArr, bArr.length);
        this.sendBuffer = new byte[PACKET_SIZE];
        byte[] bArr2 = this.sendBuffer;
        this.sendDatagram = new DatagramPacket(bArr2, bArr2.length);
    }

    public final TFTPPacket bufferedReceive() throws IOException, InterruptedIOException, SocketException, TFTPPacketException {
        this.receiveDatagram.setData(this.receiveBuffer);
        this.receiveDatagram.setLength(this.receiveBuffer.length);
        this._socket_.receive(this.receiveDatagram);
        TFTPPacket newTFTPPacket = TFTPPacket.newTFTPPacket(this.receiveDatagram);
        trace("<", newTFTPPacket);
        return newTFTPPacket;
    }

    public final void bufferedSend(TFTPPacket tFTPPacket) throws IOException {
        trace(">", tFTPPacket);
        this._socket_.send(tFTPPacket.newDatagram(this.sendDatagram, this.sendBuffer));
    }

    public final void discardPackets() throws IOException {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PACKET_SIZE], PACKET_SIZE);
        int soTimeout = getSoTimeout();
        setSoTimeout(1);
        while (true) {
            try {
                this._socket_.receive(datagramPacket);
            } catch (InterruptedIOException | SocketException unused) {
                setSoTimeout(soTimeout);
                return;
            }
        }
    }

    public final void endBufferedOps() {
        this.receiveBuffer = null;
        this.receiveDatagram = null;
        this.sendBuffer = null;
        this.sendDatagram = null;
    }

    public final TFTPPacket receive() throws IOException, InterruptedIOException, SocketException, TFTPPacketException {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PACKET_SIZE], PACKET_SIZE);
        this._socket_.receive(datagramPacket);
        TFTPPacket newTFTPPacket = TFTPPacket.newTFTPPacket(datagramPacket);
        trace("<", newTFTPPacket);
        return newTFTPPacket;
    }

    public final void send(TFTPPacket tFTPPacket) throws IOException {
        trace(">", tFTPPacket);
        this._socket_.send(tFTPPacket.newDatagram());
    }

    public void trace(String str, TFTPPacket tFTPPacket) {
    }
}
