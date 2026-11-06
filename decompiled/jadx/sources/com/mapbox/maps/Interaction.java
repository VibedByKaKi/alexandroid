package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class Interaction implements Serializable {

    @Nullable
    private final FeaturesetDescriptor featureset;

    @Nullable
    private final Value filter;

    @NonNull
    private final InteractionHandler handler;

    @Nullable
    private final Double radius;

    @NonNull
    private final InteractionType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Interaction(@Nullable FeaturesetDescriptor featuresetDescriptor, @Nullable Value value, @NonNull InteractionType interactionType, @NonNull InteractionHandler interactionHandler, @Nullable Double d) {
        this.featureset = featuresetDescriptor;
        this.filter = value;
        this.type = interactionType;
        this.handler = interactionHandler;
        this.radius = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Interaction interaction = (Interaction) obj;
        return Objects.equals(this.featureset, interaction.featureset) && Objects.equals(this.filter, interaction.filter) && Objects.equals(this.type, interaction.type) && Objects.equals(this.handler, interaction.handler) && Objects.equals(this.radius, interaction.radius);
    }

    @Nullable
    public FeaturesetDescriptor getFeatureset() {
        return this.featureset;
    }

    @Nullable
    public Value getFilter() {
        return this.filter;
    }

    @NonNull
    public InteractionHandler getHandler() {
        return this.handler;
    }

    @Nullable
    public Double getRadius() {
        return this.radius;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InteractionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.featureset, this.filter, this.type, this.handler, this.radius);
    }

    public String toString() {
        return "[featureset: " + RecordUtils.fieldToString(this.featureset) + ", filter: " + RecordUtils.fieldToString(this.filter) + ", type: " + RecordUtils.fieldToString(this.type) + ", handler: " + RecordUtils.fieldToString(this.handler) + ", radius: " + RecordUtils.fieldToString(this.radius) + MarkdownConstants.RIGHT_BRACKET;
    }
}
