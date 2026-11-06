package com.amazon.alexa.redesign.repository;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/redesign/repository/CardStudioControlNativeCacheHeadMode;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "CONSUME", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CardStudioControlNativeCacheHeadMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardStudioControlNativeCacheHeadMode[] $VALUES;
    public static final CardStudioControlNativeCacheHeadMode DISABLED = new CardStudioControlNativeCacheHeadMode("DISABLED", 0);
    public static final CardStudioControlNativeCacheHeadMode CONSUME = new CardStudioControlNativeCacheHeadMode("CONSUME", 1);

    private static final /* synthetic */ CardStudioControlNativeCacheHeadMode[] $values() {
        return new CardStudioControlNativeCacheHeadMode[]{DISABLED, CONSUME};
    }

    static {
        CardStudioControlNativeCacheHeadMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CardStudioControlNativeCacheHeadMode(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CardStudioControlNativeCacheHeadMode> getEntries() {
        return $ENTRIES;
    }

    public static CardStudioControlNativeCacheHeadMode valueOf(String str) {
        return (CardStudioControlNativeCacheHeadMode) Enum.valueOf(CardStudioControlNativeCacheHeadMode.class, str);
    }

    public static CardStudioControlNativeCacheHeadMode[] values() {
        return (CardStudioControlNativeCacheHeadMode[]) $VALUES.clone();
    }
}
