package com.amazon.identity.auth.device.framework;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import com.amazon.identity.auth.device.fh;
import com.amazon.identity.auth.device.fp;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class g implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f651a;

    public g(h hVar) {
        this.f651a = hVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        h hVar = this.f651a;
        MAPSmsReceiver mAPSmsReceiver = hVar.c;
        String str = hVar.f652a;
        int i = hVar.b;
        mAPSmsReceiver.getClass();
        if (TextUtils.equals((String) obj, "\"function\"")) {
            j jVar = new j(mAPSmsReceiver, str);
            fh fhVar = fp.f623a;
            new Handler(Looper.getMainLooper()).post(jVar);
        } else if (i < 3) {
            fp.a(new i(mAPSmsReceiver, str, i));
        } else {
            Log.e(yf.a("MAPSmsReceiver"), "Failed submitting OTP code after retrying.");
        }
    }
}
