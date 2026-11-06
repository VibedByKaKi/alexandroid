package com.amazon.alexa.assistant.session.audio.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "", "priority", "", "<init>", "(Ljava/lang/String;II)V", "getPriority", "()I", "CONTENT", "ALERT", "DIALOG", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AudioChannelType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioChannelType[] $VALUES;
    private final int priority;
    public static final AudioChannelType CONTENT = new AudioChannelType("CONTENT", 0, 0);
    public static final AudioChannelType ALERT = new AudioChannelType("ALERT", 1, 1);
    public static final AudioChannelType DIALOG = new AudioChannelType("DIALOG", 2, 2);

    private static final /* synthetic */ AudioChannelType[] $values() {
        return new AudioChannelType[]{CONTENT, ALERT, DIALOG};
    }

    static {
        AudioChannelType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AudioChannelType(String str, int i, int i2) {
        this.priority = i2;
    }

    @NotNull
    public static EnumEntries<AudioChannelType> getEntries() {
        return $ENTRIES;
    }

    public static AudioChannelType valueOf(String str) {
        return (AudioChannelType) Enum.valueOf(AudioChannelType.class, str);
    }

    public static AudioChannelType[] values() {
        return (AudioChannelType[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
