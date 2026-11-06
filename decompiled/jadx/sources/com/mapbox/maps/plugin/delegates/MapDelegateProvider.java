package com.mapbox.maps.plugin.delegates;

import androidx.annotation.RestrictTo;
import com.mapbox.maps.IndoorManager;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020608H&R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0012\u0010)\u001a\u00020*X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0012\u0010-\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "", "indoorManager", "Lcom/mapbox/maps/IndoorManager;", "getIndoorManager$annotations", "()V", "getIndoorManager", "()Lcom/mapbox/maps/IndoorManager;", "mapAttributionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "getMapAttributionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "getMapCameraManagerDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapFeatureQueryDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "getMapFeatureQueryDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "mapFeatureStateDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "getMapFeatureStateDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "mapInteractionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "getMapInteractionDelegate$annotations", "getMapInteractionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "mapListenerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "getMapListenerDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "mapPluginProviderDelegate", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getMapPluginProviderDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "mapProjectionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "getMapProjectionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "mapStyleManagerDelegate", "Lcom/mapbox/maps/MapboxStyleManager;", "getMapStyleManagerDelegate", "()Lcom/mapbox/maps/MapboxStyleManager;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "getMapTransformDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "maximumFps", "", "getMaximumFps", "()Ljava/lang/Integer;", "getStyle", "", "callback", "Lkotlin/Function1;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes9.dex */
public interface MapDelegateProvider {
    @NotNull
    IndoorManager getIndoorManager();

    @NotNull
    MapAttributionDelegate getMapAttributionDelegate();

    @NotNull
    MapCameraManagerDelegate getMapCameraManagerDelegate();

    @NotNull
    MapFeatureQueryDelegate getMapFeatureQueryDelegate();

    @NotNull
    MapFeatureStateDelegate getMapFeatureStateDelegate();

    @NotNull
    MapInteractionDelegate getMapInteractionDelegate();

    @NotNull
    MapListenerDelegate getMapListenerDelegate();

    @NotNull
    MapPluginProviderDelegate getMapPluginProviderDelegate();

    @NotNull
    MapProjectionDelegate getMapProjectionDelegate();

    @NotNull
    MapboxStyleManager getMapStyleManagerDelegate();

    @NotNull
    MapTransformDelegate getMapTransformDelegate();

    @Nullable
    Integer getMaximumFps();

    void getStyle(@NotNull Function1<? super MapboxStyleManager, Unit> callback);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Integer getMaximumFps(@NotNull MapDelegateProvider mapDelegateProvider) {
            return null;
        }

        @MapboxExperimental
        public static /* synthetic */ void getIndoorManager$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getMapInteractionDelegate$annotations() {
        }
    }
}
