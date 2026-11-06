package com.mapbox.maps.plugin.viewport.util;

import com.mapbox.maps.module.TelemetryEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/util/ViewportTelemetryEvents;", "", "()V", "stateFollowPuck", "Lcom/mapbox/maps/module/TelemetryEvent;", "getStateFollowPuck", "()Lcom/mapbox/maps/module/TelemetryEvent;", "stateOverview", "getStateOverview", "stateTransition", "getStateTransition", "plugin-viewport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ViewportTelemetryEvents {

    @NotNull
    public static final ViewportTelemetryEvents INSTANCE = new ViewportTelemetryEvents();

    @NotNull
    private static final TelemetryEvent stateFollowPuck;

    @NotNull
    private static final TelemetryEvent stateOverview;

    @NotNull
    private static final TelemetryEvent stateTransition;

    static {
        TelemetryEvent.Companion companion = TelemetryEvent.INSTANCE;
        stateFollowPuck = companion.create("viewport/state/follow-puck");
        stateOverview = companion.create("viewport/state/overview");
        stateTransition = companion.create("viewport/state/transition");
    }

    private ViewportTelemetryEvents() {
    }

    @NotNull
    public final TelemetryEvent getStateFollowPuck() {
        return stateFollowPuck;
    }

    @NotNull
    public final TelemetryEvent getStateOverview() {
        return stateOverview;
    }

    @NotNull
    public final TelemetryEvent getStateTransition() {
        return stateTransition;
    }
}
