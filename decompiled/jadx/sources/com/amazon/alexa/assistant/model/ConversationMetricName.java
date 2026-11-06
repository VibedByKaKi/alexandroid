package com.amazon.alexa.assistant.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/model/ConversationMetricName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONVERSATION_HISTORY_DOWNLOAD_LATENCY", "TIMELINE_CONVERSATION_DELETION_SUCCESS", "TIMELINE_CONVERSATION_DELETION_FAIL", "TIMELINE_CONVERSATION_DELETION_TIMEOUT", "TIMELINE_CHAT_DELETION_SUCCESS", "TIMELINE_CHAT_DELETION_FAIL", "TIMELINE_CHAT_DELETION_TIMEOUT", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationMetricName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConversationMetricName[] $VALUES;

    @NotNull
    private final String value;
    public static final ConversationMetricName CONVERSATION_HISTORY_DOWNLOAD_LATENCY = new ConversationMetricName("CONVERSATION_HISTORY_DOWNLOAD_LATENCY", 0, "CONVERSATION_HISTORY_DOWNLOAD_LATENCY");
    public static final ConversationMetricName TIMELINE_CONVERSATION_DELETION_SUCCESS = new ConversationMetricName("TIMELINE_CONVERSATION_DELETION_SUCCESS", 1, "TIMELINE_CONVERSATION_DELETION_SUCCESS");
    public static final ConversationMetricName TIMELINE_CONVERSATION_DELETION_FAIL = new ConversationMetricName("TIMELINE_CONVERSATION_DELETION_FAIL", 2, "TIMELINE_CONVERSATION_DELETION_FAIL");
    public static final ConversationMetricName TIMELINE_CONVERSATION_DELETION_TIMEOUT = new ConversationMetricName("TIMELINE_CONVERSATION_DELETION_TIMEOUT", 3, "TIMELINE_CONVERSATION_DELETION_TIMEOUT");
    public static final ConversationMetricName TIMELINE_CHAT_DELETION_SUCCESS = new ConversationMetricName("TIMELINE_CHAT_DELETION_SUCCESS", 4, "TIMELINE_CHAT_DELETION_SUCCESS");
    public static final ConversationMetricName TIMELINE_CHAT_DELETION_FAIL = new ConversationMetricName("TIMELINE_CHAT_DELETION_FAIL", 5, "TIMELINE_CHAT_DELETION_FAIL");
    public static final ConversationMetricName TIMELINE_CHAT_DELETION_TIMEOUT = new ConversationMetricName("TIMELINE_CHAT_DELETION_TIMEOUT", 6, "TIMELINE_CHAT_DELETION_TIMEOUT");

    private static final /* synthetic */ ConversationMetricName[] $values() {
        return new ConversationMetricName[]{CONVERSATION_HISTORY_DOWNLOAD_LATENCY, TIMELINE_CONVERSATION_DELETION_SUCCESS, TIMELINE_CONVERSATION_DELETION_FAIL, TIMELINE_CONVERSATION_DELETION_TIMEOUT, TIMELINE_CHAT_DELETION_SUCCESS, TIMELINE_CHAT_DELETION_FAIL, TIMELINE_CHAT_DELETION_TIMEOUT};
    }

    static {
        ConversationMetricName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ConversationMetricName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ConversationMetricName> getEntries() {
        return $ENTRIES;
    }

    public static ConversationMetricName valueOf(String str) {
        return (ConversationMetricName) Enum.valueOf(ConversationMetricName.class, str);
    }

    public static ConversationMetricName[] values() {
        return (ConversationMetricName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
