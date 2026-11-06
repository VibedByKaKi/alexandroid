package com.amazon.alexa.mobilytics.event.operational;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsOperationalEvent extends MobilyticsEvent {
    @Nullable
    Map<String, String> getDebugInfo();

    @NonNull
    Long getEventNumericValue();

    String getOperationalEventType();
}
