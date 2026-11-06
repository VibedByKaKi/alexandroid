package com.amazon.deecomms.nativemodules.cvf;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class CvfJsBridge {
    final Supplier<Object> jsInterface;
    final String namespace;

    @Nullable
    Promise pendingInstallPromise;

    @Nullable
    ReactFindViewUtil.OnViewFoundListener viewFoundListener;

    public CvfJsBridge(String str, Supplier<Object> supplier) {
        this.namespace = str;
        this.jsInterface = supplier;
    }

    public void cancelPendingInstall() {
        ReactFindViewUtil.OnViewFoundListener onViewFoundListener = this.viewFoundListener;
        if (onViewFoundListener != null) {
            ReactFindViewUtil.removeViewListener(onViewFoundListener);
            this.viewFoundListener = null;
        }
        Promise promise = this.pendingInstallPromise;
        if (promise != null) {
            promise.resolve(Boolean.FALSE);
            this.pendingInstallPromise = null;
        }
    }
}
