package com.mapbox.common.location;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class LocationProviderRequest implements Serializable {

    @Nullable
    private final AccuracyLevel accuracy;

    @Nullable
    private final Float displacement;

    @Nullable
    private final IntervalSettings interval;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private AccuracyLevel accuracy;

        @Nullable
        private Float displacement;

        @Nullable
        private IntervalSettings interval;

        public Builder accuracy(@Nullable AccuracyLevel accuracyLevel) {
            this.accuracy = accuracyLevel;
            return this;
        }

        public LocationProviderRequest build() {
            return new LocationProviderRequest(this.accuracy, this.displacement, this.interval);
        }

        public Builder displacement(@Nullable Float f) {
            this.displacement = f;
            return this;
        }

        public Builder interval(@Nullable IntervalSettings intervalSettings) {
            this.interval = intervalSettings;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private LocationProviderRequest(@Nullable AccuracyLevel accuracyLevel, @Nullable Float f, @Nullable IntervalSettings intervalSettings) {
        this.accuracy = accuracyLevel;
        this.displacement = f;
        this.interval = intervalSettings;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationProviderRequest locationProviderRequest = (LocationProviderRequest) obj;
        return Objects.equals(this.accuracy, locationProviderRequest.accuracy) && Objects.equals(this.displacement, locationProviderRequest.displacement) && Objects.equals(this.interval, locationProviderRequest.interval);
    }

    @Nullable
    public AccuracyLevel getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public Float getDisplacement() {
        return this.displacement;
    }

    @Nullable
    public IntervalSettings getInterval() {
        return this.interval;
    }

    public int hashCode() {
        return Objects.hash(this.accuracy, this.displacement, this.interval);
    }

    public Builder toBuilder() {
        return new Builder().accuracy(this.accuracy).displacement(this.displacement).interval(this.interval);
    }

    public String toString() {
        return "[accuracy: " + RecordUtils.fieldToString(this.accuracy) + ", displacement: " + RecordUtils.fieldToString(this.displacement) + ", interval: " + RecordUtils.fieldToString(this.interval) + MarkdownConstants.RIGHT_BRACKET;
    }
}
