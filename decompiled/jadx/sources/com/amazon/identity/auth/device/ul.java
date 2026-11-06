package com.amazon.identity.auth.device;

import android.webkit.WebView;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommonV2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ul implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vl f1009a;

    public ul(vl vlVar) {
        this.f1009a = vlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        WebView webView2;
        webView = ((JavaScriptBridgeCommonV2) this.f1009a).mWebView;
        webView.removeAllViews();
        webView2 = ((JavaScriptBridgeCommonV2) this.f1009a).mWebView;
        webView2.destroy();
        ((JavaScriptBridgeCommonV2) this.f1009a).mWebView = null;
    }
}
