package com.amazon.alexa.hho.navigation.transit.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/InstructionType;", "", "<init>", "(Ljava/lang/String;I)V", "ALERT", "GUIDANCE", "INFO", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstructionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstructionType[] $VALUES;
    public static final InstructionType ALERT = new InstructionType("ALERT", 0);
    public static final InstructionType GUIDANCE = new InstructionType("GUIDANCE", 1);
    public static final InstructionType INFO = new InstructionType("INFO", 2);

    private static final /* synthetic */ InstructionType[] $values() {
        return new InstructionType[]{ALERT, GUIDANCE, INFO};
    }

    static {
        InstructionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private InstructionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<InstructionType> getEntries() {
        return $ENTRIES;
    }

    public static InstructionType valueOf(String str) {
        return (InstructionType) Enum.valueOf(InstructionType.class, str);
    }

    public static InstructionType[] values() {
        return (InstructionType[]) $VALUES.clone();
    }
}
