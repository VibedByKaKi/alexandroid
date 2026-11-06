package com.amazon.alexa.client.alexaservice.networking;

import android.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class InternetConnectivityVerifier {
    private static final String EMPTY_STRING = "";
    private static final String HOST_TO_PING = "www.amazon.com";
    private static final String TAG = "InternetConnectivityVerifier";

    public boolean hasInternetConnectivity() {
        try {
            return !"".equals(InetAddress.getByName("www.amazon.com").toString());
        } catch (SecurityException e) {
            Log.w(TAG, "Security exception resolving hostname " + e.getMessage());
            return false;
        } catch (UnknownHostException e2) {
            Log.w(TAG, "Host not recognized " + e2.getMessage());
            return false;
        }
    }
}
