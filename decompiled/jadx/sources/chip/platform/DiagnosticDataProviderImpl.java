package chip.platform;

import android.content.Context;
import android.util.Log;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DiagnosticDataProviderImpl implements DiagnosticDataProvider {
    private static final String TAG = "DiagnosticDataProviderImpl";
    private Context mContext;

    public DiagnosticDataProviderImpl(Context context) {
        this.mContext = context;
    }

    @Override // chip.platform.DiagnosticDataProvider
    public NetworkInterface[] getNetworkInterfaces() {
        try {
            ArrayList list = Collections.list(java.net.NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                java.net.NetworkInterface networkInterface = (java.net.NetworkInterface) list.get(i);
                String name = networkInterface.getName();
                if (name != null) {
                    if (!name.startsWith("eth") && !name.startsWith("wlan")) {
                    }
                    NetworkInterface networkInterface2 = new NetworkInterface();
                    networkInterface2.isOperational = networkInterface.isUp();
                    networkInterface2.hardwareAddress = networkInterface.getHardwareAddress();
                    networkInterface2.name = networkInterface.getName();
                    networkInterface2.type = name.startsWith("wlan") ? 1 : 2;
                    Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement instanceof Inet4Address) {
                            if (networkInterface2.ipv4Address == null) {
                                networkInterface2.ipv4Address = nextElement.getAddress();
                            }
                        } else if (nextElement != null && networkInterface2.ipv6Address == null) {
                            networkInterface2.ipv6Address = nextElement.getAddress();
                        }
                    }
                    arrayList.add(networkInterface2);
                }
            }
            NetworkInterface[] networkInterfaceArr = new NetworkInterface[arrayList.size()];
            arrayList.toArray(networkInterfaceArr);
            return networkInterfaceArr;
        } catch (SocketException e) {
            Log.e(TAG, "getNetworkInterfaces: " + e.getMessage());
            return new NetworkInterface[0];
        }
    }

    @Override // chip.platform.DiagnosticDataProvider
    public int getRebootCount() {
        return 100;
    }
}
