package com.amazon.alexa.api.compat.migration.sdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/PreconditionResult;", "", "<init>", "(Ljava/lang/String;I)V", "SATISFIED", "UNSATISFIED", "UNKNOWN", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PreconditionResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PreconditionResult[] $VALUES;
    public static final PreconditionResult SATISFIED = new PreconditionResult("SATISFIED", 0);
    public static final PreconditionResult UNSATISFIED = new PreconditionResult("UNSATISFIED", 1);
    public static final PreconditionResult UNKNOWN = new PreconditionResult("UNKNOWN", 2);

    private static final /* synthetic */ PreconditionResult[] $values() {
        return new PreconditionResult[]{SATISFIED, UNSATISFIED, UNKNOWN};
    }

    static {
        PreconditionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PreconditionResult(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PreconditionResult> getEntries() {
        return $ENTRIES;
    }

    public static PreconditionResult valueOf(String str) {
        return (PreconditionResult) Enum.valueOf(PreconditionResult.class, str);
    }

    public static PreconditionResult[] values() {
        return (PreconditionResult[]) $VALUES.clone();
    }
}
