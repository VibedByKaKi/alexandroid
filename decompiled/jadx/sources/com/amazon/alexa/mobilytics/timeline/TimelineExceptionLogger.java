package com.amazon.alexa.mobilytics.timeline;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class TimelineExceptionLogger {
    private static final String ILLEGAL_STATE_EXCEPTION = "IllegalStateException";
    private static final String INVALID_INPUT = "InvalidInputException";
    private static final String INVALID_STATE_TRANSITION_EXCEPTION = "InvalidStateTransitionException";
    private static final String LOG_TAG = "TimelineExceptionLogger";
    public static final String NO_SUCH_TIMELINE_EXCEPTION = "NoSuchTimelineException";
    public static final String PARAM_MOBILYTICS_EVENT = "Event";
    public static final String PARAM_TIMELINE_ABORT_REASON = "AbortReason";
    public static final String PARAM_TIMELINE_NAME = "TimelineName";
    public static final String PARAM_TIMELINE_NAMESPACE = "TimelineNamespace";
    public static final String TIMELINE_ALREADY_EXISTS_EXCEPTION = "TimelineAlreadyExistsException";

    private TimelineExceptionLogger() {
    }

    public static void logException(String str, String str2, String str3) {
        String str4 = LOG_TAG;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("\n", str, "\nTimeline name: ", str2, "\nTimeline namespace: ");
        m.append(str3);
        Log.e(str4, m.toString());
    }

    public static void logIllegalStateToRecord(MobilyticsEvent mobilyticsEvent, TimelineEvent timelineEvent) {
        StringBuilder sb = new StringBuilder("\nIllegalStateException: Event not recordable on timeline with current state.");
        if (mobilyticsEvent != null) {
            sb.append("\nEvent name: " + mobilyticsEvent.getEventName());
        }
        sb.append("\nTimeline name: " + timelineEvent.timelineName());
        sb.append("\nTimeline namespace: " + timelineEvent.timelineNamespace());
        sb.append("\nTimeline state: " + timelineEvent.stateString());
        Log.e(LOG_TAG, sb.toString());
    }

    public static void logInvalidInput(@NonNull String str) {
        Log.e(LOG_TAG, "InvalidInputException: " + str + " is required and can't be null or empty.");
    }

    public static void logInvalidStateTransition(String str, TimelineEvent timelineEvent) {
        StringBuilder sb = new StringBuilder("\nInvalidStateTransitionException:");
        sb.append("\nTimeline name: " + timelineEvent.timelineName());
        sb.append("\nTimeline namespace: " + timelineEvent.timelineNamespace());
        sb.append("\nTimeline current state: " + timelineEvent.stateString());
        sb.append("\nTimeline target state: " + str);
        Log.e(LOG_TAG, sb.toString());
    }
}
