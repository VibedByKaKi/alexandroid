package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes14.dex */
public abstract class JavaScriptReplyProxy {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public JavaScriptReplyProxy() {
    }

    public abstract void postMessage(String str);

    public abstract void postMessage(byte[] bArr);
}
