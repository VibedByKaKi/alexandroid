package com.amazon.identity.auth.device.framework;

import android.webkit.WebView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f652a;
    public final /* synthetic */ int b;
    public final /* synthetic */ MAPSmsReceiver c;

    public h(MAPSmsReceiver mAPSmsReceiver, String str, int i) {
        this.c = mAPSmsReceiver;
        this.f652a = str;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        webView = this.c.b;
        webView.evaluateJavascript("typeof window.submitVerificationCode", new g(this));
    }
}
