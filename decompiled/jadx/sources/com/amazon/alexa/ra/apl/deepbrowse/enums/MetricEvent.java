package com.amazon.alexa.ra.apl.deepbrowse.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/enums/MetricEvent;", "", "<init>", "(Ljava/lang/String;I)V", "APL_PAYLOAD_RECEIVED_DEEPBROWSE", "APL_DOCUMENT_STATE_DISPLAYED_DEEPBROWSE", "APL_DOCUMENT_STATE_ERROR_DEEPBROWSE", "APL_RENDER_LATENCY_DEEPBROWSE", "APL_USER_EVENT_DEEPBROWSE", "APL_DEEPBROWSE_VIEW_RENDERED", "APL_DEEPBROWSE_VIEW_DISMISSED", "APL_OPEN_URL_SUCCESS", "APL_OPEN_URL_FAILURE", "APL_LOAD_TOKEN_LIST_DATA", "APL_LOAD_INDEX_LIST_DATA", "APL_OPEN_DEEPBROWSE_LATENCY", "APL_DEEPBROWSE_DIRECTIVE_DROPPED_AT_INGEST", "APL_DEEPBROWSE_DIRECTIVE_DROPPED_TOKEN_MISMATCH", "APL_DEEPBROWSE_HELD_DIRECTIVE_DISCARDED", "APL_DEEPBROWSE_NAVIGATION_CANCELLED", "APL_DEEPBROWSE_NAVIGATION_REJECTED", "APL_DEEPBROWSE_RENDER_NOT_PERFORMED", "APL_DEEPBROWSE_DIRECTIVE_HANDLING_FAILED", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MetricEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricEvent[] $VALUES;
    public static final MetricEvent APL_PAYLOAD_RECEIVED_DEEPBROWSE = new MetricEvent("APL_PAYLOAD_RECEIVED_DEEPBROWSE", 0);
    public static final MetricEvent APL_DOCUMENT_STATE_DISPLAYED_DEEPBROWSE = new MetricEvent("APL_DOCUMENT_STATE_DISPLAYED_DEEPBROWSE", 1);
    public static final MetricEvent APL_DOCUMENT_STATE_ERROR_DEEPBROWSE = new MetricEvent("APL_DOCUMENT_STATE_ERROR_DEEPBROWSE", 2);
    public static final MetricEvent APL_RENDER_LATENCY_DEEPBROWSE = new MetricEvent("APL_RENDER_LATENCY_DEEPBROWSE", 3);
    public static final MetricEvent APL_USER_EVENT_DEEPBROWSE = new MetricEvent("APL_USER_EVENT_DEEPBROWSE", 4);
    public static final MetricEvent APL_DEEPBROWSE_VIEW_RENDERED = new MetricEvent("APL_DEEPBROWSE_VIEW_RENDERED", 5);
    public static final MetricEvent APL_DEEPBROWSE_VIEW_DISMISSED = new MetricEvent("APL_DEEPBROWSE_VIEW_DISMISSED", 6);
    public static final MetricEvent APL_OPEN_URL_SUCCESS = new MetricEvent("APL_OPEN_URL_SUCCESS", 7);
    public static final MetricEvent APL_OPEN_URL_FAILURE = new MetricEvent("APL_OPEN_URL_FAILURE", 8);
    public static final MetricEvent APL_LOAD_TOKEN_LIST_DATA = new MetricEvent("APL_LOAD_TOKEN_LIST_DATA", 9);
    public static final MetricEvent APL_LOAD_INDEX_LIST_DATA = new MetricEvent("APL_LOAD_INDEX_LIST_DATA", 10);
    public static final MetricEvent APL_OPEN_DEEPBROWSE_LATENCY = new MetricEvent("APL_OPEN_DEEPBROWSE_LATENCY", 11);
    public static final MetricEvent APL_DEEPBROWSE_DIRECTIVE_DROPPED_AT_INGEST = new MetricEvent("APL_DEEPBROWSE_DIRECTIVE_DROPPED_AT_INGEST", 12);
    public static final MetricEvent APL_DEEPBROWSE_DIRECTIVE_DROPPED_TOKEN_MISMATCH = new MetricEvent("APL_DEEPBROWSE_DIRECTIVE_DROPPED_TOKEN_MISMATCH", 13);
    public static final MetricEvent APL_DEEPBROWSE_HELD_DIRECTIVE_DISCARDED = new MetricEvent("APL_DEEPBROWSE_HELD_DIRECTIVE_DISCARDED", 14);
    public static final MetricEvent APL_DEEPBROWSE_NAVIGATION_CANCELLED = new MetricEvent("APL_DEEPBROWSE_NAVIGATION_CANCELLED", 15);
    public static final MetricEvent APL_DEEPBROWSE_NAVIGATION_REJECTED = new MetricEvent("APL_DEEPBROWSE_NAVIGATION_REJECTED", 16);
    public static final MetricEvent APL_DEEPBROWSE_RENDER_NOT_PERFORMED = new MetricEvent("APL_DEEPBROWSE_RENDER_NOT_PERFORMED", 17);
    public static final MetricEvent APL_DEEPBROWSE_DIRECTIVE_HANDLING_FAILED = new MetricEvent("APL_DEEPBROWSE_DIRECTIVE_HANDLING_FAILED", 18);

    private static final /* synthetic */ MetricEvent[] $values() {
        return new MetricEvent[]{APL_PAYLOAD_RECEIVED_DEEPBROWSE, APL_DOCUMENT_STATE_DISPLAYED_DEEPBROWSE, APL_DOCUMENT_STATE_ERROR_DEEPBROWSE, APL_RENDER_LATENCY_DEEPBROWSE, APL_USER_EVENT_DEEPBROWSE, APL_DEEPBROWSE_VIEW_RENDERED, APL_DEEPBROWSE_VIEW_DISMISSED, APL_OPEN_URL_SUCCESS, APL_OPEN_URL_FAILURE, APL_LOAD_TOKEN_LIST_DATA, APL_LOAD_INDEX_LIST_DATA, APL_OPEN_DEEPBROWSE_LATENCY, APL_DEEPBROWSE_DIRECTIVE_DROPPED_AT_INGEST, APL_DEEPBROWSE_DIRECTIVE_DROPPED_TOKEN_MISMATCH, APL_DEEPBROWSE_HELD_DIRECTIVE_DISCARDED, APL_DEEPBROWSE_NAVIGATION_CANCELLED, APL_DEEPBROWSE_NAVIGATION_REJECTED, APL_DEEPBROWSE_RENDER_NOT_PERFORMED, APL_DEEPBROWSE_DIRECTIVE_HANDLING_FAILED};
    }

    static {
        MetricEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MetricEvent(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MetricEvent> getEntries() {
        return $ENTRIES;
    }

    public static MetricEvent valueOf(String str) {
        return (MetricEvent) Enum.valueOf(MetricEvent.class, str);
    }

    public static MetricEvent[] values() {
        return (MetricEvent[]) $VALUES.clone();
    }
}
