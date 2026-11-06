package com.amazon.alexa.redesign.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/redesign/utils/ShowDividerVote;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_DIVIDER", "HIDE_DIVIDER", "SHOW_DIVIDER_OVERRIDE", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ShowDividerVote {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShowDividerVote[] $VALUES;
    public static final ShowDividerVote SHOW_DIVIDER = new ShowDividerVote("SHOW_DIVIDER", 0);
    public static final ShowDividerVote HIDE_DIVIDER = new ShowDividerVote("HIDE_DIVIDER", 1);
    public static final ShowDividerVote SHOW_DIVIDER_OVERRIDE = new ShowDividerVote("SHOW_DIVIDER_OVERRIDE", 2);

    private static final /* synthetic */ ShowDividerVote[] $values() {
        return new ShowDividerVote[]{SHOW_DIVIDER, HIDE_DIVIDER, SHOW_DIVIDER_OVERRIDE};
    }

    static {
        ShowDividerVote[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ShowDividerVote(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ShowDividerVote> getEntries() {
        return $ENTRIES;
    }

    public static ShowDividerVote valueOf(String str) {
        return (ShowDividerVote) Enum.valueOf(ShowDividerVote.class, str);
    }

    public static ShowDividerVote[] values() {
        return (ShowDividerVote[]) $VALUES.clone();
    }
}
