package org.apache.commons.net.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SSLSocketUtils {
    private SSLSocketUtils() {
    }

    public static boolean enableEndpointNameVerification(SSLSocket sSLSocket) {
        Object invoke;
        try {
            Class<?> cls = Class.forName("javax.net.ssl.SSLParameters");
            Method declaredMethod = cls.getDeclaredMethod("setEndpointIdentificationAlgorithm", String.class);
            Method declaredMethod2 = SSLSocket.class.getDeclaredMethod("getSSLParameters", null);
            Method declaredMethod3 = SSLSocket.class.getDeclaredMethod("setSSLParameters", cls);
            if (declaredMethod == null || declaredMethod2 == null || declaredMethod3 == null || (invoke = declaredMethod2.invoke(sSLSocket, null)) == null) {
                return false;
            }
            declaredMethod.invoke(invoke, "HTTPS");
            declaredMethod3.invoke(sSLSocket, invoke);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return false;
        }
    }
}
