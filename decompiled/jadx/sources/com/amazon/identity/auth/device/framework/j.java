package com.amazon.identity.auth.device.framework;

import android.webkit.WebView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f654a;
    public final /* synthetic */ MAPSmsReceiver b;

    public j(MAPSmsReceiver mAPSmsReceiver, String str) {
        this.b = mAPSmsReceiver;
        this.f654a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        webView = this.b.b;
        webView.loadUrl("javascript:submitVerificationCode('" + this.f654a + "')");
    }
}
