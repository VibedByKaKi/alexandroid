package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TFTPAckPacket extends TFTPPacket {
    int blockNumber;

    public TFTPAckPacket(DatagramPacket datagramPacket) throws TFTPPacketException {
        super(4, datagramPacket.getAddress(), datagramPacket.getPort());
        byte[] data = datagramPacket.getData();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this.blockNumber = (data[3] & 255) | ((data[2] & 255) << 8);
    }

    public int getBlockNumber() {
        return this.blockNumber;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        bArr[0] = 0;
        bArr[1] = (byte) this.type;
        int i = this.blockNumber;
        bArr[2] = (byte) ((65535 & i) >> 8);
        bArr[3] = (byte) (i & 255);
        datagramPacket.setAddress(this.address);
        datagramPacket.setPort(this.port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(4);
        return datagramPacket;
    }

    public void setBlockNumber(int i) {
        this.blockNumber = i;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " ACK " + this.blockNumber;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram() {
        byte b = (byte) this.type;
        int i = this.blockNumber;
        return new DatagramPacket(new byte[]{0, b, (byte) ((65535 & i) >> 8), (byte) (i & 255)}, 4, this.address, this.port);
    }

    public TFTPAckPacket(InetAddress inetAddress, int i, int i2) {
        super(4, inetAddress, i);
        this.blockNumber = i2;
    }
}
