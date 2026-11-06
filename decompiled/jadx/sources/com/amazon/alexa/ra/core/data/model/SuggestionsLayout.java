package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/SuggestionsLayout;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "AUTO", "WRAP", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SuggestionsLayout {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SuggestionsLayout[] $VALUES;
    public static final SuggestionsLayout HORIZONTAL = new SuggestionsLayout("HORIZONTAL", 0);
    public static final SuggestionsLayout VERTICAL = new SuggestionsLayout("VERTICAL", 1);
    public static final SuggestionsLayout AUTO = new SuggestionsLayout("AUTO", 2);
    public static final SuggestionsLayout WRAP = new SuggestionsLayout("WRAP", 3);

    private static final /* synthetic */ SuggestionsLayout[] $values() {
        return new SuggestionsLayout[]{HORIZONTAL, VERTICAL, AUTO, WRAP};
    }

    static {
        SuggestionsLayout[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SuggestionsLayout(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SuggestionsLayout> getEntries() {
        return $ENTRIES;
    }

    public static SuggestionsLayout valueOf(String str) {
        return (SuggestionsLayout) Enum.valueOf(SuggestionsLayout.class, str);
    }

    public static SuggestionsLayout[] values() {
        return (SuggestionsLayout[]) $VALUES.clone();
    }
}
