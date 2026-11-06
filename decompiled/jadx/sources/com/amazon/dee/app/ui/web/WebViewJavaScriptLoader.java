package com.amazon.dee.app.ui.web;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WebViewJavaScriptLoader {
    static final String TAG = "com.amazon.dee.app.ui.web.WebViewJavaScriptLoader";
    final WebView webView;

    public WebViewJavaScriptLoader(WebView webView) {
        this.webView = webView;
    }

    @SuppressLint({"NewApi"})
    public final void loadJavascript(String str) {
        this.webView.evaluateJavascript(str, null);
    }
}
