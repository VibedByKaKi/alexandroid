package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(22)
    public static class Api22Impl {
        private Api22Impl() {
        }

        public static boolean isAsynchronous(Message message) {
            return message.isAsynchronous();
        }

        public static void setAsynchronous(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    private MessageCompat() {
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(Message message) {
        return Api22Impl.isAsynchronous(message);
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(Message message, boolean z) {
        Api22Impl.setAsynchronous(message, z);
    }
}
