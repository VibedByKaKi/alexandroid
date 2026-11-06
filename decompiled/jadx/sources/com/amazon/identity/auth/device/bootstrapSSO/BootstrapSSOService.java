package com.amazon.identity.auth.device.bootstrapSSO;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BootstrapSSOService extends Service {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final f f540a = new f(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("bootstrapSuccess", false);
        bundle.putInt("com.amazon.dcp.sso.ErrorCode", i);
        bundle.putString("com.amazon.dcp.sso.ErrorMessage", str);
        return bundle;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        yf.a("BootstrapSSOService");
        "user".equalsIgnoreCase(Build.TYPE);
        return this.f540a;
    }
}
