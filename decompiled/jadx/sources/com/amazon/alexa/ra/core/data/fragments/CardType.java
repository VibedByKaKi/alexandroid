package com.amazon.alexa.ra.core.data.fragments;

import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import com.amazon.deecomms.common.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/CardType;", "", "<init>", "(Ljava/lang/String;I)V", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "BUTTON", "IMAGE", SimbaEventProcessor.SOURCE_SUGGESTION, "DETAIL", "FULL_IMAGE", "HEADLINE", "EVENT", "CONTACT", "NAVIGATION", "TABLE", "LIST", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CardType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CardType TEXT = new CardType(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 0);
    public static final CardType BUTTON = new CardType("BUTTON", 1);
    public static final CardType IMAGE = new CardType("IMAGE", 2);
    public static final CardType SUGGESTION = new CardType(SimbaEventProcessor.SOURCE_SUGGESTION, 3);
    public static final CardType DETAIL = new CardType("DETAIL", 4);
    public static final CardType FULL_IMAGE = new CardType("FULL_IMAGE", 5);
    public static final CardType HEADLINE = new CardType("HEADLINE", 6);
    public static final CardType EVENT = new CardType("EVENT", 7);
    public static final CardType CONTACT = new CardType("CONTACT", 8);
    public static final CardType NAVIGATION = new CardType("NAVIGATION", 9);
    public static final CardType TABLE = new CardType("TABLE", 10);
    public static final CardType LIST = new CardType("LIST", 11);

    private static final /* synthetic */ CardType[] $values() {
        return new CardType[]{TEXT, BUTTON, IMAGE, SUGGESTION, DETAIL, FULL_IMAGE, HEADLINE, EVENT, CONTACT, NAVIGATION, TABLE, LIST};
    }

    static {
        CardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CardType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CardType> getEntries() {
        return $ENTRIES;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/CardType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/CardType;", Content.CARD_TYPE, "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CardType from(@NotNull String cardType) {
            cardType.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = cardType.toUpperCase(locale);
            upperCase.getClass();
            switch (upperCase.hashCode()) {
                case -1947208172:
                    if (upperCase.equals("NAVIGATION")) {
                        return CardType.NAVIGATION;
                    }
                    return null;
                case -332431916:
                    if (upperCase.equals("HEADLINE")) {
                        return CardType.HEADLINE;
                    }
                    return null;
                case 2336926:
                    if (upperCase.equals("LIST")) {
                        return CardType.LIST;
                    }
                    return null;
                case 2571565:
                    if (upperCase.equals(Constants.Calling.MEDIA_STREAM_TYPE_TEXT)) {
                        return CardType.TEXT;
                    }
                    return null;
                case 66353786:
                    if (upperCase.equals("EVENT")) {
                        return CardType.EVENT;
                    }
                    return null;
                case 69775675:
                    if (upperCase.equals("IMAGE")) {
                        return CardType.IMAGE;
                    }
                    return null;
                case 79578030:
                    if (upperCase.equals("TABLE")) {
                        return CardType.TABLE;
                    }
                    return null;
                case 1118623756:
                    if (upperCase.equals("FULLIMAGE")) {
                        return CardType.FULL_IMAGE;
                    }
                    return null;
                case 1669509120:
                    if (upperCase.equals("CONTACT")) {
                        return CardType.CONTACT;
                    }
                    return null;
                case 1682814468:
                    if (upperCase.equals(SimbaEventProcessor.SOURCE_SUGGESTION)) {
                        return CardType.SUGGESTION;
                    }
                    return null;
                case 1970608946:
                    if (upperCase.equals("BUTTON")) {
                        return CardType.BUTTON;
                    }
                    return null;
                case 2013072465:
                    if (upperCase.equals("DETAIL")) {
                        return CardType.DETAIL;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
