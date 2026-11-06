package com.amazon.alexa.ra.apl.fragments.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/enums/MetricEvent;", "", "<init>", "(Ljava/lang/String;I)V", "APL_PAYLOAD_RECEIVED_FRAGMENT", "APL_DOCUMENT_STATE_DISPLAYED_FRAGMENT", "APL_DOCUMENT_STATE_ERROR_FRAGMENT", "APL_RENDER_LATENCY_FRAGMENT", "APL_FCE_EXPAND_EVENT", "APL_FCE_LIGHTBOX_EXPAND_EVENT", "APL_LIGHTBOX_SWIPE_COUNT", "APL_FCE_INVOKE_OPERATION_EVENT", "APL_FCE_TEXT_MESSAGE_EVENT", "APL_USER_EVENT_FRAGMENT", "APL_OPEN_URL_SUCCESS", "APL_OPEN_URL_FAILURE", "APL_FRAGMENT_PRESSED", "APL_FRAGMENT_GET_CACHED_VIEW", "APL_FRAGMENT_CACHE_VIEW", "APL_FRAGMENT_CREATE_VIEW", "APL_FRAGMENT_MARK_UNUSED_VIEW", "APL_FRAGMENT_REMOVE_UNUSED_VIEWS", "APL_FRAGMENT_CLEAR_CACHE", "APL_FRAGMENT_MEMORY_PRESSURE", "APL_FRAGMENT_THEME_CHANGE", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MetricEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricEvent[] $VALUES;
    public static final MetricEvent APL_PAYLOAD_RECEIVED_FRAGMENT = new MetricEvent("APL_PAYLOAD_RECEIVED_FRAGMENT", 0);
    public static final MetricEvent APL_DOCUMENT_STATE_DISPLAYED_FRAGMENT = new MetricEvent("APL_DOCUMENT_STATE_DISPLAYED_FRAGMENT", 1);
    public static final MetricEvent APL_DOCUMENT_STATE_ERROR_FRAGMENT = new MetricEvent("APL_DOCUMENT_STATE_ERROR_FRAGMENT", 2);
    public static final MetricEvent APL_RENDER_LATENCY_FRAGMENT = new MetricEvent("APL_RENDER_LATENCY_FRAGMENT", 3);
    public static final MetricEvent APL_FCE_EXPAND_EVENT = new MetricEvent("APL_FCE_EXPAND_EVENT", 4);
    public static final MetricEvent APL_FCE_LIGHTBOX_EXPAND_EVENT = new MetricEvent("APL_FCE_LIGHTBOX_EXPAND_EVENT", 5);
    public static final MetricEvent APL_LIGHTBOX_SWIPE_COUNT = new MetricEvent("APL_LIGHTBOX_SWIPE_COUNT", 6);
    public static final MetricEvent APL_FCE_INVOKE_OPERATION_EVENT = new MetricEvent("APL_FCE_INVOKE_OPERATION_EVENT", 7);
    public static final MetricEvent APL_FCE_TEXT_MESSAGE_EVENT = new MetricEvent("APL_FCE_TEXT_MESSAGE_EVENT", 8);
    public static final MetricEvent APL_USER_EVENT_FRAGMENT = new MetricEvent("APL_USER_EVENT_FRAGMENT", 9);
    public static final MetricEvent APL_OPEN_URL_SUCCESS = new MetricEvent("APL_OPEN_URL_SUCCESS", 10);
    public static final MetricEvent APL_OPEN_URL_FAILURE = new MetricEvent("APL_OPEN_URL_FAILURE", 11);
    public static final MetricEvent APL_FRAGMENT_PRESSED = new MetricEvent("APL_FRAGMENT_PRESSED", 12);
    public static final MetricEvent APL_FRAGMENT_GET_CACHED_VIEW = new MetricEvent("APL_FRAGMENT_GET_CACHED_VIEW", 13);
    public static final MetricEvent APL_FRAGMENT_CACHE_VIEW = new MetricEvent("APL_FRAGMENT_CACHE_VIEW", 14);
    public static final MetricEvent APL_FRAGMENT_CREATE_VIEW = new MetricEvent("APL_FRAGMENT_CREATE_VIEW", 15);
    public static final MetricEvent APL_FRAGMENT_MARK_UNUSED_VIEW = new MetricEvent("APL_FRAGMENT_MARK_UNUSED_VIEW", 16);
    public static final MetricEvent APL_FRAGMENT_REMOVE_UNUSED_VIEWS = new MetricEvent("APL_FRAGMENT_REMOVE_UNUSED_VIEWS", 17);
    public static final MetricEvent APL_FRAGMENT_CLEAR_CACHE = new MetricEvent("APL_FRAGMENT_CLEAR_CACHE", 18);
    public static final MetricEvent APL_FRAGMENT_MEMORY_PRESSURE = new MetricEvent("APL_FRAGMENT_MEMORY_PRESSURE", 19);
    public static final MetricEvent APL_FRAGMENT_THEME_CHANGE = new MetricEvent("APL_FRAGMENT_THEME_CHANGE", 20);

    private static final /* synthetic */ MetricEvent[] $values() {
        return new MetricEvent[]{APL_PAYLOAD_RECEIVED_FRAGMENT, APL_DOCUMENT_STATE_DISPLAYED_FRAGMENT, APL_DOCUMENT_STATE_ERROR_FRAGMENT, APL_RENDER_LATENCY_FRAGMENT, APL_FCE_EXPAND_EVENT, APL_FCE_LIGHTBOX_EXPAND_EVENT, APL_LIGHTBOX_SWIPE_COUNT, APL_FCE_INVOKE_OPERATION_EVENT, APL_FCE_TEXT_MESSAGE_EVENT, APL_USER_EVENT_FRAGMENT, APL_OPEN_URL_SUCCESS, APL_OPEN_URL_FAILURE, APL_FRAGMENT_PRESSED, APL_FRAGMENT_GET_CACHED_VIEW, APL_FRAGMENT_CACHE_VIEW, APL_FRAGMENT_CREATE_VIEW, APL_FRAGMENT_MARK_UNUSED_VIEW, APL_FRAGMENT_REMOVE_UNUSED_VIEWS, APL_FRAGMENT_CLEAR_CACHE, APL_FRAGMENT_MEMORY_PRESSURE, APL_FRAGMENT_THEME_CHANGE};
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
