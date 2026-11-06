package org.apache.http.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class HttpInetSocketAddress extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    private final HttpHost httphost;

    public HttpInetSocketAddress(HttpHost httpHost, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        Args.notNull(httpHost, "HTTP host");
        this.httphost = httpHost;
    }

    public HttpHost getHttpHost() {
        return this.httphost;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.httphost.getHostName() + ":" + getPort();
    }
}
