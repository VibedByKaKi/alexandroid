package com.amazon.alexa.aamb.proxy;

import android.util.Log;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class UdpClient {
    private static final String TAG = "UdpClient";
    private final byte[] datagram;
    private final int timeout;

    public UdpClient(byte[] bArr, int i) {
        this.datagram = bArr;
        this.timeout = i;
    }

    public DatagramPacket sendAndReceive() throws UnknownHostException {
        byte[] bArr = new byte[4];
        System.arraycopy(this.datagram, 0, bArr, 0, 4);
        InetAddress byAddress = InetAddress.getByAddress(bArr);
        byte[] bArr2 = this.datagram;
        int i = ((bArr2[4] & 255) << 8) | (bArr2[5] & 255);
        byAddress.getHostAddress();
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            try {
                datagramSocket.setSoTimeout(this.timeout);
                byte[] bArr3 = this.datagram;
                int length = bArr3.length - 12;
                byte[] bArr4 = new byte[length];
                System.arraycopy(bArr3, 12, bArr4, 0, bArr3.length - 12);
                datagramSocket.send(new DatagramPacket(bArr4, length, byAddress, i));
                byte[] array = ByteBuffer.allocate(4096).array();
                DatagramPacket datagramPacket = new DatagramPacket(array, array.length);
                datagramSocket.receive(datagramPacket);
                datagramSocket.close();
                datagramSocket.close();
                return datagramPacket;
            } finally {
            }
        } catch (Exception unused) {
            Log.e(TAG, "Failed to sendAndReceive.");
            return null;
        }
    }
}
