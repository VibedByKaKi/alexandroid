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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState;", "Lcom/mapbox/maps/interactions/FeatureState;", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", Constants.HINT_TEXT_OPERATION_HIDE, "", "getHide$annotations", "()V", "getHide", "()Ljava/lang/Boolean;", "highlight", "getHighlight$annotations", "getHighlight", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "select", "getSelect$annotations", "getSelect", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class StandardPlaceLabelsState extends FeatureState {

    @NotNull
    private final Value internalState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState$Builder;", "Lcom/mapbox/maps/interactions/FeatureState$Builder;", "()V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState;", Constants.HINT_TEXT_OPERATION_HIDE, "", "highlight", "select", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        @NotNull
        public StandardPlaceLabelsState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardPlaceLabelsState. Is this intended?");
            }
            return new StandardPlaceLabelsState(new Value(getRawStateMap()));
        }

        @NotNull
        public final Builder hide(boolean hide) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueOf = Value.valueOf(hide);
            valueOf.getClass();
            rawStateMap.put(Constants.HINT_TEXT_OPERATION_HIDE, valueOf);
            return this;
        }

        @NotNull
        public final Builder highlight(boolean highlight) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueOf = Value.valueOf(highlight);
            valueOf.getClass();
            rawStateMap.put("highlight", valueOf);
            return this;
        }

        @NotNull
        public final Builder select(boolean select) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueOf = Value.valueOf(select);
            valueOf.getClass();
            rawStateMap.put("select", valueOf);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPlaceLabelsState(@NotNull Value value) {
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

    @Nullable
    public final Boolean getHighlight() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get("highlight");
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

    @Nullable
    public final Boolean getSelect() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get("select");
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    public static /* synthetic */ void getHide$annotations() {
    }

    public static /* synthetic */ void getHighlight$annotations() {
    }

    public static /* synthetic */ void getSelect$annotations() {
    }
}
