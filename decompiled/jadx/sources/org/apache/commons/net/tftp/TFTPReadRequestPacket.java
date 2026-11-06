package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TFTPReadRequestPacket extends TFTPRequestPacket {
    public TFTPReadRequestPacket(InetAddress inetAddress, int i, String str, int i2) {
        super(inetAddress, i, 1, str, i2);
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " RRQ " + getFilename() + " " + TFTP.getModeName(getMode());
    }

    public TFTPReadRequestPacket(DatagramPacket datagramPacket) throws TFTPPacketException {
        super(1, datagramPacket);
    }
}
