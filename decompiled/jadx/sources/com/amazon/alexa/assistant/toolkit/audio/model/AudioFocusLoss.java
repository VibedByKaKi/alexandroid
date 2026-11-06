package com.amazon.alexa.assistant.toolkit.audio.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/audio/model/AudioFocusLoss;", "", "<init>", "(Ljava/lang/String;I)V", "PERMANENT", "TRANSIENT", "TRANSIENT_CAN_DUCK", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AudioFocusLoss {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioFocusLoss[] $VALUES;
    public static final AudioFocusLoss PERMANENT = new AudioFocusLoss("PERMANENT", 0);
    public static final AudioFocusLoss TRANSIENT = new AudioFocusLoss("TRANSIENT", 1);
    public static final AudioFocusLoss TRANSIENT_CAN_DUCK = new AudioFocusLoss("TRANSIENT_CAN_DUCK", 2);

    private static final /* synthetic */ AudioFocusLoss[] $values() {
        return new AudioFocusLoss[]{PERMANENT, TRANSIENT, TRANSIENT_CAN_DUCK};
    }

    static {
        AudioFocusLoss[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AudioFocusLoss(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AudioFocusLoss> getEntries() {
        return $ENTRIES;
    }

    public static AudioFocusLoss valueOf(String str) {
        return (AudioFocusLoss) Enum.valueOf(AudioFocusLoss.class, str);
    }

    public static AudioFocusLoss[] values() {
        return (AudioFocusLoss[]) $VALUES.clone();
    }
}
