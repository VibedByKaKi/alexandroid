package com.mapbox.common.geofencing;

import com.mapbox.common.geofencing.GeofenceState;
import com.mapbox.geojson.Feature;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"geofenceState", "Lcom/mapbox/common/geofencing/GeofenceState;", "feature", "Lcom/mapbox/geojson/Feature;", "initializer", "Lkotlin/Function1;", "Lcom/mapbox/common/geofencing/GeofenceState$Builder;", "", "Lkotlin/ExtensionFunctionType;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class GeofenceStateKt {
    public static final /* synthetic */ GeofenceState geofenceState(Feature feature, Function1 function1) {
        feature.getClass();
        function1.getClass();
        GeofenceState.Builder builder = new GeofenceState.Builder(feature);
        function1.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ GeofenceState geofenceState$default(Feature feature, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<GeofenceState.Builder, Unit>() { // from class: com.mapbox.common.geofencing.GeofenceStateKt$geofenceState$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GeofenceState.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GeofenceState.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return geofenceState(feature, function1);
    }
}
