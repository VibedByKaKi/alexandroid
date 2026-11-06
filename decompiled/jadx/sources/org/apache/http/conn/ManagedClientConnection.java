package org.apache.http.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public interface ManagedClientConnection extends HttpRoutedConnection, ManagedHttpClientConnection, ConnectionReleaseTrigger {
    @Override // org.apache.http.conn.HttpRoutedConnection
    HttpRoute getRoute();

    @Override // org.apache.http.conn.HttpRoutedConnection, org.apache.http.conn.ManagedHttpClientConnection
    SSLSession getSSLSession();

    Object getState();

    boolean isMarkedReusable();

    @Override // org.apache.http.conn.HttpRoutedConnection
    boolean isSecure();

    void layerProtocol(HttpContext httpContext, HttpParams httpParams) throws IOException;

    void markReusable();

    void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) throws IOException;

    void setIdleDuration(long j, TimeUnit timeUnit);

    void setState(Object obj);

    void tunnelProxy(HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException;

    void tunnelTarget(boolean z, HttpParams httpParams) throws IOException;

    void unmarkReusable();
}
