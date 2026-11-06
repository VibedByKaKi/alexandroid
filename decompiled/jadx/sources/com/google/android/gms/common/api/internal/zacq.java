package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zacq implements Runnable {
    final /* synthetic */ zact zaa;

    public zacq(zact zactVar) {
        this.zaa = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zacs zacsVar;
        zacsVar = this.zaa.zah;
        zacsVar.zae(new ConnectionResult(4));
    }
}
