package com.amazon.alexa.ra.core.data.fragments;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "CARD", "APL_FRAGMENT", "SMART_FRAGMENT", "HTML_FRAGMENT", "PRIVATE", "UNSUPPORTED", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ContentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ContentType CARD = new ContentType("CARD", 0);
    public static final ContentType APL_FRAGMENT = new ContentType("APL_FRAGMENT", 1);
    public static final ContentType SMART_FRAGMENT = new ContentType("SMART_FRAGMENT", 2);
    public static final ContentType HTML_FRAGMENT = new ContentType("HTML_FRAGMENT", 3);
    public static final ContentType PRIVATE = new ContentType("PRIVATE", 4);
    public static final ContentType UNSUPPORTED = new ContentType("UNSUPPORTED", 5);

    private static final /* synthetic */ ContentType[] $values() {
        return new ContentType[]{CARD, APL_FRAGMENT, SMART_FRAGMENT, HTML_FRAGMENT, PRIVATE, UNSUPPORTED};
    }

    static {
        ContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ContentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ContentType> getEntries() {
        return $ENTRIES;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ContentType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/ContentType;", "contentType", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final ContentType from(@NotNull String contentType) {
            contentType.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = contentType.toUpperCase(locale);
            upperCase.getClass();
            switch (upperCase.hashCode()) {
                case -174161075:
                    if (upperCase.equals("APLFRAGMENT")) {
                        return ContentType.APL_FRAGMENT;
                    }
                    break;
                case 2061072:
                    if (upperCase.equals("CARD")) {
                        return ContentType.CARD;
                    }
                    break;
                case 403485027:
                    if (upperCase.equals("PRIVATE")) {
                        return ContentType.PRIVATE;
                    }
                    break;
                case 624867065:
                    if (upperCase.equals("SMARTFRAGMENT")) {
                        return ContentType.SMART_FRAGMENT;
                    }
                    break;
                case 1337063163:
                    if (upperCase.equals("HTMLFRAGMENT")) {
                        return ContentType.HTML_FRAGMENT;
                    }
                    break;
            }
            return ContentType.UNSUPPORTED;
        }

        private Companion() {
        }
    }
}
