package com.amazon.alexa.voice.metrics;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface MetricsBridge {
    void reportEvent(String str);

    void reportEvent(String str, String str2, Map<String, Object> map);

    void reportOccurrence(String str, String str2, boolean z, Map<String, Object> map);

    void reportTimer(String str, String str2, long j, Map<String, Object> map);

    void startTimerWhenTappingIngressButtonOnCard();
}
