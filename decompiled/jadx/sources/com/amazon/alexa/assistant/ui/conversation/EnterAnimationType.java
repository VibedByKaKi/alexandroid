package com.amazon.alexa.assistant.ui.conversation;

import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/EnterAnimationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PEEK", "SLIDE", "NONE", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EnterAnimationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnterAnimationType[] $VALUES;

    @NotNull
    private final String value;
    public static final EnterAnimationType PEEK = new EnterAnimationType("PEEK", 0, RaUiOptions.ENTER_ANIMATION_PEEK);
    public static final EnterAnimationType SLIDE = new EnterAnimationType("SLIDE", 1, "slide");
    public static final EnterAnimationType NONE = new EnterAnimationType("NONE", 2, "none");

    private static final /* synthetic */ EnterAnimationType[] $values() {
        return new EnterAnimationType[]{PEEK, SLIDE, NONE};
    }

    static {
        EnterAnimationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnterAnimationType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<EnterAnimationType> getEntries() {
        return $ENTRIES;
    }

    public static EnterAnimationType valueOf(String str) {
        return (EnterAnimationType) Enum.valueOf(EnterAnimationType.class, str);
    }

    public static EnterAnimationType[] values() {
        return (EnterAnimationType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
