package com.amazon.alexa.ra.core.data.fragments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/CardStylePrefix;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AMAZON_BUYNOW_BUTTON", "AMAZON_ADDTOCART_BUTTON", "ASHOP_BUYFORME_OAS_BUTTON", "ASHOP_SHOPDIRECT_OAS_BUTTON", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CardStylePrefix {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardStylePrefix[] $VALUES;

    @NotNull
    private final String value;
    public static final CardStylePrefix AMAZON_BUYNOW_BUTTON = new CardStylePrefix("AMAZON_BUYNOW_BUTTON", 0, "amazon-buynow-button");
    public static final CardStylePrefix AMAZON_ADDTOCART_BUTTON = new CardStylePrefix("AMAZON_ADDTOCART_BUTTON", 1, "amazon-addtocart-button");
    public static final CardStylePrefix ASHOP_BUYFORME_OAS_BUTTON = new CardStylePrefix("ASHOP_BUYFORME_OAS_BUTTON", 2, "ashop-buyforme-oas-button");
    public static final CardStylePrefix ASHOP_SHOPDIRECT_OAS_BUTTON = new CardStylePrefix("ASHOP_SHOPDIRECT_OAS_BUTTON", 3, "ashop-shopdirect-oas-button");

    private static final /* synthetic */ CardStylePrefix[] $values() {
        return new CardStylePrefix[]{AMAZON_BUYNOW_BUTTON, AMAZON_ADDTOCART_BUTTON, ASHOP_BUYFORME_OAS_BUTTON, ASHOP_SHOPDIRECT_OAS_BUTTON};
    }

    static {
        CardStylePrefix[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CardStylePrefix(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<CardStylePrefix> getEntries() {
        return $ENTRIES;
    }

    public static CardStylePrefix valueOf(String str) {
        return (CardStylePrefix) Enum.valueOf(CardStylePrefix.class, str);
    }

    public static CardStylePrefix[] values() {
        return (CardStylePrefix[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
