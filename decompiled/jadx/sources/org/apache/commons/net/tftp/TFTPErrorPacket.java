package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TFTPErrorPacket extends TFTPPacket {
    public static final int ACCESS_VIOLATION = 2;
    public static final int FILE_EXISTS = 6;
    public static final int FILE_NOT_FOUND = 1;
    public static final int ILLEGAL_OPERATION = 4;
    public static final int NO_SUCH_USER = 7;
    public static final int OUT_OF_SPACE = 3;
    public static final int UNDEFINED = 0;
    public static final int UNKNOWN_TID = 5;
    private final int error;
    private final String message;

    public TFTPErrorPacket(DatagramPacket datagramPacket) throws TFTPPacketException {
        super(5, datagramPacket.getAddress(), datagramPacket.getPort());
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this.error = ((data[2] & 255) << 8) | (data[3] & 255);
        if (length < 5) {
            throw new TFTPPacketException("Bad error packet. No message.");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 4; i < length; i++) {
            byte b = data[i];
            if (b == 0) {
                break;
            }
            sb.append((char) b);
        }
        this.message = sb.toString();
    }

    public int getError() {
        return this.error;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        int length = this.message.length();
        bArr[0] = 0;
        bArr[1] = (byte) this.type;
        int i = this.error;
        bArr[2] = (byte) ((65535 & i) >> 8);
        bArr[3] = (byte) (i & 255);
        System.arraycopy(this.message.getBytes(), 0, bArr, 4, length);
        int i2 = length + 4;
        bArr[i2] = 0;
        datagramPacket.setAddress(this.address);
        datagramPacket.setPort(this.port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(i2);
        return datagramPacket;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " ERR " + this.error + " " + this.message;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram() {
        int length = this.message.length();
        int i = length + 5;
        byte[] bArr = new byte[i];
        bArr[0] = 0;
        bArr[1] = (byte) this.type;
        int i2 = this.error;
        bArr[2] = (byte) ((65535 & i2) >> 8);
        bArr[3] = (byte) (i2 & 255);
        System.arraycopy(this.message.getBytes(), 0, bArr, 4, length);
        bArr[length + 4] = 0;
        return new DatagramPacket(bArr, i, this.address, this.port);
    }

    public TFTPErrorPacket(InetAddress inetAddress, int i, int i2, String str) {
        super(5, inetAddress, i);
        this.error = i2;
        this.message = str;
    }
}
