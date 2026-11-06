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
public class IntervalSettings implements Serializable {

    @Nullable
    private final Long interval;

    @Nullable
    private final Long maximumInterval;

    @Nullable
    private final Long minimumInterval;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private Long interval;

        @Nullable
        private Long maximumInterval;

        @Nullable
        private Long minimumInterval;

        public IntervalSettings build() {
            return new IntervalSettings(this.minimumInterval, this.maximumInterval, this.interval);
        }

        public Builder interval(@Nullable Long l) {
            this.interval = l;
            return this;
        }

        public Builder maximumInterval(@Nullable Long l) {
            this.maximumInterval = l;
            return this;
        }

        public Builder minimumInterval(@Nullable Long l) {
            this.minimumInterval = l;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private IntervalSettings(@Nullable Long l, @Nullable Long l2, @Nullable Long l3) {
        this.minimumInterval = l;
        this.maximumInterval = l2;
        this.interval = l3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntervalSettings intervalSettings = (IntervalSettings) obj;
        return Objects.equals(this.minimumInterval, intervalSettings.minimumInterval) && Objects.equals(this.maximumInterval, intervalSettings.maximumInterval) && Objects.equals(this.interval, intervalSettings.interval);
    }

    @Nullable
    public Long getInterval() {
        return this.interval;
    }

    @Nullable
    public Long getMaximumInterval() {
        return this.maximumInterval;
    }

    @Nullable
    public Long getMinimumInterval() {
        return this.minimumInterval;
    }

    public int hashCode() {
        return Objects.hash(this.minimumInterval, this.maximumInterval, this.interval);
    }

    public Builder toBuilder() {
        return new Builder().minimumInterval(this.minimumInterval).maximumInterval(this.maximumInterval).interval(this.interval);
    }

    public String toString() {
        return "[minimumInterval: " + RecordUtils.fieldToString(this.minimumInterval) + ", maximumInterval: " + RecordUtils.fieldToString(this.maximumInterval) + ", interval: " + RecordUtils.fieldToString(this.interval) + MarkdownConstants.RIGHT_BRACKET;
    }
}
