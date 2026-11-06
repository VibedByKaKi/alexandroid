package com.amazon.identity.auth.accounts;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.amazon.identity.auth.device.api.MAPInit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPSubAuthenticatorService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private v f384a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f384a.b.asBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        MAPInit.getInstance(this).initialize();
        this.f384a = new v(this, this);
    }
}
