package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.mobile.assistant.capabilities.localsearch.LocalSearchEngineCategories;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/HeaderActionType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "DOWN", LocalSearchEngineCategories.MUSIC, "SETTINGS", "NEW_CHAT", "ALEXA_APP", "OVERFLOW_MENU", "CLOSE", "LAUNCH_INTENT", "HEADER_CHATS", "HEADER_SETTINGS", "HEADER_PRIVACY", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class HeaderActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HeaderActionType[] $VALUES;
    public static final HeaderActionType BACK = new HeaderActionType("BACK", 0);
    public static final HeaderActionType DOWN = new HeaderActionType("DOWN", 1);
    public static final HeaderActionType MUSIC = new HeaderActionType(LocalSearchEngineCategories.MUSIC, 2);
    public static final HeaderActionType SETTINGS = new HeaderActionType("SETTINGS", 3);
    public static final HeaderActionType NEW_CHAT = new HeaderActionType("NEW_CHAT", 4);
    public static final HeaderActionType ALEXA_APP = new HeaderActionType("ALEXA_APP", 5);
    public static final HeaderActionType OVERFLOW_MENU = new HeaderActionType("OVERFLOW_MENU", 6);
    public static final HeaderActionType CLOSE = new HeaderActionType("CLOSE", 7);
    public static final HeaderActionType LAUNCH_INTENT = new HeaderActionType("LAUNCH_INTENT", 8);
    public static final HeaderActionType HEADER_CHATS = new HeaderActionType("HEADER_CHATS", 9);
    public static final HeaderActionType HEADER_SETTINGS = new HeaderActionType("HEADER_SETTINGS", 10);
    public static final HeaderActionType HEADER_PRIVACY = new HeaderActionType("HEADER_PRIVACY", 11);

    private static final /* synthetic */ HeaderActionType[] $values() {
        return new HeaderActionType[]{BACK, DOWN, MUSIC, SETTINGS, NEW_CHAT, ALEXA_APP, OVERFLOW_MENU, CLOSE, LAUNCH_INTENT, HEADER_CHATS, HEADER_SETTINGS, HEADER_PRIVACY};
    }

    static {
        HeaderActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private HeaderActionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<HeaderActionType> getEntries() {
        return $ENTRIES;
    }

    public static HeaderActionType valueOf(String str) {
        return (HeaderActionType) Enum.valueOf(HeaderActionType.class, str);
    }

    public static HeaderActionType[] values() {
        return (HeaderActionType[]) $VALUES.clone();
    }
}
