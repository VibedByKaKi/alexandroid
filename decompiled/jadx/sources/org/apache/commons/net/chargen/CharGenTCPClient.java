package org.apache.commons.net.chargen;

import java.io.InputStream;
import org.apache.commons.net.SocketClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class CharGenTCPClient extends SocketClient {
    public static final int CHARGEN_PORT = 19;
    public static final int DEFAULT_PORT = 19;
    public static final int NETSTAT_PORT = 15;
    public static final int QUOTE_OF_DAY_PORT = 17;
    public static final int SYSTAT_PORT = 11;

    public CharGenTCPClient() {
        setDefaultPort(19);
    }

    public InputStream getInputStream() {
        return this._input_;
    }
}
