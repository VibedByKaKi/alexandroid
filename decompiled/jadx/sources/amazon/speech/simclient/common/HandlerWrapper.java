package amazon.speech.simclient.common;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class HandlerWrapper {
    private final Handler mHandler;

    public HandlerWrapper(Handler handler) {
        this.mHandler = handler;
    }

    public Looper getLooper() {
        return this.mHandler.getLooper();
    }

    public boolean post(Runnable runnable) {
        return this.mHandler.post(runnable);
    }
}
