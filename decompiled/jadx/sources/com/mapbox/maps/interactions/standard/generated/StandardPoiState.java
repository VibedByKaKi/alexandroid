package com.mapbox.maps.interactions.standard.generated;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;", "Lcom/mapbox/maps/interactions/FeatureState;", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", Constants.HINT_TEXT_OPERATION_HIDE, "", "getHide$annotations", "()V", "getHide", "()Ljava/lang/Boolean;", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class StandardPoiState extends FeatureState {

    @NotNull
    private final Value internalState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState$Builder;", "Lcom/mapbox/maps/interactions/FeatureState$Builder;", "()V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;", Constants.HINT_TEXT_OPERATION_HIDE, "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        @NotNull
        public StandardPoiState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardPoiState. Is this intended?");
            }
            return new StandardPoiState(new Value(getRawStateMap()));
        }

        @NotNull
        public final Builder hide(boolean hide) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueOf = Value.valueOf(hide);
            valueOf.getClass();
            rawStateMap.put(Constants.HINT_TEXT_OPERATION_HIDE, valueOf);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPoiState(@NotNull Value value) {
        super(value);
        value.getClass();
        this.internalState = value;
    }

    @Nullable
    public final Boolean getHide() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(Constants.HINT_TEXT_OPERATION_HIDE);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public Value getInternalState() {
        return this.internalState;
    }

    public static /* synthetic */ void getHide$annotations() {
    }
}
