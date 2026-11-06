package com.mapbox.common.geofencing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingObserver;", "", "onDwell", "", "event", "Lcom/mapbox/common/geofencing/GeofencingEvent;", "onEntry", "onError", "error", "Lcom/mapbox/common/geofencing/GeofencingError;", "onExit", "onUserConsentChanged", "isConsentGiven", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface GeofencingObserver {
    void onDwell(@NotNull GeofencingEvent event);

    void onEntry(@NotNull GeofencingEvent event);

    void onError(@NotNull GeofencingError error);

    void onExit(@NotNull GeofencingEvent event);

    void onUserConsentChanged(boolean isConsentGiven);
}
