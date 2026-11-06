package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.ra.core.metrics.InvocationType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/SuggestionPillsType;", "", "<init>", "(Ljava/lang/String;I)V", "STATIC", "DYNAMIC", InvocationType.FOR_YOU, "SCREENSHOT", "CUSTOM", "CUSTOM_STATIC", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SuggestionPillsType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SuggestionPillsType[] $VALUES;
    public static final SuggestionPillsType STATIC = new SuggestionPillsType("STATIC", 0);
    public static final SuggestionPillsType DYNAMIC = new SuggestionPillsType("DYNAMIC", 1);
    public static final SuggestionPillsType FOR_YOU = new SuggestionPillsType(InvocationType.FOR_YOU, 2);
    public static final SuggestionPillsType SCREENSHOT = new SuggestionPillsType("SCREENSHOT", 3);
    public static final SuggestionPillsType CUSTOM = new SuggestionPillsType("CUSTOM", 4);
    public static final SuggestionPillsType CUSTOM_STATIC = new SuggestionPillsType("CUSTOM_STATIC", 5);

    private static final /* synthetic */ SuggestionPillsType[] $values() {
        return new SuggestionPillsType[]{STATIC, DYNAMIC, FOR_YOU, SCREENSHOT, CUSTOM, CUSTOM_STATIC};
    }

    static {
        SuggestionPillsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SuggestionPillsType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SuggestionPillsType> getEntries() {
        return $ENTRIES;
    }

    public static SuggestionPillsType valueOf(String str) {
        return (SuggestionPillsType) Enum.valueOf(SuggestionPillsType.class, str);
    }

    public static SuggestionPillsType[] values() {
        return (SuggestionPillsType[]) $VALUES.clone();
    }
}
