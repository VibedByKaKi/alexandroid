package com.amazon.identity.auth.device.fragment;

import android.webkit.WebView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f637a;

    public l(WebView webView) {
        this.f637a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f637a.removeJavascriptInterface("MAPAndroidJSBridge");
        this.f637a.removeJavascriptInterface("FidoAuthenticatorJSBridge");
    }
}
