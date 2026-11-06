package com.mapbox.maps.plugin.indoorselector;

import android.view.View;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.IndoorFloor;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J \u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH'¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/plugin/indoorselector/IndoorSelectorPlugin;", "Lcom/mapbox/maps/plugin/ViewPlugin;", "Lcom/mapbox/maps/plugin/LifecyclePlugin;", "Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettingsInterface;", "addOnFloorSelectedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mapbox/maps/plugin/indoorselector/OnFloorSelectedListener;", "onFloorSelected", "floorId", "", "removeOnFloorSelectedListener", "updateFloors", "floors", "", "Lcom/mapbox/maps/IndoorFloor;", "selectedFloorId", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public interface IndoorSelectorPlugin extends ViewPlugin, LifecyclePlugin, IndoorSelectorSettingsInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(@NotNull IndoorSelectorPlugin indoorSelectorPlugin) {
            ViewPlugin.DefaultImpls.cleanup(indoorSelectorPlugin);
        }

        public static void initialize(@NotNull IndoorSelectorPlugin indoorSelectorPlugin) {
            ViewPlugin.DefaultImpls.initialize(indoorSelectorPlugin);
        }

        public static void onDelegateProvider(@NotNull IndoorSelectorPlugin indoorSelectorPlugin, @NotNull MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            ViewPlugin.DefaultImpls.onDelegateProvider(indoorSelectorPlugin, mapDelegateProvider);
        }

        public static void onPluginView(@NotNull IndoorSelectorPlugin indoorSelectorPlugin, @NotNull View view) {
            view.getClass();
            ViewPlugin.DefaultImpls.onPluginView(indoorSelectorPlugin, view);
        }

        public static void onStart(@NotNull IndoorSelectorPlugin indoorSelectorPlugin) {
            LifecyclePlugin.DefaultImpls.onStart(indoorSelectorPlugin);
        }

        public static void onStop(@NotNull IndoorSelectorPlugin indoorSelectorPlugin) {
            LifecyclePlugin.DefaultImpls.onStop(indoorSelectorPlugin);
        }
    }

    @MapboxExperimental
    void addOnFloorSelectedListener(@NotNull OnFloorSelectedListener listener);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @MapboxExperimental
    void onFloorSelected(@NotNull String floorId);

    @MapboxExperimental
    void removeOnFloorSelectedListener(@NotNull OnFloorSelectedListener listener);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @MapboxExperimental
    void updateFloors(@NotNull List<IndoorFloor> floors, @Nullable String selectedFloorId);
}
