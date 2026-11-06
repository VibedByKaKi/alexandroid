package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "INLINE_ONLY", "GLOBAL_ONLY", "ALL", "showsInlinePills", "", "getShowsInlinePills", "()Z", "showsGlobalPill", "getShowsGlobalPill", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CitationDisplayMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CitationDisplayMode[] $VALUES;
    public static final CitationDisplayMode INLINE_ONLY = new CitationDisplayMode("INLINE_ONLY", 0);
    public static final CitationDisplayMode GLOBAL_ONLY = new CitationDisplayMode("GLOBAL_ONLY", 1);
    public static final CitationDisplayMode ALL = new CitationDisplayMode("ALL", 2);

    private static final /* synthetic */ CitationDisplayMode[] $values() {
        return new CitationDisplayMode[]{INLINE_ONLY, GLOBAL_ONLY, ALL};
    }

    static {
        CitationDisplayMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CitationDisplayMode(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CitationDisplayMode> getEntries() {
        return $ENTRIES;
    }

    public static CitationDisplayMode valueOf(String str) {
        return (CitationDisplayMode) Enum.valueOf(CitationDisplayMode.class, str);
    }

    public static CitationDisplayMode[] values() {
        return (CitationDisplayMode[]) $VALUES.clone();
    }

    public final boolean getShowsGlobalPill() {
        return this == GLOBAL_ONLY || this == ALL;
    }

    public final boolean getShowsInlinePills() {
        return this == INLINE_ONLY || this == ALL;
    }
}
