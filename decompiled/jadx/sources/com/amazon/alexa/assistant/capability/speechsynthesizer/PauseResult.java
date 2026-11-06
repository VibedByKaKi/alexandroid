package com.amazon.alexa.assistant.capability.speechsynthesizer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechsynthesizer/PauseResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "NOT_PLAYING", "ALREADY_PAUSED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PauseResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PauseResult[] $VALUES;
    public static final PauseResult SUCCESS = new PauseResult("SUCCESS", 0);
    public static final PauseResult NOT_PLAYING = new PauseResult("NOT_PLAYING", 1);
    public static final PauseResult ALREADY_PAUSED = new PauseResult("ALREADY_PAUSED", 2);

    private static final /* synthetic */ PauseResult[] $values() {
        return new PauseResult[]{SUCCESS, NOT_PLAYING, ALREADY_PAUSED};
    }

    static {
        PauseResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PauseResult(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PauseResult> getEntries() {
        return $ENTRIES;
    }

    public static PauseResult valueOf(String str) {
        return (PauseResult) Enum.valueOf(PauseResult.class, str);
    }

    public static PauseResult[] values() {
        return (PauseResult[]) $VALUES.clone();
    }
}
