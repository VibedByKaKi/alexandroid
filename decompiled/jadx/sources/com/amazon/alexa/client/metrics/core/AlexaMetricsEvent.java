package com.amazon.alexa.client.metrics.core;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes17.dex */
public interface AlexaMetricsEvent {
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 0;

    String getComponentName();

    Map<String, Object> getCustomEntries();

    long getEventDate();

    String getEventName();

    void invalidateEvent();

    boolean isInvalidated();
}
