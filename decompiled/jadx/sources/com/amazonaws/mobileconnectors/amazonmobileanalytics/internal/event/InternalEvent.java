package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONSerializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface InternalEvent extends AnalyticsEvent, JSONSerializable {
    ClientContext createClientContext(String str);

    Long getEventTimestamp();

    String getSdkName();

    String getSdkVersion();

    Long getSessionDuration();

    String getSessionId();

    long getSessionStart();

    Long getSessionStop();

    Id getUniqueId();
}
