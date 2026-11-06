package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ConversationHintTextOperation;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW", "SEND", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ConversationHintTextOperation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConversationHintTextOperation[] $VALUES;
    public static final ConversationHintTextOperation SHOW = new ConversationHintTextOperation("SHOW", 0);
    public static final ConversationHintTextOperation SEND = new ConversationHintTextOperation("SEND", 1);

    private static final /* synthetic */ ConversationHintTextOperation[] $values() {
        return new ConversationHintTextOperation[]{SHOW, SEND};
    }

    static {
        ConversationHintTextOperation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ConversationHintTextOperation(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ConversationHintTextOperation> getEntries() {
        return $ENTRIES;
    }

    public static ConversationHintTextOperation valueOf(String str) {
        return (ConversationHintTextOperation) Enum.valueOf(ConversationHintTextOperation.class, str);
    }

    public static ConversationHintTextOperation[] values() {
        return (ConversationHintTextOperation[]) $VALUES.clone();
    }
}
