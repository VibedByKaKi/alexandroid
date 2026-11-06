package com.amazon.coral.service;

import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TransmutingProxyOptions {
    private final boolean handleUnknownEvents;
    private final int maxMapEntries;

    public TransmutingProxyOptions(boolean z, int i) {
        if (i < 0 && i != -1) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.maxMapEntries = i;
        this.handleUnknownEvents = z;
    }

    public boolean getHandleUnknownEvents() {
        return this.handleUnknownEvents;
    }

    public int getMaxMapEntries() {
        return this.maxMapEntries;
    }

    public TransmutingProxyOptions(boolean z) {
        this(z, -1);
    }
}
