package com.amazon.alexa.assistant.capability.speaker.volume;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speaker/volume/VolumeOperation;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INITIALIZE", "GET_VOLUME", "IS_MUTED", "SET_VOLUME", "ADJUST_VOLUME", "SET_MUTE", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VolumeOperation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VolumeOperation[] $VALUES;

    @NotNull
    private final String value;
    public static final VolumeOperation INITIALIZE = new VolumeOperation("INITIALIZE", 0, "initialize");
    public static final VolumeOperation GET_VOLUME = new VolumeOperation("GET_VOLUME", 1, "getVolume");
    public static final VolumeOperation IS_MUTED = new VolumeOperation("IS_MUTED", 2, "isMuted");
    public static final VolumeOperation SET_VOLUME = new VolumeOperation("SET_VOLUME", 3, "setVolume");
    public static final VolumeOperation ADJUST_VOLUME = new VolumeOperation("ADJUST_VOLUME", 4, "adjustVolume");
    public static final VolumeOperation SET_MUTE = new VolumeOperation("SET_MUTE", 5, "setMute");

    private static final /* synthetic */ VolumeOperation[] $values() {
        return new VolumeOperation[]{INITIALIZE, GET_VOLUME, IS_MUTED, SET_VOLUME, ADJUST_VOLUME, SET_MUTE};
    }

    static {
        VolumeOperation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VolumeOperation(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<VolumeOperation> getEntries() {
        return $ENTRIES;
    }

    public static VolumeOperation valueOf(String str) {
        return (VolumeOperation) Enum.valueOf(VolumeOperation.class, str);
    }

    public static VolumeOperation[] values() {
        return (VolumeOperation[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
