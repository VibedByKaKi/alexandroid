package com.amazon.alexa.mobilytics.lifecycle;

import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class Lifecycle {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Event {
        ON_CREATE,
        ON_DESTROY,
        ON_START,
        ON_STOP,
        ON_RESUME,
        ON_PAUSE
    }

    @Inject
    public Lifecycle() {
    }

    public Observable<Event> onEvent() {
        return LifecycleDispatcher.onEvent();
    }
}
