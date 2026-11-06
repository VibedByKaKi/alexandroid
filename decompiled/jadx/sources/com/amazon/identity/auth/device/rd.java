package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.webkit.WebView;
import com.amazon.identity.auth.device.api.MAPAndroidWebViewHelper;
import com.amazon.identity.mobi.lwasso.api.LWASSODependency;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class rd extends LWASSODependency {
    public final void incrementCounterAndRecord(String str) {
        jg.a(str);
    }

    public final boolean injectJSInterface(WebView webView, Bundle bundle) {
        return MAPAndroidWebViewHelper.enableMAPJSBridgeForWebView(webView, bundle);
    }

    public final boolean shouldFunctionReturnBoolean(String str) {
        return false;
    }

    public final void setWebViewBehavior(String str, String str2) {
    }
}
