package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.amazon.identity.auth.device.api.MAPAccountManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class jh extends nd {
    public final Bundle c;
    public final Runnable d;

    public jh(WebView webView, Bundle bundle, Runnable runnable) {
        super(webView, "NavigationJavaScriptBridge");
        this.d = runnable;
        this.c = bundle;
    }

    @JavascriptInterface
    public void cancelWithNavigationUrl(String str) {
        invokeWithEncoding("IDENTITY_MOBILE_NAVIGATION", MAPAccountManager.CANCEL_WITH_NAVIGATION_URL_BUNDLE_KEY, str, new hh(this));
    }
}
