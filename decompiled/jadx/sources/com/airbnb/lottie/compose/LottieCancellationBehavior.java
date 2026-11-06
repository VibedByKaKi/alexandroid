package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "(Ljava/lang/String;I)V", "Immediately", "OnIterationFinish", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LottieCancellationBehavior {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LottieCancellationBehavior[] $VALUES;
    public static final LottieCancellationBehavior Immediately = new LottieCancellationBehavior("Immediately", 0);
    public static final LottieCancellationBehavior OnIterationFinish = new LottieCancellationBehavior("OnIterationFinish", 1);

    private static final /* synthetic */ LottieCancellationBehavior[] $values() {
        return new LottieCancellationBehavior[]{Immediately, OnIterationFinish};
    }

    static {
        LottieCancellationBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LottieCancellationBehavior(String str, int i) {
    }

    @NotNull
    public static EnumEntries<LottieCancellationBehavior> getEntries() {
        return $ENTRIES;
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) $VALUES.clone();
    }
}
