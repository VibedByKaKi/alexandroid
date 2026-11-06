package org.apache.commons.net.ntp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class NTPUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 123;
    private int version = 3;

    public TimeInfo getTime(InetAddress inetAddress, int i) throws IOException {
        if (!isOpen()) {
            open();
        }
        NtpV3Impl ntpV3Impl = new NtpV3Impl();
        ntpV3Impl.setMode(3);
        ntpV3Impl.setVersion(this.version);
        DatagramPacket datagramPacket = ntpV3Impl.getDatagramPacket();
        datagramPacket.setAddress(inetAddress);
        datagramPacket.setPort(i);
        NtpV3Impl ntpV3Impl2 = new NtpV3Impl();
        DatagramPacket datagramPacket2 = ntpV3Impl2.getDatagramPacket();
        ntpV3Impl.setTransmitTime(TimeStamp.getCurrentTime());
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        return new TimeInfo((NtpV3Packet) ntpV3Impl2, System.currentTimeMillis(), false);
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public TimeInfo getTime(InetAddress inetAddress) throws IOException {
        return getTime(inetAddress, 123);
    }
}
