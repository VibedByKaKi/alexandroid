package org.apache.commons.net.time;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.net.SocketClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TimeTCPClient extends SocketClient {
    public static final int DEFAULT_PORT = 37;
    public static final long SECONDS_1900_TO_1970 = 2208988800L;

    public TimeTCPClient() {
        setDefaultPort(37);
    }

    public Date getDate() throws IOException {
        return new Date((getTime() - 2208988800L) * 1000);
    }

    public long getTime() throws IOException {
        return new DataInputStream(this._input_).readInt() & 4294967295L;
    }
}
