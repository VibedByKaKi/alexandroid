package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public interface EventsServiceInterface {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void flush(@Nullable FlushOperationResultCallback flushOperationResultCallback);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void registerObserver(@NonNull EventsServiceObserver eventsServiceObserver);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void sendCrashEvent(@NonNull CrashEvent crashEvent, @Nullable EventsServiceResponseCallback eventsServiceResponseCallback);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void sendEvent(@NonNull Event event, @Nullable EventsServiceResponseCallback eventsServiceResponseCallback);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void sendTurnstileEvent(@NonNull TurnstileEvent turnstileEvent, @Nullable EventsServiceResponseCallback eventsServiceResponseCallback);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void unregisterObserver(@NonNull EventsServiceObserver eventsServiceObserver);
}
