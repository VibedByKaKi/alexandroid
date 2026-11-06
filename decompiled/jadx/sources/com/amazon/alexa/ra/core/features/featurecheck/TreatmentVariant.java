package com.amazon.alexa.ra.core.features.featurecheck;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/features/featurecheck/TreatmentVariant;", "", "<init>", "(Ljava/lang/String;I)V", "C", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TreatmentVariant {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TreatmentVariant[] $VALUES;
    public static final TreatmentVariant C = new TreatmentVariant("C", 0);
    public static final TreatmentVariant T1 = new TreatmentVariant("T1", 1);
    public static final TreatmentVariant T2 = new TreatmentVariant("T2", 2);
    public static final TreatmentVariant T3 = new TreatmentVariant("T3", 3);
    public static final TreatmentVariant T4 = new TreatmentVariant("T4", 4);
    public static final TreatmentVariant T5 = new TreatmentVariant("T5", 5);
    public static final TreatmentVariant T6 = new TreatmentVariant("T6", 6);
    public static final TreatmentVariant T7 = new TreatmentVariant("T7", 7);
    public static final TreatmentVariant T8 = new TreatmentVariant("T8", 8);
    public static final TreatmentVariant T9 = new TreatmentVariant("T9", 9);

    private static final /* synthetic */ TreatmentVariant[] $values() {
        return new TreatmentVariant[]{C, T1, T2, T3, T4, T5, T6, T7, T8, T9};
    }

    static {
        TreatmentVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TreatmentVariant(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TreatmentVariant> getEntries() {
        return $ENTRIES;
    }

    public static TreatmentVariant valueOf(String str) {
        return (TreatmentVariant) Enum.valueOf(TreatmentVariant.class, str);
    }

    public static TreatmentVariant[] values() {
        return (TreatmentVariant[]) $VALUES.clone();
    }
}
