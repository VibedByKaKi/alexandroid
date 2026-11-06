package com.google.ads.interactivemedia.v3.api;

import androidx.annotation.InspectableProperty;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class AdEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AdEventListener {
        void onAdEvent(AdEvent adEvent);
    }

    public abstract Map<String, String> getAdData();

    public abstract InspectableProperty getType();
}
