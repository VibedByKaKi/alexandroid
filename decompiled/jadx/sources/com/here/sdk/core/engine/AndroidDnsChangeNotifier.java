package com.here.sdk.core.engine;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import androidx.annotation.NonNull;
import com.here.sdk.core.NetworkEndpoint;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class AndroidDnsChangeNotifier extends ConnectivityManager.NetworkCallback implements DnsChangeNotifier {
    private ConnectivityManager mConnectivityManager;
    private Map<Network, List<InetAddress>> mDnsListPerNetwork = new HashMap();
    private DnsChangedListener mListener = null;

    private AndroidDnsChangeNotifier(ConnectivityManager connectivityManager) {
        this.mConnectivityManager = connectivityManager;
    }

    private List<InetAddress> getDnsForActiveNetwork() {
        Network activeNetwork = this.mConnectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return Arrays.asList(new InetAddress[0]);
        }
        LinkProperties linkProperties = this.mConnectivityManager.getLinkProperties(activeNetwork);
        return linkProperties == null ? Arrays.asList(new InetAddress[0]) : linkProperties.getDnsServers();
    }

    private List<NetworkEndpoint> getDnsList() {
        if (!getDnsForActiveNetwork().isEmpty()) {
            return Arrays.asList(new NetworkEndpoint[0]);
        }
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<Network, List<InetAddress>>> it2 = this.mDnsListPerNetwork.entrySet().iterator();
        while (it2.hasNext()) {
            hashSet.addAll(it2.next().getValue());
        }
        LinkedList linkedList = new LinkedList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            linkedList.add(new NetworkEndpoint((InetAddress) it3.next()));
        }
        return linkedList;
    }

    public static AndroidDnsChangeNotifier make(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        AndroidDnsChangeNotifier androidDnsChangeNotifier = new AndroidDnsChangeNotifier(connectivityManager);
        connectivityManager.registerNetworkCallback(build, androidDnsChangeNotifier);
        return androidDnsChangeNotifier;
    }

    private void report() {
        DnsChangedListener dnsChangedListener = this.mListener;
        if (dnsChangedListener != null) {
            dnsChangedListener.onDnsList(getDnsList());
        }
    }

    private static NetworkEndpoint toNetworkEndpoint(InetAddress inetAddress) {
        return new NetworkEndpoint(inetAddress);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public synchronized void onAvailable(Network network) {
        this.mDnsListPerNetwork.put(network, Arrays.asList(new InetAddress[0]));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public synchronized void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.mDnsListPerNetwork.put(network, linkProperties.getDnsServers());
        report();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public synchronized void onLost(Network network) {
        this.mDnsListPerNetwork.remove(network);
        report();
    }

    @Override // com.here.sdk.core.engine.DnsChangeNotifier
    public synchronized void subscribe(DnsChangedListener dnsChangedListener) {
        this.mListener = dnsChangedListener;
        report();
    }
}
