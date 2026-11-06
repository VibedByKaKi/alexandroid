package com.amazon.apl.devtools.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum EventMethod {
    VIEW_STATE_CHANGE(VIEW_STATE_CHANGE_TEXT),
    LOG_ENTRY_ADDED(LOG_ENTRY_ADDED_TEXT),
    NETWORK_REQUEST_WILL_BE_SENT(NETWORK_REQUEST_WILL_BE_SENT_TEXT),
    NETWORK_LOADING_FAILED(NETWORK_LOADING_FAILED_TEXT),
    NETWORK_LOADING_FINISHED(NETWORK_LOADING_FINISHED_TEXT),
    PERFORMANCE_METRIC(PERFORMANCE_METRIC_TEXT),
    FRAMEMETRICS_INCIDENT_REPORTED(FRAMEMETRICS_INCIDENT_REPORTED_TEXT),
    FRAMEMETRICS_INCIDENT_ENDED(FRAMEMETRICS_INCIDENT_ENDED_TEXT),
    SESSION_RECORDER_EVENT_REPORTED(SESSION_RECORDER_EVENT_REPORTED_TEXT);

    private static final String FRAMEMETRICS_INCIDENT_ENDED_TEXT = "FrameMetrics.incidentEnded";
    private static final String FRAMEMETRICS_INCIDENT_REPORTED_TEXT = "FrameMetrics.incidentReported";
    private static final String LOG_ENTRY_ADDED_TEXT = "Log.entryAdded";
    private static final String NETWORK_LOADING_FAILED_TEXT = "Network.loadingFailed";
    private static final String NETWORK_LOADING_FINISHED_TEXT = "Network.loadingFinished";
    private static final String NETWORK_REQUEST_WILL_BE_SENT_TEXT = "Network.requestWillBeSent";
    private static final String PERFORMANCE_METRIC_TEXT = "Performance.metrics";
    private static final String SESSION_RECORDER_EVENT_REPORTED_TEXT = "SessionRecorder.eventReported";
    private static final String VIEW_STATE_CHANGE_TEXT = "View.stateChange";
    private final String mEventMethodText;

    EventMethod(String str) {
        this.mEventMethodText = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.mEventMethodText;
    }
}
