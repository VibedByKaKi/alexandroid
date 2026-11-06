package com.amazon.alexa.ra.core.metrics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/NavigationType;", "", "<init>", "(Ljava/lang/String;I)V", "CONVERSATION_HISTORY", "EXISTING_CONVERSATION", "OPEN_URL", "EXPAND", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NavigationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationType[] $VALUES;
    public static final NavigationType CONVERSATION_HISTORY = new NavigationType("CONVERSATION_HISTORY", 0);
    public static final NavigationType EXISTING_CONVERSATION = new NavigationType("EXISTING_CONVERSATION", 1);
    public static final NavigationType OPEN_URL = new NavigationType("OPEN_URL", 2);
    public static final NavigationType EXPAND = new NavigationType("EXPAND", 3);

    private static final /* synthetic */ NavigationType[] $values() {
        return new NavigationType[]{CONVERSATION_HISTORY, EXISTING_CONVERSATION, OPEN_URL, EXPAND};
    }

    static {
        NavigationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private NavigationType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<NavigationType> getEntries() {
        return $ENTRIES;
    }

    public static NavigationType valueOf(String str) {
        return (NavigationType) Enum.valueOf(NavigationType.class, str);
    }

    public static NavigationType[] values() {
        return (NavigationType[]) $VALUES.clone();
    }
}
