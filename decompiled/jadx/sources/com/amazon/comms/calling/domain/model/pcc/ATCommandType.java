package com.amazon.comms.calling.domain.model.pcc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/ATCommandType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DIAL", "ANSWER_CALL", "END_CALL", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ATCommandType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ATCommandType[] $VALUES;

    @NotNull
    private final String value;
    public static final ATCommandType DIAL = new ATCommandType("DIAL", 0, "ATD");
    public static final ATCommandType ANSWER_CALL = new ATCommandType("ANSWER_CALL", 1, "ATA");
    public static final ATCommandType END_CALL = new ATCommandType("END_CALL", 2, "AT+CHUP");

    private static final /* synthetic */ ATCommandType[] $values() {
        return new ATCommandType[]{DIAL, ANSWER_CALL, END_CALL};
    }

    static {
        ATCommandType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ATCommandType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ATCommandType> getEntries() {
        return $ENTRIES;
    }

    public static ATCommandType valueOf(String str) {
        return (ATCommandType) Enum.valueOf(ATCommandType.class, str);
    }

    public static ATCommandType[] values() {
        return (ATCommandType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
