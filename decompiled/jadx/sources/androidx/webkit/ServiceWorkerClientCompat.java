package androidx.webkit;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.WorkerThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public abstract class ServiceWorkerClientCompat {
    @WorkerThread
    public abstract WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest);
}
