package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/OverflowMenuItemType;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_CHAT", "MY_CHATS", "CHATS", "ALEXA_SETTINGS", "ALEXA_PRIVACY", "VOICE_RESPONSES", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class OverflowMenuItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OverflowMenuItemType[] $VALUES;
    public static final OverflowMenuItemType NEW_CHAT = new OverflowMenuItemType("NEW_CHAT", 0);
    public static final OverflowMenuItemType MY_CHATS = new OverflowMenuItemType("MY_CHATS", 1);
    public static final OverflowMenuItemType CHATS = new OverflowMenuItemType("CHATS", 2);
    public static final OverflowMenuItemType ALEXA_SETTINGS = new OverflowMenuItemType("ALEXA_SETTINGS", 3);
    public static final OverflowMenuItemType ALEXA_PRIVACY = new OverflowMenuItemType("ALEXA_PRIVACY", 4);
    public static final OverflowMenuItemType VOICE_RESPONSES = new OverflowMenuItemType("VOICE_RESPONSES", 5);

    private static final /* synthetic */ OverflowMenuItemType[] $values() {
        return new OverflowMenuItemType[]{NEW_CHAT, MY_CHATS, CHATS, ALEXA_SETTINGS, ALEXA_PRIVACY, VOICE_RESPONSES};
    }

    static {
        OverflowMenuItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private OverflowMenuItemType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OverflowMenuItemType> getEntries() {
        return $ENTRIES;
    }

    public static OverflowMenuItemType valueOf(String str) {
        return (OverflowMenuItemType) Enum.valueOf(OverflowMenuItemType.class, str);
    }

    public static OverflowMenuItemType[] values() {
        return (OverflowMenuItemType[]) $VALUES.clone();
    }
}
