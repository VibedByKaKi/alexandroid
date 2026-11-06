package com.mapbox.common.geofencing;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.geojson.Feature;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/geofencing/GeofenceState;", "Ljava/io/Serializable;", "feature", "Lcom/mapbox/geojson/Feature;", "timestamp", "Ljava/util/Date;", "(Lcom/mapbox/geojson/Feature;Ljava/util/Date;)V", "getFeature", "()Lcom/mapbox/geojson/Feature;", "getTimestamp", "()Ljava/util/Date;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toBuilder", "Lcom/mapbox/common/geofencing/GeofenceState$Builder;", "toString", "", "Builder", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class GeofenceState implements Serializable {

    @NotNull
    private final Feature feature;

    @Nullable
    private final Date timestamp;

    private GeofenceState(Feature feature, Date date) {
        this.feature = feature;
        this.timestamp = date;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof GeofenceState)) {
            return false;
        }
        GeofenceState geofenceState = (GeofenceState) other;
        return Intrinsics.areEqual(this.feature, geofenceState.feature) && Intrinsics.areEqual(this.timestamp, geofenceState.timestamp);
    }

    @NotNull
    public final Feature getFeature() {
        return this.feature;
    }

    @Nullable
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.feature, this.timestamp);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this.feature).setFeature(this.feature).setTimestamp(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "GeofenceState(feature=" + this.feature + ", timestamp=" + this.timestamp + ')';
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mapbox/common/geofencing/GeofenceState$Builder;", "", "feature", "Lcom/mapbox/geojson/Feature;", "(Lcom/mapbox/geojson/Feature;)V", "<set-?>", "getFeature", "()Lcom/mapbox/geojson/Feature;", "setFeature", "Ljava/util/Date;", "timestamp", "getTimestamp", "()Ljava/util/Date;", "setTimestamp", "(Ljava/util/Date;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/common/geofencing/GeofenceState;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private Feature feature;

        @Nullable
        private Date timestamp;

        public Builder(@NotNull Feature feature) {
            feature.getClass();
            this.feature = feature;
        }

        @NotNull
        public final GeofenceState build() {
            Feature feature = this.feature;
            if (feature != null) {
                feature.getClass();
                return new GeofenceState(feature, this.timestamp, null);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Could not build an instance of GeofenceState through GeofenceState.Builder because feature was null.");
            return null;
        }

        @NotNull
        public final Feature getFeature() {
            return this.feature;
        }

        @Nullable
        public final Date getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: setFeature, reason: collision with other method in class */
        public final /* synthetic */ void m24693setFeature(Feature feature) {
            feature.getClass();
            this.feature = feature;
        }

        /* renamed from: setTimestamp, reason: collision with other method in class */
        public final /* synthetic */ void m24694setTimestamp(Date date) {
            this.timestamp = date;
        }

        @NotNull
        public final Builder setTimestamp(@Nullable Date timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @NotNull
        public final Builder setFeature(@NotNull Feature feature) {
            feature.getClass();
            this.feature = feature;
            return this;
        }
    }

    public /* synthetic */ GeofenceState(Feature feature, Date date, DefaultConstructorMarker defaultConstructorMarker) {
        this(feature, date);
    }
}
