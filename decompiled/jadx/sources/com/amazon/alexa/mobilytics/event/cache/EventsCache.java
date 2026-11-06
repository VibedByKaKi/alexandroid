package com.amazon.alexa.mobilytics.event.cache;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface EventsCache {
    boolean clear();

    List<MobilyticsEvent> events();

    void onInitialize(@NonNull MobilyticsConfiguration mobilyticsConfiguration);

    long size();

    boolean store(MobilyticsEvent mobilyticsEvent);
}
