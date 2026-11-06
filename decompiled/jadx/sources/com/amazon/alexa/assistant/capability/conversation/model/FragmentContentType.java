package com.amazon.alexa.assistant.capability.conversation.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/FragmentContentType;", "", "<init>", "(Ljava/lang/String;I)V", "CARD", "APL_FRAGMENT", "SMART_FRAGMENT", "HTML_FRAGMENT", "PRIVATE", "UNSUPPORTED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FragmentContentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FragmentContentType[] $VALUES;
    public static final FragmentContentType CARD = new FragmentContentType("CARD", 0);
    public static final FragmentContentType APL_FRAGMENT = new FragmentContentType("APL_FRAGMENT", 1);
    public static final FragmentContentType SMART_FRAGMENT = new FragmentContentType("SMART_FRAGMENT", 2);
    public static final FragmentContentType HTML_FRAGMENT = new FragmentContentType("HTML_FRAGMENT", 3);
    public static final FragmentContentType PRIVATE = new FragmentContentType("PRIVATE", 4);
    public static final FragmentContentType UNSUPPORTED = new FragmentContentType("UNSUPPORTED", 5);

    private static final /* synthetic */ FragmentContentType[] $values() {
        return new FragmentContentType[]{CARD, APL_FRAGMENT, SMART_FRAGMENT, HTML_FRAGMENT, PRIVATE, UNSUPPORTED};
    }

    static {
        FragmentContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FragmentContentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FragmentContentType> getEntries() {
        return $ENTRIES;
    }

    public static FragmentContentType valueOf(String str) {
        return (FragmentContentType) Enum.valueOf(FragmentContentType.class, str);
    }

    public static FragmentContentType[] values() {
        return (FragmentContentType[]) $VALUES.clone();
    }
}
