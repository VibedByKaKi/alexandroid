package com.amazon.alexa.ra.core.metrics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/TouchSource;", "", "<init>", "(Ljava/lang/String;I)V", "STATIC_STARTER", "DYNAMIC_STARTER", "FOR_YOU_STARTER", "FOLLOW_UP_SUGGESTION", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TouchSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TouchSource[] $VALUES;
    public static final TouchSource STATIC_STARTER = new TouchSource("STATIC_STARTER", 0);
    public static final TouchSource DYNAMIC_STARTER = new TouchSource("DYNAMIC_STARTER", 1);
    public static final TouchSource FOR_YOU_STARTER = new TouchSource("FOR_YOU_STARTER", 2);
    public static final TouchSource FOLLOW_UP_SUGGESTION = new TouchSource("FOLLOW_UP_SUGGESTION", 3);

    private static final /* synthetic */ TouchSource[] $values() {
        return new TouchSource[]{STATIC_STARTER, DYNAMIC_STARTER, FOR_YOU_STARTER, FOLLOW_UP_SUGGESTION};
    }

    static {
        TouchSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TouchSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TouchSource> getEntries() {
        return $ENTRIES;
    }

    public static TouchSource valueOf(String str) {
        return (TouchSource) Enum.valueOf(TouchSource.class, str);
    }

    public static TouchSource[] values() {
        return (TouchSource[]) $VALUES.clone();
    }
}
