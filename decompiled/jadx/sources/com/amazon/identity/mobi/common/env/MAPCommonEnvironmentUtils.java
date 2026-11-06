package com.amazon.identity.mobi.common.env;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface MAPCommonEnvironmentUtils {
    String getAmazonHostFromPartialDomain(String str);

    void handleWebViewReceivedSslError(WebViewClient webViewClient, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);
}
