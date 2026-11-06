package com.amazon.alexa.assistant.capability.conversation;

import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/FragmentCardType;", "", "<init>", "(Ljava/lang/String;I)V", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "BUTTON", "IMAGE", SimbaEventProcessor.SOURCE_SUGGESTION, "DETAIL", "FULL_IMAGE", "HEADLINE", "EVENT", "CONTACT", "NAVIGATION", "TABLE", "LIST", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FragmentCardType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FragmentCardType[] $VALUES;
    public static final FragmentCardType TEXT = new FragmentCardType(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 0);
    public static final FragmentCardType BUTTON = new FragmentCardType("BUTTON", 1);
    public static final FragmentCardType IMAGE = new FragmentCardType("IMAGE", 2);
    public static final FragmentCardType SUGGESTION = new FragmentCardType(SimbaEventProcessor.SOURCE_SUGGESTION, 3);
    public static final FragmentCardType DETAIL = new FragmentCardType("DETAIL", 4);
    public static final FragmentCardType FULL_IMAGE = new FragmentCardType("FULL_IMAGE", 5);
    public static final FragmentCardType HEADLINE = new FragmentCardType("HEADLINE", 6);
    public static final FragmentCardType EVENT = new FragmentCardType("EVENT", 7);
    public static final FragmentCardType CONTACT = new FragmentCardType("CONTACT", 8);
    public static final FragmentCardType NAVIGATION = new FragmentCardType("NAVIGATION", 9);
    public static final FragmentCardType TABLE = new FragmentCardType("TABLE", 10);
    public static final FragmentCardType LIST = new FragmentCardType("LIST", 11);

    private static final /* synthetic */ FragmentCardType[] $values() {
        return new FragmentCardType[]{TEXT, BUTTON, IMAGE, SUGGESTION, DETAIL, FULL_IMAGE, HEADLINE, EVENT, CONTACT, NAVIGATION, TABLE, LIST};
    }

    static {
        FragmentCardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FragmentCardType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FragmentCardType> getEntries() {
        return $ENTRIES;
    }

    public static FragmentCardType valueOf(String str) {
        return (FragmentCardType) Enum.valueOf(FragmentCardType.class, str);
    }

    public static FragmentCardType[] values() {
        return (FragmentCardType[]) $VALUES.clone();
    }
}
