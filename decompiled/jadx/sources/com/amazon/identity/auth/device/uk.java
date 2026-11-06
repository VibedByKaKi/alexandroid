package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class uk extends nd {
    public static Boolean e;
    public final yk c;
    public final Bundle d;

    public uk(WebView webView, yk ykVar, Bundle bundle) {
        super(webView, "IDENTITY_MOBILE_PHONE_NUMBER_PICKER");
        this.c = ykVar;
        this.d = bundle;
    }

    @JavascriptInterface
    public void getPhoneNumberFromNative(String str) {
        invokeWithEncoding("IDENTITY_MOBILE_PHONE_NUMBER_PICKER", "getPhoneNumberFromNative", str, new rk(this, str));
    }

    @JavascriptInterface
    public void requestPhoneNumber(String str) {
        invokeWithEncoding("IDENTITY_MOBILE_PHONE_NUMBER_PICKER", "requestPhoneNumber", str, new tk(this, str));
    }
}
