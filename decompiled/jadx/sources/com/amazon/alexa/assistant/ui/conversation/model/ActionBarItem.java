package com.amazon.alexa.assistant.ui.conversation.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ActionBarItem;", "", "<init>", "(Ljava/lang/String;I)V", "Regenerate", "Share", "Copy", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActionBarItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActionBarItem[] $VALUES;
    public static final ActionBarItem Regenerate = new ActionBarItem("Regenerate", 0);
    public static final ActionBarItem Share = new ActionBarItem("Share", 1);
    public static final ActionBarItem Copy = new ActionBarItem("Copy", 2);

    private static final /* synthetic */ ActionBarItem[] $values() {
        return new ActionBarItem[]{Regenerate, Share, Copy};
    }

    static {
        ActionBarItem[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ActionBarItem(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ActionBarItem> getEntries() {
        return $ENTRIES;
    }

    public static ActionBarItem valueOf(String str) {
        return (ActionBarItem) Enum.valueOf(ActionBarItem.class, str);
    }

    public static ActionBarItem[] values() {
        return (ActionBarItem[]) $VALUES.clone();
    }
}
