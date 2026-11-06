package com.amazon.comms.calling.domain.model.pcc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/PCCConstraints;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL_ANSWER_CALL", "MANUAL_DECLINE_CALL", "MANUAL_END_CALL", "OVERRIDE_RINGTONE_SUPPORTED", "VIDEO_SUPPORTED", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class PCCConstraints {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PCCConstraints[] $VALUES;
    public static final PCCConstraints MANUAL_ANSWER_CALL = new PCCConstraints("MANUAL_ANSWER_CALL", 0);
    public static final PCCConstraints MANUAL_DECLINE_CALL = new PCCConstraints("MANUAL_DECLINE_CALL", 1);
    public static final PCCConstraints MANUAL_END_CALL = new PCCConstraints("MANUAL_END_CALL", 2);
    public static final PCCConstraints OVERRIDE_RINGTONE_SUPPORTED = new PCCConstraints("OVERRIDE_RINGTONE_SUPPORTED", 3);
    public static final PCCConstraints VIDEO_SUPPORTED = new PCCConstraints("VIDEO_SUPPORTED", 4);

    private static final /* synthetic */ PCCConstraints[] $values() {
        return new PCCConstraints[]{MANUAL_ANSWER_CALL, MANUAL_DECLINE_CALL, MANUAL_END_CALL, OVERRIDE_RINGTONE_SUPPORTED, VIDEO_SUPPORTED};
    }

    static {
        PCCConstraints[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PCCConstraints(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PCCConstraints> getEntries() {
        return $ENTRIES;
    }

    public static PCCConstraints valueOf(String str) {
        return (PCCConstraints) Enum.valueOf(PCCConstraints.class, str);
    }

    public static PCCConstraints[] values() {
        return (PCCConstraints[]) $VALUES.clone();
    }
}
