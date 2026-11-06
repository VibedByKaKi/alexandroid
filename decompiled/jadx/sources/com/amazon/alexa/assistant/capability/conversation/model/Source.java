package com.amazon.alexa.assistant.capability.conversation.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/Source;", "", "<init>", "(Ljava/lang/String;I)V", "ALEXA_RESPONSE", "CONVERSATION_SERVICE", "CONVERSATION_SERVICE_SYNC", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Source {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Source[] $VALUES;
    public static final Source ALEXA_RESPONSE = new Source("ALEXA_RESPONSE", 0);
    public static final Source CONVERSATION_SERVICE = new Source("CONVERSATION_SERVICE", 1);
    public static final Source CONVERSATION_SERVICE_SYNC = new Source("CONVERSATION_SERVICE_SYNC", 2);

    private static final /* synthetic */ Source[] $values() {
        return new Source[]{ALEXA_RESPONSE, CONVERSATION_SERVICE, CONVERSATION_SERVICE_SYNC};
    }

    static {
        Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Source(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Source> getEntries() {
        return $ENTRIES;
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }
}
