package com.amazon.comms.calling.domain.model.dataChannel.calling;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/calling/CallingDataChannelEventName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NEW_SCREEN_ORIENTATION", "PIP_ACTION", "CALL_SETUP", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallingDataChannelEventName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CallingDataChannelEventName[] $VALUES;

    @NotNull
    private final String value;

    @SerializedName("new_screen_orientation")
    public static final CallingDataChannelEventName NEW_SCREEN_ORIENTATION = new CallingDataChannelEventName("NEW_SCREEN_ORIENTATION", 0, "new_screen_orientation");

    @SerializedName("PIPAction")
    public static final CallingDataChannelEventName PIP_ACTION = new CallingDataChannelEventName("PIP_ACTION", 1, "PIPAction");

    @SerializedName("call_setup")
    public static final CallingDataChannelEventName CALL_SETUP = new CallingDataChannelEventName("CALL_SETUP", 2, "call_setup");

    private static final /* synthetic */ CallingDataChannelEventName[] $values() {
        return new CallingDataChannelEventName[]{NEW_SCREEN_ORIENTATION, PIP_ACTION, CALL_SETUP};
    }

    static {
        CallingDataChannelEventName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CallingDataChannelEventName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<CallingDataChannelEventName> getEntries() {
        return $ENTRIES;
    }

    public static CallingDataChannelEventName valueOf(String str) {
        return (CallingDataChannelEventName) Enum.valueOf(CallingDataChannelEventName.class, str);
    }

    public static CallingDataChannelEventName[] values() {
        return (CallingDataChannelEventName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
