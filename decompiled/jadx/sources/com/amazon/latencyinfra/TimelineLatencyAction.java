package com.amazon.latencyinfra;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum TimelineLatencyAction {
    START_RECORD_TIMELINE("startTimeline"),
    RECORD_EVENT_IN_TIMELINE("record"),
    RECORD_CACHED_EVENTS_IN_TIMELINE("recrodEvents"),
    END_TIMELINE("endTimeline"),
    RECORD_TIMELINE_WITH_CACHED_START_AND_END_TIMESTAMP("recordWithData");

    private final String type;

    TimelineLatencyAction(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
