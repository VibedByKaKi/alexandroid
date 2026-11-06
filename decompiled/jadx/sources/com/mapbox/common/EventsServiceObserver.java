package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.Value;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface EventsServiceObserver {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void didEncounterError(@NonNull EventsServiceError eventsServiceError, @NonNull Value value);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void didSendEvents(@NonNull Value value);
}
