package com.amazon.alexa.ra.core.data.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/SuggestionUiTheme;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADULT", "KID_FRIENDLY", "HIDDEN", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SuggestionUiTheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SuggestionUiTheme[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final SuggestionUiTheme ADULT = new SuggestionUiTheme("ADULT", 0, "ADULT");
    public static final SuggestionUiTheme KID_FRIENDLY = new SuggestionUiTheme("KID_FRIENDLY", 1, "KID_FRIENDLY");
    public static final SuggestionUiTheme HIDDEN = new SuggestionUiTheme("HIDDEN", 2, "HIDDEN");

    private static final /* synthetic */ SuggestionUiTheme[] $values() {
        return new SuggestionUiTheme[]{ADULT, KID_FRIENDLY, HIDDEN};
    }

    static {
        SuggestionUiTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private SuggestionUiTheme(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<SuggestionUiTheme> getEntries() {
        return $ENTRIES;
    }

    public static SuggestionUiTheme valueOf(String str) {
        return (SuggestionUiTheme) Enum.valueOf(SuggestionUiTheme.class, str);
    }

    public static SuggestionUiTheme[] values() {
        return (SuggestionUiTheme[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/SuggestionUiTheme$Companion;", "", "<init>", "()V", "isKidsTheme", "", "theme", "Lcom/amazon/alexa/ra/core/data/model/SuggestionUiTheme;", "fromString", "value", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSuggestionPillUiModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestionPillUiModel.kt\ncom/amazon/alexa/ra/core/data/model/SuggestionUiTheme$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SuggestionUiTheme fromString(@Nullable String value) {
            Object obj;
            Iterator<E> it2 = SuggestionUiTheme.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((SuggestionUiTheme) obj).getValue(), value)) {
                    break;
                }
            }
            SuggestionUiTheme suggestionUiTheme = (SuggestionUiTheme) obj;
            return suggestionUiTheme == null ? SuggestionUiTheme.ADULT : suggestionUiTheme;
        }

        public final boolean isKidsTheme(@NotNull SuggestionUiTheme theme) {
            theme.getClass();
            return theme == SuggestionUiTheme.KID_FRIENDLY || theme == SuggestionUiTheme.HIDDEN;
        }

        private Companion() {
        }
    }
}
