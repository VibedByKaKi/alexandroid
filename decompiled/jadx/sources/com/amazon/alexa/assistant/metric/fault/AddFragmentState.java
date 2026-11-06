package com.amazon.alexa.assistant.metric.fault;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/metric/fault/AddFragmentState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NO_FRAGMENTS", "NO_AGENT_FRAGMENTS_EMPTY_CONTAINER", "NO_AGENT_FRAGMENTS_NON_EMPTY_CONTAINER", "VALID_RESPONSE", "UNKNOWN", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddFragmentState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddFragmentState[] $VALUES;

    @NotNull
    private final String value;
    public static final AddFragmentState NO_FRAGMENTS = new AddFragmentState("NO_FRAGMENTS", 0, "NoFragments");
    public static final AddFragmentState NO_AGENT_FRAGMENTS_EMPTY_CONTAINER = new AddFragmentState("NO_AGENT_FRAGMENTS_EMPTY_CONTAINER", 1, "NoAgentResponseEmptyContainer");
    public static final AddFragmentState NO_AGENT_FRAGMENTS_NON_EMPTY_CONTAINER = new AddFragmentState("NO_AGENT_FRAGMENTS_NON_EMPTY_CONTAINER", 2, "NoAgentResponseNonEmptyContainer");
    public static final AddFragmentState VALID_RESPONSE = new AddFragmentState("VALID_RESPONSE", 3, "ValidAgentResponse");
    public static final AddFragmentState UNKNOWN = new AddFragmentState("UNKNOWN", 4, "Unknown");

    private static final /* synthetic */ AddFragmentState[] $values() {
        return new AddFragmentState[]{NO_FRAGMENTS, NO_AGENT_FRAGMENTS_EMPTY_CONTAINER, NO_AGENT_FRAGMENTS_NON_EMPTY_CONTAINER, VALID_RESPONSE, UNKNOWN};
    }

    static {
        AddFragmentState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AddFragmentState(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<AddFragmentState> getEntries() {
        return $ENTRIES;
    }

    public static AddFragmentState valueOf(String str) {
        return (AddFragmentState) Enum.valueOf(AddFragmentState.class, str);
    }

    public static AddFragmentState[] values() {
        return (AddFragmentState[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
