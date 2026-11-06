package com.mapbox.maps.interactions.standard.generated;

import androidx.annotation.RestrictTo;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState;", "Lcom/mapbox/maps/interactions/FeatureState;", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class StandardLandmarkIconsState extends FeatureState {

    @NotNull
    private final Value internalState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState$Builder;", "Lcom/mapbox/maps/interactions/FeatureState$Builder;", "()V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        @NotNull
        public StandardLandmarkIconsState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardLandmarkIconsState. Is this intended?");
            }
            return new StandardLandmarkIconsState(new Value(getRawStateMap()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardLandmarkIconsState(@NotNull Value value) {
        super(value);
        value.getClass();
        this.internalState = value;
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public Value getInternalState() {
        return this.internalState;
    }
}
