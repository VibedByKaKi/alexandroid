package com.amazon.apl.devtools.controllers;

import com.amazon.apl.devtools.controllers.impl.NoOpDTServer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLDevTools {
    private final IDTServer mDTServer = new NoOpDTServer();
    private int mPortNumber;

    public APLDevTools setPort(int i) {
        this.mPortNumber = i;
        return this;
    }

    public void start() {
        this.mDTServer.start(this.mPortNumber);
    }

    public void stop() {
        this.mDTServer.stop();
    }
}
