package com.amazon.alexa.pmi.taplatency;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/pmi/taplatency/TapMetric;", "", "token", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "TTFR", "TTAC", "TTLR", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TapMetric {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TapMetric[] $VALUES;

    @NotNull
    private final String token;
    public static final TapMetric TTFR = new TapMetric("TTFR", 0, "TTFR");
    public static final TapMetric TTAC = new TapMetric("TTAC", 1, "TTAC");
    public static final TapMetric TTLR = new TapMetric("TTLR", 2, "TTLR");

    private static final /* synthetic */ TapMetric[] $values() {
        return new TapMetric[]{TTFR, TTAC, TTLR};
    }

    static {
        TapMetric[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TapMetric(String str, int i, String str2) {
        this.token = str2;
    }

    @NotNull
    public static EnumEntries<TapMetric> getEntries() {
        return $ENTRIES;
    }

    public static TapMetric valueOf(String str) {
        return (TapMetric) Enum.valueOf(TapMetric.class, str);
    }

    public static TapMetric[] values() {
        return (TapMetric[]) $VALUES.clone();
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }
}
