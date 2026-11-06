package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface DatagramSocketFactory {
    DatagramSocket createDatagramSocket() throws SocketException;

    DatagramSocket createDatagramSocket(int i) throws SocketException;

    DatagramSocket createDatagramSocket(int i, InetAddress inetAddress) throws SocketException;
}
