package com.mapbox.maps.interactions;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/interactions/FeatureState;", "", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "asJsonString", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "getBooleanState", "stateName", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getDoubleState", "", "(Ljava/lang/String;)Ljava/lang/Double;", "getLongState", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getStringState", "hashCode", "", "toString", "Builder", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class FeatureState {

    @NotNull
    public static final String TAG = "FeatureState";

    @NotNull
    private final Value internalState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016R0\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/interactions/FeatureState$Builder;", "", "()V", "rawStateMap", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "getRawStateMap", "()Ljava/util/HashMap;", "addBooleanState", "stateName", "value", "", "addDoubleState", "", "addLongState", "", "addStringState", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/interactions/FeatureState;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class Builder {

        @NotNull
        private final HashMap<String, Value> rawStateMap = new HashMap<>();

        @NotNull
        public final Builder addBooleanState(@NotNull String stateName, boolean value) {
            stateName.getClass();
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            valueOf.getClass();
            hashMap.put(stateName, valueOf);
            return this;
        }

        @NotNull
        public final Builder addDoubleState(@NotNull String stateName, double value) {
            stateName.getClass();
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            valueOf.getClass();
            hashMap.put(stateName, valueOf);
            return this;
        }

        @NotNull
        public final Builder addLongState(@NotNull String stateName, long value) {
            stateName.getClass();
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            valueOf.getClass();
            hashMap.put(stateName, valueOf);
            return this;
        }

        @NotNull
        public final Builder addStringState(@NotNull String stateName, @NotNull String value) {
            stateName.getClass();
            value.getClass();
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            valueOf.getClass();
            hashMap.put(stateName, valueOf);
            return this;
        }

        @NotNull
        public FeatureState build() {
            if (this.rawStateMap.isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty FeatureState. Is this intended?");
            }
            return new FeatureState(new Value(this.rawStateMap));
        }

        @NotNull
        public final HashMap<String, Value> getRawStateMap() {
            return this.rawStateMap;
        }
    }

    public FeatureState(@NotNull Value value) {
        value.getClass();
        this.internalState = value;
    }

    @NotNull
    public final String asJsonString() {
        String json = getInternalState().toJson();
        json.getClass();
        return json;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return Intrinsics.areEqual(getInternalState(), ((FeatureState) other).getInternalState());
    }

    @Nullable
    public final Boolean getBooleanState(@NotNull String stateName) {
        stateName.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    @Nullable
    public final Double getDoubleState(@NotNull String stateName) {
        stateName.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Double) {
            return (Double) contents2;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public Value getInternalState() {
        return this.internalState;
    }

    @Nullable
    public final Long getLongState(@NotNull String stateName) {
        stateName.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Long) {
            return (Long) contents2;
        }
        return null;
    }

    @Nullable
    public final String getStringState(@NotNull String stateName) {
        stateName.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof String) {
            return (String) contents2;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(getInternalState());
    }

    @NotNull
    public String toString() {
        return "FeatureStateValue(state=" + getInternalState().toJson() + ')';
    }
}
