package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TFTPPacket {
    public static final int ACKNOWLEDGEMENT = 4;
    public static final int DATA = 3;
    public static final int ERROR = 5;
    static final int MIN_PACKET_SIZE = 4;
    public static final int READ_REQUEST = 1;
    public static final int SEGMENT_SIZE = 512;
    public static final int WRITE_REQUEST = 2;
    InetAddress address;
    int port;
    int type;

    public TFTPPacket(int i, InetAddress inetAddress, int i2) {
        this.type = i;
        this.address = inetAddress;
        this.port = i2;
    }

    public static final TFTPPacket newTFTPPacket(DatagramPacket datagramPacket) throws TFTPPacketException {
        if (datagramPacket.getLength() < 4) {
            throw new TFTPPacketException("Bad packet. Datagram data length is too short.");
        }
        byte b = datagramPacket.getData()[1];
        if (b == 1) {
            return new TFTPReadRequestPacket(datagramPacket);
        }
        if (b == 2) {
            return new TFTPWriteRequestPacket(datagramPacket);
        }
        if (b == 3) {
            return new TFTPDataPacket(datagramPacket);
        }
        if (b == 4) {
            return new TFTPAckPacket(datagramPacket);
        }
        if (b == 5) {
            return new TFTPErrorPacket(datagramPacket);
        }
        throw new TFTPPacketException("Bad packet.  Invalid TFTP operator code.");
    }

    public final InetAddress getAddress() {
        return this.address;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getType() {
        return this.type;
    }

    public abstract DatagramPacket newDatagram();

    public abstract DatagramPacket newDatagram(DatagramPacket datagramPacket, byte[] bArr);

    public final void setAddress(InetAddress inetAddress) {
        this.address = inetAddress;
    }

    public final void setPort(int i) {
        this.port = i;
    }

    public String toString() {
        return this.address + " " + this.port + " " + this.type;
    }
}
