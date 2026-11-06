package com.amazon.alexa.assistant.session.audio.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "FOREGROUNDED", "BACKGROUNDED", "INACTIVE", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AudioChannelState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioChannelState[] $VALUES;
    public static final AudioChannelState ACTIVE = new AudioChannelState("ACTIVE", 0);
    public static final AudioChannelState FOREGROUNDED = new AudioChannelState("FOREGROUNDED", 1);
    public static final AudioChannelState BACKGROUNDED = new AudioChannelState("BACKGROUNDED", 2);
    public static final AudioChannelState INACTIVE = new AudioChannelState("INACTIVE", 3);

    private static final /* synthetic */ AudioChannelState[] $values() {
        return new AudioChannelState[]{ACTIVE, FOREGROUNDED, BACKGROUNDED, INACTIVE};
    }

    static {
        AudioChannelState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AudioChannelState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AudioChannelState> getEntries() {
        return $ENTRIES;
    }

    public static AudioChannelState valueOf(String str) {
        return (AudioChannelState) Enum.valueOf(AudioChannelState.class, str);
    }

    public static AudioChannelState[] values() {
        return (AudioChannelState[]) $VALUES.clone();
    }
}
