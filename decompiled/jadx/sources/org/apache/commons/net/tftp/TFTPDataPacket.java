package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TFTPDataPacket extends TFTPPacket {
    public static final int MAX_DATA_LENGTH = 512;
    public static final int MIN_DATA_LENGTH = 0;
    int blockNumber;
    private byte[] data;
    private int length;
    private int offset;

    public TFTPDataPacket(DatagramPacket datagramPacket) throws TFTPPacketException {
        super(3, datagramPacket.getAddress(), datagramPacket.getPort());
        this.data = datagramPacket.getData();
        this.offset = 4;
        int type = getType();
        byte[] bArr = this.data;
        if (type != bArr[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this.blockNumber = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int length = datagramPacket.getLength() - 4;
        this.length = length;
        if (length > 512) {
            this.length = 512;
        }
    }

    public int getBlockNumber() {
        return this.blockNumber;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDataLength() {
        return this.length;
    }

    public int getDataOffset() {
        return this.offset;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        bArr[0] = 0;
        bArr[1] = (byte) this.type;
        int i = this.blockNumber;
        bArr[2] = (byte) ((65535 & i) >> 8);
        bArr[3] = (byte) (i & 255);
        byte[] bArr2 = this.data;
        if (bArr != bArr2) {
            System.arraycopy(bArr2, this.offset, bArr, 4, this.length);
        }
        datagramPacket.setAddress(this.address);
        datagramPacket.setPort(this.port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(this.length + 4);
        return datagramPacket;
    }

    public void setBlockNumber(int i) {
        this.blockNumber = i;
    }

    public void setData(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.offset = i;
        this.length = i2;
        if (i2 > 512) {
            this.length = 512;
        } else {
            this.length = i2;
        }
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " DATA " + this.blockNumber + " " + this.length;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram() {
        int i = this.length;
        byte[] bArr = new byte[i + 4];
        bArr[0] = 0;
        bArr[1] = (byte) this.type;
        int i2 = this.blockNumber;
        bArr[2] = (byte) ((65535 & i2) >> 8);
        bArr[3] = (byte) (i2 & 255);
        System.arraycopy(this.data, this.offset, bArr, 4, i);
        return new DatagramPacket(bArr, this.length + 4, this.address, this.port);
    }

    public TFTPDataPacket(InetAddress inetAddress, int i, int i2, byte[] bArr) {
        this(inetAddress, i, i2, bArr, 0, bArr.length);
    }

    public TFTPDataPacket(InetAddress inetAddress, int i, int i2, byte[] bArr, int i3, int i4) {
        super(3, inetAddress, i);
        this.blockNumber = i2;
        this.data = bArr;
        this.offset = i3;
        if (i4 > 512) {
            this.length = 512;
        } else {
            this.length = i4;
        }
    }
}
