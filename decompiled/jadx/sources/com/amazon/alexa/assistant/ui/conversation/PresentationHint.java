package com.amazon.alexa.assistant.ui.conversation;

import com.amazon.alexa.voice.ui.suggestions.SuggestionAction;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/PresentationHint;", "", "<init>", "(Ljava/lang/String;I)V", "IN_APP", SuggestionAction.EXTERNAL, "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PresentationHint {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PresentationHint[] $VALUES;
    public static final PresentationHint IN_APP = new PresentationHint("IN_APP", 0);
    public static final PresentationHint EXTERNAL = new PresentationHint(SuggestionAction.EXTERNAL, 1);

    private static final /* synthetic */ PresentationHint[] $values() {
        return new PresentationHint[]{IN_APP, EXTERNAL};
    }

    static {
        PresentationHint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PresentationHint(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PresentationHint> getEntries() {
        return $ENTRIES;
    }

    public static PresentationHint valueOf(String str) {
        return (PresentationHint) Enum.valueOf(PresentationHint.class, str);
    }

    public static PresentationHint[] values() {
        return (PresentationHint[]) $VALUES.clone();
    }
}
