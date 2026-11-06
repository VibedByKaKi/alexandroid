package com.amazon.alexa.redesign.entity;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/redesign/entity/ExecutionContext;", "", "<init>", "(Ljava/lang/String;I)V", "COACHMARK_BASED", "CARD_BASED", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ExecutionContext {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExecutionContext[] $VALUES;
    public static final ExecutionContext COACHMARK_BASED = new ExecutionContext("COACHMARK_BASED", 0);
    public static final ExecutionContext CARD_BASED = new ExecutionContext("CARD_BASED", 1);

    private static final /* synthetic */ ExecutionContext[] $values() {
        return new ExecutionContext[]{COACHMARK_BASED, CARD_BASED};
    }

    static {
        ExecutionContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ExecutionContext(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ExecutionContext> getEntries() {
        return $ENTRIES;
    }

    public static ExecutionContext valueOf(String str) {
        return (ExecutionContext) Enum.valueOf(ExecutionContext.class, str);
    }

    public static ExecutionContext[] values() {
        return (ExecutionContext[]) $VALUES.clone();
    }
}
