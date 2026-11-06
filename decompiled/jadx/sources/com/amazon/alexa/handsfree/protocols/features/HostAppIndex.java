package com.amazon.alexa.handsfree.protocols.features;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum HostAppIndex {
    ALEXA_APP_INDEX(0),
    MSHOP_INDEX(1);

    private final int mHostAppIndex;

    HostAppIndex(@NonNull int i) {
        this.mHostAppIndex = i;
    }

    public int getHostAppIndex() {
        return this.mHostAppIndex;
    }
}
