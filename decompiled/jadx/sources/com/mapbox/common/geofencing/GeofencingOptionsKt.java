package com.mapbox.common.geofencing;

import com.mapbox.common.geofencing.GeofencingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"geofencingOptions", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "initializer", "Lkotlin/Function1;", "Lcom/mapbox/common/geofencing/GeofencingOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class GeofencingOptionsKt {
    public static final /* synthetic */ GeofencingOptions geofencingOptions(Function1 function1) {
        function1.getClass();
        GeofencingOptions.Builder builder = new GeofencingOptions.Builder();
        function1.invoke(builder);
        return builder.build();
    }
}
