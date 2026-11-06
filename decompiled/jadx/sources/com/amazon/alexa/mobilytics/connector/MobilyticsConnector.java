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
public interface MobilyticsConnector {
    void flush();

    String name();

    void onEntitlementStatusChanged(@Nullable MobilyticsEntitlementStatus mobilyticsEntitlementStatus);

    void onFinalize();

    void onInitialize(@NonNull MobilyticsConfiguration mobilyticsConfiguration);

    void onRecordEvent(@NonNull MobilyticsEvent mobilyticsEvent);

    void onRouteChanged(@Nullable MobilyticsRoute mobilyticsRoute);

    void onSessionPause(@NonNull MobilyticsSession mobilyticsSession);

    void onSessionResume(@NonNull MobilyticsSession mobilyticsSession);

    void onSessionStart(@NonNull MobilyticsSession mobilyticsSession);

    void onSessionStop(@NonNull MobilyticsSession mobilyticsSession);

    void onUserChanged(@Nullable MobilyticsUser mobilyticsUser);

    default void onEndpointsChanged() {
    }
}
