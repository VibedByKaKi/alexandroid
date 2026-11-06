package com.mapbox.common.geofencing;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingOptions;", "Ljava/io/Serializable;", "maximumMonitoredFeatures", "", "(I)V", "getMaximumMonitoredFeatures", "()I", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toBuilder", "Lcom/mapbox/common/geofencing/GeofencingOptions$Builder;", "toString", "", "Builder", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class GeofencingOptions implements Serializable {
    private final int maximumMonitoredFeatures;

    private GeofencingOptions(int i) {
        this.maximumMonitoredFeatures = i;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof GeofencingOptions) && this.maximumMonitoredFeatures == ((GeofencingOptions) other).maximumMonitoredFeatures;
    }

    public final int getMaximumMonitoredFeatures() {
        return this.maximumMonitoredFeatures;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maximumMonitoredFeatures));
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().setMaximumMonitoredFeatures(this.maximumMonitoredFeatures);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("GeofencingOptions(maximumMonitoredFeatures="), this.maximumMonitoredFeatures, ')');
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingOptions$Builder;", "", "()V", "<set-?>", "", "maximumMonitoredFeatures", "getMaximumMonitoredFeatures", "()I", "setMaximumMonitoredFeatures", "(I)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/common/geofencing/GeofencingOptions;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private int maximumMonitoredFeatures = 100000;

        @NotNull
        public final GeofencingOptions build() {
            return new GeofencingOptions(this.maximumMonitoredFeatures, null);
        }

        public final int getMaximumMonitoredFeatures() {
            return this.maximumMonitoredFeatures;
        }

        /* renamed from: setMaximumMonitoredFeatures, reason: collision with other method in class */
        public final /* synthetic */ void m24700setMaximumMonitoredFeatures(int i) {
            this.maximumMonitoredFeatures = i;
        }

        @NotNull
        public final Builder setMaximumMonitoredFeatures(int maximumMonitoredFeatures) {
            this.maximumMonitoredFeatures = maximumMonitoredFeatures;
            return this;
        }
    }

    public /* synthetic */ GeofencingOptions(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
