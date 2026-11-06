package com.amazon.alexa.elements.turbomodules.metrics;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsMetricsTurbomoduleAPI {
    void manageTimeline(String str, String str2, String str3, String str4, Promise promise);

    void manageTimelineWithOwnerID(String str, String str2, String str3, String str4, String str5, Promise promise);

    void record(String str, String str2, String str3, ReadableMap readableMap);

    void recordWithTimeline(String str, String str2, String str3, String str4, String str5, ReadableMap readableMap, Promise promise);
}
