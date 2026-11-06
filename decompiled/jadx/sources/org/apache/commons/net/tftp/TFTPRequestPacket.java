package org.apache.commons.net.tftp;

import defpackage.a$$ExternalSyntheticOutline0;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TFTPRequestPacket extends TFTPPacket {
    private final String fileName;
    private final int mode;
    static final String[] modeStrings = {"netascii", "octet"};
    private static final byte[][] modeBytes = {new byte[]{110, 101, 116, 97, 115, 99, 105, 105, 0}, new byte[]{111, 99, 116, 101, 116, 0}};

    public TFTPRequestPacket(int i, DatagramPacket datagramPacket) throws TFTPPacketException {
        super(i, datagramPacket.getAddress(), datagramPacket.getPort());
        byte[] data = datagramPacket.getData();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        StringBuilder sb = new StringBuilder();
        int length = datagramPacket.getLength();
        int i2 = 2;
        while (i2 < length) {
            byte b = data[i2];
            if (b == 0) {
                break;
            }
            sb.append((char) b);
            i2++;
        }
        this.fileName = sb.toString();
        if (i2 >= length) {
            throw new TFTPPacketException("Bad file name and mode format.");
        }
        int i3 = 0;
        sb.setLength(0);
        for (int i4 = i2 + 1; i4 < length; i4++) {
            byte b2 = data[i4];
            if (b2 == 0) {
                break;
            }
            sb.append((char) b2);
        }
        String lowerCase = sb.toString().toLowerCase(Locale.ENGLISH);
        int length2 = modeStrings.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            if (lowerCase.equals(modeStrings[i5])) {
                i3 = i5;
                break;
            }
            i5++;
        }
        this.mode = i3;
        if (i5 >= length2) {
            throw new TFTPPacketException(a$$ExternalSyntheticOutline0.m("Unrecognized TFTP transfer mode: ", lowerCase));
        }
    }

    public final String getFilename() {
        return this.fileName;
    }

    public final int getMode() {
        return this.mode;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public final DatagramPacket newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        int length = this.fileName.length();
        byte[][] bArr2 = modeBytes;
        int length2 = bArr2[this.mode].length;
        bArr[0] = 0;
        bArr[1] = (byte) this.type;
        System.arraycopy(this.fileName.getBytes(), 0, bArr, 2, length);
        bArr[length + 2] = 0;
        System.arraycopy(bArr2[this.mode], 0, bArr, length + 3, length2);
        datagramPacket.setAddress(this.address);
        datagramPacket.setPort(this.port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(length + length2 + 3);
        return datagramPacket;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public final DatagramPacket newDatagram() {
        int length = this.fileName.length();
        byte[][] bArr = modeBytes;
        int length2 = bArr[this.mode].length;
        int i = length + length2 + 4;
        byte[] bArr2 = new byte[i];
        bArr2[0] = 0;
        bArr2[1] = (byte) this.type;
        System.arraycopy(this.fileName.getBytes(), 0, bArr2, 2, length);
        bArr2[length + 2] = 0;
        System.arraycopy(bArr[this.mode], 0, bArr2, length + 3, length2);
        return new DatagramPacket(bArr2, i, this.address, this.port);
    }

    public TFTPRequestPacket(InetAddress inetAddress, int i, int i2, String str, int i3) {
        super(i2, inetAddress, i);
        this.fileName = str;
        this.mode = i3;
    }
}
