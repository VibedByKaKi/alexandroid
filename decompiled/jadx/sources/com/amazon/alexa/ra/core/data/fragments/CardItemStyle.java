package com.amazon.alexa.ra.core.data.fragments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/CardItemStyle;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ATTRIBUTION", "DEEP_THINKING", "DEEP_THINKING_FINAL", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CardItemStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardItemStyle[] $VALUES;
    public static final CardItemStyle ATTRIBUTION = new CardItemStyle("ATTRIBUTION", 0, "text-style-attribution");
    public static final CardItemStyle DEEP_THINKING = new CardItemStyle("DEEP_THINKING", 1, "text-style-deep-thinking");
    public static final CardItemStyle DEEP_THINKING_FINAL = new CardItemStyle("DEEP_THINKING_FINAL", 2, "text-style-deep-thinking-final");

    @NotNull
    private final String value;

    private static final /* synthetic */ CardItemStyle[] $values() {
        return new CardItemStyle[]{ATTRIBUTION, DEEP_THINKING, DEEP_THINKING_FINAL};
    }

    static {
        CardItemStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CardItemStyle(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<CardItemStyle> getEntries() {
        return $ENTRIES;
    }

    public static CardItemStyle valueOf(String str) {
        return (CardItemStyle) Enum.valueOf(CardItemStyle.class, str);
    }

    public static CardItemStyle[] values() {
        return (CardItemStyle[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
