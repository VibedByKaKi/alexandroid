package org.apache.commons.net.bsd;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RLoginClient extends RCommandClient {
    public static final int DEFAULT_PORT = 513;

    public RLoginClient() {
        setDefaultPort(513);
    }

    public void rlogin(String str, String str2, String str3, int i) throws IOException {
        rexec(str, str2, TableInfo$$ExternalSyntheticOutline0.m(i, str3, "/"), false);
    }

    public void rlogin(String str, String str2, String str3) throws IOException {
        rexec(str, str2, str3, false);
    }
}
