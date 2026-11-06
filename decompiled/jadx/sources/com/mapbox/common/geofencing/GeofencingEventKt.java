package com.mapbox.common.geofencing;

import com.mapbox.common.geofencing.GeofencingEvent;
import com.mapbox.geojson.Feature;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"geofencingEvent", "Lcom/mapbox/common/geofencing/GeofencingEvent;", "feature", "Lcom/mapbox/geojson/Feature;", "timestamp", "Ljava/util/Date;", "initializer", "Lkotlin/Function1;", "Lcom/mapbox/common/geofencing/GeofencingEvent$Builder;", "", "Lkotlin/ExtensionFunctionType;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class GeofencingEventKt {
    public static final /* synthetic */ GeofencingEvent geofencingEvent(Feature feature, Date date, Function1 function1) {
        feature.getClass();
        date.getClass();
        function1.getClass();
        GeofencingEvent.Builder builder = new GeofencingEvent.Builder(feature, date);
        function1.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ GeofencingEvent geofencingEvent$default(Feature feature, Date date, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1<GeofencingEvent.Builder, Unit>() { // from class: com.mapbox.common.geofencing.GeofencingEventKt$geofencingEvent$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GeofencingEvent.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GeofencingEvent.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return geofencingEvent(feature, date, function1);
    }
}
