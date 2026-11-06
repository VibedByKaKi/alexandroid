package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum AudioPlayerEventType implements APLEnum {
    kAudioPlayerEventEnd(0),
    kAudioPlayerEventPause(1),
    kAudioPlayerEventPlay(2),
    kAudioPlayerEventTimeUpdate(3),
    kAudioPlayerEventReady(4),
    kAudioPlayerEventFail(5);

    private static SparseArray<AudioPlayerEventType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (AudioPlayerEventType audioPlayerEventType : values()) {
            values.put(audioPlayerEventType.getIndex(), audioPlayerEventType);
        }
    }

    AudioPlayerEventType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static AudioPlayerEventType valueOf(int i) {
        return values.get(i);
    }
}
