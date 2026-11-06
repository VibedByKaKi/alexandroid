package com.amazon.alexa.mobilytics.connector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus;
import com.amazon.alexa.mobilytics.identity.MobilyticsRoute;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.session.MobilyticsSession;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface ConnectorExecutor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        ConnectorExecutor create(@NonNull MobilyticsConnector mobilyticsConnector);
    }

    String connectorName();

    void executeEndpointsChanged();

    void executeOnEntitlementStatusChanged(@Nullable MobilyticsEntitlementStatus mobilyticsEntitlementStatus);

    void executeOnFinalize();

    void executeOnInitialize(@NonNull MobilyticsConfiguration mobilyticsConfiguration);

    void executeRecordEvent(@NonNull MobilyticsEvent mobilyticsEvent);

    void executeRecordInternalEvent(@NonNull MobilyticsEvent mobilyticsEvent);

    void executeRouteChanged(@Nullable MobilyticsRoute mobilyticsRoute);

    void executeSessionPause(@NonNull MobilyticsSession mobilyticsSession);

    void executeSessionResume(@NonNull MobilyticsSession mobilyticsSession);

    void executeSessionStart(@NonNull MobilyticsSession mobilyticsSession);

    void executeSessionStop(@NonNull MobilyticsSession mobilyticsSession);

    void executeUserChanged(@Nullable MobilyticsUser mobilyticsUser);

    void flush();
}
