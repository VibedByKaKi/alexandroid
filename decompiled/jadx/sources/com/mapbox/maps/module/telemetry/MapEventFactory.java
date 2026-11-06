package com.mapbox.maps.module.telemetry;

import android.os.Bundle;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.mapbox.common.TelemetrySystemUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapEventFactory;", "", "()V", "buildMapLoadEvent", "Lcom/mapbox/maps/module/telemetry/MapLoadEvent;", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "metadata", "Lcom/mapbox/maps/module/telemetry/MapTelemetryMetadata;", "buildPerformanceEvent", "Lcom/mapbox/maps/module/telemetry/PerformanceEvent;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "data", "Landroid/os/Bundle;", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class MapEventFactory {

    @NotNull
    public static final MapEventFactory INSTANCE = new MapEventFactory();

    private MapEventFactory() {
    }

    @NotNull
    public final MapLoadEvent buildMapLoadEvent(@NotNull PhoneState phoneState, @Nullable MapTelemetryMetadata metadata) {
        UiFramework uiFramework;
        phoneState.getClass();
        return new MapLoadEvent(TelemetrySystemUtils.obtainUniversalUniqueIdentifier(), (metadata == null || (uiFramework = metadata.getUiFramework()) == null) ? null : uiFramework.getValue(), phoneState);
    }

    @NotNull
    public final PerformanceEvent buildPerformanceEvent(@NotNull PhoneState phoneState, @NotNull String sessionId, @NotNull Bundle data) {
        phoneState.getClass();
        sessionId.getClass();
        data.getClass();
        return new PerformanceEvent(phoneState, sessionId, data);
    }

    @NotNull
    public final MapLoadEvent buildMapLoadEvent(@NotNull PhoneState phoneState) {
        phoneState.getClass();
        return buildMapLoadEvent(phoneState, null);
    }
}
