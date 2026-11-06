package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class CameraAnimationHint implements Serializable {

    @NonNull
    private final List<CameraAnimationHintStage> stages;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @NonNull
        private List<CameraAnimationHintStage> stages;

        public CameraAnimationHint build() {
            if (this.stages != null) {
                return new CameraAnimationHint(this.stages);
            }
            Single$$ExternalSyntheticBUOutline0.m$1("stages shouldn't be null");
            return null;
        }

        public Builder stages(@NonNull List<CameraAnimationHintStage> list) {
            this.stages = list;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CameraAnimationHint(@NonNull List<CameraAnimationHintStage> list) {
        this.stages = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && CameraAnimationHint.class == obj.getClass() && Objects.equals(this.stages, ((CameraAnimationHint) obj).stages);
    }

    @NonNull
    public List<CameraAnimationHintStage> getStages() {
        return this.stages;
    }

    public int hashCode() {
        return Objects.hash(this.stages);
    }

    public Builder toBuilder() {
        return new Builder().stages(this.stages);
    }

    public String toString() {
        return "[stages: " + RecordUtils.fieldToString(this.stages) + MarkdownConstants.RIGHT_BRACKET;
    }
}
