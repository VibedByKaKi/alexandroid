package com.mapbox.maps.plugin.locationcomponent.model;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0012\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0000¢\u0006\u0002\b\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R5\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/model/ModelPart;", "", "featureStateId", "", "(Ljava/lang/String;)V", "getFeatureStateId", "()Ljava/lang/String;", "updateFeatureState", "Lkotlin/Function1;", "Lcom/mapbox/bindgen/Value;", "Lkotlin/ParameterName;", "name", "state", "", "getUpdateFeatureState", "()Lkotlin/jvm/functions/Function1;", "setUpdateFeatureState", "(Lkotlin/jvm/functions/Function1;)V", "bindTo", "", "mapFeatureStateDelegate", "bindTo$plugin_locationcomponent_release", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public abstract class ModelPart {

    @NotNull
    private final String featureStateId;

    @NotNull
    private Function1<? super Value, Boolean> updateFeatureState;

    public ModelPart(@NotNull String str) {
        str.getClass();
        this.featureStateId = str;
        this.updateFeatureState = new Function1<Value, Boolean>() { // from class: com.mapbox.maps.plugin.locationcomponent.model.ModelPart$updateFeatureState$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Value value) {
                value.getClass();
                return Boolean.FALSE;
            }
        };
    }

    public final void bindTo$plugin_locationcomponent_release(@NotNull Function1<? super Value, Boolean> mapFeatureStateDelegate) {
        mapFeatureStateDelegate.getClass();
        this.updateFeatureState = mapFeatureStateDelegate;
    }

    @NotNull
    public final String getFeatureStateId() {
        return this.featureStateId;
    }

    @NotNull
    public final Function1<Value, Boolean> getUpdateFeatureState() {
        return this.updateFeatureState;
    }

    public final void setUpdateFeatureState(@NotNull Function1<? super Value, Boolean> function1) {
        function1.getClass();
        this.updateFeatureState = function1;
    }
}
