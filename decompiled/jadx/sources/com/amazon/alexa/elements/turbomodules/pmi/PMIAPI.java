package com.amazon.alexa.elements.turbomodules.pmi;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface PMIAPI {
    void endTimeline(double d, @Nullable String str);

    void mark(double d, String str, @Nullable ReadableMap readableMap);

    double startRootTimeline(String str, @Nullable ReadableArray readableArray, String str2, double d);

    @Nullable
    Double startTimeline(String str, @Nullable ReadableArray readableArray, String str2, @Nullable Double d);
}
