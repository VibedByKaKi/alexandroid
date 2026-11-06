package com.amazon.alexa.ra.core.ui.custom;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonRow;", "", "<init>", "(Ljava/lang/String;I)V", "BUBBLE", "FIRST_LINE", "SECOND_LINE", "SMART_FRAGMENT", "PILLS", "ACTIONS", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class TurnSkeletonRow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TurnSkeletonRow[] $VALUES;
    public static final TurnSkeletonRow BUBBLE = new TurnSkeletonRow("BUBBLE", 0);
    public static final TurnSkeletonRow FIRST_LINE = new TurnSkeletonRow("FIRST_LINE", 1);
    public static final TurnSkeletonRow SECOND_LINE = new TurnSkeletonRow("SECOND_LINE", 2);
    public static final TurnSkeletonRow SMART_FRAGMENT = new TurnSkeletonRow("SMART_FRAGMENT", 3);
    public static final TurnSkeletonRow PILLS = new TurnSkeletonRow("PILLS", 4);
    public static final TurnSkeletonRow ACTIONS = new TurnSkeletonRow("ACTIONS", 5);

    private static final /* synthetic */ TurnSkeletonRow[] $values() {
        return new TurnSkeletonRow[]{BUBBLE, FIRST_LINE, SECOND_LINE, SMART_FRAGMENT, PILLS, ACTIONS};
    }

    static {
        TurnSkeletonRow[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TurnSkeletonRow(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TurnSkeletonRow> getEntries() {
        return $ENTRIES;
    }

    public static TurnSkeletonRow valueOf(String str) {
        return (TurnSkeletonRow) Enum.valueOf(TurnSkeletonRow.class, str);
    }

    public static TurnSkeletonRow[] values() {
        return (TurnSkeletonRow[]) $VALUES.clone();
    }
}
