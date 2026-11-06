package com.amazon.alexa.ra.android.smartfragment.metrics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/metrics/MetricName;", "", "<init>", "(Ljava/lang/String;I)V", "SMARTFRAGMENT_PAYLOAD_RECEIVED", "SMARTFRAGMENT_BRIDGE_ACQUIRE_LATENCY", "SMARTFRAGMENT_BRIDGE_ACQUIRE_FAILURE", "SMARTFRAGMENT_JS_LOAD_LATENCY", "SMARTFRAGMENT_TOTAL_LOAD_LATENCY", "SMARTFRAGMENT_VIEW_TEARDOWN_FAILURE", "SMARTFRAGMENT_BRIDGE_REACQUIRE_FAILURE", "SMARTFRAGMENT_MAP_TOKEN_REQUEST", "SMARTFRAGMENT_HIDDEN", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MetricName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricName[] $VALUES;
    public static final MetricName SMARTFRAGMENT_PAYLOAD_RECEIVED = new MetricName("SMARTFRAGMENT_PAYLOAD_RECEIVED", 0);
    public static final MetricName SMARTFRAGMENT_BRIDGE_ACQUIRE_LATENCY = new MetricName("SMARTFRAGMENT_BRIDGE_ACQUIRE_LATENCY", 1);
    public static final MetricName SMARTFRAGMENT_BRIDGE_ACQUIRE_FAILURE = new MetricName("SMARTFRAGMENT_BRIDGE_ACQUIRE_FAILURE", 2);
    public static final MetricName SMARTFRAGMENT_JS_LOAD_LATENCY = new MetricName("SMARTFRAGMENT_JS_LOAD_LATENCY", 3);
    public static final MetricName SMARTFRAGMENT_TOTAL_LOAD_LATENCY = new MetricName("SMARTFRAGMENT_TOTAL_LOAD_LATENCY", 4);
    public static final MetricName SMARTFRAGMENT_VIEW_TEARDOWN_FAILURE = new MetricName("SMARTFRAGMENT_VIEW_TEARDOWN_FAILURE", 5);
    public static final MetricName SMARTFRAGMENT_BRIDGE_REACQUIRE_FAILURE = new MetricName("SMARTFRAGMENT_BRIDGE_REACQUIRE_FAILURE", 6);
    public static final MetricName SMARTFRAGMENT_MAP_TOKEN_REQUEST = new MetricName("SMARTFRAGMENT_MAP_TOKEN_REQUEST", 7);
    public static final MetricName SMARTFRAGMENT_HIDDEN = new MetricName("SMARTFRAGMENT_HIDDEN", 8);

    private static final /* synthetic */ MetricName[] $values() {
        return new MetricName[]{SMARTFRAGMENT_PAYLOAD_RECEIVED, SMARTFRAGMENT_BRIDGE_ACQUIRE_LATENCY, SMARTFRAGMENT_BRIDGE_ACQUIRE_FAILURE, SMARTFRAGMENT_JS_LOAD_LATENCY, SMARTFRAGMENT_TOTAL_LOAD_LATENCY, SMARTFRAGMENT_VIEW_TEARDOWN_FAILURE, SMARTFRAGMENT_BRIDGE_REACQUIRE_FAILURE, SMARTFRAGMENT_MAP_TOKEN_REQUEST, SMARTFRAGMENT_HIDDEN};
    }

    static {
        MetricName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MetricName(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MetricName> getEntries() {
        return $ENTRIES;
    }

    public static MetricName valueOf(String str) {
        return (MetricName) Enum.valueOf(MetricName.class, str);
    }

    public static MetricName[] values() {
        return (MetricName[]) $VALUES.clone();
    }
}
