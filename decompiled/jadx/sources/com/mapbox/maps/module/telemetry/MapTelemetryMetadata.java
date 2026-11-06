package com.mapbox.maps.module.telemetry;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryMetadata;", "", "uiFramework", "Lcom/mapbox/maps/module/telemetry/UiFramework;", "(Lcom/mapbox/maps/module/telemetry/UiFramework;)V", "getUiFramework", "()Lcom/mapbox/maps/module/telemetry/UiFramework;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes9.dex */
public final class MapTelemetryMetadata {

    @Nullable
    private final UiFramework uiFramework;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryMetadata$Builder;", "", "()V", "uiFramework", "Lcom/mapbox/maps/module/telemetry/UiFramework;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/module/telemetry/MapTelemetryMetadata;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private UiFramework uiFramework;

        @NotNull
        public final MapTelemetryMetadata build() {
            return new MapTelemetryMetadata(this.uiFramework, null);
        }

        @NotNull
        public final Builder uiFramework(@Nullable UiFramework uiFramework) {
            this.uiFramework = uiFramework;
            return this;
        }
    }

    private MapTelemetryMetadata(UiFramework uiFramework) {
        this.uiFramework = uiFramework;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof MapTelemetryMetadata) && Intrinsics.areEqual(this.uiFramework, ((MapTelemetryMetadata) other).uiFramework);
    }

    @Nullable
    public final UiFramework getUiFramework() {
        return this.uiFramework;
    }

    public int hashCode() {
        UiFramework uiFramework = this.uiFramework;
        if (uiFramework != null) {
            return uiFramework.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "MapTelemetryMetadata(uiFramework=" + this.uiFramework + ')';
    }

    public /* synthetic */ MapTelemetryMetadata(UiFramework uiFramework, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiFramework);
    }
}
