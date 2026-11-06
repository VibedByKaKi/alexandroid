package com.mapbox.maps.plugin.viewport.data;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "", "maxDurationMs", "", "(J)V", "getMaxDurationMs", "()J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toBuilder", "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions$Builder;", "toString", "", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DefaultViewportTransitionOptions {
    private final long maxDurationMs;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions$Builder;", "", "()V", "maxDurationMs", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private long maxDurationMs = 3500;

        @NotNull
        public final DefaultViewportTransitionOptions build() {
            return new DefaultViewportTransitionOptions(this.maxDurationMs, null);
        }

        @NotNull
        public final Builder maxDurationMs(long maxDurationMs) {
            this.maxDurationMs = maxDurationMs;
            return this;
        }
    }

    private DefaultViewportTransitionOptions(long j) {
        this.maxDurationMs = j;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof DefaultViewportTransitionOptions) && this.maxDurationMs == ((DefaultViewportTransitionOptions) other).maxDurationMs;
    }

    public final long getMaxDurationMs() {
        return this.maxDurationMs;
    }

    public int hashCode() {
        return Long.hashCode(this.maxDurationMs);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().maxDurationMs(this.maxDurationMs);
    }

    @NotNull
    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m(new StringBuilder("DefaultViewportTransitionOptions(maxDurationMs="), this.maxDurationMs, ')');
    }

    public /* synthetic */ DefaultViewportTransitionOptions(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
