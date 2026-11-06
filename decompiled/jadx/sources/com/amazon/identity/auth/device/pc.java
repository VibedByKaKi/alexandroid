package com.amazon.identity.auth.device;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class pc {
    public static void a(Handler handler, Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new oc(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Log.e(yf.a("HandlerHelpers"), "Latch was interrupted.", e);
        }
    }
}
