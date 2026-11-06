package com.amazon.alexa.assistant.session.speechsynthesizer.model;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechsynthesizer/model/SpeechSynthesizerState;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "FOCUSING", "PLAYING", "FINISHED", "INTERRUPTED", CareActorsStore.SubscriptionStatus.PAUSED, "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SpeechSynthesizerState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SpeechSynthesizerState[] $VALUES;
    public static final SpeechSynthesizerState IDLE = new SpeechSynthesizerState(WifiConnectionState.IDLE, 0);
    public static final SpeechSynthesizerState FOCUSING = new SpeechSynthesizerState("FOCUSING", 1);
    public static final SpeechSynthesizerState PLAYING = new SpeechSynthesizerState("PLAYING", 2);
    public static final SpeechSynthesizerState FINISHED = new SpeechSynthesizerState("FINISHED", 3);
    public static final SpeechSynthesizerState INTERRUPTED = new SpeechSynthesizerState("INTERRUPTED", 4);
    public static final SpeechSynthesizerState PAUSED = new SpeechSynthesizerState(CareActorsStore.SubscriptionStatus.PAUSED, 5);

    private static final /* synthetic */ SpeechSynthesizerState[] $values() {
        return new SpeechSynthesizerState[]{IDLE, FOCUSING, PLAYING, FINISHED, INTERRUPTED, PAUSED};
    }

    static {
        SpeechSynthesizerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SpeechSynthesizerState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SpeechSynthesizerState> getEntries() {
        return $ENTRIES;
    }

    public static SpeechSynthesizerState valueOf(String str) {
        return (SpeechSynthesizerState) Enum.valueOf(SpeechSynthesizerState.class, str);
    }

    public static SpeechSynthesizerState[] values() {
        return (SpeechSynthesizerState[]) $VALUES.clone();
    }
}
