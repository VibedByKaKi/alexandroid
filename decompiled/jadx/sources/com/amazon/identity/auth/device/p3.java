package com.amazon.identity.auth.device;

import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class p3 {
    public static void a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            AtomicFile$$ExternalSyntheticBUOutline0.m(a0.a("SSLSocket is required, ", socket.getClass().getCanonicalName(), " is not supported"));
            return;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        String[] supportedProtocols = sSLSocket.getSupportedProtocols();
        String[] strArr = new String[supportedProtocols.length];
        int i = 0;
        for (String str : supportedProtocols) {
            if ("TLSv1.2".equals(str) || "TLSv1.3".equals(str)) {
                strArr[i] = str;
                i++;
            }
        }
        if (i == 0) {
            AtomicFile$$ExternalSyntheticBUOutline0.m("Device does not support TLS");
            return;
        }
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        sSLSocket.setEnabledProtocols(strArr2);
    }
}
