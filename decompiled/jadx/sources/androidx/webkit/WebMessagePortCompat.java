package androidx.webkit;

import android.os.Handler;
import android.webkit.WebMessagePort;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AnyThread
/* loaded from: classes14.dex */
public abstract class WebMessagePortCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public WebMessagePortCompat() {
    }

    public abstract void close();

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract WebMessagePort getFrameworkPort();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract InvocationHandler getInvocationHandler();

    public abstract void postMessage(WebMessageCompat webMessageCompat);

    public abstract void setWebMessageCallback(Handler handler, WebMessageCallbackCompat webMessageCallbackCompat);

    public abstract void setWebMessageCallback(WebMessageCallbackCompat webMessageCallbackCompat);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class WebMessageCallbackCompat {
        public void onMessage(WebMessagePortCompat webMessagePortCompat, WebMessageCompat webMessageCompat) {
        }
    }
}
