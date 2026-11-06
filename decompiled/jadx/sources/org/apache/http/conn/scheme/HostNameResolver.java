package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public interface HostNameResolver {
    InetAddress resolve(String str) throws IOException;
}
