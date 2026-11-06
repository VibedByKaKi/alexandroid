package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/TranscriptDirection;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TranscriptDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TranscriptDirection[] $VALUES;
    public static final TranscriptDirection LEFT_TO_RIGHT = new TranscriptDirection("LEFT_TO_RIGHT", 0);
    public static final TranscriptDirection RIGHT_TO_LEFT = new TranscriptDirection("RIGHT_TO_LEFT", 1);

    private static final /* synthetic */ TranscriptDirection[] $values() {
        return new TranscriptDirection[]{LEFT_TO_RIGHT, RIGHT_TO_LEFT};
    }

    static {
        TranscriptDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TranscriptDirection(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TranscriptDirection> getEntries() {
        return $ENTRIES;
    }

    public static TranscriptDirection valueOf(String str) {
        return (TranscriptDirection) Enum.valueOf(TranscriptDirection.class, str);
    }

    public static TranscriptDirection[] values() {
        return (TranscriptDirection[]) $VALUES.clone();
    }
}
