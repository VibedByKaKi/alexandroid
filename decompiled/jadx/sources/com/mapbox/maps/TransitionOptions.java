package com.mapbox.maps;

import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransitionOptions implements Serializable {

    @Nullable
    private final Long delay;

    @Nullable
    private final Long duration;

    @Nullable
    private final Boolean enablePlacementTransitions;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private Long delay;

        @Nullable
        private Long duration;

        @Nullable
        private Boolean enablePlacementTransitions;

        public TransitionOptions build() {
            return new TransitionOptions(this.duration, this.delay, this.enablePlacementTransitions);
        }

        public Builder delay(@Nullable Long l) {
            this.delay = l;
            return this;
        }

        public Builder duration(@Nullable Long l) {
            this.duration = l;
            return this;
        }

        public Builder enablePlacementTransitions(@Nullable Boolean bool) {
            this.enablePlacementTransitions = bool;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private TransitionOptions(@Nullable Long l, @Nullable Long l2, @Nullable Boolean bool) {
        this.duration = l;
        this.delay = l2;
        this.enablePlacementTransitions = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransitionOptions.class != obj.getClass()) {
            return false;
        }
        TransitionOptions transitionOptions = (TransitionOptions) obj;
        return Objects.equals(this.duration, transitionOptions.duration) && Objects.equals(this.delay, transitionOptions.delay) && Objects.equals(this.enablePlacementTransitions, transitionOptions.enablePlacementTransitions);
    }

    @Nullable
    public Long getDelay() {
        return this.delay;
    }

    @Nullable
    public Long getDuration() {
        return this.duration;
    }

    @Nullable
    public Boolean getEnablePlacementTransitions() {
        return this.enablePlacementTransitions;
    }

    public int hashCode() {
        return Objects.hash(this.duration, this.delay, this.enablePlacementTransitions);
    }

    public Builder toBuilder() {
        return new Builder().duration(this.duration).delay(this.delay).enablePlacementTransitions(this.enablePlacementTransitions);
    }

    public String toString() {
        return "[duration: " + RecordUtils.fieldToString(this.duration) + ", delay: " + RecordUtils.fieldToString(this.delay) + ", enablePlacementTransitions: " + RecordUtils.fieldToString(this.enablePlacementTransitions) + MarkdownConstants.RIGHT_BRACKET;
    }
}
