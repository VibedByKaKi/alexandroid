package com.amazon.alexa.assistant.ui.conversation;

import com.amazon.alexa.ra.core.data.model.SuggestionUiTheme;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/SuggestionTheme;", "", "uiTheme", "Lcom/amazon/alexa/ra/core/data/model/SuggestionUiTheme;", "<init>", "(Ljava/lang/String;ILcom/amazon/alexa/ra/core/data/model/SuggestionUiTheme;)V", "getUiTheme", "()Lcom/amazon/alexa/ra/core/data/model/SuggestionUiTheme;", "ADULT", "KIDS", "HIDDEN", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SuggestionTheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SuggestionTheme[] $VALUES;

    @NotNull
    private final SuggestionUiTheme uiTheme;
    public static final SuggestionTheme ADULT = new SuggestionTheme("ADULT", 0, SuggestionUiTheme.ADULT);
    public static final SuggestionTheme KIDS = new SuggestionTheme("KIDS", 1, SuggestionUiTheme.KID_FRIENDLY);
    public static final SuggestionTheme HIDDEN = new SuggestionTheme("HIDDEN", 2, SuggestionUiTheme.HIDDEN);

    private static final /* synthetic */ SuggestionTheme[] $values() {
        return new SuggestionTheme[]{ADULT, KIDS, HIDDEN};
    }

    static {
        SuggestionTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SuggestionTheme(String str, int i, SuggestionUiTheme suggestionUiTheme) {
        this.uiTheme = suggestionUiTheme;
    }

    @NotNull
    public static EnumEntries<SuggestionTheme> getEntries() {
        return $ENTRIES;
    }

    public static SuggestionTheme valueOf(String str) {
        return (SuggestionTheme) Enum.valueOf(SuggestionTheme.class, str);
    }

    public static SuggestionTheme[] values() {
        return (SuggestionTheme[]) $VALUES.clone();
    }

    @NotNull
    public final SuggestionUiTheme getUiTheme() {
        return this.uiTheme;
    }
}
