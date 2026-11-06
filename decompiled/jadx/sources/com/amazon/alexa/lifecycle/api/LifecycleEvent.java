package com.amazon.alexa.lifecycle.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public enum LifecycleEvent {
    APPLICATION_DID_FOREGROUND("application::didForeground"),
    APPLICATION_DID_BACKGROUND("application::didBackground"),
    APPLICATION_WILL_SHUTDOWN("application::willShutdown"),
    APPLICATION_READY("application::ready"),
    APPLICATION_LOADED("application::loaded");

    public static final String IS_FOREGROUND = "isForeground";
    public static final String IS_LOADED = "isLoaded";
    public static final String IS_READY = "isReady";
    public final String name;

    LifecycleEvent(String str) {
        this.name = str;
    }
}
