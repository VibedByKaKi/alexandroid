package com.amazon.alexa.accessorykit;

import com.facebook.react.bridge.LifecycleEventListener;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class CompositeDisposableClearOnHostDestroyListener implements LifecycleEventListener {
    private final CompositeDisposable compositeDisposable;

    public CompositeDisposableClearOnHostDestroyListener(CompositeDisposable compositeDisposable) {
        this.compositeDisposable = compositeDisposable;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.compositeDisposable.clear();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
