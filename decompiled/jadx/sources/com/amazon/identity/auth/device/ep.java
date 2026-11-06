package com.amazon.identity.auth.device;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ep extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        fp.c = new Handler();
        Looper.loop();
    }
}
