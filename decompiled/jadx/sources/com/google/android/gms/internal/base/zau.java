package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class zau extends Handler {
    private final Looper zaa;

    public zau() {
        this.zaa = Looper.getMainLooper();
    }

    public zau(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public zau(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}
