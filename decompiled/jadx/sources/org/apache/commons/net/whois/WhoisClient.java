package org.apache.commons.net.whois;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.net.finger.FingerClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class WhoisClient extends FingerClient {
    public static final String DEFAULT_HOST = "whois.internic.net";
    public static final int DEFAULT_PORT = 43;

    public WhoisClient() {
        setDefaultPort(43);
    }

    public InputStream getInputStream(String str) throws IOException {
        return getInputStream(false, str);
    }

    public String query(String str) throws IOException {
        return query(false, str);
    }
}
