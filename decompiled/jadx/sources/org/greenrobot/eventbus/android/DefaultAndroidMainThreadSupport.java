package org.greenrobot.eventbus.android;

import android.os.Looper;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.HandlerPoster;
import org.greenrobot.eventbus.MainThreadSupport;
import org.greenrobot.eventbus.Poster;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DefaultAndroidMainThreadSupport implements MainThreadSupport {
    @Override // org.greenrobot.eventbus.MainThreadSupport
    public Poster createPoster(EventBus eventBus) {
        return new HandlerPoster(eventBus, Looper.getMainLooper(), 10);
    }

    @Override // org.greenrobot.eventbus.MainThreadSupport
    public boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
