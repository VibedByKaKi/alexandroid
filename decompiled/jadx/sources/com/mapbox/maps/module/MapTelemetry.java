package com.mapbox.maps.module;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.mapbox.common.TelemetryUtils;
import com.mapbox.maps.module.telemetry.MapTelemetryMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface MapTelemetry {
    void disableTelemetrySession();

    default boolean getUserTelemetryRequestState() {
        return TelemetryUtils.getEventsCollectionState();
    }

    void onAppUserTurnstileEvent();

    default void onAppUserTurnstileEvent(@Nullable MapTelemetryMetadata mapTelemetryMetadata) {
        onAppUserTurnstileEvent();
    }

    void onPerformanceEvent(@Nullable Bundle bundle);

    void setUserTelemetryRequestState(boolean z);
}
