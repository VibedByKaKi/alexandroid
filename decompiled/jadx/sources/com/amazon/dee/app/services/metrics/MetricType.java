package com.amazon.dee.app.services.metrics;

import com.amazon.alexa.location.utils.MetricsUtil;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/dee/app/services/metrics/MetricType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TIME", "COUNT", "FAULT", "LIMIT", "AVAILABILITY", "DATA", "toString", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MetricType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricType[] $VALUES;

    @NotNull
    private final String type;
    public static final MetricType TIME = new MetricType("TIME", 0, "time");
    public static final MetricType COUNT = new MetricType("COUNT", 1, "count");
    public static final MetricType FAULT = new MetricType("FAULT", 2, MetricsUtil.LegacyMetricTypes.FAULT);
    public static final MetricType LIMIT = new MetricType("LIMIT", 3, "limit");
    public static final MetricType AVAILABILITY = new MetricType("AVAILABILITY", 4, MetricsUtil.LegacyMetricTypes.AVAILABILITY);
    public static final MetricType DATA = new MetricType("DATA", 5, "");

    private static final /* synthetic */ MetricType[] $values() {
        return new MetricType[]{TIME, COUNT, FAULT, LIMIT, AVAILABILITY, DATA};
    }

    static {
        MetricType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MetricType(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<MetricType> getEntries() {
        return $ENTRIES;
    }

    public static MetricType valueOf(String str) {
        return (MetricType) Enum.valueOf(MetricType.class, str);
    }

    public static MetricType[] values() {
        return (MetricType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.type;
    }
}
