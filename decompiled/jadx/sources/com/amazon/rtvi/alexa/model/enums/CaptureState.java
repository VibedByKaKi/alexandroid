package com.amazon.rtvi.alexa.model.enums;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import com.fasterxml.jackson.annotation.JsonValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/rtvi/alexa/model/enums/CaptureState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", WifiConnectionState.IDLE, "CAPTURING", "EXPECTING_VISUAL_INPUT", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CaptureState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CaptureState[] $VALUES;

    @JsonValue
    @NotNull
    private final String value;
    public static final CaptureState IDLE = new CaptureState(WifiConnectionState.IDLE, 0, WifiConnectionState.IDLE);
    public static final CaptureState CAPTURING = new CaptureState("CAPTURING", 1, "CAPTURING");
    public static final CaptureState EXPECTING_VISUAL_INPUT = new CaptureState("EXPECTING_VISUAL_INPUT", 2, "EXPECTING_VISUAL_INPUT");

    private static final /* synthetic */ CaptureState[] $values() {
        return new CaptureState[]{IDLE, CAPTURING, EXPECTING_VISUAL_INPUT};
    }

    static {
        CaptureState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CaptureState(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<CaptureState> getEntries() {
        return $ENTRIES;
    }

    public static CaptureState valueOf(String str) {
        return (CaptureState) Enum.valueOf(CaptureState.class, str);
    }

    public static CaptureState[] values() {
        return (CaptureState[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
