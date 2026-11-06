package com.amazon.alexa.api.compat.model.conversation;

import com.amazon.alexa.sendtoapp.notification.SendToAppMessagingReceiver;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSource;", "", "wireValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getWireValue", "()Ljava/lang/String;", "NEW", "TOPIC_LOAD", "CONVERSATION_LOAD", "TIMELINE_TOPIC", SendToAppMessagingReceiver.SEND_TO_APP_NOTIFICATION_TYPE, "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ConversationLoadSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConversationLoadSource[] $VALUES;

    @NotNull
    private final String wireValue;
    public static final ConversationLoadSource NEW = new ConversationLoadSource("NEW", 0, "new");
    public static final ConversationLoadSource TOPIC_LOAD = new ConversationLoadSource("TOPIC_LOAD", 1, "topicLoad");
    public static final ConversationLoadSource CONVERSATION_LOAD = new ConversationLoadSource("CONVERSATION_LOAD", 2, "conversationLoad");
    public static final ConversationLoadSource TIMELINE_TOPIC = new ConversationLoadSource("TIMELINE_TOPIC", 3, "conversationLoad.timelineTopic");
    public static final ConversationLoadSource SEND_TO_PHONE = new ConversationLoadSource(SendToAppMessagingReceiver.SEND_TO_APP_NOTIFICATION_TYPE, 4, "conversationLoad.sendToPhone");

    private static final /* synthetic */ ConversationLoadSource[] $values() {
        return new ConversationLoadSource[]{NEW, TOPIC_LOAD, CONVERSATION_LOAD, TIMELINE_TOPIC, SEND_TO_PHONE};
    }

    static {
        ConversationLoadSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ConversationLoadSource(String str, int i, String str2) {
        this.wireValue = str2;
    }

    @NotNull
    public static EnumEntries<ConversationLoadSource> getEntries() {
        return $ENTRIES;
    }

    public static ConversationLoadSource valueOf(String str) {
        return (ConversationLoadSource) Enum.valueOf(ConversationLoadSource.class, str);
    }

    public static ConversationLoadSource[] values() {
        return (ConversationLoadSource[]) $VALUES.clone();
    }

    @NotNull
    public final String getWireValue() {
        return this.wireValue;
    }
}
