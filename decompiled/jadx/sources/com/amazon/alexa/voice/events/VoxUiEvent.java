package com.amazon.alexa.voice.events;

import android.os.SystemClock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class VoxUiEvent {
    public static final long UNDEFINED_TIMESTAMP = 0;
    private final String name;
    private final long timestamp;

    private VoxUiEvent(String str, long j) {
        this.name = str;
        this.timestamp = j;
    }

    public static VoxUiEvent create(String str) {
        return new VoxUiEvent(str, 0L);
    }

    public static VoxUiEvent occurNow(String str) {
        return new VoxUiEvent(str, SystemClock.elapsedRealtime());
    }

    public String getName() {
        return this.name;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public static VoxUiEvent create(String str, long j) {
        return new VoxUiEvent(str, j);
    }
}
