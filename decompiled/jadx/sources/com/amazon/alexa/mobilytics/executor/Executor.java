package com.amazon.alexa.mobilytics.executor;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.timeline.TimelineMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface Executor {
    void executeRecordBIEvent(@NonNull MobilyticsEvent mobilyticsEvent);

    void executeRecordEvent(@NonNull MobilyticsEvent mobilyticsEvent);

    void executeTimelineEvent(TimelineMessage timelineMessage);
}
