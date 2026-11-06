package com.amazon.alexa.assistant.ui.conversation;

import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/StartingState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "VOICE", "LIVE_MODE", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StartingState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StartingState[] $VALUES;

    @NotNull
    private final String value;
    public static final StartingState TEXT = new StartingState(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 0, "text");
    public static final StartingState VOICE = new StartingState("VOICE", 1, "voice");
    public static final StartingState LIVE_MODE = new StartingState("LIVE_MODE", 2, "liveMode");

    private static final /* synthetic */ StartingState[] $values() {
        return new StartingState[]{TEXT, VOICE, LIVE_MODE};
    }

    static {
        StartingState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private StartingState(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<StartingState> getEntries() {
        return $ENTRIES;
    }

    public static StartingState valueOf(String str) {
        return (StartingState) Enum.valueOf(StartingState.class, str);
    }

    public static StartingState[] values() {
        return (StartingState[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
