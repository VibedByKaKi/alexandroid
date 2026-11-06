package com.mapbox.maps;

import com.mapbox.maps.MapPlayerOptions;
import com.mapbox.maps.MapRecorderOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a%\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"mapPlayerOptions", "Lcom/mapbox/maps/MapPlayerOptions;", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/MapPlayerOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "mapRecorderOptions", "Lcom/mapbox/maps/MapRecorderOptions;", "Lcom/mapbox/maps/MapRecorderOptions$Builder;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxMapRecorderKt {
    @NotNull
    public static final MapPlayerOptions mapPlayerOptions(@NotNull Function1<? super MapPlayerOptions.Builder, Unit> function1) {
        function1.getClass();
        MapPlayerOptions.Builder builder = new MapPlayerOptions.Builder();
        function1.invoke(builder);
        MapPlayerOptions build = builder.build();
        build.getClass();
        return build;
    }

    @NotNull
    public static final MapRecorderOptions mapRecorderOptions(@NotNull Function1<? super MapRecorderOptions.Builder, Unit> function1) {
        function1.getClass();
        MapRecorderOptions.Builder builder = new MapRecorderOptions.Builder();
        function1.invoke(builder);
        MapRecorderOptions build = builder.build();
        build.getClass();
        return build;
    }
}
