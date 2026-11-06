package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class up extends xp {
    public final /* synthetic */ zp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(zp zpVar, yp ypVar, Callback callback) {
        super(zpVar, ypVar, callback);
        this.d = zpVar;
    }

    @Override // com.amazon.identity.auth.device.xp
    public final void b() {
        Log.i(yf.a("TokenJobQueue"), a0.a("Scheduled running concurrent job ", this.b.a(), "."));
        this.d.a();
    }
}
