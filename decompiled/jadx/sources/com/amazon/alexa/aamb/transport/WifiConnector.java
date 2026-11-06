package com.amazon.alexa.aamb.transport;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.amazon.alexa.aamb.transport.Transport;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import javax.net.SocketFactory;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class WifiConnector extends TransportBase {
    private static final String TAG = "WiFi_AAMB";

    public WifiConnector() {
        setTransportType(1);
    }

    private InetAddress getHotspotAddress(Context context) throws UnknownHostException {
        int i = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getDhcpInfo().serverAddress;
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            i = Integer.reverseBytes(i);
        }
        return InetAddress.getByAddress(BigInteger.valueOf(i).toByteArray());
    }

    private SocketFactory getWifiSocketFactory(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            if (connectivityManager.getNetworkInfo(network).getType() == 1) {
                return network.getSocketFactory();
            }
        }
        return null;
    }

    @Override // com.amazon.alexa.aamb.transport.Transport
    public Transport.Connection connect(Context context) throws IOException {
        InetAddress hotspotAddress = getHotspotAddress(context);
        Log.i(TAG, "Hotspot inet address|" + hotspotAddress.getHostAddress());
        InetSocketAddress inetSocketAddress = new InetSocketAddress(hotspotAddress.getHostAddress(), 9878);
        Log.i(TAG, "serverIpAddress|" + inetSocketAddress.getAddress());
        SocketFactory wifiSocketFactory = getWifiSocketFactory(context);
        if (wifiSocketFactory == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Failed to create a socket bound to Wi-Fi");
            return null;
        }
        Socket createSocket = wifiSocketFactory.createSocket();
        createSocket.connect(inetSocketAddress);
        return new SocketConnection(createSocket);
    }

    @Override // com.amazon.alexa.aamb.transport.Transport
    public String getName() {
        return "wifi-hotspot-connector";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
