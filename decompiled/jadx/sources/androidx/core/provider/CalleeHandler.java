package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    public static Handler create() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
