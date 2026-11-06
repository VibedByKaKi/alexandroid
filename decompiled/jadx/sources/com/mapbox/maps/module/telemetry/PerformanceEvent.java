package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0\u000b0\u001f\"\u0004\b\u0000\u0010 2\b\u0010!\u001a\u0004\u0018\u00010\u00052\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002J\u0012\u0010$\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010%\u001a\u00020\u0005H\u0016R$\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/mapbox/maps/module/telemetry/PerformanceEvent;", "Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "bundle", "Landroid/os/Bundle;", "(Lcom/mapbox/maps/module/telemetry/PhoneState;Ljava/lang/String;Landroid/os/Bundle;)V", "attributes", "", "Lcom/mapbox/maps/module/telemetry/PerformanceEvent$PerformanceAttribute;", "getAttributes", "()Ljava/util/List;", "counters", "", "getCounters", "metadata", "Lcom/google/gson/JsonObject;", "getMetadata", "()Lcom/google/gson/JsonObject;", "getSessionId", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "getEventName", "hashCode", "", "initList", "Ljava/util/ArrayList;", ExifInterface.GPS_DIRECTION_TRUE, "fromString", "typeToken", "Lcom/google/gson/reflect/TypeToken;", "initMetaData", "toString", "Companion", "PerformanceAttribute", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ParcelCreator"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes9.dex */
public final class PerformanceEvent extends MapBaseEvent {

    @NotNull
    private static final String PERFORMANCE_TRACE = "mobile.performance_trace";

    @SerializedName("attributes")
    @Nullable
    private final List<PerformanceAttribute<String>> attributes;

    @SerializedName("counters")
    @Nullable
    private final List<PerformanceAttribute<Double>> counters;

    @SerializedName("metadata")
    @Nullable
    private final JsonObject metadata;

    @SerializedName(LiveTranslationCapabilityConstants.KEY_SESSION_ID)
    @Nullable
    private final String sessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/module/telemetry/PerformanceEvent$PerformanceAttribute;", ExifInterface.GPS_DIRECTION_TRUE, "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PerformanceAttribute<T> {

        @Nullable
        private final String name;

        @Nullable
        private final T value;

        public PerformanceAttribute(@Nullable String str, T t) {
            this.name = str;
            this.value = t;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(PerformanceAttribute.class, other.getClass())) {
                return false;
            }
            PerformanceAttribute performanceAttribute = (PerformanceAttribute) other;
            if (Intrinsics.areEqual(this.name, performanceAttribute.name)) {
                return Intrinsics.areEqual(this.value, performanceAttribute.value);
            }
            return false;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            T t = this.value;
            return hashCode + (t != null ? t.hashCode() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceEvent(@NotNull PhoneState phoneState, @Nullable String str, @NotNull Bundle bundle) {
        super(phoneState);
        phoneState.getClass();
        bundle.getClass();
        this.sessionId = str;
        this.attributes = initList(bundle.getString("attributes"), new TypeToken<ArrayList<PerformanceAttribute<String>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.1
        });
        this.counters = initList(bundle.getString("counters"), new TypeToken<ArrayList<PerformanceAttribute<Double>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.2
        });
        this.metadata = initMetaData(bundle.getString("metadata"));
    }

    private final <T> ArrayList<PerformanceAttribute<T>> initList(String fromString, TypeToken<?> typeToken) {
        if (fromString == null || fromString.length() == 0) {
            return new ArrayList<>();
        }
        Object fromJson = new Gson().fromJson(fromString, typeToken.getType());
        fromJson.getClass();
        return (ArrayList) fromJson;
    }

    private final JsonObject initMetaData(String fromString) {
        if (fromString == null) {
            return new JsonObject();
        }
        Object fromJson = new Gson().fromJson(fromString, (Class<Object>) JsonObject.class);
        fromJson.getClass();
        return (JsonObject) fromJson;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(PerformanceEvent.class, other.getClass())) {
            return false;
        }
        PerformanceEvent performanceEvent = (PerformanceEvent) other;
        if (Intrinsics.areEqual(getEvent(), performanceEvent.getEvent()) && Intrinsics.areEqual(getCreated(), performanceEvent.getCreated()) && Intrinsics.areEqual(this.sessionId, performanceEvent.sessionId) && Intrinsics.areEqual(this.attributes, performanceEvent.attributes) && Intrinsics.areEqual(this.counters, performanceEvent.counters)) {
            return Intrinsics.areEqual(this.metadata, performanceEvent.metadata);
        }
        return false;
    }

    @Nullable
    public final List<PerformanceAttribute<String>> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final List<PerformanceAttribute<Double>> getCounters() {
        return this.counters;
    }

    @Override // com.mapbox.maps.module.telemetry.MapBaseEvent
    @NotNull
    public String getEventName() {
        return PERFORMANCE_TRACE;
    }

    @Nullable
    public final JsonObject getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        int hashCode = (getCreated().hashCode() + ((getEvent().hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31;
        List<PerformanceAttribute<String>> list = this.attributes;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<PerformanceAttribute<Double>> list2 = this.counters;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        JsonObject jsonObject = this.metadata;
        return hashCode3 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PerformanceEvent{sessionId='" + this.sessionId + "', attributes=" + this.attributes + ", counters=" + this.counters + ", metadata=" + this.metadata + AbstractJsonLexerKt.END_OBJ;
    }
}
