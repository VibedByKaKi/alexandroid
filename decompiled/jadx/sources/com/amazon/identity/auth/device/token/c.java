package com.amazon.identity.auth.device.token;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class c {
    private AtomicBoolean mHasBeenCalled = new AtomicBoolean(false);

    public abstract void finish(Bundle bundle);

    public void onFinish(Bundle bundle) {
        if (this.mHasBeenCalled.compareAndSet(false, true)) {
            finish(bundle);
        }
    }
}
