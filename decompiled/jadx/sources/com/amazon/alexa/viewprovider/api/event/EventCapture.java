package com.amazon.alexa.viewprovider.api.event;

import com.amazon.alexa.viewprovider.api.event.personalization.InteractionEventData;
import java.util.Map;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface EventCapture {
    void captureClick(InteractionEventData interactionEventData);

    Observable<Map<String, String>> getShfCache(String str, boolean z);

    boolean hasActivityRedesign();
}
