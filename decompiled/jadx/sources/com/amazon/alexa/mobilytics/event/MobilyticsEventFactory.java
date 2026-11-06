package com.amazon.alexa.mobilytics.event;

import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsEventFactory {
    @Nullable
    MobilyticsOperationalEvent getOperationalEvent(@Nullable String str, @Nullable String str2, @Nullable Map<String, Object> map);

    @Nullable
    MobilyticsUserInteractionEvent getUserInteractionEvent(@Nullable String str, @Nullable String str2, @Nullable Map<String, Object> map);
}
