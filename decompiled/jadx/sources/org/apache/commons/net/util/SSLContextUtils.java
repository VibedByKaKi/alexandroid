package org.apache.commons.net.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SSLContextUtils {
    private SSLContextUtils() {
    }

    public static SSLContext createSSLContext(String str, KeyManager keyManager, TrustManager trustManager) throws IOException {
        return createSSLContext(str, keyManager == null ? null : new KeyManager[]{keyManager}, trustManager != null ? new TrustManager[]{trustManager} : null);
    }

    public static SSLContext createSSLContext(String str, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance(str);
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            return sSLContext;
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException("Could not initialize SSL context");
            iOException.initCause(e);
            throw iOException;
        }
    }
}
