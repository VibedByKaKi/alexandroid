package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface InternalEventClient extends EventClient {
    void addEventObserver(EventObserver eventObserver);

    AnalyticsEvent createEvent(String str, boolean z);

    InternalEvent createInternalEvent(String str, long j, Long l, Long l2);

    String getSessionId();

    long getSessionStartTime();

    void removeEventObserver(EventObserver eventObserver);

    void setSessionId(String str);

    void setSessionStartTime(long j);
}
