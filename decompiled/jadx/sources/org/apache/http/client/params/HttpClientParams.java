package org.apache.http.client.params;

import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class HttpClientParams {
    private HttpClientParams() {
    }

    public static long getConnectionManagerTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        Long l = (Long) httpParams.getParameter("http.conn-manager.timeout");
        return l != null ? l.longValue() : HttpConnectionParams.getConnectionTimeout(httpParams);
    }

    public static String getCookiePolicy(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(ClientPNames.COOKIE_POLICY);
        return str == null ? "best-match" : str;
    }

    public static boolean isAuthenticating(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, true);
    }

    public static boolean isRedirecting(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_REDIRECTS, true);
    }

    public static void setAuthenticating(HttpParams httpParams, boolean z) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z);
    }

    public static void setConnectionManagerTimeout(HttpParams httpParams, long j) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setLongParameter("http.conn-manager.timeout", j);
    }

    public static void setCookiePolicy(HttpParams httpParams, String str) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public static void setRedirecting(HttpParams httpParams, boolean z) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z);
    }
}
