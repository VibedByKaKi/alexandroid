package com.mapbox.maps.plugin.scalebar;

import android.view.View;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0018\u0010\u0004\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/ScaleBarPlugin;", "Lcom/mapbox/maps/plugin/ViewPlugin;", "Lcom/mapbox/maps/plugin/MapSizePlugin;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsInterface;", "distancePerPixel", "", "getDistancePerPixel", "()F", "setDistancePerPixel", "(F)V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface ScaleBarPlugin extends ViewPlugin, MapSizePlugin, ScaleBarSettingsInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(@NotNull ScaleBarPlugin scaleBarPlugin) {
            ViewPlugin.DefaultImpls.cleanup(scaleBarPlugin);
        }

        public static void initialize(@NotNull ScaleBarPlugin scaleBarPlugin) {
            ViewPlugin.DefaultImpls.initialize(scaleBarPlugin);
        }

        public static void onDelegateProvider(@NotNull ScaleBarPlugin scaleBarPlugin, @NotNull MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            ViewPlugin.DefaultImpls.onDelegateProvider(scaleBarPlugin, mapDelegateProvider);
        }

        public static void onPluginView(@NotNull ScaleBarPlugin scaleBarPlugin, @NotNull View view) {
            view.getClass();
            ViewPlugin.DefaultImpls.onPluginView(scaleBarPlugin, view);
        }

        public static void onSizeChanged(@NotNull ScaleBarPlugin scaleBarPlugin, int i, int i2) {
            MapSizePlugin.DefaultImpls.onSizeChanged(scaleBarPlugin, i, i2);
        }
    }

    float getDistancePerPixel();

    void setDistancePerPixel(float f);
}
