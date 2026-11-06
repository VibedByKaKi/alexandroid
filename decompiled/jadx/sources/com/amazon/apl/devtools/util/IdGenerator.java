package com.amazon.apl.devtools.util;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class IdGenerator {
    private int mNextId;

    public IdGenerator() {
        this.mNextId = 100;
    }

    public String generateId(String str) {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        m.append(generateId());
        return m.toString();
    }

    public IdGenerator(int i) {
        this.mNextId = i;
    }

    public int generateId() {
        int i = this.mNextId;
        this.mNextId = i + 1;
        return i;
    }
}
