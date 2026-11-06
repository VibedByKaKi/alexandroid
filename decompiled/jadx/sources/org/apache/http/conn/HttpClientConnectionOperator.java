package org.apache.http.conn;

import java.io.IOException;
import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.apache.http.config.SocketConfig;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface HttpClientConnectionOperator {
    void connect(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, InetSocketAddress inetSocketAddress, int i, SocketConfig socketConfig, HttpContext httpContext) throws IOException;

    void upgrade(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, HttpContext httpContext) throws IOException;
}
