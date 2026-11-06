package com.swmansion.reanimated.keyboard;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum KeyboardState {
    UNKNOWN(0),
    OPENING(1),
    OPEN(2),
    CLOSING(3),
    CLOSED(4);

    private final int mValue;

    KeyboardState(int i) {
        this.mValue = i;
    }

    public int asInt() {
        return this.mValue;
    }
}
