package com.amazon.dee.app.elements.bridges;

import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "Ping")
/* loaded from: classes3.dex */
public class PingData {
    private String id;
    private boolean timedOut;
    private long timestamp;

    public PingData(String str, long j, boolean z) {
        this.id = str;
        this.timestamp = j;
        this.timedOut = z;
    }

    public String getId() {
        return this.id;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isTimedOut() {
        return this.timedOut;
    }

    public void setTimedOut(boolean z) {
        this.timedOut = z;
    }
}
